package travel.yj.instantnode.service;


import org.springframework.stereotype.Service;
import travel.yj.instantnode.bean.InstantNotePicture;

import java.io.File;
import java.util.List;

@Service
public class InstantNotePictureService {

    //查找朋友圈的相片
    public List<InstantNotePicture> listInstantNotePictureByInstantNoteId(Integer instantNoteId){
            return null;
    }

    //删除朋友圈的图片
    public String deleteListInstantNotePictureByInstantNoteId(Integer instantNoteId){
        return null;
    }

    //添加相片
    public String addListInstantNotePicture(Integer instantNoteId,List<File> listPicture){
        return null;
    }
}
