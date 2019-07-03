package com.bupt.ctrl.model;

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

        public Criteria andCommentIdIsNull() {
            addCriterion("Comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("Comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("Comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("Comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("Comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("Comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("Comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("Comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("Comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("Comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("Comment_Content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("Comment_Content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("Comment_Content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("Comment_Content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("Comment_Content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment_Content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("Comment_Content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("Comment_Content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("Comment_Content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("Comment_Content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("Comment_Content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("Comment_Content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("Comment_Content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("Comment_Content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNull() {
            addCriterion("Comment_Time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("Comment_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(Date value) {
            addCriterion("Comment_Time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(Date value) {
            addCriterion("Comment_Time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(Date value) {
            addCriterion("Comment_Time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Comment_Time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(Date value) {
            addCriterion("Comment_Time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("Comment_Time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<Date> values) {
            addCriterion("Comment_Time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<Date> values) {
            addCriterion("Comment_Time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(Date value1, Date value2) {
            addCriterion("Comment_Time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("Comment_Time not between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentToIsNull() {
            addCriterion("Comment_To is null");
            return (Criteria) this;
        }

        public Criteria andCommentToIsNotNull() {
            addCriterion("Comment_To is not null");
            return (Criteria) this;
        }

        public Criteria andCommentToEqualTo(Integer value) {
            addCriterion("Comment_To =", value, "commentTo");
            return (Criteria) this;
        }

        public Criteria andCommentToNotEqualTo(Integer value) {
            addCriterion("Comment_To <>", value, "commentTo");
            return (Criteria) this;
        }

        public Criteria andCommentToGreaterThan(Integer value) {
            addCriterion("Comment_To >", value, "commentTo");
            return (Criteria) this;
        }

        public Criteria andCommentToGreaterThanOrEqualTo(Integer value) {
            addCriterion("Comment_To >=", value, "commentTo");
            return (Criteria) this;
        }

        public Criteria andCommentToLessThan(Integer value) {
            addCriterion("Comment_To <", value, "commentTo");
            return (Criteria) this;
        }

        public Criteria andCommentToLessThanOrEqualTo(Integer value) {
            addCriterion("Comment_To <=", value, "commentTo");
            return (Criteria) this;
        }

        public Criteria andCommentToIn(List<Integer> values) {
            addCriterion("Comment_To in", values, "commentTo");
            return (Criteria) this;
        }

        public Criteria andCommentToNotIn(List<Integer> values) {
            addCriterion("Comment_To not in", values, "commentTo");
            return (Criteria) this;
        }

        public Criteria andCommentToBetween(Integer value1, Integer value2) {
            addCriterion("Comment_To between", value1, value2, "commentTo");
            return (Criteria) this;
        }

        public Criteria andCommentToNotBetween(Integer value1, Integer value2) {
            addCriterion("Comment_To not between", value1, value2, "commentTo");
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