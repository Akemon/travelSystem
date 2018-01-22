package travel.yj.instantnode.bean;

import java.util.Date;

public class InstantNoteComment {
    private Integer instantNoteCommentId;

    private Integer instantNoteId;

    private String comment;

    private Integer likeNumber;

    private String userId;

    private Integer replyCommentId;

    private Boolean isAccuse;

    private Date gmtCreate;

    private Date gmtModifited;

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
}