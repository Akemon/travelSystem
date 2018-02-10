package travel.yj.instantnode.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import travel.hk.userinfo.bean.UserInfo;
import travel.hk.userinfo.service.UserInfoService;
import travel.yj.followlist.service.FollowPeopleListService;
import travel.yj.instantnode.bean.InstantNote;
import travel.yj.instantnode.bean.InstantNoteComment;
import travel.yj.instantnode.bean.InstantNotePicture;
import travel.yj.instantnode.mapper.InstantNoteMapper;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author 杨景
 */
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
    @Autowired
    private FollowPeopleListService followPeopleListService;
    @Autowired
    private InstantNoteLikePeopleService instantNoteLikePeopleService;


    public String  addOneInstantNote(String createrId, String content, String location,List<MultipartFile> listUploadFile){
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
        if(instantNoteId==null){
            throw new IllegalArgumentException("Id为空！");
        }
        instantNotePictureService.addListInstantNotePicture(instantNoteId,listUploadFile);
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


    /**
     * 查看我发过的朋友圈
     * @param myId 我的Id
     * @return JsonArray对应的String
     */
    public String selectMyCreateInstantNote(String myId){
        List<InstantNote> listMyInstantNote = instantNoteMapper.selectByUserId(myId);
        JsonArray jsonArray=parseListInstantNoteToJsonArray(listMyInstantNote);
        return jsonArray.toString();
    }


    /**
     * 获取我的朋友圈
     * @param myId 我的Id
     * @return 我的朋友圈对应的List<InstantNote> 对应的JsonArray String
     */
    public String selectMyInstantNote(String myId){
        //1.获取我的关注的用户列表
        List<String> listMyFollowUserId=followPeopleListService.selectListMyFollowUserId(myId);
        //2.添加我的账号进入列表
        listMyFollowUserId.add(myId);
        //3.构造参数
        String sqlParams=createSqlParams(listMyFollowUserId);
        List<InstantNote> listInstantNote=instantNoteMapper.selectMyInstantNote(sqlParams);
        //4.获取对应的JsonArray
        JsonArray jsonArray=parseListInstantNoteToJsonArray(listInstantNote);
        return jsonArray.toString();
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

    private JsonArray parseListInstantNoteToJsonArray(List<InstantNote> listInstantNote){
        JsonArray jsonArray=new JsonArray();
        for(InstantNote instantNote:listInstantNote){
            JsonObject instantNoteJsonObject=parseInstantNoteToJsonObject(instantNote);
            jsonArray.add(instantNoteJsonObject);
        }
        return jsonArray;
    }

    private JsonObject parseInstantNoteToJsonObject(InstantNote instantNote){
        JsonObject jsonObject=new JsonObject();

        UserInfo createrUser=instantNote.getUserInfo();

        Integer instantNoteId=instantNote.getInstantNoteId();
        String createrName=createrUser.getName();
        String content=instantNote.getContent();
        String location=instantNote.getLocation();
        Integer likeNumber=instantNote.getLikeNumber();
        //一系列评论
        List<InstantNoteComment> listInstantNoteComment=instantNote.getListInstantNodeComment();
        //一系列图片
        List<InstantNotePicture> listInstantNotePicture=instantNote.getListInstantNotePicture();

        JsonArray listInstantNoteCommentJsonArray=instantNoteCommentService.parseListInstantNoteCommonToJsonArray(listInstantNoteComment);
        JsonArray listInstantNotePictureJsonArray=instantNotePictureService.parseListInstantNotePictureToJsonArray(listInstantNotePicture);
        JsonArray listLikePeople=instantNoteLikePeopleService.selectListInstantNoteLikePeopleByInstantNoteId(instantNote.getInstantNoteId());

        jsonObject.addProperty("instantNoteId",instantNoteId);
        jsonObject.addProperty("createrName",createrName);
        jsonObject.addProperty("content",content);
        jsonObject.addProperty("location",location);
        jsonObject.add("listPicture",listInstantNotePictureJsonArray);
        jsonObject.add("listComment",listInstantNoteCommentJsonArray);
        jsonObject.add("listLikePeople",listLikePeople);
        return jsonObject;
    }

    private String createSqlParams(List<String> listId){
        StringBuilder sb=new StringBuilder();
        int count=1;
        int size=listId.size();
        for(String id:listId){
            sb.append("'");
            sb.append(id);
            sb.append("'");
            if(count!=size){
                sb.append(",");
            }
            count++;
        }
        return sb.toString();
    }



}
