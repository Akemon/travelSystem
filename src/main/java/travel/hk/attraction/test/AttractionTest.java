package travel.hk.attraction.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.multipart.MultipartFile;
import travel.common.test.MultipartFileTestUtil;
import travel.common.util.FileUtil;
import travel.hk.attraction.bean.Attraction;
import travel.hk.attraction.service.AttractionService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AttractionTest {

    @Autowired
    AttractionService attractionService;

    @Test
    public void testSelectAttractionById(){
        Attraction attraction =attractionService.getAttractionById(1);
        System.out.println("景点名字："+attraction.getName());
    }

    @Test
    public void testInsertNewAttraction(){
        Attraction attraction =new Attraction();
        File file =new File("G:\\图片\\婷婷\\婷婷1.jpg");
        List<MultipartFile> fileList = new ArrayList<>();
        MultipartFile  multipartFile =MultipartFileTestUtil.parseFileToMockMultipartFile(file);
        fileList.add(multipartFile);
        attractionService.createNewAttraction(attraction,fileList);

    }
}
