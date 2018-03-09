package travel.hk.note.bean;

public class Content {
    private Integer travelNoteContentId;

    private Integer travelNoteId;

    private String travelNoteContent;

    public Integer getTravelNoteContentId() {
        return travelNoteContentId;
    }

    public void setTravelNoteContentId(Integer travelNoteContentId) {
        this.travelNoteContentId = travelNoteContentId;
    }

    public Integer getTravelNoteId() {
        return travelNoteId;
    }

    public void setTravelNoteId(Integer travelNoteId) {
        this.travelNoteId = travelNoteId;
    }

    public String getTravelNoteContent() {
        return travelNoteContent;
    }

    public void setTravelNoteContent(String travelNoteContent) {
        this.travelNoteContent = travelNoteContent == null ? null : travelNoteContent.trim();
    }
}