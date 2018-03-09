package travel.hk.note.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoteExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTouristDayIsNull() {
            addCriterion("tourist_day is null");
            return (Criteria) this;
        }

        public Criteria andTouristDayIsNotNull() {
            addCriterion("tourist_day is not null");
            return (Criteria) this;
        }

        public Criteria andTouristDayEqualTo(Integer value) {
            addCriterion("tourist_day =", value, "touristDay");
            return (Criteria) this;
        }

        public Criteria andTouristDayNotEqualTo(Integer value) {
            addCriterion("tourist_day <>", value, "touristDay");
            return (Criteria) this;
        }

        public Criteria andTouristDayGreaterThan(Integer value) {
            addCriterion("tourist_day >", value, "touristDay");
            return (Criteria) this;
        }

        public Criteria andTouristDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("tourist_day >=", value, "touristDay");
            return (Criteria) this;
        }

        public Criteria andTouristDayLessThan(Integer value) {
            addCriterion("tourist_day <", value, "touristDay");
            return (Criteria) this;
        }

        public Criteria andTouristDayLessThanOrEqualTo(Integer value) {
            addCriterion("tourist_day <=", value, "touristDay");
            return (Criteria) this;
        }

        public Criteria andTouristDayIn(List<Integer> values) {
            addCriterion("tourist_day in", values, "touristDay");
            return (Criteria) this;
        }

        public Criteria andTouristDayNotIn(List<Integer> values) {
            addCriterion("tourist_day not in", values, "touristDay");
            return (Criteria) this;
        }

        public Criteria andTouristDayBetween(Integer value1, Integer value2) {
            addCriterion("tourist_day between", value1, value2, "touristDay");
            return (Criteria) this;
        }

        public Criteria andTouristDayNotBetween(Integer value1, Integer value2) {
            addCriterion("tourist_day not between", value1, value2, "touristDay");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyIsNull() {
            addCriterion("spend_money is null");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyIsNotNull() {
            addCriterion("spend_money is not null");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyEqualTo(String value) {
            addCriterion("spend_money =", value, "spendMoney");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyNotEqualTo(String value) {
            addCriterion("spend_money <>", value, "spendMoney");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyGreaterThan(String value) {
            addCriterion("spend_money >", value, "spendMoney");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("spend_money >=", value, "spendMoney");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyLessThan(String value) {
            addCriterion("spend_money <", value, "spendMoney");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyLessThanOrEqualTo(String value) {
            addCriterion("spend_money <=", value, "spendMoney");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyLike(String value) {
            addCriterion("spend_money like", value, "spendMoney");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyNotLike(String value) {
            addCriterion("spend_money not like", value, "spendMoney");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyIn(List<String> values) {
            addCriterion("spend_money in", values, "spendMoney");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyNotIn(List<String> values) {
            addCriterion("spend_money not in", values, "spendMoney");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyBetween(String value1, String value2) {
            addCriterion("spend_money between", value1, value2, "spendMoney");
            return (Criteria) this;
        }

        public Criteria andSpendMoneyNotBetween(String value1, String value2) {
            addCriterion("spend_money not between", value1, value2, "spendMoney");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNull() {
            addCriterion("partner is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNotNull() {
            addCriterion("partner is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerEqualTo(String value) {
            addCriterion("partner =", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotEqualTo(String value) {
            addCriterion("partner <>", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThan(String value) {
            addCriterion("partner >", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("partner >=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThan(String value) {
            addCriterion("partner <", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThanOrEqualTo(String value) {
            addCriterion("partner <=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLike(String value) {
            addCriterion("partner like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotLike(String value) {
            addCriterion("partner not like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerIn(List<String> values) {
            addCriterion("partner in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotIn(List<String> values) {
            addCriterion("partner not in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerBetween(String value1, String value2) {
            addCriterion("partner between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotBetween(String value1, String value2) {
            addCriterion("partner not between", value1, value2, "partner");
            return (Criteria) this;
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

        public Criteria andLikeNumberIsNull() {
            addCriterion("like_number is null");
            return (Criteria) this;
        }

        public Criteria andLikeNumberIsNotNull() {
            addCriterion("like_number is not null");
            return (Criteria) this;
        }

        public Criteria andLikeNumberEqualTo(Integer value) {
            addCriterion("like_number =", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberNotEqualTo(Integer value) {
            addCriterion("like_number <>", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberGreaterThan(Integer value) {
            addCriterion("like_number >", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_number >=", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberLessThan(Integer value) {
            addCriterion("like_number <", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("like_number <=", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberIn(List<Integer> values) {
            addCriterion("like_number in", values, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberNotIn(List<Integer> values) {
            addCriterion("like_number not in", values, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberBetween(Integer value1, Integer value2) {
            addCriterion("like_number between", value1, value2, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("like_number not between", value1, value2, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberIsNull() {
            addCriterion("collect_number is null");
            return (Criteria) this;
        }

        public Criteria andCollectNumberIsNotNull() {
            addCriterion("collect_number is not null");
            return (Criteria) this;
        }

        public Criteria andCollectNumberEqualTo(Integer value) {
            addCriterion("collect_number =", value, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberNotEqualTo(Integer value) {
            addCriterion("collect_number <>", value, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberGreaterThan(Integer value) {
            addCriterion("collect_number >", value, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_number >=", value, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberLessThan(Integer value) {
            addCriterion("collect_number <", value, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberLessThanOrEqualTo(Integer value) {
            addCriterion("collect_number <=", value, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberIn(List<Integer> values) {
            addCriterion("collect_number in", values, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberNotIn(List<Integer> values) {
            addCriterion("collect_number not in", values, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberBetween(Integer value1, Integer value2) {
            addCriterion("collect_number between", value1, value2, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_number not between", value1, value2, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberIsNull() {
            addCriterion("comment_number is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumberIsNotNull() {
            addCriterion("comment_number is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumberEqualTo(Integer value) {
            addCriterion("comment_number =", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberNotEqualTo(Integer value) {
            addCriterion("comment_number <>", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberGreaterThan(Integer value) {
            addCriterion("comment_number >", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_number >=", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberLessThan(Integer value) {
            addCriterion("comment_number <", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("comment_number <=", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberIn(List<Integer> values) {
            addCriterion("comment_number in", values, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberNotIn(List<Integer> values) {
            addCriterion("comment_number not in", values, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberBetween(Integer value1, Integer value2) {
            addCriterion("comment_number between", value1, value2, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_number not between", value1, value2, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andScanNumberIsNull() {
            addCriterion("scan_number is null");
            return (Criteria) this;
        }

        public Criteria andScanNumberIsNotNull() {
            addCriterion("scan_number is not null");
            return (Criteria) this;
        }

        public Criteria andScanNumberEqualTo(Integer value) {
            addCriterion("scan_number =", value, "scanNumber");
            return (Criteria) this;
        }

        public Criteria andScanNumberNotEqualTo(Integer value) {
            addCriterion("scan_number <>", value, "scanNumber");
            return (Criteria) this;
        }

        public Criteria andScanNumberGreaterThan(Integer value) {
            addCriterion("scan_number >", value, "scanNumber");
            return (Criteria) this;
        }

        public Criteria andScanNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("scan_number >=", value, "scanNumber");
            return (Criteria) this;
        }

        public Criteria andScanNumberLessThan(Integer value) {
            addCriterion("scan_number <", value, "scanNumber");
            return (Criteria) this;
        }

        public Criteria andScanNumberLessThanOrEqualTo(Integer value) {
            addCriterion("scan_number <=", value, "scanNumber");
            return (Criteria) this;
        }

        public Criteria andScanNumberIn(List<Integer> values) {
            addCriterion("scan_number in", values, "scanNumber");
            return (Criteria) this;
        }

        public Criteria andScanNumberNotIn(List<Integer> values) {
            addCriterion("scan_number not in", values, "scanNumber");
            return (Criteria) this;
        }

        public Criteria andScanNumberBetween(Integer value1, Integer value2) {
            addCriterion("scan_number between", value1, value2, "scanNumber");
            return (Criteria) this;
        }

        public Criteria andScanNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("scan_number not between", value1, value2, "scanNumber");
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