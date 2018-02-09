package travel.yj.followlist.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import travel.hk.userinfo.bean.UserInfo;
import travel.yj.followlist.bean.FollowPeopleList;
import travel.yj.followlist.mapper.FollowPeopleListMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 杨景
 */
@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class FollowPeopleListService {

    @Autowired
    private FollowPeopleListMapper followPeopleListMapper;

    /**
     * 新增关注
     * @param hostUserId 被关注者Id
     * @param followUserId 主动关注他人的id
     * @return 关注结果
     */
    public String followSomeone(String hostUserId, String followUserId){
        //1.确定是否已经关注
        FollowPeopleList followPeopleList=followPeopleListMapper.selectByHostUserIdAndFollowUserId(hostUserId,followUserId);
        if(followPeopleList!=null){
            UserInfo hostUser=followPeopleList.getHostUser();
            throw new IllegalArgumentException("您已经关注了:"+hostUser.getName()+" ,无需再关注!");
        }
        //2.是否关注自己
        if(hostUserId.equals(followUserId)){
            throw new IllegalArgumentException("请不要关注自己!");
        }
        //3.新增关注信息
        FollowPeopleList newFollowPeopleList=parseToFollowPeopleList(hostUserId,followUserId);
        //4.插入关注信息
        followPeopleListMapper.insert(newFollowPeopleList);
        return "关注成功!";
    }

    /**
     * 取消关注
     * @param followPeopleListId 关注信息列表Id
     * @return 取消关注结果
     */
    public String cancelFollowSomeOne(Integer followPeopleListId){
        int deleteNumber=followPeopleListMapper.deleteByPrimaryKey(followPeopleListId);
        if(deleteNumber!=1){
            throw new IllegalArgumentException("取消关注异常!");
        }
        return "取消关注成功!";
    }

    /**
     * 获取我关注的用户列表
     * @param followUserId
     * @return 我关注的用户列表Json字符串
     */
    public String selectMyFollowList(String followUserId){
        List<FollowPeopleList> list=followPeopleListMapper.selectByFollowUserId(followUserId);
        JsonArray jsonArray=parseListFollowPeopleListToJsonArray(list);
        return jsonArray.toString();
    }

    /**
     * 获取关注我的用户列表
     * @param hostUserId 我的用户Id
     * @return 关注我的用户列表的Json字符串
     */
    public String selectMyFans(String hostUserId){
        List<FollowPeopleList> list=followPeopleListMapper.selectByHostUserId(hostUserId);
        JsonArray jsonArray=parseListFollowPeopleListToJsonArray(list);
        return jsonArray.toString();
    }

    /**
     * 获取关注我的用户列表
     * @param followUserId 我的用户Id
     * @return 关注我的用户列表的Json字符串
     */
    public String selectMyFollowUser(String followUserId){
        List<FollowPeopleList> list=followPeopleListMapper.selectByFollowUserId(followUserId);
        JsonArray jsonArray=parseListFollowPeopleListToJsonArray(list);
        return jsonArray.toString();
    }


    /**
     * 获取我关注的 用户Id
     * @param followUserId 我的用户Id
     * @return
     */
    public List<String> selectListMyFollowUserId(String followUserId){
        List<FollowPeopleList> listFollowPeopleList=followPeopleListMapper.selectByFollowUserId(followUserId);
        //我关注的用户Id列表
        List<String> listMyFollowUserId=new ArrayList<String>();
        for(FollowPeopleList oneFollowPeople:listFollowPeopleList){
            String userId=oneFollowPeople.getHostUserId();
            listMyFollowUserId.add(userId);
        }
        return listMyFollowUserId;
    }


    private FollowPeopleList parseToFollowPeopleList(String hostUserId,String followUserId){
        FollowPeopleList followPeopleList=new FollowPeopleList();
        followPeopleList.setFollowUserId(followUserId);
        followPeopleList.setHostUserId(hostUserId);
        followPeopleList.setGmtCreate(new Date());
        followPeopleList.setGmtModifited(new Date());
        return followPeopleList;
    }

    private JsonArray parseListFollowPeopleListToJsonArray(List<FollowPeopleList> listFollowPeople){
        JsonArray jsonArray=new JsonArray();
        for(FollowPeopleList followPeople:listFollowPeople){
            JsonObject jsonObject=new JsonObject();
            //被关注人信息
            UserInfo hostUserInfo=followPeople.getHostUser();
            String hostUserName=hostUserInfo.getName();
            String hostUserId=hostUserInfo.getUserId();
            //关注人信息
            UserInfo followUserInfo=followPeople.getFollowUser();
            String followUserName=followUserInfo.getName();
            String followUserId=followUserInfo.getUserId();
            Integer followPeopleId=followPeople.getFollowPeopleListId();

            jsonObject.addProperty("hostUserName",hostUserName);
            jsonObject.addProperty("hostUserId",hostUserId);
            jsonObject.addProperty("followUserName",followUserName);
            jsonObject.addProperty("followUserId",followUserId);
            jsonObject.addProperty("followPeopleListId",followPeopleId);
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }
}
