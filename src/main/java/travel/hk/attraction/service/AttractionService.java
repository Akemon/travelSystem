package travel.hk.attraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import travel.common.util.FileUtil;
import travel.hk.attraction.bean.Attraction;
import travel.hk.attraction.mapper.AttractionMapper;
import travel.hk.attraction.util.AttractionFileUtil;
import travel.yj.instantnode.bean.InstantNotePicture;
import travel.yj.instantnode.util.InstantNoteFileUtil;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Service
public class AttractionService {
    @Autowired
    AttractionMapper attractionMapper;

    /**
     * 根据主键id获取景点的详细信息
     * @param id
     * @return
     */
    public Attraction getAttractionById(int id){
        return attractionMapper.selectByPrimaryKey(id);
    }

    /**
     * 获取所有的景点信息
     * @return
     */
    public List<Attraction> getAllAttractions(){
        return attractionMapper.selectByExample(null);
    }


    /**
     * 创建一个新景点
     * @param attraction
     * @param listUploadFile
     */
    public void createNewAttraction(Attraction attraction,List<MultipartFile> listUploadFile){
        if(attraction!=null){

            //插入图片
            if(listUploadFile!=null||listUploadFile.size()!=0) {
                String relativePath = "";
                for (MultipartFile oneUploadFile : listUploadFile) {
                    //存储路径:D:\\travelSystem\\attraction\\picture\\attractionId\\UUId_图片名称
                    String pictureName = getPictureName(oneUploadFile);
                    relativePath += attraction.getTouristAttractionId() + File.separator + pictureName + ",";
                    //2.将文件插入文件系统中
                    String saveDirectoryPath = AttractionFileUtil.getAttractionPictureBasePath() + File.separator + attraction.getTouristAttractionId();
                    FileUtil.uploadFile(saveDirectoryPath, pictureName, oneUploadFile);
                }
                attraction.setPicture(relativePath);
            }
            attractionMapper.insertSelective(attraction);



        }
    }

    private String getPictureName(MultipartFile file){
        String fileName=file.getOriginalFilename();
        String uuid= UUID.randomUUID().toString();
        return uuid+"_"+fileName;
    }
}
