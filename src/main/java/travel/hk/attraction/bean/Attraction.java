package travel.hk.attraction.bean;

import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.List;

public class Attraction {
    private Integer touristAttractionId;

    private String name;

    private String description;

    private String location;

    private String longitude;

    private String latitude;

    private String zoomLevel;

    private Integer listenNumber;

    private String picture;

    private String openTime;

    private String touristAttractionLevel;

    private String price;

    private String goodPlace;

    private String hotLevel;

    private String transportation;

    private Date gmtCreate;

    private Date gmtModifited;

    //图片文件
//    private List<ResponseEntity<byte[]>> pictureList;
//
//    public List<ResponseEntity<byte[]>> getPictureList() {
//        return pictureList;
//    }

//    public void setPictureList(List<ResponseEntity<byte[]>> pictureList) {
//        this.pictureList = pictureList;
//    }

    public Integer getTouristAttractionId() {
        return touristAttractionId;
    }

    public void setTouristAttractionId(Integer touristAttractionId) {
        this.touristAttractionId = touristAttractionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getZoomLevel() {
        return zoomLevel;
    }

    public void setZoomLevel(String zoomLevel) {
        this.zoomLevel = zoomLevel == null ? null : zoomLevel.trim();
    }

    public Integer getListenNumber() {
        return listenNumber;
    }

    public void setListenNumber(Integer listenNumber) {
        this.listenNumber = listenNumber;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }

    public String getTouristAttractionLevel() {
        return touristAttractionLevel;
    }

    public void setTouristAttractionLevel(String touristAttractionLevel) {
        this.touristAttractionLevel = touristAttractionLevel == null ? null : touristAttractionLevel.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getGoodPlace() {
        return goodPlace;
    }

    public void setGoodPlace(String goodPlace) {
        this.goodPlace = goodPlace == null ? null : goodPlace.trim();
    }

    public String getHotLevel() {
        return hotLevel;
    }

    public void setHotLevel(String hotLevel) {
        this.hotLevel = hotLevel == null ? null : hotLevel.trim();
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation == null ? null : transportation.trim();
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