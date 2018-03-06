package travel.common.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**@author 杨景 */
public class FileUtil {

    /***
     * 存储文件
     * @param directoryPath 存储的文件夹路径(比如D:\\travelSystem)
     * @param fileName 存储的文件名字包含后缀(比如picture1.jpg)
     * @param uploadFile 存储的文件
     * 如果参数为D:\\travelSystem和picture1.jpg,所以存储最终位置D:\\travelSystem\\picture1.jpg
     */
    public static void uploadFile(String directoryPath,String fileName, MultipartFile uploadFile){
        //1.判断文件夹是否存在,不存在则创建
        File directoryFile=new File(directoryPath);
        if(!directoryFile.exists()){
            directoryFile.mkdirs();
        }
        //2.存储文件
        File destinationFile=new File(directoryPath,fileName);
        try {
            uploadFile.transferTo(destinationFile);
        }catch (Exception e){
            e.printStackTrace();
            throw new IllegalArgumentException("照片上传失败!");
        }
    }

    /***
     * 下载文件
     * @param downloadFile 需要下载的文件
     * @return ResponseEntity<byte[]>
     */
    public static ResponseEntity<byte[]> downloadFile(File downloadFile){
        //1.获取ResponseBody数组
        byte[] body=getDownloadFileResponseBodyBody(downloadFile);
        //2.获取HttpHeaders
        HttpHeaders headers=getDownloadFileHttpHeaders(downloadFile.getName());
        //3.构建ResponseEntity<byte>
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, HttpStatus.OK);
        return entity;
    }

    /***
     * 删除文件
     * @param deleteFile 需要删除的文件
     * @return 文件是否删除 true or false
     */
    public static boolean deleteFile(File deleteFile){
        boolean isDelete=deleteFile.delete();
        if(!isDelete){
            throw new IllegalArgumentException("删除文件异常!");
        }
        return isDelete;
    }

    /**
     * 获取文件的body数组[byte数组类型]
     * @param downloadFile
     * @return byte[]
     * @throws IllegalArgumentException
     */
    private static byte[] getDownloadFileResponseBodyBody(File downloadFile){
        byte[] body = null;
        try{
            InputStream is = new FileInputStream(downloadFile);
            body = new byte[is.available()];
            is.read(body);
            is.close();
        }catch(Exception e){
            e.printStackTrace();
            throw new IllegalArgumentException("下载出现异常!"+e.getMessage());
        }
        return body;
    }

    /**
     * 获取文件下载头
     * @param fileName 需要下载的文件的名字
     * @return
     */
    private static HttpHeaders getDownloadFileHttpHeaders(String fileName){
        HttpHeaders headers = new HttpHeaders();
        try{
            headers.add("Content-Disposition",
                    "attchement;filename=" + new String(fileName.getBytes("UTF-8"), "ISO-8859-1").replaceAll(" ", ""));
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        }catch(Exception e){
            e.printStackTrace();
            throw new IllegalArgumentException("下载出现异常!"+e.getMessage());
        }
        return headers;
    }


}
