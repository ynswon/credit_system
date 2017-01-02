package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class application_dataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public application_dataExample() {
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

        public Criteria andTypePrefixIsNull() {
            addCriterion("type_prefix is null");
            return (Criteria) this;
        }

        public Criteria andTypePrefixIsNotNull() {
            addCriterion("type_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andTypePrefixEqualTo(String value) {
            addCriterion("type_prefix =", value, "typePrefix");
            return (Criteria) this;
        }

        public Criteria andTypePrefixNotEqualTo(String value) {
            addCriterion("type_prefix <>", value, "typePrefix");
            return (Criteria) this;
        }

        public Criteria andTypePrefixGreaterThan(String value) {
            addCriterion("type_prefix >", value, "typePrefix");
            return (Criteria) this;
        }

        public Criteria andTypePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("type_prefix >=", value, "typePrefix");
            return (Criteria) this;
        }

        public Criteria andTypePrefixLessThan(String value) {
            addCriterion("type_prefix <", value, "typePrefix");
            return (Criteria) this;
        }

        public Criteria andTypePrefixLessThanOrEqualTo(String value) {
            addCriterion("type_prefix <=", value, "typePrefix");
            return (Criteria) this;
        }

        public Criteria andTypePrefixLike(String value) {
            addCriterion("type_prefix like", value, "typePrefix");
            return (Criteria) this;
        }

        public Criteria andTypePrefixNotLike(String value) {
            addCriterion("type_prefix not like", value, "typePrefix");
            return (Criteria) this;
        }

        public Criteria andTypePrefixIn(List<String> values) {
            addCriterion("type_prefix in", values, "typePrefix");
            return (Criteria) this;
        }

        public Criteria andTypePrefixNotIn(List<String> values) {
            addCriterion("type_prefix not in", values, "typePrefix");
            return (Criteria) this;
        }

        public Criteria andTypePrefixBetween(String value1, String value2) {
            addCriterion("type_prefix between", value1, value2, "typePrefix");
            return (Criteria) this;
        }

        public Criteria andTypePrefixNotBetween(String value1, String value2) {
            addCriterion("type_prefix not between", value1, value2, "typePrefix");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIdxIsNull() {
            addCriterion("type_idx is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdxIsNotNull() {
            addCriterion("type_idx is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdxEqualTo(Integer value) {
            addCriterion("type_idx =", value, "typeIdx");
            return (Criteria) this;
        }

        public Criteria andTypeIdxNotEqualTo(Integer value) {
            addCriterion("type_idx <>", value, "typeIdx");
            return (Criteria) this;
        }

        public Criteria andTypeIdxGreaterThan(Integer value) {
            addCriterion("type_idx >", value, "typeIdx");
            return (Criteria) this;
        }

        public Criteria andTypeIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_idx >=", value, "typeIdx");
            return (Criteria) this;
        }

        public Criteria andTypeIdxLessThan(Integer value) {
            addCriterion("type_idx <", value, "typeIdx");
            return (Criteria) this;
        }

        public Criteria andTypeIdxLessThanOrEqualTo(Integer value) {
            addCriterion("type_idx <=", value, "typeIdx");
            return (Criteria) this;
        }

        public Criteria andTypeIdxIn(List<Integer> values) {
            addCriterion("type_idx in", values, "typeIdx");
            return (Criteria) this;
        }

        public Criteria andTypeIdxNotIn(List<Integer> values) {
            addCriterion("type_idx not in", values, "typeIdx");
            return (Criteria) this;
        }

        public Criteria andTypeIdxBetween(Integer value1, Integer value2) {
            addCriterion("type_idx between", value1, value2, "typeIdx");
            return (Criteria) this;
        }

        public Criteria andTypeIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("type_idx not between", value1, value2, "typeIdx");
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

        public Criteria andSeriesCountIsNull() {
            addCriterion("series_count is null");
            return (Criteria) this;
        }

        public Criteria andSeriesCountIsNotNull() {
            addCriterion("series_count is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesCountEqualTo(Integer value) {
            addCriterion("series_count =", value, "seriesCount");
            return (Criteria) this;
        }

        public Criteria andSeriesCountNotEqualTo(Integer value) {
            addCriterion("series_count <>", value, "seriesCount");
            return (Criteria) this;
        }

        public Criteria andSeriesCountGreaterThan(Integer value) {
            addCriterion("series_count >", value, "seriesCount");
            return (Criteria) this;
        }

        public Criteria andSeriesCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("series_count >=", value, "seriesCount");
            return (Criteria) this;
        }

        public Criteria andSeriesCountLessThan(Integer value) {
            addCriterion("series_count <", value, "seriesCount");
            return (Criteria) this;
        }

        public Criteria andSeriesCountLessThanOrEqualTo(Integer value) {
            addCriterion("series_count <=", value, "seriesCount");
            return (Criteria) this;
        }

        public Criteria andSeriesCountIn(List<Integer> values) {
            addCriterion("series_count in", values, "seriesCount");
            return (Criteria) this;
        }

        public Criteria andSeriesCountNotIn(List<Integer> values) {
            addCriterion("series_count not in", values, "seriesCount");
            return (Criteria) this;
        }

        public Criteria andSeriesCountBetween(Integer value1, Integer value2) {
            addCriterion("series_count between", value1, value2, "seriesCount");
            return (Criteria) this;
        }

        public Criteria andSeriesCountNotBetween(Integer value1, Integer value2) {
            addCriterion("series_count not between", value1, value2, "seriesCount");
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