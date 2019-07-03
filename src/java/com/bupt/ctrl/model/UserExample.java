package com.bupt.ctrl.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("User_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("User_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("User_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("User_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("User_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("User_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("User_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("User_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("User_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("User_Name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("User_Name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("User_Name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("User_Name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("User_Name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("User_Name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("User_Name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("User_Name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("User_Name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("User_Name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("User_Name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("User_Name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("User_Password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("User_Password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("User_Password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("User_Password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("User_Password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("User_Password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("User_Password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("User_Password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("User_Password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("User_Password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("User_Password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("User_Password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("User_Password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("User_Password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserIdentityIsNull() {
            addCriterion("User_Identity is null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityIsNotNull() {
            addCriterion("User_Identity is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityEqualTo(Integer value) {
            addCriterion("User_Identity =", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityNotEqualTo(Integer value) {
            addCriterion("User_Identity <>", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityGreaterThan(Integer value) {
            addCriterion("User_Identity >", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Identity >=", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityLessThan(Integer value) {
            addCriterion("User_Identity <", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("User_Identity <=", value, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityIn(List<Integer> values) {
            addCriterion("User_Identity in", values, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityNotIn(List<Integer> values) {
            addCriterion("User_Identity not in", values, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityBetween(Integer value1, Integer value2) {
            addCriterion("User_Identity between", value1, value2, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Identity not between", value1, value2, "userIdentity");
            return (Criteria) this;
        }

        public Criteria andUserIntroIsNull() {
            addCriterion("User_Intro is null");
            return (Criteria) this;
        }

        public Criteria andUserIntroIsNotNull() {
            addCriterion("User_Intro is not null");
            return (Criteria) this;
        }

        public Criteria andUserIntroEqualTo(String value) {
            addCriterion("User_Intro =", value, "userIntro");
            return (Criteria) this;
        }

        public Criteria andUserIntroNotEqualTo(String value) {
            addCriterion("User_Intro <>", value, "userIntro");
            return (Criteria) this;
        }

        public Criteria andUserIntroGreaterThan(String value) {
            addCriterion("User_Intro >", value, "userIntro");
            return (Criteria) this;
        }

        public Criteria andUserIntroGreaterThanOrEqualTo(String value) {
            addCriterion("User_Intro >=", value, "userIntro");
            return (Criteria) this;
        }

        public Criteria andUserIntroLessThan(String value) {
            addCriterion("User_Intro <", value, "userIntro");
            return (Criteria) this;
        }

        public Criteria andUserIntroLessThanOrEqualTo(String value) {
            addCriterion("User_Intro <=", value, "userIntro");
            return (Criteria) this;
        }

        public Criteria andUserIntroLike(String value) {
            addCriterion("User_Intro like", value, "userIntro");
            return (Criteria) this;
        }

        public Criteria andUserIntroNotLike(String value) {
            addCriterion("User_Intro not like", value, "userIntro");
            return (Criteria) this;
        }

        public Criteria andUserIntroIn(List<String> values) {
            addCriterion("User_Intro in", values, "userIntro");
            return (Criteria) this;
        }

        public Criteria andUserIntroNotIn(List<String> values) {
            addCriterion("User_Intro not in", values, "userIntro");
            return (Criteria) this;
        }

        public Criteria andUserIntroBetween(String value1, String value2) {
            addCriterion("User_Intro between", value1, value2, "userIntro");
            return (Criteria) this;
        }

        public Criteria andUserIntroNotBetween(String value1, String value2) {
            addCriterion("User_Intro not between", value1, value2, "userIntro");
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