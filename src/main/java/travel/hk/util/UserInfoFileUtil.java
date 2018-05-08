package travel.hk.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UserInfoFileUtil {
    private UserInfoFileUtil() {}

    public static String getUserInfoPictureBasePath(){
        Properties properties=new Properties();
        Resource resource = new ClassPathResource("travelSystemBasePath");
        try {
            properties.load(resource.getInputStream());
            return (String)properties.get("travelSystem.userInfo.picture.basePath");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
