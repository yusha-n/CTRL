package com.bupt.ctrl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("Course_Id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("Course_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("Course_Id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("Course_Id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("Course_Id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Course_Id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("Course_Id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("Course_Id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("Course_Id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("Course_Id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("Course_Id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Course_Id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("Course_Name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("Course_Name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("Course_Name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("Course_Name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("Course_Name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("Course_Name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("Course_Name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("Course_Name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("Course_Name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("Course_Name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("Course_Name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("Course_Name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("Course_Name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("Course_Name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCoursePassIsNull() {
            addCriterion("Course_Pass is null");
            return (Criteria) this;
        }

        public Criteria andCoursePassIsNotNull() {
            addCriterion("Course_Pass is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePassEqualTo(Integer value) {
            addCriterion("Course_Pass =", value, "coursePass");
            return (Criteria) this;
        }

        public Criteria andCoursePassNotEqualTo(Integer value) {
            addCriterion("Course_Pass <>", value, "coursePass");
            return (Criteria) this;
        }

        public Criteria andCoursePassGreaterThan(Integer value) {
            addCriterion("Course_Pass >", value, "coursePass");
            return (Criteria) this;
        }

        public Criteria andCoursePassGreaterThanOrEqualTo(Integer value) {
            addCriterion("Course_Pass >=", value, "coursePass");
            return (Criteria) this;
        }

        public Criteria andCoursePassLessThan(Integer value) {
            addCriterion("Course_Pass <", value, "coursePass");
            return (Criteria) this;
        }

        public Criteria andCoursePassLessThanOrEqualTo(Integer value) {
            addCriterion("Course_Pass <=", value, "coursePass");
            return (Criteria) this;
        }

        public Criteria andCoursePassIn(List<Integer> values) {
            addCriterion("Course_Pass in", values, "coursePass");
            return (Criteria) this;
        }

        public Criteria andCoursePassNotIn(List<Integer> values) {
            addCriterion("Course_Pass not in", values, "coursePass");
            return (Criteria) this;
        }

        public Criteria andCoursePassBetween(Integer value1, Integer value2) {
            addCriterion("Course_Pass between", value1, value2, "coursePass");
            return (Criteria) this;
        }

        public Criteria andCoursePassNotBetween(Integer value1, Integer value2) {
            addCriterion("Course_Pass not between", value1, value2, "coursePass");
            return (Criteria) this;
        }

        public Criteria andCourseIntroIsNull() {
            addCriterion("Course_Intro is null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroIsNotNull() {
            addCriterion("Course_Intro is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroEqualTo(String value) {
            addCriterion("Course_Intro =", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroNotEqualTo(String value) {
            addCriterion("Course_Intro <>", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroGreaterThan(String value) {
            addCriterion("Course_Intro >", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroGreaterThanOrEqualTo(String value) {
            addCriterion("Course_Intro >=", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroLessThan(String value) {
            addCriterion("Course_Intro <", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroLessThanOrEqualTo(String value) {
            addCriterion("Course_Intro <=", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroLike(String value) {
            addCriterion("Course_Intro like", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroNotLike(String value) {
            addCriterion("Course_Intro not like", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroIn(List<String> values) {
            addCriterion("Course_Intro in", values, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroNotIn(List<String> values) {
            addCriterion("Course_Intro not in", values, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroBetween(String value1, String value2) {
            addCriterion("Course_Intro between", value1, value2, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroNotBetween(String value1, String value2) {
            addCriterion("Course_Intro not between", value1, value2, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseImageIsNull() {
            addCriterion("Course_Image is null");
            return (Criteria) this;
        }

        public Criteria andCourseImageIsNotNull() {
            addCriterion("Course_Image is not null");
            return (Criteria) this;
        }

        public Criteria andCourseImageEqualTo(String value) {
            addCriterion("Course_Image =", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageNotEqualTo(String value) {
            addCriterion("Course_Image <>", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageGreaterThan(String value) {
            addCriterion("Course_Image >", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageGreaterThanOrEqualTo(String value) {
            addCriterion("Course_Image >=", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageLessThan(String value) {
            addCriterion("Course_Image <", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageLessThanOrEqualTo(String value) {
            addCriterion("Course_Image <=", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageLike(String value) {
            addCriterion("Course_Image like", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageNotLike(String value) {
            addCriterion("Course_Image not like", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageIn(List<String> values) {
            addCriterion("Course_Image in", values, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageNotIn(List<String> values) {
            addCriterion("Course_Image not in", values, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageBetween(String value1, String value2) {
            addCriterion("Course_Image between", value1, value2, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageNotBetween(String value1, String value2) {
            addCriterion("Course_Image not between", value1, value2, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseDateIsNull() {
            addCriterion("Course_Date is null");
            return (Criteria) this;
        }

        public Criteria andCourseDateIsNotNull() {
            addCriterion("Course_Date is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDateEqualTo(Date value) {
            addCriterion("Course_Date =", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotEqualTo(Date value) {
            addCriterion("Course_Date <>", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateGreaterThan(Date value) {
            addCriterion("Course_Date >", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Course_Date >=", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateLessThan(Date value) {
            addCriterion("Course_Date <", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateLessThanOrEqualTo(Date value) {
            addCriterion("Course_Date <=", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateIn(List<Date> values) {
            addCriterion("Course_Date in", values, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotIn(List<Date> values) {
            addCriterion("Course_Date not in", values, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateBetween(Date value1, Date value2) {
            addCriterion("Course_Date between", value1, value2, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotBetween(Date value1, Date value2) {
            addCriterion("Course_Date not between", value1, value2, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIsNull() {
            addCriterion("Course_Teacher is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIsNotNull() {
            addCriterion("Course_Teacher is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherEqualTo(String value) {
            addCriterion("Course_Teacher =", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherNotEqualTo(String value) {
            addCriterion("Course_Teacher <>", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGreaterThan(String value) {
            addCriterion("Course_Teacher >", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("Course_Teacher >=", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherLessThan(String value) {
            addCriterion("Course_Teacher <", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherLessThanOrEqualTo(String value) {
            addCriterion("Course_Teacher <=", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherLike(String value) {
            addCriterion("Course_Teacher like", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherNotLike(String value) {
            addCriterion("Course_Teacher not like", value, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIn(List<String> values) {
            addCriterion("Course_Teacher in", values, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherNotIn(List<String> values) {
            addCriterion("Course_Teacher not in", values, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherBetween(String value1, String value2) {
            addCriterion("Course_Teacher between", value1, value2, "courseTeacher");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherNotBetween(String value1, String value2) {
            addCriterion("Course_Teacher not between", value1, value2, "courseTeacher");
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