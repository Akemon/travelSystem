package travel.hk.note.bean;

import travel.hk.userinfo.bean.UserInfo;

import java.util.Date;

public class Comment {
    private Integer travelNoteCommentId;

    //评论的游记id
    private Integer followTravelNoteId;

    private String content;

    private String likeNumber;

    //评论者的id
    private String createId;

    //标记回复时的评论ID
   private int signReplyCommentId;

    public int getSignReplyCommentId() {
        return signReplyCommentId;
    }

    public void setSignReplyCommentId(int signReplyCommentId) {
        this.signReplyCommentId = signReplyCommentId;
    }

    //评论者的用户详细信息
    private UserInfo createUserInfo;

    //回复某人的回复者id
    private String replyCommentId;

    public UserInfo getCreateUserInfo() {
        return createUserInfo;
    }

    public void setCreateUserInfo(UserInfo createUserInfo) {
        this.createUserInfo = createUserInfo;
    }

    public UserInfo getReplyUserInfo() {
        return replyUserInfo;
    }

    public void setReplyUserInfo(UserInfo replyUserInfo) {
        this.replyUserInfo = replyUserInfo;
    }

    public Boolean getAccuse() {
        return isAccuse;
    }

    public void setAccuse(Boolean accuse) {
        isAccuse = accuse;
    }

    //回复者的用户详细信息
    private UserInfo replyUserInfo;

    private Boolean isAccuse;

    private Date gmtCreate;

    private Date gmtModifited;

    public Integer getTravelNoteCommentId() {
        return travelNoteCommentId;
    }

    public void setTravelNoteCommentId(Integer travelNoteCommentId) {
        this.travelNoteCommentId = travelNoteCommentId;
    }

    public Integer getFollowTravelNoteId() {
        return followTravelNoteId;
    }

    public void setFollowTravelNoteId(Integer followTravelNoteId) {
        this.followTravelNoteId = followTravelNoteId;
    }



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(String likeNumber) {
        this.likeNumber = likeNumber == null ? null : likeNumber.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public String getReplyCommentId() {
        return replyCommentId;
    }

    public void setReplyCommentId(String replyCommentId) {
        this.replyCommentId = replyCommentId == null ? null : replyCommentId.trim();
    }

    public Boolean getIsAccuse() {
        return isAccuse;
    }

    public void setIsAccuse(Boolean isAccuse) {
        this.isAccuse = isAccuse;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }



    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModifited() {
        return gmtModifited;
    }

    public void setGmtModifited(Date gmtModifited) {
        this.gmtModifited = gmtModifited;
    }
}