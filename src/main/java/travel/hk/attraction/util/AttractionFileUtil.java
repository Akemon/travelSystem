package travel.hk.attraction.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AttractionFileUtil
{
    private AttractionFileUtil() {}

    public static String getAttractionPictureBasePath(){
        Properties properties=new Properties();
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("travelSystemBasePath");
        try {
            properties.load(inputStream);
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
