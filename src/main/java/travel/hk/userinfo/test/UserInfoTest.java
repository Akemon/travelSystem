package travel.hk.userinfo.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.multipart.MultipartFile;
import travel.common.test.MultipartFileTestUtil;
import travel.hk.userinfo.bean.UserInfo;
import travel.hk.userinfo.mapper.UserInfoMapper;
import travel.hk.userinfo.service.UserInfoService;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserInfoTest {
    @Autowired
    UserInfoService userInfoService;

    @Autowired
    SqlSession sqlSession;

    @Autowired
    UserInfoMapper userInfoMapper;

//    @Test
//    public void  testSelect(){
//      //  UserInfoMapper userInfoMapper =sqlSession.getMapper(UserInfoMapper.class);
//        List<UserInfo> userInfoList =userInfoMapper.selectByExample(null);
//        Iterator<UserInfo> iterator =userInfoList.iterator();
//        String userName ;
//        while(iterator.hasNext()){
//            UserInfo userInfo  =iterator.next();
//            userName =userInfo.getName();
//            System.out.println("userName:"+userName);
//        }
//    }
//
    @Test
    public void testSelectOneUser(){
        UserInfo userInfo =userInfoService.getOneUserById("1");
        System.out.println(userInfo.getName());
    }

    @Test
    public void testInsertNewUser(){
        UserInfo user= new UserInfo();
        File file =new File("G:\\图片\\婷婷\\婷婷1.jpg");
        List<MultipartFile> fileList = new ArrayList<>();
        MultipartFile  multipartFile = MultipartFileTestUtil.parseFileToMockMultipartFile(file);
        fileList.add(multipartFile);
        user.setUserId("SDFSD");
        user.setPassword("123");
        userInfoService.userRegister(user,fileList);

    }
}
