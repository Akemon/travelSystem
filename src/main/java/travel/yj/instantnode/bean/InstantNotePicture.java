package travel.yj.instantnode.bean;

public class InstantNotePicture {
    private Integer instantNotePictureId;

    private Integer instantNoteId;

    private String picturePath;

    public Integer getInstantNotePictureId() {
        return instantNotePictureId;
    }

    public void setInstantNotePictureId(Integer instantNotePictureId) {
        this.instantNotePictureId = instantNotePictureId;
    }

    public Integer getInstantNoteId() {
        return instantNoteId;
    }

    public void setInstantNoteId(Integer instantNoteId) {
        this.instantNoteId = instantNoteId;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath == null ? null : picturePath.trim();
    }
}