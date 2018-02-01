package travel.yj.followlist.bean;

import travel.hk.userinfo.bean.UserInfo;

import java.util.Date;

public class FollowPeopleList {
    private Integer followPeopleListId;

    private String hostUserId;

    private UserInfo hostUser;

    private String followUserId;

    private UserInfo followUser;

    private Date gmtCreate;

    private Date gmtModifited;

    public Integer getFollowPeopleListId() {
        return followPeopleListId;
    }

    public void setFollowPeopleListId(Integer followPeopleListId) {
        this.followPeopleListId = followPeopleListId;
    }

    public String getHostUserId() {
        return hostUserId;
    }

    public void setHostUserId(String hostUserId) {
        this.hostUserId = hostUserId == null ? null : hostUserId.trim();
    }

    public String getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(String followUserId) {
        this.followUserId = followUserId == null ? null : followUserId.trim();
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

    public UserInfo getHostUser() {
        return hostUser;
    }

    public void setHostUser(UserInfo hostUser) {
        this.hostUser = hostUser;
    }

    public UserInfo getFollowUser() {
        return followUser;
    }

    public void setFollowUser(UserInfo followUser) {
        this.followUser = followUser;
    }
}