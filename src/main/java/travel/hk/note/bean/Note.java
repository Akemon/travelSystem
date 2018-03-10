package travel.hk.note.bean;

import java.util.Date;

public class Note {
    private Integer travelNoteId;

    private String title;

    private String userId;

    private Integer touristDay;

    private String spendMoney;

    private String partner;

    private Integer touristAttractionId;

    private Integer likeNumber;

    private Integer collectNumber;

    private Integer commentNumber;

    private Integer scanNumber;

    private Date gmtCreate;

    private Date gmtModifited;

    //游记的内容
    private Content content;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Integer getTravelNoteId() {
        return travelNoteId;
    }

    public void setTravelNoteId(Integer travelNoteId) {
        this.travelNoteId = travelNoteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getTouristDay() {
        return touristDay;
    }

    public void setTouristDay(Integer touristDay) {
        this.touristDay = touristDay;
    }

    public String getSpendMoney() {
        return spendMoney;
    }

    public void setSpendMoney(String spendMoney) {
        this.spendMoney = spendMoney == null ? null : spendMoney.trim();
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    public Integer getTouristAttractionId() {
        return touristAttractionId;
    }

    public void setTouristAttractionId(Integer touristAttractionId) {
        this.touristAttractionId = touristAttractionId;
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }

    public Integer getCollectNumber() {
        return collectNumber;
    }

    public void setCollectNumber(Integer collectNumber) {
        this.collectNumber = collectNumber;
    }

    public Integer getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }

    public Integer getScanNumber() {
        return scanNumber;
    }

    public void setScanNumber(Integer scanNumber) {
        this.scanNumber = scanNumber;
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