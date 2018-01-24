package travel.yj.instantnode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import travel.yj.instantnode.bean.InstantNote;
import travel.yj.instantnode.mapper.InstantNoteMapper;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class InstantNoteService {

    @Autowired
    private InstantNoteMapper instantNoteMapper;
    @Autowired
    private InstantNoteService instantNoteService;
    @Autowired
    private InstantNotePictureService instantNotePictureService;


    //1.添加一条朋友圈
    public String  addOneInstantNote(String createrId, String content, String location, HttpServletRequest request){
        InstantNote newInstantNote=new InstantNote();
        //1.转换成InstantNote
        InstantNote instantNote=parseInstantNote(createrId,content,location);

        //2.校验参数
        if(!checkInsertParams(instantNote)){
            return "Error";
        }

        //3.插入数据库
        instantNoteMapper.insert(instantNote);

        //4.插入对应的图片,无论有没有新增图片,都要调用，对应的方法会进行判断
        Integer instantNoteId=instantNote.getInstantNoteId();
        instantNotePictureService.addListInstantNotePicture(instantNoteId,request);

        return "内容发布成功!";
    }

    //2.删除朋友圈内容
    public String deleteOneInstantNote(Integer instantNoteId){
        return null;
    }

    //3.查看我发过的朋友圈
    public String selectMyCreateInstantNote(String myId){
        return null;
    }

    //4.查看我的朋友圈
    public String selectMyInstantNote(String myId){
        return null;
    }

    private InstantNote parseInstantNote(String createrId,String content,String location){
        InstantNote newInstantNote=new InstantNote();
        newInstantNote.setContent(content);
        newInstantNote.setGmtCreate(new Date());
        newInstantNote.setGmtModifited(new Date());
        newInstantNote.setIsAccuse(false);
        newInstantNote.setLikeNumber(0);
        newInstantNote.setLocation(location);
        newInstantNote.setUserId(createrId);
        return newInstantNote;
    }

    private boolean checkInsertParams(InstantNote checkInstantNote){
        throw new IllegalArgumentException("功能未实现!");
    }

}
