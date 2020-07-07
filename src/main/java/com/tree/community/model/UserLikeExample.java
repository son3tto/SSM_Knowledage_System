package com.tree.community.model;

import java.util.ArrayList;
import java.util.List;

public class UserLikeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    public UserLikeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLikedUserIdIsNull() {
            addCriterion("liked_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLikedUserIdIsNotNull() {
            addCriterion("liked_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikedUserIdEqualTo(Long value) {
            addCriterion("liked_user_id =", value, "likedUserId");
            return (Criteria) this;
        }

        public Criteria andLikedUserIdNotEqualTo(Long value) {
            addCriterion("liked_user_id <>", value, "likedUserId");
            return (Criteria) this;
        }

        public Criteria andLikedUserIdGreaterThan(Long value) {
            addCriterion("liked_user_id >", value, "likedUserId");
            return (Criteria) this;
        }

        public Criteria andLikedUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("liked_user_id >=", value, "likedUserId");
            return (Criteria) this;
        }

        public Criteria andLikedUserIdLessThan(Long value) {
            addCriterion("liked_user_id <", value, "likedUserId");
            return (Criteria) this;
        }

        public Criteria andLikedUserIdLessThanOrEqualTo(Long value) {
            addCriterion("liked_user_id <=", value, "likedUserId");
            return (Criteria) this;
        }

        public Criteria andLikedUserIdIn(List<Long> values) {
            addCriterion("liked_user_id in", values, "likedUserId");
            return (Criteria) this;
        }

        public Criteria andLikedUserIdNotIn(List<Long> values) {
            addCriterion("liked_user_id not in", values, "likedUserId");
            return (Criteria) this;
        }

        public Criteria andLikedUserIdBetween(Long value1, Long value2) {
            addCriterion("liked_user_id between", value1, value2, "likedUserId");
            return (Criteria) this;
        }

        public Criteria andLikedUserIdNotBetween(Long value1, Long value2) {
            addCriterion("liked_user_id not between", value1, value2, "likedUserId");
            return (Criteria) this;
        }

        public Criteria andLikedPostIdIsNull() {
            addCriterion("liked_post_id is null");
            return (Criteria) this;
        }

        public Criteria andLikedPostIdIsNotNull() {
            addCriterion("liked_post_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikedPostIdEqualTo(Long value) {
            addCriterion("liked_post_id =", value, "likedPostId");
            return (Criteria) this;
        }

        public Criteria andLikedPostIdNotEqualTo(Long value) {
            addCriterion("liked_post_id <>", value, "likedPostId");
            return (Criteria) this;
        }

        public Criteria andLikedPostIdGreaterThan(Long value) {
            addCriterion("liked_post_id >", value, "likedPostId");
            return (Criteria) this;
        }

        public Criteria andLikedPostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("liked_post_id >=", value, "likedPostId");
            return (Criteria) this;
        }

        public Criteria andLikedPostIdLessThan(Long value) {
            addCriterion("liked_post_id <", value, "likedPostId");
            return (Criteria) this;
        }

        public Criteria andLikedPostIdLessThanOrEqualTo(Long value) {
            addCriterion("liked_post_id <=", value, "likedPostId");
            return (Criteria) this;
        }

        public Criteria andLikedPostIdIn(List<Long> values) {
            addCriterion("liked_post_id in", values, "likedPostId");
            return (Criteria) this;
        }

        public Criteria andLikedPostIdNotIn(List<Long> values) {
            addCriterion("liked_post_id not in", values, "likedPostId");
            return (Criteria) this;
        }

        public Criteria andLikedPostIdBetween(Long value1, Long value2) {
            addCriterion("liked_post_id between", value1, value2, "likedPostId");
            return (Criteria) this;
        }

