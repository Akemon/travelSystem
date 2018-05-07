package travel.yj.instantnode.util;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 杨景
 */
public class InstantNoteFileUtil {

    private InstantNoteFileUtil() {}

    public static String getInstantNotePictureBasePath(){
        Properties properties=new Properties();
        Resource resource = new ClassPathResource("travelSystemBasePath");
        try {
            properties.load(resource.getInputStream());
            return (String)properties.get("travelSystem.instantNote.picture.basePath");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e.getMessage());
        }
    }

}
