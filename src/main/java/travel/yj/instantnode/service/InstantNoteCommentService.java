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

    public String addInstantNoteComment(){
        return null;
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

}
