package travel.yj.instantnode.service;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import travel.yj.instantnode.bean.InstantNote;
import travel.yj.instantnode.bean.InstantNotePicture;
import travel.yj.instantnode.mapper.InstantNotePictureMapper;
import travel.yj.instantnode.util.InstantNoteFileUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class InstantNotePictureService {

    @Autowired
    private InstantNotePictureMapper instantNotePictureMapper;
    @Autowired
    private InstantNoteService instantNoteService;


    //查找朋友圈的相片
    public List<InstantNotePicture> listInstantNotePictureByInstantNoteId(Integer instantNoteId){
            return null;
    }

    //删除朋友圈的图片

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
            listPicturePath.add(picture.getPicturePath());//记录文件路径
            instantNotePictureMapper.deleteByPrimaryKey(picture.getInstantNotePictureId());
        }
        return listPicturePath;
    }

    public boolean deleteListInstantNotePictureInFileSystem(List<String> listAbsoluteNotePicturePath){
        if(listAbsoluteNotePicturePath.size()==0){
            return true;
        }
        //删除文件系统的朋友圈照片
        for (String instantNotePicturePath:listAbsoluteNotePicturePath) {
            deleteOneInstantNotePicture(instantNotePicturePath);
        }
        return true;
    }

    /**
     * 添加朋友圈相片
     * @param instantNoteId 朋友圈内容Id
     * @param request 包含图片（或者不包含图片）的request
     * @return true or false
     */
    public String addListInstantNotePicture(Integer instantNoteId,HttpServletRequest request){
        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
                request.getSession().getServletContext());
        String basePath= InstantNoteFileUtil.getInstantNotePictureBasePath();
        //检查form中是否有enctype="multipart/form-data"
        if(multipartResolver.isMultipart(request)){
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;

            //获取multiRequest 中所有的文件名
            Iterator iter=multiRequest.getFileNames();
            while(iter.hasNext())
            {
                //一次遍历所有文件
                MultipartFile file=multiRequest.getFile(iter.next().toString());
                if(file!=null)
                {
                    //存储路径:D:\travelSystem\instantNote\picture\朋友圈Id\文件名
                    //relativePath 相对路径
                    String relativePath=instantNoteId+File.separator+file.getOriginalFilename();

                    //插入数据库
                    insertIntoDB(instantNoteId,relativePath);

                    //上传至文件系统
                    try {
                        file.transferTo(new File(basePath,relativePath));
                    }catch (IOException e){
                        e.printStackTrace();
                        throw new IllegalArgumentException("服务器错误!储存照片至文件系统出错!",e);
                    }


                }
            }
        }
        return "照片添加成功!";
    }

    private void insertIntoDB(Integer instantNoteId,String relativePath){
        InstantNotePicture instantNotePicture=new InstantNotePicture();
        instantNotePicture.setInstantNoteId(instantNoteId);
        instantNotePicture.setPicturePath(relativePath);
        instantNotePictureMapper.insert(instantNotePicture);
    }

    private boolean deleteOneInstantNotePicture(String absoluteNotePicturePath){
        String basePath= InstantNoteFileUtil.getInstantNotePictureBasePath();
        File file=new File(basePath,absoluteNotePicturePath);
        if(!file.exists()){
            throw new IllegalArgumentException("需要删除的朋友圈照片不存在!");
        }
        boolean isDelete=file.delete();
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



}
