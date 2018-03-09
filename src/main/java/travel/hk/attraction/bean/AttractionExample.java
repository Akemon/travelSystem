package travel.hk.attraction.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttractionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttractionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTouristAttractionIdIsNull() {
            addCriterion("tourist_attraction_id is null");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionIdIsNotNull() {
            addCriterion("tourist_attraction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionIdEqualTo(Integer value) {
            addCriterion("tourist_attraction_id =", value, "touristAttractionId");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionIdNotEqualTo(Integer value) {
            addCriterion("tourist_attraction_id <>", value, "touristAttractionId");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionIdGreaterThan(Integer value) {
            addCriterion("tourist_attraction_id >", value, "touristAttractionId");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tourist_attraction_id >=", value, "touristAttractionId");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionIdLessThan(Integer value) {
            addCriterion("tourist_attraction_id <", value, "touristAttractionId");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionIdLessThanOrEqualTo(Integer value) {
            addCriterion("tourist_attraction_id <=", value, "touristAttractionId");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionIdIn(List<Integer> values) {
            addCriterion("tourist_attraction_id in", values, "touristAttractionId");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionIdNotIn(List<Integer> values) {
            addCriterion("tourist_attraction_id not in", values, "touristAttractionId");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionIdBetween(Integer value1, Integer value2) {
            addCriterion("tourist_attraction_id between", value1, value2, "touristAttractionId");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tourist_attraction_id not between", value1, value2, "touristAttractionId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andZoomLevelIsNull() {
            addCriterion("zoom_level is null");
            return (Criteria) this;
        }

        public Criteria andZoomLevelIsNotNull() {
            addCriterion("zoom_level is not null");
            return (Criteria) this;
        }

        public Criteria andZoomLevelEqualTo(String value) {
            addCriterion("zoom_level =", value, "zoomLevel");
            return (Criteria) this;
        }

        public Criteria andZoomLevelNotEqualTo(String value) {
            addCriterion("zoom_level <>", value, "zoomLevel");
            return (Criteria) this;
        }

        public Criteria andZoomLevelGreaterThan(String value) {
            addCriterion("zoom_level >", value, "zoomLevel");
            return (Criteria) this;
        }

        public Criteria andZoomLevelGreaterThanOrEqualTo(String value) {
            addCriterion("zoom_level >=", value, "zoomLevel");
            return (Criteria) this;
        }

        public Criteria andZoomLevelLessThan(String value) {
            addCriterion("zoom_level <", value, "zoomLevel");
            return (Criteria) this;
        }

        public Criteria andZoomLevelLessThanOrEqualTo(String value) {
            addCriterion("zoom_level <=", value, "zoomLevel");
            return (Criteria) this;
        }

        public Criteria andZoomLevelLike(String value) {
            addCriterion("zoom_level like", value, "zoomLevel");
            return (Criteria) this;
        }

        public Criteria andZoomLevelNotLike(String value) {
            addCriterion("zoom_level not like", value, "zoomLevel");
            return (Criteria) this;
        }

        public Criteria andZoomLevelIn(List<String> values) {
            addCriterion("zoom_level in", values, "zoomLevel");
            return (Criteria) this;
        }

        public Criteria andZoomLevelNotIn(List<String> values) {
            addCriterion("zoom_level not in", values, "zoomLevel");
            return (Criteria) this;
        }

        public Criteria andZoomLevelBetween(String value1, String value2) {
            addCriterion("zoom_level between", value1, value2, "zoomLevel");
            return (Criteria) this;
        }

        public Criteria andZoomLevelNotBetween(String value1, String value2) {
            addCriterion("zoom_level not between", value1, value2, "zoomLevel");
            return (Criteria) this;
        }

        public Criteria andListenNumberIsNull() {
            addCriterion("listen_number is null");
            return (Criteria) this;
        }

        public Criteria andListenNumberIsNotNull() {
            addCriterion("listen_number is not null");
            return (Criteria) this;
        }

        public Criteria andListenNumberEqualTo(Integer value) {
            addCriterion("listen_number =", value, "listenNumber");
            return (Criteria) this;
        }

        public Criteria andListenNumberNotEqualTo(Integer value) {
            addCriterion("listen_number <>", value, "listenNumber");
            return (Criteria) this;
        }

        public Criteria andListenNumberGreaterThan(Integer value) {
            addCriterion("listen_number >", value, "listenNumber");
            return (Criteria) this;
        }

        public Criteria andListenNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("listen_number >=", value, "listenNumber");
            return (Criteria) this;
        }

        public Criteria andListenNumberLessThan(Integer value) {
            addCriterion("listen_number <", value, "listenNumber");
            return (Criteria) this;
        }

        public Criteria andListenNumberLessThanOrEqualTo(Integer value) {
            addCriterion("listen_number <=", value, "listenNumber");
            return (Criteria) this;
        }

        public Criteria andListenNumberIn(List<Integer> values) {
            addCriterion("listen_number in", values, "listenNumber");
            return (Criteria) this;
        }

        public Criteria andListenNumberNotIn(List<Integer> values) {
            addCriterion("listen_number not in", values, "listenNumber");
            return (Criteria) this;
        }

        public Criteria andListenNumberBetween(Integer value1, Integer value2) {
            addCriterion("listen_number between", value1, value2, "listenNumber");
            return (Criteria) this;
        }

        public Criteria andListenNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("listen_number not between", value1, value2, "listenNumber");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("open_time like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("open_time not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelIsNull() {
            addCriterion("tourist_attraction_level is null");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelIsNotNull() {
            addCriterion("tourist_attraction_level is not null");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelEqualTo(String value) {
            addCriterion("tourist_attraction_level =", value, "touristAttractionLevel");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelNotEqualTo(String value) {
            addCriterion("tourist_attraction_level <>", value, "touristAttractionLevel");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelGreaterThan(String value) {
            addCriterion("tourist_attraction_level >", value, "touristAttractionLevel");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("tourist_attraction_level >=", value, "touristAttractionLevel");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelLessThan(String value) {
            addCriterion("tourist_attraction_level <", value, "touristAttractionLevel");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelLessThanOrEqualTo(String value) {
            addCriterion("tourist_attraction_level <=", value, "touristAttractionLevel");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelLike(String value) {
            addCriterion("tourist_attraction_level like", value, "touristAttractionLevel");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelNotLike(String value) {
            addCriterion("tourist_attraction_level not like", value, "touristAttractionLevel");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelIn(List<String> values) {
            addCriterion("tourist_attraction_level in", values, "touristAttractionLevel");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelNotIn(List<String> values) {
            addCriterion("tourist_attraction_level not in", values, "touristAttractionLevel");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelBetween(String value1, String value2) {
            addCriterion("tourist_attraction_level between", value1, value2, "touristAttractionLevel");
            return (Criteria) this;
        }

        public Criteria andTouristAttractionLevelNotBetween(String value1, String value2) {
            addCriterion("tourist_attraction_level not between", value1, value2, "touristAttractionLevel");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceIsNull() {
            addCriterion("good_place is null");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceIsNotNull() {
            addCriterion("good_place is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceEqualTo(String value) {
            addCriterion("good_place =", value, "goodPlace");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceNotEqualTo(String value) {
            addCriterion("good_place <>", value, "goodPlace");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceGreaterThan(String value) {
            addCriterion("good_place >", value, "goodPlace");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("good_place >=", value, "goodPlace");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceLessThan(String value) {
            addCriterion("good_place <", value, "goodPlace");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceLessThanOrEqualTo(String value) {
            addCriterion("good_place <=", value, "goodPlace");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceLike(String value) {
            addCriterion("good_place like", value, "goodPlace");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceNotLike(String value) {
            addCriterion("good_place not like", value, "goodPlace");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceIn(List<String> values) {
            addCriterion("good_place in", values, "goodPlace");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceNotIn(List<String> values) {
            addCriterion("good_place not in", values, "goodPlace");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceBetween(String value1, String value2) {
            addCriterion("good_place between", value1, value2, "goodPlace");
            return (Criteria) this;
        }

        public Criteria andGoodPlaceNotBetween(String value1, String value2) {
            addCriterion("good_place not between", value1, value2, "goodPlace");
            return (Criteria) this;
        }

        public Criteria andHotLevelIsNull() {
            addCriterion("hot_level is null");
            return (Criteria) this;
        }

        public Criteria andHotLevelIsNotNull() {
            addCriterion("hot_level is not null");
            return (Criteria) this;
        }

        public Criteria andHotLevelEqualTo(String value) {
            addCriterion("hot_level =", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelNotEqualTo(String value) {
            addCriterion("hot_level <>", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelGreaterThan(String value) {
            addCriterion("hot_level >", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelGreaterThanOrEqualTo(String value) {
            addCriterion("hot_level >=", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelLessThan(String value) {
            addCriterion("hot_level <", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelLessThanOrEqualTo(String value) {
            addCriterion("hot_level <=", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelLike(String value) {
            addCriterion("hot_level like", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelNotLike(String value) {
            addCriterion("hot_level not like", value, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelIn(List<String> values) {
            addCriterion("hot_level in", values, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelNotIn(List<String> values) {
            addCriterion("hot_level not in", values, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelBetween(String value1, String value2) {
            addCriterion("hot_level between", value1, value2, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andHotLevelNotBetween(String value1, String value2) {
            addCriterion("hot_level not between", value1, value2, "hotLevel");
            return (Criteria) this;
        }

        public Criteria andTransportationIsNull() {
            addCriterion("transportation is null");
            return (Criteria) this;
        }

        public Criteria andTransportationIsNotNull() {
            addCriterion("transportation is not null");
            return (Criteria) this;
        }

        public Criteria andTransportationEqualTo(String value) {
            addCriterion("transportation =", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotEqualTo(String value) {
            addCriterion("transportation <>", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationGreaterThan(String value) {
            addCriterion("transportation >", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationGreaterThanOrEqualTo(String value) {
            addCriterion("transportation >=", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationLessThan(String value) {
            addCriterion("transportation <", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationLessThanOrEqualTo(String value) {
            addCriterion("transportation <=", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationLike(String value) {
            addCriterion("transportation like", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotLike(String value) {
            addCriterion("transportation not like", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationIn(List<String> values) {
            addCriterion("transportation in", values, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotIn(List<String> values) {
            addCriterion("transportation not in", values, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationBetween(String value1, String value2) {
            addCriterion("transportation between", value1, value2, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotBetween(String value1, String value2) {
            addCriterion("transportation not between", value1, value2, "transportation");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifitedIsNull() {
            addCriterion("gmt_modifited is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifitedIsNotNull() {
            addCriterion("gmt_modifited is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifitedEqualTo(Date value) {
            addCriterion("gmt_modifited =", value, "gmtModifited");
            return (Criteria) this;
        }

        public Criteria andGmtModifitedNotEqualTo(Date value) {
            addCriterion("gmt_modifited <>", value, "gmtModifited");
            return (Criteria) this;
        }

        public Criteria andGmtModifitedGreaterThan(Date value) {
            addCriterion("gmt_modifited >", value, "gmtModifited");
            return (Criteria) this;
        }

        public Criteria andGmtModifitedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modifited >=", value, "gmtModifited");
            return (Criteria) this;
        }

        public Criteria andGmtModifitedLessThan(Date value) {
            addCriterion("gmt_modifited <", value, "gmtModifited");
            return (Criteria) this;
        }

        public Criteria andGmtModifitedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modifited <=", value, "gmtModifited");
            return (Criteria) this;
        }

        public Criteria andGmtModifitedIn(List<Date> values) {
            addCriterion("gmt_modifited in", values, "gmtModifited");
            return (Criteria) this;
        }

        public Criteria andGmtModifitedNotIn(List<Date> values) {
            addCriterion("gmt_modifited not in", values, "gmtModifited");
            return (Criteria) this;
        }

        public Criteria andGmtModifitedBetween(Date value1, Date value2) {
            addCriterion("gmt_modifited between", value1, value2, "gmtModifited");
            return (Criteria) this;
        }

        public Criteria andGmtModifitedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modifited not between", value1, value2, "gmtModifited");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}