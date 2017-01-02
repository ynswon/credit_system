package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class list_creditorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public list_creditorExample() {
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

        public Criteria andUserIdxIsNull() {
            addCriterion("user_idx is null");
            return (Criteria) this;
        }

        public Criteria andUserIdxIsNotNull() {
            addCriterion("user_idx is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdxEqualTo(Integer value) {
            addCriterion("user_idx =", value, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxNotEqualTo(Integer value) {
            addCriterion("user_idx <>", value, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxGreaterThan(Integer value) {
            addCriterion("user_idx >", value, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_idx >=", value, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxLessThan(Integer value) {
            addCriterion("user_idx <", value, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxLessThanOrEqualTo(Integer value) {
            addCriterion("user_idx <=", value, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxIn(List<Integer> values) {
            addCriterion("user_idx in", values, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxNotIn(List<Integer> values) {
            addCriterion("user_idx not in", values, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxBetween(Integer value1, Integer value2) {
            addCriterion("user_idx between", value1, value2, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("user_idx not between", value1, value2, "userIdx");
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

        public Criteria andInvestmentAmountIsNull() {
            addCriterion("investment_amount is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountIsNotNull() {
            addCriterion("investment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountEqualTo(Integer value) {
            addCriterion("investment_amount =", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotEqualTo(Integer value) {
            addCriterion("investment_amount <>", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountGreaterThan(Integer value) {
            addCriterion("investment_amount >", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("investment_amount >=", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountLessThan(Integer value) {
            addCriterion("investment_amount <", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountLessThanOrEqualTo(Integer value) {
            addCriterion("investment_amount <=", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountIn(List<Integer> values) {
            addCriterion("investment_amount in", values, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotIn(List<Integer> values) {
            addCriterion("investment_amount not in", values, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountBetween(Integer value1, Integer value2) {
            addCriterion("investment_amount between", value1, value2, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("investment_amount not between", value1, value2, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateIsNull() {
            addCriterion("investment_state is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateIsNotNull() {
            addCriterion("investment_state is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateEqualTo(String value) {
            addCriterion("investment_state =", value, "investmentState");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateNotEqualTo(String value) {
            addCriterion("investment_state <>", value, "investmentState");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateGreaterThan(String value) {
            addCriterion("investment_state >", value, "investmentState");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateGreaterThanOrEqualTo(String value) {
            addCriterion("investment_state >=", value, "investmentState");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateLessThan(String value) {
            addCriterion("investment_state <", value, "investmentState");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateLessThanOrEqualTo(String value) {
            addCriterion("investment_state <=", value, "investmentState");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateLike(String value) {
            addCriterion("investment_state like", value, "investmentState");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateNotLike(String value) {
            addCriterion("investment_state not like", value, "investmentState");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateIn(List<String> values) {
            addCriterion("investment_state in", values, "investmentState");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateNotIn(List<String> values) {
            addCriterion("investment_state not in", values, "investmentState");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateBetween(String value1, String value2) {
            addCriterion("investment_state between", value1, value2, "investmentState");
            return (Criteria) this;
        }

        public Criteria andInvestmentStateNotBetween(String value1, String value2) {
            addCriterion("investment_state not between", value1, value2, "investmentState");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("datetime is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("datetime is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(Date value) {
            addCriterion("datetime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(Date value) {
            addCriterion("datetime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(Date value) {
            addCriterion("datetime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("datetime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(Date value) {
            addCriterion("datetime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("datetime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<Date> values) {
            addCriterion("datetime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<Date> values) {
            addCriterion("datetime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(Date value1, Date value2) {
            addCriterion("datetime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("datetime not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(Integer value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(Integer value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(Integer value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(Integer value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(Integer value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<Integer> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<Integer> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(Integer value1, Integer value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateIsNull() {
            addCriterion("funda_support_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateIsNotNull() {
            addCriterion("funda_support_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateEqualTo(Float value) {
            addCriterion("funda_support_interest_rate =", value, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateNotEqualTo(Float value) {
            addCriterion("funda_support_interest_rate <>", value, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateGreaterThan(Float value) {
            addCriterion("funda_support_interest_rate >", value, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateGreaterThanOrEqualTo(Float value) {
            addCriterion("funda_support_interest_rate >=", value, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateLessThan(Float value) {
            addCriterion("funda_support_interest_rate <", value, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateLessThanOrEqualTo(Float value) {
            addCriterion("funda_support_interest_rate <=", value, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateIn(List<Float> values) {
            addCriterion("funda_support_interest_rate in", values, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateNotIn(List<Float> values) {
            addCriterion("funda_support_interest_rate not in", values, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateBetween(Float value1, Float value2) {
            addCriterion("funda_support_interest_rate between", value1, value2, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateNotBetween(Float value1, Float value2) {
            addCriterion("funda_support_interest_rate not between", value1, value2, "fundaSupportInterestRate");
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