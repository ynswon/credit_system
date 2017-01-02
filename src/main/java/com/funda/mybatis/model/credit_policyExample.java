package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class credit_policyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public credit_policyExample() {
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

        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andIindexIsNull() {
            addCriterion("iindex is null");
            return (Criteria) this;
        }

        public Criteria andIindexIsNotNull() {
            addCriterion("iindex is not null");
            return (Criteria) this;
        }

        public Criteria andIindexEqualTo(String value) {
            addCriterion("iindex =", value, "iindex");
            return (Criteria) this;
        }

        public Criteria andIindexNotEqualTo(String value) {
            addCriterion("iindex <>", value, "iindex");
            return (Criteria) this;
        }

        public Criteria andIindexGreaterThan(String value) {
            addCriterion("iindex >", value, "iindex");
            return (Criteria) this;
        }

        public Criteria andIindexGreaterThanOrEqualTo(String value) {
            addCriterion("iindex >=", value, "iindex");
            return (Criteria) this;
        }

        public Criteria andIindexLessThan(String value) {
            addCriterion("iindex <", value, "iindex");
            return (Criteria) this;
        }

        public Criteria andIindexLessThanOrEqualTo(String value) {
            addCriterion("iindex <=", value, "iindex");
            return (Criteria) this;
        }

        public Criteria andIindexLike(String value) {
            addCriterion("iindex like", value, "iindex");
            return (Criteria) this;
        }

        public Criteria andIindexNotLike(String value) {
            addCriterion("iindex not like", value, "iindex");
            return (Criteria) this;
        }

        public Criteria andIindexIn(List<String> values) {
            addCriterion("iindex in", values, "iindex");
            return (Criteria) this;
        }

        public Criteria andIindexNotIn(List<String> values) {
            addCriterion("iindex not in", values, "iindex");
            return (Criteria) this;
        }

        public Criteria andIindexBetween(String value1, String value2) {
            addCriterion("iindex between", value1, value2, "iindex");
            return (Criteria) this;
        }

        public Criteria andIindexNotBetween(String value1, String value2) {
            addCriterion("iindex not between", value1, value2, "iindex");
            return (Criteria) this;
        }

        public Criteria andRepayFutureIsNull() {
            addCriterion("repay_future is null");
            return (Criteria) this;
        }

        public Criteria andRepayFutureIsNotNull() {
            addCriterion("repay_future is not null");
            return (Criteria) this;
        }

        public Criteria andRepayFutureEqualTo(String value) {
            addCriterion("repay_future =", value, "repayFuture");
            return (Criteria) this;
        }

        public Criteria andRepayFutureNotEqualTo(String value) {
            addCriterion("repay_future <>", value, "repayFuture");
            return (Criteria) this;
        }

        public Criteria andRepayFutureGreaterThan(String value) {
            addCriterion("repay_future >", value, "repayFuture");
            return (Criteria) this;
        }

        public Criteria andRepayFutureGreaterThanOrEqualTo(String value) {
            addCriterion("repay_future >=", value, "repayFuture");
            return (Criteria) this;
        }

        public Criteria andRepayFutureLessThan(String value) {
            addCriterion("repay_future <", value, "repayFuture");
            return (Criteria) this;
        }

        public Criteria andRepayFutureLessThanOrEqualTo(String value) {
            addCriterion("repay_future <=", value, "repayFuture");
            return (Criteria) this;
        }

        public Criteria andRepayFutureLike(String value) {
            addCriterion("repay_future like", value, "repayFuture");
            return (Criteria) this;
        }

        public Criteria andRepayFutureNotLike(String value) {
            addCriterion("repay_future not like", value, "repayFuture");
            return (Criteria) this;
        }

        public Criteria andRepayFutureIn(List<String> values) {
            addCriterion("repay_future in", values, "repayFuture");
            return (Criteria) this;
        }

        public Criteria andRepayFutureNotIn(List<String> values) {
            addCriterion("repay_future not in", values, "repayFuture");
            return (Criteria) this;
        }

        public Criteria andRepayFutureBetween(String value1, String value2) {
            addCriterion("repay_future between", value1, value2, "repayFuture");
            return (Criteria) this;
        }

        public Criteria andRepayFutureNotBetween(String value1, String value2) {
            addCriterion("repay_future not between", value1, value2, "repayFuture");
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

        public Criteria andSegIsNull() {
            addCriterion("seg is null");
            return (Criteria) this;
        }

        public Criteria andSegIsNotNull() {
            addCriterion("seg is not null");
            return (Criteria) this;
        }

        public Criteria andSegEqualTo(String value) {
            addCriterion("seg =", value, "seg");
            return (Criteria) this;
        }

        public Criteria andSegNotEqualTo(String value) {
            addCriterion("seg <>", value, "seg");
            return (Criteria) this;
        }

        public Criteria andSegGreaterThan(String value) {
            addCriterion("seg >", value, "seg");
            return (Criteria) this;
        }

        public Criteria andSegGreaterThanOrEqualTo(String value) {
            addCriterion("seg >=", value, "seg");
            return (Criteria) this;
        }

        public Criteria andSegLessThan(String value) {
            addCriterion("seg <", value, "seg");
            return (Criteria) this;
        }

        public Criteria andSegLessThanOrEqualTo(String value) {
            addCriterion("seg <=", value, "seg");
            return (Criteria) this;
        }

        public Criteria andSegLike(String value) {
            addCriterion("seg like", value, "seg");
            return (Criteria) this;
        }

        public Criteria andSegNotLike(String value) {
            addCriterion("seg not like", value, "seg");
            return (Criteria) this;
        }

        public Criteria andSegIn(List<String> values) {
            addCriterion("seg in", values, "seg");
            return (Criteria) this;
        }

        public Criteria andSegNotIn(List<String> values) {
            addCriterion("seg not in", values, "seg");
            return (Criteria) this;
        }

        public Criteria andSegBetween(String value1, String value2) {
            addCriterion("seg between", value1, value2, "seg");
            return (Criteria) this;
        }

        public Criteria andSegNotBetween(String value1, String value2) {
            addCriterion("seg not between", value1, value2, "seg");
            return (Criteria) this;
        }

        public Criteria andPolicyIsNull() {
            addCriterion("policy is null");
            return (Criteria) this;
        }

        public Criteria andPolicyIsNotNull() {
            addCriterion("policy is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyEqualTo(String value) {
            addCriterion("policy =", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotEqualTo(String value) {
            addCriterion("policy <>", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyGreaterThan(String value) {
            addCriterion("policy >", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("policy >=", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLessThan(String value) {
            addCriterion("policy <", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLessThanOrEqualTo(String value) {
            addCriterion("policy <=", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLike(String value) {
            addCriterion("policy like", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotLike(String value) {
            addCriterion("policy not like", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyIn(List<String> values) {
            addCriterion("policy in", values, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotIn(List<String> values) {
            addCriterion("policy not in", values, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyBetween(String value1, String value2) {
            addCriterion("policy between", value1, value2, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotBetween(String value1, String value2) {
            addCriterion("policy not between", value1, value2, "policy");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnIsNull() {
            addCriterion("qualified_yn is null");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnIsNotNull() {
            addCriterion("qualified_yn is not null");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnEqualTo(String value) {
            addCriterion("qualified_yn =", value, "qualifiedYn");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnNotEqualTo(String value) {
            addCriterion("qualified_yn <>", value, "qualifiedYn");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnGreaterThan(String value) {
            addCriterion("qualified_yn >", value, "qualifiedYn");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnGreaterThanOrEqualTo(String value) {
            addCriterion("qualified_yn >=", value, "qualifiedYn");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnLessThan(String value) {
            addCriterion("qualified_yn <", value, "qualifiedYn");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnLessThanOrEqualTo(String value) {
            addCriterion("qualified_yn <=", value, "qualifiedYn");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnLike(String value) {
            addCriterion("qualified_yn like", value, "qualifiedYn");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnNotLike(String value) {
            addCriterion("qualified_yn not like", value, "qualifiedYn");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnIn(List<String> values) {
            addCriterion("qualified_yn in", values, "qualifiedYn");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnNotIn(List<String> values) {
            addCriterion("qualified_yn not in", values, "qualifiedYn");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnBetween(String value1, String value2) {
            addCriterion("qualified_yn between", value1, value2, "qualifiedYn");
            return (Criteria) this;
        }

        public Criteria andQualifiedYnNotBetween(String value1, String value2) {
            addCriterion("qualified_yn not between", value1, value2, "qualifiedYn");
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