package travel.yj.instantnode.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import travel.yj.instantnode.bean.InstantNotePicture;
import travel.yj.instantnode.mapper.InstantNotePictureMapper;
import travel.yj.instantnode.util.InstantNoteFileUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class InstantNotePictureService {

    @Autowired
    private InstantNotePictureMapper instantNotePictureMapper;

    //查找朋友圈的相片
    public List<InstantNotePicture> listInstantNotePictureByInstantNoteId(Integer instantNoteId){
            return null;
    }

    //删除朋友圈的图片
    public String deleteListInstantNotePictureByInstantNoteId(Integer instantNoteId){
        return null;
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



}
