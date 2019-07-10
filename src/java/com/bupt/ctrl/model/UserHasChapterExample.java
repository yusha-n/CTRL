package com.bupt.ctrl.model;

import java.util.ArrayList;
import java.util.List;

public class UserHasChapterExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    public UserHasChapterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
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
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
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

        public Criteria andUserUserIdIsNull() {
            addCriterion("User_User_id is null");
            return (Criteria) this;
        }

        public Criteria andUserUserIdIsNotNull() {
            addCriterion("User_User_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserUserIdEqualTo(Integer value) {
            addCriterion("User_User_id =", value, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdNotEqualTo(Integer value) {
            addCriterion("User_User_id <>", value, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdGreaterThan(Integer value) {
            addCriterion("User_User_id >", value, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_User_id >=", value, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdLessThan(Integer value) {
            addCriterion("User_User_id <", value, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_User_id <=", value, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdIn(List<Integer> values) {
            addCriterion("User_User_id in", values, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdNotIn(List<Integer> values) {
            addCriterion("User_User_id not in", values, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_User_id between", value1, value2, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_User_id not between", value1, value2, "userUserId");
            return (Criteria) this;
        }

        public Criteria andChapterChapterIdIsNull() {
            addCriterion("Chapter_Chapter_id is null");
            return (Criteria) this;
        }

        public Criteria andChapterChapterIdIsNotNull() {
            addCriterion("Chapter_Chapter_id is not null");
            return (Criteria) this;
        }

        public Criteria andChapterChapterIdEqualTo(Integer value) {
            addCriterion("Chapter_Chapter_id =", value, "chapterChapterId");
            return (Criteria) this;
        }

        public Criteria andChapterChapterIdNotEqualTo(Integer value) {
            addCriterion("Chapter_Chapter_id <>", value, "chapterChapterId");
            return (Criteria) this;
        }

        public Criteria andChapterChapterIdGreaterThan(Integer value) {
            addCriterion("Chapter_Chapter_id >", value, "chapterChapterId");
            return (Criteria) this;
        }

        public Criteria andChapterChapterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Chapter_Chapter_id >=", value, "chapterChapterId");
            return (Criteria) this;
        }

        public Criteria andChapterChapterIdLessThan(Integer value) {
            addCriterion("Chapter_Chapter_id <", value, "chapterChapterId");
            return (Criteria) this;
        }

        public Criteria andChapterChapterIdLessThanOrEqualTo(Integer value) {
            addCriterion("Chapter_Chapter_id <=", value, "chapterChapterId");
            return (Criteria) this;
        }

        public Criteria andChapterChapterIdIn(List<Integer> values) {
            addCriterion("Chapter_Chapter_id in", values, "chapterChapterId");
            return (Criteria) this;
        }

        public Criteria andChapterChapterIdNotIn(List<Integer> values) {
            addCriterion("Chapter_Chapter_id not in", values, "chapterChapterId");
            return (Criteria) this;
        }

        public Criteria andChapterChapterIdBetween(Integer value1, Integer value2) {
            addCriterion("Chapter_Chapter_id between", value1, value2, "chapterChapterId");
            return (Criteria) this;
        }

        public Criteria andChapterChapterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Chapter_Chapter_id not between", value1, value2, "chapterChapterId");
            return (Criteria) this;
        }

        public Criteria andUserHasLearnedIsNull() {
            addCriterion("User_has_Learned is null");
            return (Criteria) this;
        }

        public Criteria andUserHasLearnedIsNotNull() {
            addCriterion("User_has_Learned is not null");
            return (Criteria) this;
        }

        public Criteria andUserHasLearnedEqualTo(Integer value) {
            addCriterion("User_has_Learned =", value, "userHasLearned");
            return (Criteria) this;
        }

        public Criteria andUserHasLearnedNotEqualTo(Integer value) {
            addCriterion("User_has_Learned <>", value, "userHasLearned");
            return (Criteria) this;
        }

        public Criteria andUserHasLearnedGreaterThan(Integer value) {
            addCriterion("User_has_Learned >", value, "userHasLearned");
            return (Criteria) this;
        }

        public Criteria andUserHasLearnedGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_has_Learned >=", value, "userHasLearned");
            return (Criteria) this;
        }

        public Criteria andUserHasLearnedLessThan(Integer value) {
            addCriterion("User_has_Learned <", value, "userHasLearned");
            return (Criteria) this;
        }

        public Criteria andUserHasLearnedLessThanOrEqualTo(Integer value) {
            addCriterion("User_has_Learned <=", value, "userHasLearned");
            return (Criteria) this;
        }

        public Criteria andUserHasLearnedIn(List<Integer> values) {
            addCriterion("User_has_Learned in", values, "userHasLearned");
            return (Criteria) this;
        }

        public Criteria andUserHasLearnedNotIn(List<Integer> values) {
            addCriterion("User_has_Learned not in", values, "userHasLearned");
            return (Criteria) this;
        }

        public Criteria andUserHasLearnedBetween(Integer value1, Integer value2) {
            addCriterion("User_has_Learned between", value1, value2, "userHasLearned");
            return (Criteria) this;
        }

        public Criteria andUserHasLearnedNotBetween(Integer value1, Integer value2) {
            addCriterion("User_has_Learned not between", value1, value2, "userHasLearned");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated do_not_delete_during_merge Wed Jul 10 09:55:09 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
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