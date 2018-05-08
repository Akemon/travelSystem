package travel.hk.userinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import travel.common.util.FileUtil;
import travel.hk.attraction.util.AttractionFileUtil;
import travel.hk.userinfo.bean.UserInfo;
import travel.hk.userinfo.bean.UserInfoExample;
import travel.hk.userinfo.mapper.UserInfoMapper;
import travel.hk.util.UserInfoFileUtil;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 获取所有的用户信息
     * @return
     */
    public List<UserInfo> getAllUserInfo(){
        return userInfoMapper.selectByExample(null);
    }

    /**
     * 根据用户id获取用户信息
     * @param userid
     * @return
     */
    public UserInfo getOneUserById(String userid){
        return userInfoMapper.selectByPrimaryKey(userid);
    }

    /**
     * 用户登陆
     * @param userInfo
     * @return
     */
    public UserInfo userLogin(UserInfo userInfo){
        UserInfoExample userInfoExample =new UserInfoExample();
        UserInfoExample.Criteria criteria =userInfoExample.createCriteria();
        criteria.andUserIdEqualTo(userInfo.getUserId());
        criteria.andPasswordEqualTo(userInfo.getPassword());
        List<UserInfo> users = userInfoMapper.selectByExample(userInfoExample);
        if(users.size()==0) return null;
        return users.get(0);
    }

    /**
     *用户注册
     * @param userInfo
     * @param listUploadFile 图片文件
     * @return
     */
    public boolean userRegister(UserInfo userInfo,List<MultipartFile> listUploadFile){
        UserInfo userInfo1 =userInfoMapper.selectByPrimaryKey(userInfo.getUserId());
        //用户已注册
        if(userInfo1!=null) return false;
        userInfo.setGmtCreate(new Date());
        userInfo.setGmtModifited(new Date());
        userInfoMapper.insertSelective(userInfo);
        //插入图片
        if(listUploadFile==null) return true;
        if(listUploadFile!=null||listUploadFile.size()!=0) {
            String relativePath = "";
            for (MultipartFile oneUploadFile : listUploadFile) {
                //存储路径:C:\\travelSystem\\userInfo\\picture\\UUId_图片名称
                String pictureName = getPictureName(oneUploadFile);
                relativePath += userInfo.getUserId()+ File.separator + pictureName + ",";
                //2.将文件插入文件系统中
                String saveDirectoryPath = UserInfoFileUtil.getUserInfoPictureBasePath() + File.separator + userInfo.getUserId();
                FileUtil.uploadFile(saveDirectoryPath, pictureName, oneUploadFile);
            }
           userInfo.setPicture(relativePath);
        }
        userInfoMapper.updateByPrimaryKeySelective(userInfo);

    return true;
    }
    private String getPictureName(MultipartFile file){
        String fileName=file.getOriginalFilename();
        String uuid= UUID.randomUUID().toString();
        return uuid+"_"+fileName;
    }

    public ResponseEntity<byte[]> downloadPicture(String picturePath) {
        String path =UserInfoFileUtil.getUserInfoPictureBasePath()+File.separator+picturePath;
        return FileUtil.downloadFile(new File(path));
    }
}
