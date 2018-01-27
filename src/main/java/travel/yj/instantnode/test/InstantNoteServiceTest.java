package travel.yj.instantnode.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.multipart.MultipartFile;
import travel.yj.instantnode.service.InstantNoteService;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)//表示整合JUnit4进行测试
@ContextConfiguration(locations={"classpath:applicationContext.xml"})//加载spring配置文件
public class InstantNoteServiceTest {

    @Autowired
    private InstantNoteService instantNoteService;

    @Test
    public void testAddOneInstantNoteWithoutPicture(){
        String createrId="826299017";
        String content="今天是2018/1/27很开心";
        String location="深职院";
        List<MultipartFile> listFile=null;
        String result=instantNoteService.addOneInstantNote(createrId,content,location,listFile);
        assertEquals(true,result.indexOf("成功")>=0);
    }

    @Test
    public void testAddOneInstantNoteWithPicture(){
        String createrId="826299017";
        String content="今天是2018/1/27很开心";
        String location="深职院";

        List<MultipartFile> listFile=new ArrayList<MultipartFile>();
        MultipartFile file1=parseFileToMockMultipartFile(new File("D:\\0_test\\CE.jpg"));
        MultipartFile file2=parseFileToMockMultipartFile(new File("D:\\0_test\\zx.jpg"));
        MultipartFile file3=parseFileToMockMultipartFile(new File("D:\\0_test\\zz.jpg"));
        listFile.add(file1);
        listFile.add(file2);
        listFile.add(file3);
        String result=instantNoteService.addOneInstantNote(createrId,content,location,listFile);
        assertEquals(true,result.indexOf("成功")>=0);
    }

    private static MultipartFile parseFileToMockMultipartFile(File file){
        try {
            MultipartFile multipartFile = new MockMultipartFile(file.getName(), new FileInputStream(file));
            return multipartFile;
        }catch (Exception e){
            e.printStackTrace();
            throw new IllegalArgumentException("转换文件出现异常:"+e.getMessage());
        }
    }
}