        public Criteria andLikedPostIdNotBetween(Long value1, Long value2) {
            addCriterion("liked_post_id not between", value1, value2, "likedPostId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGmtCteateIsNull() {
            addCriterion("gmt_cteate is null");
            return (Criteria) this;
        }

        public Criteria andGmtCteateIsNotNull() {
            addCriterion("gmt_cteate is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCteateEqualTo(Long value) {
            addCriterion("gmt_cteate =", value, "gmtCteate");
            return (Criteria) this;
        }

        public Criteria andGmtCteateNotEqualTo(Long value) {
            addCriterion("gmt_cteate <>", value, "gmtCteate");
            return (Criteria) this;
        }

        public Criteria andGmtCteateGreaterThan(Long value) {
            addCriterion("gmt_cteate >", value, "gmtCteate");
            return (Criteria) this;
        }

        public Criteria andGmtCteateGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_cteate >=", value, "gmtCteate");
            return (Criteria) this;
        }

        public Criteria andGmtCteateLessThan(Long value) {
            addCriterion("gmt_cteate <", value, "gmtCteate");
            return (Criteria) this;
        }

        public Criteria andGmtCteateLessThanOrEqualTo(Long value) {
            addCriterion("gmt_cteate <=", value, "gmtCteate");
            return (Criteria) this;
        }

        public Criteria andGmtCteateIn(List<Long> values) {
            addCriterion("gmt_cteate in", values, "gmtCteate");
            return (Criteria) this;
        }

        public Criteria andGmtCteateNotIn(List<Long> values) {
            addCriterion("gmt_cteate not in", values, "gmtCteate");
            return (Criteria) this;
        }

        public Criteria andGmtCteateBetween(Long value1, Long value2) {
            addCriterion("gmt_cteate between", value1, value2, "gmtCteate");
            return (Criteria) this;
        }

        public Criteria andGmtCteateNotBetween(Long value1, Long value2) {
            addCriterion("gmt_cteate not between", value1, value2, "gmtCteate");
            return (Criteria) this;
        }

        public Criteria andGmtMotifiedIsNull() {
            addCriterion("gmt_motified is null");
            return (Criteria) this;
        }

        public Criteria andGmtMotifiedIsNotNull() {
            addCriterion("gmt_motified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtMotifiedEqualTo(Long value) {
            addCriterion("gmt_motified =", value, "gmtMotified");
            return (Criteria) this;
        }

        public Criteria andGmtMotifiedNotEqualTo(Long value) {
            addCriterion("gmt_motified <>", value, "gmtMotified");
            return (Criteria) this;
        }

        public Criteria andGmtMotifiedGreaterThan(Long value) {
            addCriterion("gmt_motified >", value, "gmtMotified");
            return (Criteria) this;
        }

        public Criteria andGmtMotifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_motified >=", value, "gmtMotified");
            return (Criteria) this;
        }

        public Criteria andGmtMotifiedLessThan(Long value) {
            addCriterion("gmt_motified <", value, "gmtMotified");
            return (Criteria) this;
        }

        public Criteria andGmtMotifiedLessThanOrEqualTo(Long value) {
            addCriterion("gmt_motified <=", value, "gmtMotified");
            return (Criteria) this;
        }

        public Criteria andGmtMotifiedIn(List<Long> values) {
            addCriterion("gmt_motified in", values, "gmtMotified");
            return (Criteria) this;
        }

        public Criteria andGmtMotifiedNotIn(List<Long> values) {
            addCriterion("gmt_motified not in", values, "gmtMotified");
            return (Criteria) this;
        }

        public Criteria andGmtMotifiedBetween(Long value1, Long value2) {
            addCriterion("gmt_motified between", value1, value2, "gmtMotified");
            return (Criteria) this;
        }

        public Criteria andGmtMotifiedNotBetween(Long value1, Long value2) {
            addCriterion("gmt_motified not between", value1, value2, "gmtMotified");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Long value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Long value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Long value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Long value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Long value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Long> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Long> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Long value1, Long value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Long value1, Long value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_like
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 30 23:42:30 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_like
     *
     * @mbg.generated Tue Jun 30 23:42:30 CST 2020
     */
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