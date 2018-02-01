package travel.yj.instantnode.bean;

import travel.hk.userinfo.bean.UserInfo;

import java.util.Date;

/**
 * @author 杨景
 */
public class InstantNoteComment {
    private Integer instantNoteCommentId;

    private Integer instantNoteId;

    /**
     *   评论的朋友圈
     */
    private InstantNote instantNote;

    private String comment;

    private Integer likeNumber;

    private String userId;

    /**
     * 用户信息
     */
    private UserInfo userInfo;

    private Integer replyCommentId;

    /**
     * 回复的评论
     */
    private InstantNoteComment replyComment;

    private Boolean isAccuse;

    private Date gmtCreate;

    private Date gmtModifited;

    private String replyCommentUserId;

    private UserInfo replyCommentUser;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Integer getInstantNoteCommentId() {
        return instantNoteCommentId;
    }

    public void setInstantNoteCommentId(Integer instantNoteCommentId) {
        this.instantNoteCommentId = instantNoteCommentId;
    }

    public Integer getInstantNoteId() {
        return instantNoteId;
    }

    public void setInstantNoteId(Integer instantNoteId) {
        this.instantNoteId = instantNoteId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getReplyCommentId() {
        return replyCommentId;
    }

    public void setReplyCommentId(Integer replyCommentId) {
        this.replyCommentId = replyCommentId;
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

    public InstantNote getInstantNote() {
        return instantNote;
    }

    public void setInstantNote(InstantNote instantNote) {
        this.instantNote = instantNote;
    }

    public InstantNoteComment getReplyComment() {
        return replyComment;
    }

    public void setReplyComment(InstantNoteComment replyComment) {
        this.replyComment = replyComment;
    }

    public String getReplyCommentUserId() {
        return replyCommentUserId;
    }

    public UserInfo getReplyCommentUser() {
        return replyCommentUser;
    }

    public void setReplyCommentUserId(String replyCommentUserId) {
        this.replyCommentUserId = replyCommentUserId;
    }

    public void setReplyCommentUser(UserInfo replyCommentUser) {
        this.replyCommentUser = replyCommentUser;
    }
}