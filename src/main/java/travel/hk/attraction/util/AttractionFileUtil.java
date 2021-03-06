package travel.hk.attraction.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AttractionFileUtil
{
    private AttractionFileUtil() {}

    public static String getAttractionPictureBasePath(){
        Properties properties=new Properties();
        Resource resource = new ClassPathResource("travelSystemBasePath");
//        System.out.println("inputStream:"+inputStream);
        try {
            properties.load(resource.getInputStream());
            return (String)properties.get("travelSystem.attraction.picture.basePath");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
