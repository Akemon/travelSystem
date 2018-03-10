package travel.hk.note.bean;

import travel.hk.userinfo.bean.UserInfo;

import java.util.Date;

public class NoteCollection {
    private Integer travelNoteCollectionId;

    private Integer travelNoteId;

    private String collectUserId;

    //收藏者用户的个人信息
    private UserInfo userInfo;

    //游记的详细信息
    private Note note;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    private Date gmtCreate;

    private Date gmtModifited;

    public Integer getTravelNoteCollectionId() {
        return travelNoteCollectionId;
    }

    public void setTravelNoteCollectionId(Integer travelNoteCollectionId) {
        this.travelNoteCollectionId = travelNoteCollectionId;
    }

    public Integer getTravelNoteId() {
        return travelNoteId;
    }

    public void setTravelNoteId(Integer travelNoteId) {
        this.travelNoteId = travelNoteId;
    }

    public String getCollectUserId() {
        return collectUserId;
    }

    public void setCollectUserId(String collectUserId) {
        this.collectUserId = collectUserId == null ? null : collectUserId.trim();
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