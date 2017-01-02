package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class application_data_seriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public application_data_seriesExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdxIsNull() {
            addCriterion("idx is null");
            return (Criteria) this;
        }

        public Criteria andIdxIsNotNull() {
            addCriterion("idx is not null");
            return (Criteria) this;
        }

        public Criteria andIdxEqualTo(Integer value) {
            addCriterion("idx =", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotEqualTo(Integer value) {
            addCriterion("idx <>", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThan(Integer value) {
            addCriterion("idx >", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx >=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThan(Integer value) {
            addCriterion("idx <", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThanOrEqualTo(Integer value) {
            addCriterion("idx <=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxIn(List<Integer> values) {
            addCriterion("idx in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotIn(List<Integer> values) {
            addCriterion("idx not in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxBetween(Integer value1, Integer value2) {
            addCriterion("idx between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("idx not between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andRefIdxIsNull() {
            addCriterion("ref_idx is null");
            return (Criteria) this;
        }

        public Criteria andRefIdxIsNotNull() {
            addCriterion("ref_idx is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdxEqualTo(Integer value) {
            addCriterion("ref_idx =", value, "refIdx");
            return (Criteria) this;
        }

        public Criteria andRefIdxNotEqualTo(Integer value) {
            addCriterion("ref_idx <>", value, "refIdx");
            return (Criteria) this;
        }

        public Criteria andRefIdxGreaterThan(Integer value) {
            addCriterion("ref_idx >", value, "refIdx");
            return (Criteria) this;
        }

        public Criteria andRefIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("ref_idx >=", value, "refIdx");
            return (Criteria) this;
        }

        public Criteria andRefIdxLessThan(Integer value) {
            addCriterion("ref_idx <", value, "refIdx");
            return (Criteria) this;
        }

        public Criteria andRefIdxLessThanOrEqualTo(Integer value) {
            addCriterion("ref_idx <=", value, "refIdx");
            return (Criteria) this;
        }

        public Criteria andRefIdxIn(List<Integer> values) {
            addCriterion("ref_idx in", values, "refIdx");
            return (Criteria) this;
        }

        public Criteria andRefIdxNotIn(List<Integer> values) {
            addCriterion("ref_idx not in", values, "refIdx");
            return (Criteria) this;
        }

        public Criteria andRefIdxBetween(Integer value1, Integer value2) {
            addCriterion("ref_idx between", value1, value2, "refIdx");
            return (Criteria) this;
        }

        public Criteria andRefIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("ref_idx not between", value1, value2, "refIdx");
            return (Criteria) this;
        }

        public Criteria andSegIdxIsNull() {
            addCriterion("seg_idx is null");
            return (Criteria) this;
        }

        public Criteria andSegIdxIsNotNull() {
            addCriterion("seg_idx is not null");
            return (Criteria) this;
        }

        public Criteria andSegIdxEqualTo(String value) {
            addCriterion("seg_idx =", value, "segIdx");
            return (Criteria) this;
        }

        public Criteria andSegIdxNotEqualTo(String value) {
            addCriterion("seg_idx <>", value, "segIdx");
            return (Criteria) this;
        }

        public Criteria andSegIdxGreaterThan(String value) {
            addCriterion("seg_idx >", value, "segIdx");
            return (Criteria) this;
        }

        public Criteria andSegIdxGreaterThanOrEqualTo(String value) {
            addCriterion("seg_idx >=", value, "segIdx");
            return (Criteria) this;
        }

        public Criteria andSegIdxLessThan(String value) {
            addCriterion("seg_idx <", value, "segIdx");
            return (Criteria) this;
        }

        public Criteria andSegIdxLessThanOrEqualTo(String value) {
            addCriterion("seg_idx <=", value, "segIdx");
            return (Criteria) this;
        }

        public Criteria andSegIdxLike(String value) {
            addCriterion("seg_idx like", value, "segIdx");
            return (Criteria) this;
        }

        public Criteria andSegIdxNotLike(String value) {
            addCriterion("seg_idx not like", value, "segIdx");
            return (Criteria) this;
        }

        public Criteria andSegIdxIn(List<String> values) {
            addCriterion("seg_idx in", values, "segIdx");
            return (Criteria) this;
        }

        public Criteria andSegIdxNotIn(List<String> values) {
            addCriterion("seg_idx not in", values, "segIdx");
            return (Criteria) this;
        }

        public Criteria andSegIdxBetween(String value1, String value2) {
            addCriterion("seg_idx between", value1, value2, "segIdx");
            return (Criteria) this;
        }

        public Criteria andSegIdxNotBetween(String value1, String value2) {
            addCriterion("seg_idx not between", value1, value2, "segIdx");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxIsNull() {
            addCriterion("series_idx is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxIsNotNull() {
            addCriterion("series_idx is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxEqualTo(String value) {
            addCriterion("series_idx =", value, "seriesIdx");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxNotEqualTo(String value) {
            addCriterion("series_idx <>", value, "seriesIdx");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxGreaterThan(String value) {
            addCriterion("series_idx >", value, "seriesIdx");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxGreaterThanOrEqualTo(String value) {
            addCriterion("series_idx >=", value, "seriesIdx");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxLessThan(String value) {
            addCriterion("series_idx <", value, "seriesIdx");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxLessThanOrEqualTo(String value) {
            addCriterion("series_idx <=", value, "seriesIdx");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxLike(String value) {
            addCriterion("series_idx like", value, "seriesIdx");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxNotLike(String value) {
            addCriterion("series_idx not like", value, "seriesIdx");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxIn(List<String> values) {
            addCriterion("series_idx in", values, "seriesIdx");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxNotIn(List<String> values) {
            addCriterion("series_idx not in", values, "seriesIdx");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxBetween(String value1, String value2) {
            addCriterion("series_idx between", value1, value2, "seriesIdx");
            return (Criteria) this;
        }

        public Criteria andSeriesIdxNotBetween(String value1, String value2) {
            addCriterion("series_idx not between", value1, value2, "seriesIdx");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andSegNameIsNull() {
            addCriterion("seg_name is null");
            return (Criteria) this;
        }

        public Criteria andSegNameIsNotNull() {
            addCriterion("seg_name is not null");
            return (Criteria) this;
        }

        public Criteria andSegNameEqualTo(String value) {
            addCriterion("seg_name =", value, "segName");
            return (Criteria) this;
        }

        public Criteria andSegNameNotEqualTo(String value) {
            addCriterion("seg_name <>", value, "segName");
            return (Criteria) this;
        }

        public Criteria andSegNameGreaterThan(String value) {
            addCriterion("seg_name >", value, "segName");
            return (Criteria) this;
        }

        public Criteria andSegNameGreaterThanOrEqualTo(String value) {
            addCriterion("seg_name >=", value, "segName");
            return (Criteria) this;
        }

        public Criteria andSegNameLessThan(String value) {
            addCriterion("seg_name <", value, "segName");
            return (Criteria) this;
        }

        public Criteria andSegNameLessThanOrEqualTo(String value) {
            addCriterion("seg_name <=", value, "segName");
            return (Criteria) this;
        }

        public Criteria andSegNameLike(String value) {
            addCriterion("seg_name like", value, "segName");
            return (Criteria) this;
        }

        public Criteria andSegNameNotLike(String value) {
            addCriterion("seg_name not like", value, "segName");
            return (Criteria) this;
        }

        public Criteria andSegNameIn(List<String> values) {
            addCriterion("seg_name in", values, "segName");
            return (Criteria) this;
        }

        public Criteria andSegNameNotIn(List<String> values) {
            addCriterion("seg_name not in", values, "segName");
            return (Criteria) this;
        }

        public Criteria andSegNameBetween(String value1, String value2) {
            addCriterion("seg_name between", value1, value2, "segName");
            return (Criteria) this;
        }

        public Criteria andSegNameNotBetween(String value1, String value2) {
            addCriterion("seg_name not between", value1, value2, "segName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNull() {
            addCriterion("series_name is null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNotNull() {
            addCriterion("series_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameEqualTo(String value) {
            addCriterion("series_name =", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotEqualTo(String value) {
            addCriterion("series_name <>", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThan(String value) {
            addCriterion("series_name >", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThanOrEqualTo(String value) {
            addCriterion("series_name >=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThan(String value) {
            addCriterion("series_name <", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThanOrEqualTo(String value) {
            addCriterion("series_name <=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLike(String value) {
            addCriterion("series_name like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotLike(String value) {
            addCriterion("series_name not like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIn(List<String> values) {
            addCriterion("series_name in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotIn(List<String> values) {
            addCriterion("series_name not in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameBetween(String value1, String value2) {
            addCriterion("series_name between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotBetween(String value1, String value2) {
            addCriterion("series_name not between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andDetailIdxIsNull() {
            addCriterion("detail_idx is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdxIsNotNull() {
            addCriterion("detail_idx is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdxEqualTo(String value) {
            addCriterion("detail_idx =", value, "detailIdx");
            return (Criteria) this;
        }

        public Criteria andDetailIdxNotEqualTo(String value) {
            addCriterion("detail_idx <>", value, "detailIdx");
            return (Criteria) this;
        }

        public Criteria andDetailIdxGreaterThan(String value) {
            addCriterion("detail_idx >", value, "detailIdx");
            return (Criteria) this;
        }

        public Criteria andDetailIdxGreaterThanOrEqualTo(String value) {
            addCriterion("detail_idx >=", value, "detailIdx");
            return (Criteria) this;
        }

        public Criteria andDetailIdxLessThan(String value) {
            addCriterion("detail_idx <", value, "detailIdx");
            return (Criteria) this;
        }

        public Criteria andDetailIdxLessThanOrEqualTo(String value) {
            addCriterion("detail_idx <=", value, "detailIdx");
            return (Criteria) this;
        }

        public Criteria andDetailIdxLike(String value) {
            addCriterion("detail_idx like", value, "detailIdx");
            return (Criteria) this;
        }

        public Criteria andDetailIdxNotLike(String value) {
            addCriterion("detail_idx not like", value, "detailIdx");
            return (Criteria) this;
        }

        public Criteria andDetailIdxIn(List<String> values) {
            addCriterion("detail_idx in", values, "detailIdx");
            return (Criteria) this;
        }

        public Criteria andDetailIdxNotIn(List<String> values) {
            addCriterion("detail_idx not in", values, "detailIdx");
            return (Criteria) this;
        }

        public Criteria andDetailIdxBetween(String value1, String value2) {
            addCriterion("detail_idx between", value1, value2, "detailIdx");
            return (Criteria) this;
        }

        public Criteria andDetailIdxNotBetween(String value1, String value2) {
            addCriterion("detail_idx not between", value1, value2, "detailIdx");
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