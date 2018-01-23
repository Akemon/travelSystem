package travel.yj.instantnode.bean;

import travel.hk.userinfo.bean.UserInfo;

import java.util.Date;
import java.util.List;

public class InstantNote {
    private Integer instantNoteId;

    private String userId;

    private UserInfo userInfo;//用户信息

    private String content;

    private String location;

    private Integer likeNumber;

    private Boolean isAccuse;

    private Date gmtCreate;

    private Date gmtModifited;

    private List<InstantNotePicture> listInstantNotePicture;//朋友圈对应的图片

    private List<InstantNoteComment> listInstantNodeComment;//朋友圈对应的评论

    public List<InstantNoteComment> getListInstantNodeComment() {
        return listInstantNodeComment;
    }

    public void setListInstantNodeComment(List<InstantNoteComment> listInstantNodeComment) {
        this.listInstantNodeComment = listInstantNodeComment;
    }

    public List<InstantNotePicture> getListInstantNotePicture() {
        return listInstantNotePicture;
    }

    public void setListInstantNotePicture(List<InstantNotePicture> listInstantNotePicture) {
        this.listInstantNotePicture = listInstantNotePicture;
    }

    public Integer getInstantNoteId() {
        return instantNoteId;
    }

    public void setInstantNoteId(Integer instantNoteId) {
        this.instantNoteId = instantNoteId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
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

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}