package travel.yj.instantnode.bean;
/**
 * @author 杨景
 */
public class InstantNotePicture {
    private Integer instantNotePictureId;

    private Integer instantNoteId;

    /**
     * 朋友圈内容
     */
    private InstantNote instantNote;

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

    public InstantNote getInstantNote() {
        return instantNote;
    }

    public void setInstantNote(InstantNote instantNote) {
        this.instantNote = instantNote;
    }
}