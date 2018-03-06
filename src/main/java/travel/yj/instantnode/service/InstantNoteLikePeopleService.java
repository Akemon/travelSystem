package travel.yj.instantnode.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import travel.yj.instantnode.bean.InstantNoteLikePeople;
import travel.yj.instantnode.mapper.InstantNoteLikePeopleMapper;
import travel.common.util.CheckUtil;
import travel.common.util.DateUtil;

import java.util.Date;
import java.util.List;

/**@author 杨景 */
@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class InstantNoteLikePeopleService {

    @Autowired
    private InstantNoteLikePeopleMapper instantNoteLikePeopleMapper;

    public String addInstantNoteLikePeople(Integer instantNoteId,String creatorId){
        //校验参数
        checkParams(instantNoteId,creatorId);

        InstantNoteLikePeople instantNoteLikePeople=new InstantNoteLikePeople();
        instantNoteLikePeople.setInstantNoteId(instantNoteId);
        instantNoteLikePeople.setUserId(creatorId);
        instantNoteLikePeople.setGmtCreate(new Date());
        instantNoteLikePeople.setGmtModified(new Date());

        instantNoteLikePeopleMapper.insert(instantNoteLikePeople);
        return "点赞成功!";
    }

    public String cancelLikeInstantNote(Integer instantNoteId,String creatorId){
        if(instantNoteLikePeopleMapper.selectByPrimaryKey(instantNoteId,creatorId)==null){
            throw new IllegalArgumentException("您没有为这条朋友圈点赞!");
        }
        instantNoteLikePeopleMapper.deleteByPrimaryKey(instantNoteId,creatorId);
        return "取消点赞成功!";
    }

    public JsonArray selectListInstantNoteLikePeopleByInstantNoteId(Integer instantNoteId){
        List<InstantNoteLikePeople> list=instantNoteLikePeopleMapper.selectByInstantNoteId(instantNoteId);
        JsonArray jsonArray=parseListInstantNoteLikePeopleToJsonArray(list);
        return jsonArray;
    }

    private JsonArray parseListInstantNoteLikePeopleToJsonArray(List<InstantNoteLikePeople> listInstantNoteLikePeople){
        JsonArray jsonArray=new JsonArray();
        for(InstantNoteLikePeople likePeople:listInstantNoteLikePeople){
                JsonObject one=parseInstantNotePeopleToJsonObject(likePeople);
                jsonArray.add(one);
        }
        return jsonArray;
    }

    private JsonObject parseInstantNotePeopleToJsonObject(InstantNoteLikePeople instantNoteLikePeople){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("instantNoteId",instantNoteLikePeople.getInstantNoteId());
        jsonObject.addProperty("userName",instantNoteLikePeople.getUserInfo().getName());
        jsonObject.addProperty("userId",instantNoteLikePeople.getUserInfo().getUserId());
        jsonObject.addProperty("gmtCreate", DateUtil.formatDate(instantNoteLikePeople.getGmtCreate()));
        return jsonObject;
    }

    private void checkParams(Integer instantNoteId,String creatorId){
        if(CheckUtil.isIntegerNull(instantNoteId)){
            throw new IllegalArgumentException("点赞的朋友圈Id不能为空");
        }
        if(CheckUtil.isStringNull(creatorId)){
            throw new IllegalArgumentException("点赞者Id不能为空");
        }
        if(instantNoteLikePeopleMapper.selectByPrimaryKey(instantNoteId,creatorId)!=null){
            throw new IllegalArgumentException("您已经为这朋友圈点过赞!无需再次点赞!");
        }
    }


}
