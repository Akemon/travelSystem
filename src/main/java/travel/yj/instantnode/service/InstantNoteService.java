package travel.yj.instantnode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import travel.hk.userinfo.service.UserInfoService;
import travel.yj.instantnode.bean.InstantNote;
import travel.yj.instantnode.mapper.InstantNoteMapper;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class InstantNoteService {

    @Autowired
    private InstantNoteMapper instantNoteMapper;
    @Autowired
    private InstantNotePictureService instantNotePictureService;
    @Autowired
    private InstantNoteCommentService instantNoteCommentService;
    @Autowired
    private UserInfoService userInfoService;


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

    /**
     * 删除Id为instantNoteId的朋友圈，包括 评论、照片、朋友圈内容
     * @param instantNoteId
     * @return 删除结果
     */
    public String deleteOneInstantNote(Integer instantNoteId){
        //1.删除数据库朋友圈的照片记录
        List<String> listDeletePicturePath=instantNotePictureService.deleteListInstantNotePictureByInstantNoteId(instantNoteId);

        //2.删除朋友圈的评论
        instantNoteCommentService.deleteListInstantNoteComment(instantNoteId);

        //3.删除朋友圈
        instantNoteMapper.deleteByPrimaryKey(instantNoteId);

        //4.删除文件系统的朋友圈照片,如果删除不成功,抛出异常,回滚前面被删除的数据库记录
        instantNotePictureService.deleteListInstantNotePictureInFileSystem(listDeletePicturePath);
        return "朋友圈删除成功!";
    }

    //3.查看我发过的朋友圈
    public String selectMyCreateInstantNote(String myId){
        return null;
    }

    //4.查看我的朋友圈
    public String selectMyInstantNote(String myId){
        return null;
    }

    /**
     * 根据instantNoteId获取对应的InstantNote
     * @param instantNoteId 需要筛选的instantNoteId
     * @return 对应的instantNote
     */
    public InstantNote selectOneInstantNoteById(Integer instantNoteId){
        return instantNoteMapper.selectByPrimaryKey(instantNoteId);
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
        String createrId=checkInstantNote.getUserId();
        if(userInfoService.getOneUserById(createrId)==null){
            throw new IllegalArgumentException("创建朋友圈的用户不存在!");
        }
        return true;
    }

}
