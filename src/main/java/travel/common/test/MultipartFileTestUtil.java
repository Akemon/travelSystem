package travel.common.test;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;

public class MultipartFileTestUtil {

    public static MultipartFile parseFileToMockMultipartFile(File file){
        try {
            MultipartFile multipartFile = new MockMultipartFile(file.getName(),file.getName(),"No set",new FileInputStream(file));
            return multipartFile;
        }catch (Exception e){
            e.printStackTrace();
            throw new IllegalArgumentException("转换文件出现异常:"+e.getMessage());
        }
    }
}
