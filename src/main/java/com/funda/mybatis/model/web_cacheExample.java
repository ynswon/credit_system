package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class web_cacheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public web_cacheExample() {
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

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andFundingAccIsNull() {
            addCriterion("funding_acc is null");
            return (Criteria) this;
        }

        public Criteria andFundingAccIsNotNull() {
            addCriterion("funding_acc is not null");
            return (Criteria) this;
        }

        public Criteria andFundingAccEqualTo(Long value) {
            addCriterion("funding_acc =", value, "fundingAcc");
            return (Criteria) this;
        }

        public Criteria andFundingAccNotEqualTo(Long value) {
            addCriterion("funding_acc <>", value, "fundingAcc");
            return (Criteria) this;
        }

        public Criteria andFundingAccGreaterThan(Long value) {
            addCriterion("funding_acc >", value, "fundingAcc");
            return (Criteria) this;
        }

        public Criteria andFundingAccGreaterThanOrEqualTo(Long value) {
            addCriterion("funding_acc >=", value, "fundingAcc");
            return (Criteria) this;
        }

        public Criteria andFundingAccLessThan(Long value) {
            addCriterion("funding_acc <", value, "fundingAcc");
            return (Criteria) this;
        }

        public Criteria andFundingAccLessThanOrEqualTo(Long value) {
            addCriterion("funding_acc <=", value, "fundingAcc");
            return (Criteria) this;
        }

        public Criteria andFundingAccIn(List<Long> values) {
            addCriterion("funding_acc in", values, "fundingAcc");
            return (Criteria) this;
        }

        public Criteria andFundingAccNotIn(List<Long> values) {
            addCriterion("funding_acc not in", values, "fundingAcc");
            return (Criteria) this;
        }

        public Criteria andFundingAccBetween(Long value1, Long value2) {
            addCriterion("funding_acc between", value1, value2, "fundingAcc");
            return (Criteria) this;
        }

        public Criteria andFundingAccNotBetween(Long value1, Long value2) {
            addCriterion("funding_acc not between", value1, value2, "fundingAcc");
            return (Criteria) this;
        }

        public Criteria andAverageInterestRateIsNull() {
            addCriterion("average_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andAverageInterestRateIsNotNull() {
            addCriterion("average_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAverageInterestRateEqualTo(Double value) {
            addCriterion("average_interest_rate =", value, "averageInterestRate");
            return (Criteria) this;
        }

        public Criteria andAverageInterestRateNotEqualTo(Double value) {
            addCriterion("average_interest_rate <>", value, "averageInterestRate");
            return (Criteria) this;
        }

        public Criteria andAverageInterestRateGreaterThan(Double value) {
            addCriterion("average_interest_rate >", value, "averageInterestRate");
            return (Criteria) this;
        }

        public Criteria andAverageInterestRateGreaterThanOrEqualTo(Double value) {
            addCriterion("average_interest_rate >=", value, "averageInterestRate");
            return (Criteria) this;
        }

        public Criteria andAverageInterestRateLessThan(Double value) {
            addCriterion("average_interest_rate <", value, "averageInterestRate");
            return (Criteria) this;
        }

        public Criteria andAverageInterestRateLessThanOrEqualTo(Double value) {
            addCriterion("average_interest_rate <=", value, "averageInterestRate");
            return (Criteria) this;
        }

        public Criteria andAverageInterestRateIn(List<Double> values) {
            addCriterion("average_interest_rate in", values, "averageInterestRate");
            return (Criteria) this;
        }

        public Criteria andAverageInterestRateNotIn(List<Double> values) {
            addCriterion("average_interest_rate not in", values, "averageInterestRate");
            return (Criteria) this;
        }

        public Criteria andAverageInterestRateBetween(Double value1, Double value2) {
            addCriterion("average_interest_rate between", value1, value2, "averageInterestRate");
            return (Criteria) this;
        }

        public Criteria andAverageInterestRateNotBetween(Double value1, Double value2) {
            addCriterion("average_interest_rate not between", value1, value2, "averageInterestRate");
            return (Criteria) this;
        }

        public Criteria andCreditorAccIsNull() {
            addCriterion("creditor_acc is null");
            return (Criteria) this;
        }

        public Criteria andCreditorAccIsNotNull() {
            addCriterion("creditor_acc is not null");
            return (Criteria) this;
        }

        public Criteria andCreditorAccEqualTo(Integer value) {
            addCriterion("creditor_acc =", value, "creditorAcc");
            return (Criteria) this;
        }

        public Criteria andCreditorAccNotEqualTo(Integer value) {
            addCriterion("creditor_acc <>", value, "creditorAcc");
            return (Criteria) this;
        }

        public Criteria andCreditorAccGreaterThan(Integer value) {
            addCriterion("creditor_acc >", value, "creditorAcc");
            return (Criteria) this;
        }

        public Criteria andCreditorAccGreaterThanOrEqualTo(Integer value) {
            addCriterion("creditor_acc >=", value, "creditorAcc");
            return (Criteria) this;
        }

        public Criteria andCreditorAccLessThan(Integer value) {
            addCriterion("creditor_acc <", value, "creditorAcc");
            return (Criteria) this;
        }

        public Criteria andCreditorAccLessThanOrEqualTo(Integer value) {
            addCriterion("creditor_acc <=", value, "creditorAcc");
            return (Criteria) this;
        }

        public Criteria andCreditorAccIn(List<Integer> values) {
            addCriterion("creditor_acc in", values, "creditorAcc");
            return (Criteria) this;
        }

        public Criteria andCreditorAccNotIn(List<Integer> values) {
            addCriterion("creditor_acc not in", values, "creditorAcc");
            return (Criteria) this;
        }

        public Criteria andCreditorAccBetween(Integer value1, Integer value2) {
            addCriterion("creditor_acc between", value1, value2, "creditorAcc");
            return (Criteria) this;
        }

        public Criteria andCreditorAccNotBetween(Integer value1, Integer value2) {
            addCriterion("creditor_acc not between", value1, value2, "creditorAcc");
            return (Criteria) this;
        }

        public Criteria andItemAccIsNull() {
            addCriterion("item_acc is null");
            return (Criteria) this;
        }

        public Criteria andItemAccIsNotNull() {
            addCriterion("item_acc is not null");
            return (Criteria) this;
        }

        public Criteria andItemAccEqualTo(Integer value) {
            addCriterion("item_acc =", value, "itemAcc");
            return (Criteria) this;
        }

        public Criteria andItemAccNotEqualTo(Integer value) {
            addCriterion("item_acc <>", value, "itemAcc");
            return (Criteria) this;
        }

        public Criteria andItemAccGreaterThan(Integer value) {
            addCriterion("item_acc >", value, "itemAcc");
            return (Criteria) this;
        }

        public Criteria andItemAccGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_acc >=", value, "itemAcc");
            return (Criteria) this;
        }

        public Criteria andItemAccLessThan(Integer value) {
            addCriterion("item_acc <", value, "itemAcc");
            return (Criteria) this;
        }

        public Criteria andItemAccLessThanOrEqualTo(Integer value) {
            addCriterion("item_acc <=", value, "itemAcc");
            return (Criteria) this;
        }

        public Criteria andItemAccIn(List<Integer> values) {
            addCriterion("item_acc in", values, "itemAcc");
            return (Criteria) this;
        }

        public Criteria andItemAccNotIn(List<Integer> values) {
            addCriterion("item_acc not in", values, "itemAcc");
            return (Criteria) this;
        }

        public Criteria andItemAccBetween(Integer value1, Integer value2) {
            addCriterion("item_acc between", value1, value2, "itemAcc");
            return (Criteria) this;
        }

        public Criteria andItemAccNotBetween(Integer value1, Integer value2) {
            addCriterion("item_acc not between", value1, value2, "itemAcc");
            return (Criteria) this;
        }

        public Criteria andPresentFundingDateIsNull() {
            addCriterion("present_funding_date is null");
            return (Criteria) this;
        }

        public Criteria andPresentFundingDateIsNotNull() {
            addCriterion("present_funding_date is not null");
            return (Criteria) this;
        }

        public Criteria andPresentFundingDateEqualTo(Date value) {
            addCriterion("present_funding_date =", value, "presentFundingDate");
            return (Criteria) this;
        }

        public Criteria andPresentFundingDateNotEqualTo(Date value) {
            addCriterion("present_funding_date <>", value, "presentFundingDate");
            return (Criteria) this;
        }

        public Criteria andPresentFundingDateGreaterThan(Date value) {
            addCriterion("present_funding_date >", value, "presentFundingDate");
            return (Criteria) this;
        }

        public Criteria andPresentFundingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("present_funding_date >=", value, "presentFundingDate");
            return (Criteria) this;
        }

        public Criteria andPresentFundingDateLessThan(Date value) {
            addCriterion("present_funding_date <", value, "presentFundingDate");
            return (Criteria) this;
        }

        public Criteria andPresentFundingDateLessThanOrEqualTo(Date value) {
            addCriterion("present_funding_date <=", value, "presentFundingDate");
            return (Criteria) this;
        }

        public Criteria andPresentFundingDateIn(List<Date> values) {
            addCriterion("present_funding_date in", values, "presentFundingDate");
            return (Criteria) this;
        }

        public Criteria andPresentFundingDateNotIn(List<Date> values) {
            addCriterion("present_funding_date not in", values, "presentFundingDate");
            return (Criteria) this;
        }

        public Criteria andPresentFundingDateBetween(Date value1, Date value2) {
            addCriterion("present_funding_date between", value1, value2, "presentFundingDate");
            return (Criteria) this;
        }

        public Criteria andPresentFundingDateNotBetween(Date value1, Date value2) {
            addCriterion("present_funding_date not between", value1, value2, "presentFundingDate");
            return (Criteria) this;
        }

        public Criteria andNextFundingDateIsNull() {
            addCriterion("next_funding_date is null");
            return (Criteria) this;
        }

        public Criteria andNextFundingDateIsNotNull() {
            addCriterion("next_funding_date is not null");
            return (Criteria) this;
        }

        public Criteria andNextFundingDateEqualTo(Date value) {
            addCriterion("next_funding_date =", value, "nextFundingDate");
            return (Criteria) this;
        }

        public Criteria andNextFundingDateNotEqualTo(Date value) {
            addCriterion("next_funding_date <>", value, "nextFundingDate");
            return (Criteria) this;
        }

        public Criteria andNextFundingDateGreaterThan(Date value) {
            addCriterion("next_funding_date >", value, "nextFundingDate");
            return (Criteria) this;
        }

        public Criteria andNextFundingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("next_funding_date >=", value, "nextFundingDate");
            return (Criteria) this;
        }

        public Criteria andNextFundingDateLessThan(Date value) {
            addCriterion("next_funding_date <", value, "nextFundingDate");
            return (Criteria) this;
        }

        public Criteria andNextFundingDateLessThanOrEqualTo(Date value) {
            addCriterion("next_funding_date <=", value, "nextFundingDate");
            return (Criteria) this;
        }

        public Criteria andNextFundingDateIn(List<Date> values) {
            addCriterion("next_funding_date in", values, "nextFundingDate");
            return (Criteria) this;
        }

        public Criteria andNextFundingDateNotIn(List<Date> values) {
            addCriterion("next_funding_date not in", values, "nextFundingDate");
            return (Criteria) this;
        }

        public Criteria andNextFundingDateBetween(Date value1, Date value2) {
            addCriterion("next_funding_date between", value1, value2, "nextFundingDate");
            return (Criteria) this;
        }

        public Criteria andNextFundingDateNotBetween(Date value1, Date value2) {
            addCriterion("next_funding_date not between", value1, value2, "nextFundingDate");
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