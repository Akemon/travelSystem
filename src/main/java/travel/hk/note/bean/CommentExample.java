package travel.hk.note.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andTravelNoteCommentIdIsNull() {
            addCriterion("travel_note_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCommentIdIsNotNull() {
            addCriterion("travel_note_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCommentIdEqualTo(Integer value) {
            addCriterion("travel_note_comment_id =", value, "travelNoteCommentId");
            return (Criteria) this;
        }

        public Criteria andSignReplyCommentIdEqualTo(Integer value) {
            addCriterion("sign_reply_comment_id =", value, "signReplyCommentId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCommentIdNotEqualTo(Integer value) {
            addCriterion("travel_note_comment_id <>", value, "travelNoteCommentId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCommentIdGreaterThan(Integer value) {
            addCriterion("travel_note_comment_id >", value, "travelNoteCommentId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("travel_note_comment_id >=", value, "travelNoteCommentId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCommentIdLessThan(Integer value) {
            addCriterion("travel_note_comment_id <", value, "travelNoteCommentId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("travel_note_comment_id <=", value, "travelNoteCommentId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCommentIdIn(List<Integer> values) {
            addCriterion("travel_note_comment_id in", values, "travelNoteCommentId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCommentIdNotIn(List<Integer> values) {
            addCriterion("travel_note_comment_id not in", values, "travelNoteCommentId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("travel_note_comment_id between", value1, value2, "travelNoteCommentId");
            return (Criteria) this;
        }

        public Criteria andTravelNoteCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("travel_note_comment_id not between", value1, value2, "travelNoteCommentId");
            return (Criteria) this;
        }

        public Criteria andFollowTravelNoteIdIsNull() {
            addCriterion("follow_travel_note_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowTravelNoteIdIsNotNull() {
            addCriterion("follow_travel_note_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowTravelNoteIdEqualTo(Integer value) {
            addCriterion("follow_travel_note_id =", value, "followTravelNoteId");
            return (Criteria) this;
        }

        public Criteria andFollowTravelNoteIdNotEqualTo(Integer value) {
            addCriterion("follow_travel_note_id <>", value, "followTravelNoteId");
            return (Criteria) this;
        }

        public Criteria andFollowTravelNoteIdGreaterThan(Integer value) {
            addCriterion("follow_travel_note_id >", value, "followTravelNoteId");
            return (Criteria) this;
        }

        public Criteria andFollowTravelNoteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_travel_note_id >=", value, "followTravelNoteId");
            return (Criteria) this;
        }

        public Criteria andFollowTravelNoteIdLessThan(Integer value) {
            addCriterion("follow_travel_note_id <", value, "followTravelNoteId");
            return (Criteria) this;
        }

        public Criteria andFollowTravelNoteIdLessThanOrEqualTo(Integer value) {
            addCriterion("follow_travel_note_id <=", value, "followTravelNoteId");
            return (Criteria) this;
        }

        public Criteria andFollowTravelNoteIdIn(List<Integer> values) {
            addCriterion("follow_travel_note_id in", values, "followTravelNoteId");
            return (Criteria) this;
        }

        public Criteria andFollowTravelNoteIdNotIn(List<Integer> values) {
            addCriterion("follow_travel_note_id not in", values, "followTravelNoteId");
            return (Criteria) this;
        }

        public Criteria andFollowTravelNoteIdBetween(Integer value1, Integer value2) {
            addCriterion("follow_travel_note_id between", value1, value2, "followTravelNoteId");
            return (Criteria) this;
        }

        public Criteria andFollowTravelNoteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_travel_note_id not between", value1, value2, "followTravelNoteId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andLikeNumberEqualTo(String value) {
            addCriterion("like_number =", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberNotEqualTo(String value) {
            addCriterion("like_number <>", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberGreaterThan(String value) {
            addCriterion("like_number >", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("like_number >=", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberLessThan(String value) {
            addCriterion("like_number <", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberLessThanOrEqualTo(String value) {
            addCriterion("like_number <=", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberLike(String value) {
            addCriterion("like_number like", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberNotLike(String value) {
            addCriterion("like_number not like", value, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberIn(List<String> values) {
            addCriterion("like_number in", values, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberNotIn(List<String> values) {
            addCriterion("like_number not in", values, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberBetween(String value1, String value2) {
            addCriterion("like_number between", value1, value2, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andLikeNumberNotBetween(String value1, String value2) {
            addCriterion("like_number not between", value1, value2, "likeNumber");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("create_id like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("create_id not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdIsNull() {
            addCriterion("reply_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdIsNotNull() {
            addCriterion("reply_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdEqualTo(String value) {
            addCriterion("reply_comment_id =", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdNotEqualTo(String value) {
            addCriterion("reply_comment_id <>", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdGreaterThan(String value) {
            addCriterion("reply_comment_id >", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdGreaterThanOrEqualTo(String value) {
            addCriterion("reply_comment_id >=", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdLessThan(String value) {
            addCriterion("reply_comment_id <", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdLessThanOrEqualTo(String value) {
            addCriterion("reply_comment_id <=", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdLike(String value) {
            addCriterion("reply_comment_id like", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdNotLike(String value) {
            addCriterion("reply_comment_id not like", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdIn(List<String> values) {
            addCriterion("reply_comment_id in", values, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdNotIn(List<String> values) {
            addCriterion("reply_comment_id not in", values, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdBetween(String value1, String value2) {
            addCriterion("reply_comment_id between", value1, value2, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdNotBetween(String value1, String value2) {
            addCriterion("reply_comment_id not between", value1, value2, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andIsAccuseIsNull() {
            addCriterion("is_accuse is null");
            return (Criteria) this;
        }

        public Criteria andIsAccuseIsNotNull() {
            addCriterion("is_accuse is not null");
            return (Criteria) this;
        }

        public Criteria andIsAccuseEqualTo(Boolean value) {
            addCriterion("is_accuse =", value, "isAccuse");
            return (Criteria) this;
        }

        public Criteria andIsAccuseNotEqualTo(Boolean value) {
            addCriterion("is_accuse <>", value, "isAccuse");
            return (Criteria) this;
        }

        public Criteria andIsAccuseGreaterThan(Boolean value) {
            addCriterion("is_accuse >", value, "isAccuse");
            return (Criteria) this;
        }

        public Criteria andIsAccuseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_accuse >=", value, "isAccuse");
            return (Criteria) this;
        }

        public Criteria andIsAccuseLessThan(Boolean value) {
            addCriterion("is_accuse <", value, "isAccuse");
            return (Criteria) this;
        }

        public Criteria andIsAccuseLessThanOrEqualTo(Boolean value) {
            addCriterion("is_accuse <=", value, "isAccuse");
            return (Criteria) this;
        }

        public Criteria andIsAccuseIn(List<Boolean> values) {
            addCriterion("is_accuse in", values, "isAccuse");
            return (Criteria) this;
        }

        public Criteria andIsAccuseNotIn(List<Boolean> values) {
            addCriterion("is_accuse not in", values, "isAccuse");
            return (Criteria) this;
        }

        public Criteria andIsAccuseBetween(Boolean value1, Boolean value2) {
            addCriterion("is_accuse between", value1, value2, "isAccuse");
            return (Criteria) this;
        }

        public Criteria andIsAccuseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_accuse not between", value1, value2, "isAccuse");
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