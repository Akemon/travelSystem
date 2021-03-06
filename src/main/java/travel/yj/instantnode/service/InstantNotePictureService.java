package travel.yj.instantnode.service;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import travel.common.util.FileUtil;
import travel.yj.instantnode.bean.InstantNote;
import travel.yj.instantnode.bean.InstantNotePicture;
import travel.yj.instantnode.mapper.InstantNotePictureMapper;
import travel.yj.instantnode.util.InstantNoteFileUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
/**
 * @author 杨景
 */
@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class InstantNotePictureService {

    @Autowired
    private InstantNotePictureMapper instantNotePictureMapper;
    @Autowired
    private InstantNoteService instantNoteService;


    /**
     * 删除instantNoteId 删除对应的朋友圈的照片(方法会判断是否存在照片)
     * @param instantNoteId 需要删除照片的的朋友圈Id
     * @return 被删除的照片相对路径列表 or 长度为0 的List
     */
    public List<String> deleteListInstantNotePictureByInstantNoteId(Integer instantNoteId){

        List<String> listPicturePath=new ArrayList<String>();

        InstantNote instantNote=instantNoteService.selectOneInstantNoteById(instantNoteId);
        //1.获取对应的朋友圈照片
        List<InstantNotePicture> listInstantNotePicture=instantNote.getListInstantNotePicture();
        //2.删除照片
        for(InstantNotePicture picture:listInstantNotePicture){
            //记录文件路径
            listPicturePath.add(picture.getPicturePath());
            instantNotePictureMapper.deleteByPrimaryKey(picture.getInstantNotePictureId());
        }
        return listPicturePath;
    }

    public boolean deleteListInstantNotePictureInFileSystem(List<String> listAbsoluteNotePicturePath){
        if(listAbsoluteNotePicturePath==null||listAbsoluteNotePicturePath.size()==0){
            return true;
        }
        //删除文件系统的朋友圈照片
        for (String instantNotePicturePath:listAbsoluteNotePicturePath) {
            deleteOneInstantNotePicture(instantNotePicturePath);
        }
        return true;
    }


    public String addListInstantNotePicture(Integer instantNoteId,List<MultipartFile> listUploadFile){
        if(listUploadFile==null||listUploadFile.size()==0){
            return "";
        }
        for(MultipartFile oneUploadFile:listUploadFile){
            //存储路径:D:\\travelSystem\\instantNote\\picture\\instantNoteId\\UUId_图片名称
            String pictureName=getPictureName(oneUploadFile);
            String relativePath=instantNoteId+File.separator+pictureName;
            //1.将图片信息插入数据库中
            InstantNotePicture instantNotePicture=insertIntoDB(instantNoteId,relativePath);
            //2.将文件插入文件系统中
            String saveDirectoryPath=InstantNoteFileUtil.getInstantNotePictureBasePath()+File.separator+instantNoteId;
            FileUtil.uploadFile(saveDirectoryPath,pictureName,oneUploadFile);
        }
        return "照片添加成功!";
    }

    public ResponseEntity<byte[]> downloadPicture(Integer instantNotePictureId){
        InstantNotePicture instantNotePicture=instantNotePictureMapper.selectByPrimaryKey(instantNotePictureId);
        //1.获取文件
        File downloadPicture=getDownloadPicture(instantNotePicture);
        return FileUtil.downloadFile(downloadPicture);
    }

    private File getDownloadPicture(InstantNotePicture instantNotePicture){
        String basePath=InstantNoteFileUtil.getInstantNotePictureBasePath();
        String picturePath=instantNotePicture.getPicturePath();
        File downloadFile=new File(basePath, picturePath);
        return downloadFile;
    }



    private InstantNotePicture insertIntoDB(Integer instantNoteId,String relativePath){
        InstantNotePicture instantNotePicture=new InstantNotePicture();
        instantNotePicture.setInstantNoteId(instantNoteId);
        instantNotePicture.setPicturePath(relativePath);
        instantNotePictureMapper.insert(instantNotePicture);
        return instantNotePicture;
    }

    private boolean deleteOneInstantNotePicture(String absoluteNotePicturePath){
        String basePath= InstantNoteFileUtil.getInstantNotePictureBasePath();
        File file=new File(basePath,absoluteNotePicturePath);
        if(!file.exists()){
            throw new IllegalArgumentException("需要删除的朋友圈照片不存在!");
        }
        boolean isDelete=FileUtil.deleteFile(file);
        if(!isDelete){
            throw new IllegalArgumentException("朋友圈照片删除失败");
        }
        return isDelete;
    }

    public JsonArray parseListInstantNotePictureToJsonArray(List<InstantNotePicture> listInstantNotePicture){
        JsonArray jsonArray=new JsonArray();
        for (InstantNotePicture picture:listInstantNotePicture) {
                JsonObject onePictureJsonoObject=parseInstantNotePictureToJsonObject(picture);
                jsonArray.add(onePictureJsonoObject);
        }
        return jsonArray;
    }

    private JsonObject parseInstantNotePictureToJsonObject(InstantNotePicture picture){
        JsonObject jsonObject=new JsonObject();
        Integer instantNotePictureId=picture.getInstantNotePictureId();
        String picturePath=picture.getPicturePath();
        jsonObject.addProperty("instantNotePictureId",instantNotePictureId);
        jsonObject.addProperty("picturePath",picturePath);
        return jsonObject;
    }

    private String getPictureName(MultipartFile file){
        String fileName=file.getOriginalFilename();
        String uuid= UUID.randomUUID().toString();
        return uuid+"_"+fileName;
    }



}
