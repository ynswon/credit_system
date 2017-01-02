package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class transfer_listExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public transfer_listExample() {
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

        public Criteria andTransferIdIsNull() {
            addCriterion("transfer_id is null");
            return (Criteria) this;
        }

        public Criteria andTransferIdIsNotNull() {
            addCriterion("transfer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransferIdEqualTo(String value) {
            addCriterion("transfer_id =", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotEqualTo(String value) {
            addCriterion("transfer_id <>", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdGreaterThan(String value) {
            addCriterion("transfer_id >", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_id >=", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLessThan(String value) {
            addCriterion("transfer_id <", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLessThanOrEqualTo(String value) {
            addCriterion("transfer_id <=", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLike(String value) {
            addCriterion("transfer_id like", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotLike(String value) {
            addCriterion("transfer_id not like", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdIn(List<String> values) {
            addCriterion("transfer_id in", values, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotIn(List<String> values) {
            addCriterion("transfer_id not in", values, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdBetween(String value1, String value2) {
            addCriterion("transfer_id between", value1, value2, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotBetween(String value1, String value2) {
            addCriterion("transfer_id not between", value1, value2, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferCodeIsNull() {
            addCriterion("transfer_code is null");
            return (Criteria) this;
        }

        public Criteria andTransferCodeIsNotNull() {
            addCriterion("transfer_code is not null");
            return (Criteria) this;
        }

        public Criteria andTransferCodeEqualTo(String value) {
            addCriterion("transfer_code =", value, "transferCode");
            return (Criteria) this;
        }

        public Criteria andTransferCodeNotEqualTo(String value) {
            addCriterion("transfer_code <>", value, "transferCode");
            return (Criteria) this;
        }

        public Criteria andTransferCodeGreaterThan(String value) {
            addCriterion("transfer_code >", value, "transferCode");
            return (Criteria) this;
        }

        public Criteria andTransferCodeGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_code >=", value, "transferCode");
            return (Criteria) this;
        }

        public Criteria andTransferCodeLessThan(String value) {
            addCriterion("transfer_code <", value, "transferCode");
            return (Criteria) this;
        }

        public Criteria andTransferCodeLessThanOrEqualTo(String value) {
            addCriterion("transfer_code <=", value, "transferCode");
            return (Criteria) this;
        }

        public Criteria andTransferCodeLike(String value) {
            addCriterion("transfer_code like", value, "transferCode");
            return (Criteria) this;
        }

        public Criteria andTransferCodeNotLike(String value) {
            addCriterion("transfer_code not like", value, "transferCode");
            return (Criteria) this;
        }

        public Criteria andTransferCodeIn(List<String> values) {
            addCriterion("transfer_code in", values, "transferCode");
            return (Criteria) this;
        }

        public Criteria andTransferCodeNotIn(List<String> values) {
            addCriterion("transfer_code not in", values, "transferCode");
            return (Criteria) this;
        }

        public Criteria andTransferCodeBetween(String value1, String value2) {
            addCriterion("transfer_code between", value1, value2, "transferCode");
            return (Criteria) this;
        }

        public Criteria andTransferCodeNotBetween(String value1, String value2) {
            addCriterion("transfer_code not between", value1, value2, "transferCode");
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

        public Criteria andWithdrawalIdxIsNull() {
            addCriterion("withdrawal_idx is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIdxIsNotNull() {
            addCriterion("withdrawal_idx is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIdxEqualTo(Integer value) {
            addCriterion("withdrawal_idx =", value, "withdrawalIdx");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIdxNotEqualTo(Integer value) {
            addCriterion("withdrawal_idx <>", value, "withdrawalIdx");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIdxGreaterThan(Integer value) {
            addCriterion("withdrawal_idx >", value, "withdrawalIdx");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdrawal_idx >=", value, "withdrawalIdx");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIdxLessThan(Integer value) {
            addCriterion("withdrawal_idx <", value, "withdrawalIdx");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIdxLessThanOrEqualTo(Integer value) {
            addCriterion("withdrawal_idx <=", value, "withdrawalIdx");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIdxIn(List<Integer> values) {
            addCriterion("withdrawal_idx in", values, "withdrawalIdx");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIdxNotIn(List<Integer> values) {
            addCriterion("withdrawal_idx not in", values, "withdrawalIdx");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIdxBetween(Integer value1, Integer value2) {
            addCriterion("withdrawal_idx between", value1, value2, "withdrawalIdx");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("withdrawal_idx not between", value1, value2, "withdrawalIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andTransferStatusIsNull() {
            addCriterion("transfer_status is null");
            return (Criteria) this;
        }

        public Criteria andTransferStatusIsNotNull() {
            addCriterion("transfer_status is not null");
            return (Criteria) this;
        }

        public Criteria andTransferStatusEqualTo(Integer value) {
            addCriterion("transfer_status =", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotEqualTo(Integer value) {
            addCriterion("transfer_status <>", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusGreaterThan(Integer value) {
            addCriterion("transfer_status >", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("transfer_status >=", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusLessThan(Integer value) {
            addCriterion("transfer_status <", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusLessThanOrEqualTo(Integer value) {
            addCriterion("transfer_status <=", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusIn(List<Integer> values) {
            addCriterion("transfer_status in", values, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotIn(List<Integer> values) {
            addCriterion("transfer_status not in", values, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusBetween(Integer value1, Integer value2) {
            addCriterion("transfer_status between", value1, value2, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("transfer_status not between", value1, value2, "transferStatus");
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