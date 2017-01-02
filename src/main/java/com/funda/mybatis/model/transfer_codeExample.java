package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class transfer_codeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public transfer_codeExample() {
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

        public Criteria andCommonCodeIsNull() {
            addCriterion("common_code is null");
            return (Criteria) this;
        }

        public Criteria andCommonCodeIsNotNull() {
            addCriterion("common_code is not null");
            return (Criteria) this;
        }

        public Criteria andCommonCodeEqualTo(String value) {
            addCriterion("common_code =", value, "commonCode");
            return (Criteria) this;
        }

        public Criteria andCommonCodeNotEqualTo(String value) {
            addCriterion("common_code <>", value, "commonCode");
            return (Criteria) this;
        }

        public Criteria andCommonCodeGreaterThan(String value) {
            addCriterion("common_code >", value, "commonCode");
            return (Criteria) this;
        }

        public Criteria andCommonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("common_code >=", value, "commonCode");
            return (Criteria) this;
        }

        public Criteria andCommonCodeLessThan(String value) {
            addCriterion("common_code <", value, "commonCode");
            return (Criteria) this;
        }

        public Criteria andCommonCodeLessThanOrEqualTo(String value) {
            addCriterion("common_code <=", value, "commonCode");
            return (Criteria) this;
        }

        public Criteria andCommonCodeLike(String value) {
            addCriterion("common_code like", value, "commonCode");
            return (Criteria) this;
        }

        public Criteria andCommonCodeNotLike(String value) {
            addCriterion("common_code not like", value, "commonCode");
            return (Criteria) this;
        }

        public Criteria andCommonCodeIn(List<String> values) {
            addCriterion("common_code in", values, "commonCode");
            return (Criteria) this;
        }

        public Criteria andCommonCodeNotIn(List<String> values) {
            addCriterion("common_code not in", values, "commonCode");
            return (Criteria) this;
        }

        public Criteria andCommonCodeBetween(String value1, String value2) {
            addCriterion("common_code between", value1, value2, "commonCode");
            return (Criteria) this;
        }

        public Criteria andCommonCodeNotBetween(String value1, String value2) {
            addCriterion("common_code not between", value1, value2, "commonCode");
            return (Criteria) this;
        }

        public Criteria andCodeIncrementIsNull() {
            addCriterion("code_increment is null");
            return (Criteria) this;
        }

        public Criteria andCodeIncrementIsNotNull() {
            addCriterion("code_increment is not null");
            return (Criteria) this;
        }

        public Criteria andCodeIncrementEqualTo(Integer value) {
            addCriterion("code_increment =", value, "codeIncrement");
            return (Criteria) this;
        }

        public Criteria andCodeIncrementNotEqualTo(Integer value) {
            addCriterion("code_increment <>", value, "codeIncrement");
            return (Criteria) this;
        }

        public Criteria andCodeIncrementGreaterThan(Integer value) {
            addCriterion("code_increment >", value, "codeIncrement");
            return (Criteria) this;
        }

        public Criteria andCodeIncrementGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_increment >=", value, "codeIncrement");
            return (Criteria) this;
        }

        public Criteria andCodeIncrementLessThan(Integer value) {
            addCriterion("code_increment <", value, "codeIncrement");
            return (Criteria) this;
        }

        public Criteria andCodeIncrementLessThanOrEqualTo(Integer value) {
            addCriterion("code_increment <=", value, "codeIncrement");
            return (Criteria) this;
        }

        public Criteria andCodeIncrementIn(List<Integer> values) {
            addCriterion("code_increment in", values, "codeIncrement");
            return (Criteria) this;
        }

        public Criteria andCodeIncrementNotIn(List<Integer> values) {
            addCriterion("code_increment not in", values, "codeIncrement");
            return (Criteria) this;
        }

        public Criteria andCodeIncrementBetween(Integer value1, Integer value2) {
            addCriterion("code_increment between", value1, value2, "codeIncrement");
            return (Criteria) this;
        }

        public Criteria andCodeIncrementNotBetween(Integer value1, Integer value2) {
            addCriterion("code_increment not between", value1, value2, "codeIncrement");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("session_id like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("session_id not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andRequestedDatetimeIsNull() {
            addCriterion("requested_datetime is null");
            return (Criteria) this;
        }

        public Criteria andRequestedDatetimeIsNotNull() {
            addCriterion("requested_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andRequestedDatetimeEqualTo(Date value) {
            addCriterion("requested_datetime =", value, "requestedDatetime");
            return (Criteria) this;
        }

        public Criteria andRequestedDatetimeNotEqualTo(Date value) {
            addCriterion("requested_datetime <>", value, "requestedDatetime");
            return (Criteria) this;
        }

        public Criteria andRequestedDatetimeGreaterThan(Date value) {
            addCriterion("requested_datetime >", value, "requestedDatetime");
            return (Criteria) this;
        }

        public Criteria andRequestedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("requested_datetime >=", value, "requestedDatetime");
            return (Criteria) this;
        }

        public Criteria andRequestedDatetimeLessThan(Date value) {
            addCriterion("requested_datetime <", value, "requestedDatetime");
            return (Criteria) this;
        }

        public Criteria andRequestedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("requested_datetime <=", value, "requestedDatetime");
            return (Criteria) this;
        }

        public Criteria andRequestedDatetimeIn(List<Date> values) {
            addCriterion("requested_datetime in", values, "requestedDatetime");
            return (Criteria) this;
        }

        public Criteria andRequestedDatetimeNotIn(List<Date> values) {
            addCriterion("requested_datetime not in", values, "requestedDatetime");
            return (Criteria) this;
        }

        public Criteria andRequestedDatetimeBetween(Date value1, Date value2) {
            addCriterion("requested_datetime between", value1, value2, "requestedDatetime");
            return (Criteria) this;
        }

        public Criteria andRequestedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("requested_datetime not between", value1, value2, "requestedDatetime");
            return (Criteria) this;
        }

        public Criteria andFundingIdxIsNull() {
            addCriterion("funding_idx is null");
            return (Criteria) this;
        }

        public Criteria andFundingIdxIsNotNull() {
            addCriterion("funding_idx is not null");
            return (Criteria) this;
        }

        public Criteria andFundingIdxEqualTo(Integer value) {
            addCriterion("funding_idx =", value, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxNotEqualTo(Integer value) {
            addCriterion("funding_idx <>", value, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxGreaterThan(Integer value) {
            addCriterion("funding_idx >", value, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("funding_idx >=", value, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxLessThan(Integer value) {
            addCriterion("funding_idx <", value, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxLessThanOrEqualTo(Integer value) {
            addCriterion("funding_idx <=", value, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxIn(List<Integer> values) {
            addCriterion("funding_idx in", values, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxNotIn(List<Integer> values) {
            addCriterion("funding_idx not in", values, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxBetween(Integer value1, Integer value2) {
            addCriterion("funding_idx between", value1, value2, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("funding_idx not between", value1, value2, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andRepaymentIdxIsNull() {
            addCriterion("repayment_idx is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentIdxIsNotNull() {
            addCriterion("repayment_idx is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentIdxEqualTo(Integer value) {
            addCriterion("repayment_idx =", value, "repaymentIdx");
            return (Criteria) this;
        }

        public Criteria andRepaymentIdxNotEqualTo(Integer value) {
            addCriterion("repayment_idx <>", value, "repaymentIdx");
            return (Criteria) this;
        }

        public Criteria andRepaymentIdxGreaterThan(Integer value) {
            addCriterion("repayment_idx >", value, "repaymentIdx");
            return (Criteria) this;
        }

        public Criteria andRepaymentIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_idx >=", value, "repaymentIdx");
            return (Criteria) this;
        }

        public Criteria andRepaymentIdxLessThan(Integer value) {
            addCriterion("repayment_idx <", value, "repaymentIdx");
            return (Criteria) this;
        }

        public Criteria andRepaymentIdxLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_idx <=", value, "repaymentIdx");
            return (Criteria) this;
        }

        public Criteria andRepaymentIdxIn(List<Integer> values) {
            addCriterion("repayment_idx in", values, "repaymentIdx");
            return (Criteria) this;
        }

        public Criteria andRepaymentIdxNotIn(List<Integer> values) {
            addCriterion("repayment_idx not in", values, "repaymentIdx");
            return (Criteria) this;
        }

        public Criteria andRepaymentIdxBetween(Integer value1, Integer value2) {
            addCriterion("repayment_idx between", value1, value2, "repaymentIdx");
            return (Criteria) this;
        }

        public Criteria andRepaymentIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_idx not between", value1, value2, "repaymentIdx");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Integer value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Integer value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Integer value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Integer value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Integer value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Integer> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Integer> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Integer value1, Integer value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Integer value1, Integer value2) {
            addCriterion("result not between", value1, value2, "result");
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