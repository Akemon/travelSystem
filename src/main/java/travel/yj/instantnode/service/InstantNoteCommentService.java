package travel.yj.instantnode.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import travel.hk.userinfo.bean.UserInfo;
import travel.yj.instantnode.bean.InstantNote;
import travel.yj.instantnode.bean.InstantNoteComment;
import travel.yj.instantnode.mapper.InstantNoteCommentMapper;
import travel.yj.instantnode.util.DateUtil;

import java.util.Date;
import java.util.List;

/**
 * @author 杨景
 */
@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class InstantNoteCommentService {

    @Autowired
    private InstantNoteService instantNoteService;
    @Autowired
    private InstantNoteCommentMapper instantNoteCommentMapper;

    /**
     * 新增评论
     * @param instantNoteId 被评论的朋友圈Id
     * @param createrId 评论创建者Id
     * @param replyUserId 被回复的评论的创建者Id
     * @param content 评论内容
     * @return 添加评论的结果
     */
    public String addInstantNoteComment(Integer instantNoteId,String createrId,String replyUserId,String content){
        //1.转换成对应的InstantNoteComment
        InstantNoteComment instantNoteComment=parseToInstantNoteComment(instantNoteId,createrId,replyUserId,content);
        //2.校验参数
        if(!checkNewParams(instantNoteComment)){
            return "Error";
        }
        //3.插入数据库
        instantNoteCommentMapper.insert(instantNoteComment);
        return "发布评论成功!";
    }

    /**
     * 根据instantNoteId 删除对应的所有留言
     * @param instantNoteId 需要删除的instantNoteId
     * @return 删除结果
     */
    public String deleteListInstantNoteComment(Integer instantNoteId){
        //1.删除instantNoteId 对应的所有留言
        instantNoteCommentMapper.deleteListInstantNoteCommentByInstantNoteId(instantNoteId);
        return "删除成功!";
    }

    /**
     * 根据Id删除对应的朋友圈评论
     * @param instantNoteCommentId 朋友圈评论Id
     * @return 删除结果
     */
    public String deleteOneInstantNoteCommentById(Integer instantNoteCommentId){
        instantNoteCommentMapper.deleteByPrimaryKey(instantNoteCommentId);
        return "评论删除成功!";
    }


    public JsonArray parseListInstantNoteCommonToJsonArray(List<InstantNoteComment> listInstantNoteComment){
        JsonArray jsonArray=new JsonArray();
        for(int i=0;i<listInstantNoteComment.size();i++){
            InstantNoteComment oneComment=listInstantNoteComment.get(i);
            JsonObject oneCommentJsonObject=parseInstantNoteCommonToJsonObject(oneComment);
            jsonArray.add(oneCommentJsonObject);
        }
        return jsonArray;
    }

    private JsonObject parseInstantNoteCommonToJsonObject(InstantNoteComment instantNoteComment){
        JsonObject jsonObject=new JsonObject();

        String comment=instantNoteComment.getComment();
        Date createTime=instantNoteComment.getGmtCreate();
        Integer instantNoteCommentId=instantNoteComment.getInstantNoteCommentId();
        //评论创建者
        UserInfo createrUserInfo=instantNoteComment.getUserInfo();
        String createrUserName=createrUserInfo.getName();
        //回复谁的评论
        UserInfo replyCommentUser=instantNoteComment.getReplyCommentUser();

        jsonObject.addProperty("instantNoteCommentId",instantNoteCommentId);
        jsonObject.addProperty("comment",comment);
        jsonObject.addProperty("createrName",createrUserName);

        boolean isReplyOther=(replyCommentUser!=null);
        if(isReplyOther){
            jsonObject.addProperty("isReplyOther","true");
            jsonObject.addProperty("replyOtherName",replyCommentUser.getName());
        }else{
            jsonObject.addProperty("isReplyOther","false");
            jsonObject.addProperty("replyOtherName","");
        }

        jsonObject.addProperty("createTime", DateUtil.formatDate(createTime));
        return jsonObject;
    }

    private InstantNoteComment parseToInstantNoteComment(Integer instantNoteId,String createrId,String replyUserId,String content){
        InstantNoteComment instantNoteComment=new InstantNoteComment();
        instantNoteComment.setComment(content);
        instantNoteComment.setGmtCreate(new Date());
        instantNoteComment.setGmtModifited(new Date());
        instantNoteComment.setInstantNoteId(instantNoteId);
        instantNoteComment.setIsAccuse(false);
        instantNoteComment.setLikeNumber(0);
        instantNoteComment.setUserId(createrId);
        instantNoteComment.setReplyCommentUserId(replyUserId);
        return instantNoteComment;
    }

    private boolean checkNewParams(InstantNoteComment instantNoteComment){
        String content=instantNoteComment.getComment();
        Integer instantNoteId=instantNoteComment.getInstantNoteId();
        String createrId=instantNoteComment.getUserId();
        String replyUserId=instantNoteComment.getReplyCommentUserId();
        if(content==null||content.trim().length()==0){
            throw new IllegalArgumentException("评论内容不能为空!");
        }
        return true;
    }

}
