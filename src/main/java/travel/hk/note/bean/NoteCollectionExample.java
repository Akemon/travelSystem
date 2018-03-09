package travel.hk.note.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoteCollectionExample() {
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

        public Criteria andTravelNoteCollectionIdIsNull() {
            addCriterion("travel_note_collection_id is null");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCollectionIdIsNotNull() {
            addCriterion("travel_note_collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCollectionIdEqualTo(Integer value) {
            addCriterion("travel_note_collection_id =", value, "travelNoteCollectionId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCollectionIdNotEqualTo(Integer value) {
            addCriterion("travel_note_collection_id <>", value, "travelNoteCollectionId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCollectionIdGreaterThan(Integer value) {
            addCriterion("travel_note_collection_id >", value, "travelNoteCollectionId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCollectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("travel_note_collection_id >=", value, "travelNoteCollectionId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCollectionIdLessThan(Integer value) {
            addCriterion("travel_note_collection_id <", value, "travelNoteCollectionId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCollectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("travel_note_collection_id <=", value, "travelNoteCollectionId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCollectionIdIn(List<Integer> values) {
            addCriterion("travel_note_collection_id in", values, "travelNoteCollectionId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCollectionIdNotIn(List<Integer> values) {
            addCriterion("travel_note_collection_id not in", values, "travelNoteCollectionId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCollectionIdBetween(Integer value1, Integer value2) {
            addCriterion("travel_note_collection_id between", value1, value2, "travelNoteCollectionId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCollectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("travel_note_collection_id not between", value1, value2, "travelNoteCollectionId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteIdIsNull() {
            addCriterion("travel_note_id is null");
            return (Criteria) this;
        }

        public Criteria andTravelNoteIdIsNotNull() {
            addCriterion("travel_note_id is not null");
            return (Criteria) this;
        }

        public Criteria andTravelNoteIdEqualTo(Integer value) {
            addCriterion("travel_note_id =", value, "travelNoteId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteIdNotEqualTo(Integer value) {
            addCriterion("travel_note_id <>", value, "travelNoteId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteIdGreaterThan(Integer value) {
            addCriterion("travel_note_id >", value, "travelNoteId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("travel_note_id >=", value, "travelNoteId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteIdLessThan(Integer value) {
            addCriterion("travel_note_id <", value, "travelNoteId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteIdLessThanOrEqualTo(Integer value) {
            addCriterion("travel_note_id <=", value, "travelNoteId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteIdIn(List<Integer> values) {
            addCriterion("travel_note_id in", values, "travelNoteId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteIdNotIn(List<Integer> values) {
            addCriterion("travel_note_id not in", values, "travelNoteId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteIdBetween(Integer value1, Integer value2) {
            addCriterion("travel_note_id between", value1, value2, "travelNoteId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("travel_note_id not between", value1, value2, "travelNoteId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdIsNull() {
            addCriterion("collect_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdIsNotNull() {
            addCriterion("collect_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdEqualTo(String value) {
            addCriterion("collect_user_id =", value, "collectUserId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdNotEqualTo(String value) {
            addCriterion("collect_user_id <>", value, "collectUserId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdGreaterThan(String value) {
            addCriterion("collect_user_id >", value, "collectUserId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("collect_user_id >=", value, "collectUserId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdLessThan(String value) {
            addCriterion("collect_user_id <", value, "collectUserId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdLessThanOrEqualTo(String value) {
            addCriterion("collect_user_id <=", value, "collectUserId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdLike(String value) {
            addCriterion("collect_user_id like", value, "collectUserId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdNotLike(String value) {
            addCriterion("collect_user_id not like", value, "collectUserId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdIn(List<String> values) {
            addCriterion("collect_user_id in", values, "collectUserId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdNotIn(List<String> values) {
            addCriterion("collect_user_id not in", values, "collectUserId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdBetween(String value1, String value2) {
            addCriterion("collect_user_id between", value1, value2, "collectUserId");
            return (Criteria) this;
        }

        public Criteria andCollectUserIdNotBetween(String value1, String value2) {
            addCriterion("collect_user_id not between", value1, value2, "collectUserId");
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