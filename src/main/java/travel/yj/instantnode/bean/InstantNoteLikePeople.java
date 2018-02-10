package travel.yj.instantnode.bean;

import travel.hk.userinfo.bean.UserInfo;

import java.util.Date;

/**@author 杨景 */
public class InstantNoteLikePeople {
    private Integer instantNoteId;

    private InstantNote instantNote;

    private String userId;

    private UserInfo userInfo;

    private Date gmtCreate;

    private Date gmtModified;

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

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public InstantNote getInstantNote() {
        return instantNote;
    }

    public void setInstantNote(InstantNote instantNote) {
        this.instantNote = instantNote;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}