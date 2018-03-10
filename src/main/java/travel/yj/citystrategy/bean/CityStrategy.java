package travel.yj.citystrategy.bean;

import java.util.Date;

public class CityStrategy {
    private Integer cityStrategyId;

    private String path;

    private String cityname;

    private String cityStart;

    private String attrativeSeason;

    private String description;

    private String attrativeFoot;

    private String attrativeScenic;

    private Date gmtCreate;

    private Date gmtModifited;

    private String content;

    public Integer getCityStrategyId() {
        return cityStrategyId;
    }

    public void setCityStrategyId(Integer cityStrategyId) {
        this.cityStrategyId = cityStrategyId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getCityStart() {
        return cityStart;
    }

    public void setCityStart(String cityStart) {
        this.cityStart = cityStart == null ? null : cityStart.trim();
    }

    public String getAttrativeSeason() {
        return attrativeSeason;
    }

    public void setAttrativeSeason(String attrativeSeason) {
        this.attrativeSeason = attrativeSeason == null ? null : attrativeSeason.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAttrativeFoot() {
        return attrativeFoot;
    }

    public void setAttrativeFoot(String attrativeFoot) {
        this.attrativeFoot = attrativeFoot == null ? null : attrativeFoot.trim();
    }

    public String getAttrativeScenic() {
        return attrativeScenic;
    }

    public void setAttrativeScenic(String attrativeScenic) {
        this.attrativeScenic = attrativeScenic == null ? null : attrativeScenic.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}