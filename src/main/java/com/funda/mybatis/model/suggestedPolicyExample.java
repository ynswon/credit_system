package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class suggestedPolicyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public suggestedPolicyExample() {
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andMonthlyrepayIsNull() {
            addCriterion("monthlyRepay is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyrepayIsNotNull() {
            addCriterion("monthlyRepay is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyrepayEqualTo(Double value) {
            addCriterion("monthlyRepay =", value, "monthlyrepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyrepayNotEqualTo(Double value) {
            addCriterion("monthlyRepay <>", value, "monthlyrepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyrepayGreaterThan(Double value) {
            addCriterion("monthlyRepay >", value, "monthlyrepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyrepayGreaterThanOrEqualTo(Double value) {
            addCriterion("monthlyRepay >=", value, "monthlyrepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyrepayLessThan(Double value) {
            addCriterion("monthlyRepay <", value, "monthlyrepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyrepayLessThanOrEqualTo(Double value) {
            addCriterion("monthlyRepay <=", value, "monthlyrepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyrepayIn(List<Double> values) {
            addCriterion("monthlyRepay in", values, "monthlyrepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyrepayNotIn(List<Double> values) {
            addCriterion("monthlyRepay not in", values, "monthlyrepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyrepayBetween(Double value1, Double value2) {
            addCriterion("monthlyRepay between", value1, value2, "monthlyrepay");
            return (Criteria) this;
        }

        public Criteria andMonthlyrepayNotBetween(Double value1, Double value2) {
            addCriterion("monthlyRepay not between", value1, value2, "monthlyrepay");
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

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Double value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Double value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Double value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Double value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Double value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Double value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Double> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Double> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Double value1, Double value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Double value1, Double value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("seq is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("seq is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Integer value) {
            addCriterion("seq =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Integer value) {
            addCriterion("seq <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Integer value) {
            addCriterion("seq >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("seq >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Integer value) {
            addCriterion("seq <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Integer value) {
            addCriterion("seq <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Integer> values) {
            addCriterion("seq in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Integer> values) {
            addCriterion("seq not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Integer value1, Integer value2) {
            addCriterion("seq between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("seq not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andLimitIsNull() {
            addCriterion("limit is null");
            return (Criteria) this;
        }

        public Criteria andLimitIsNotNull() {
            addCriterion("limit is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEqualTo(Double value) {
            addCriterion("limit =", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotEqualTo(Double value) {
            addCriterion("limit <>", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThan(Double value) {
            addCriterion("limit >", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThanOrEqualTo(Double value) {
            addCriterion("limit >=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThan(Double value) {
            addCriterion("limit <", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThanOrEqualTo(Double value) {
            addCriterion("limit <=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitIn(List<Double> values) {
            addCriterion("limit in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotIn(List<Double> values) {
            addCriterion("limit not in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitBetween(Double value1, Double value2) {
            addCriterion("limit between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotBetween(Double value1, Double value2) {
            addCriterion("limit not between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andQualityYnIsNull() {
            addCriterion("quality_yn is null");
            return (Criteria) this;
        }

        public Criteria andQualityYnIsNotNull() {
            addCriterion("quality_yn is not null");
            return (Criteria) this;
        }

        public Criteria andQualityYnEqualTo(String value) {
            addCriterion("quality_yn =", value, "qualityYn");
            return (Criteria) this;
        }

        public Criteria andQualityYnNotEqualTo(String value) {
            addCriterion("quality_yn <>", value, "qualityYn");
            return (Criteria) this;
        }

        public Criteria andQualityYnGreaterThan(String value) {
            addCriterion("quality_yn >", value, "qualityYn");
            return (Criteria) this;
        }

        public Criteria andQualityYnGreaterThanOrEqualTo(String value) {
            addCriterion("quality_yn >=", value, "qualityYn");
            return (Criteria) this;
        }

        public Criteria andQualityYnLessThan(String value) {
            addCriterion("quality_yn <", value, "qualityYn");
            return (Criteria) this;
        }

        public Criteria andQualityYnLessThanOrEqualTo(String value) {
            addCriterion("quality_yn <=", value, "qualityYn");
            return (Criteria) this;
        }

        public Criteria andQualityYnLike(String value) {
            addCriterion("quality_yn like", value, "qualityYn");
            return (Criteria) this;
        }

        public Criteria andQualityYnNotLike(String value) {
            addCriterion("quality_yn not like", value, "qualityYn");
            return (Criteria) this;
        }

        public Criteria andQualityYnIn(List<String> values) {
            addCriterion("quality_yn in", values, "qualityYn");
            return (Criteria) this;
        }

        public Criteria andQualityYnNotIn(List<String> values) {
            addCriterion("quality_yn not in", values, "qualityYn");
            return (Criteria) this;
        }

        public Criteria andQualityYnBetween(String value1, String value2) {
            addCriterion("quality_yn between", value1, value2, "qualityYn");
            return (Criteria) this;
        }

        public Criteria andQualityYnNotBetween(String value1, String value2) {
            addCriterion("quality_yn not between", value1, value2, "qualityYn");
            return (Criteria) this;
        }

        public Criteria andApprovedYnIsNull() {
            addCriterion("approved_yn is null");
            return (Criteria) this;
        }

        public Criteria andApprovedYnIsNotNull() {
            addCriterion("approved_yn is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedYnEqualTo(String value) {
            addCriterion("approved_yn =", value, "approvedYn");
            return (Criteria) this;
        }

        public Criteria andApprovedYnNotEqualTo(String value) {
            addCriterion("approved_yn <>", value, "approvedYn");
            return (Criteria) this;
        }

        public Criteria andApprovedYnGreaterThan(String value) {
            addCriterion("approved_yn >", value, "approvedYn");
            return (Criteria) this;
        }

        public Criteria andApprovedYnGreaterThanOrEqualTo(String value) {
            addCriterion("approved_yn >=", value, "approvedYn");
            return (Criteria) this;
        }

        public Criteria andApprovedYnLessThan(String value) {
            addCriterion("approved_yn <", value, "approvedYn");
            return (Criteria) this;
        }

        public Criteria andApprovedYnLessThanOrEqualTo(String value) {
            addCriterion("approved_yn <=", value, "approvedYn");
            return (Criteria) this;
        }

        public Criteria andApprovedYnLike(String value) {
            addCriterion("approved_yn like", value, "approvedYn");
            return (Criteria) this;
        }

        public Criteria andApprovedYnNotLike(String value) {
            addCriterion("approved_yn not like", value, "approvedYn");
            return (Criteria) this;
        }

        public Criteria andApprovedYnIn(List<String> values) {
            addCriterion("approved_yn in", values, "approvedYn");
            return (Criteria) this;
        }

        public Criteria andApprovedYnNotIn(List<String> values) {
            addCriterion("approved_yn not in", values, "approvedYn");
            return (Criteria) this;
        }

        public Criteria andApprovedYnBetween(String value1, String value2) {
            addCriterion("approved_yn between", value1, value2, "approvedYn");
            return (Criteria) this;
        }

        public Criteria andApprovedYnNotBetween(String value1, String value2) {
            addCriterion("approved_yn not between", value1, value2, "approvedYn");
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

        public Criteria andDatetimeEqualTo(String value) {
            addCriterion("datetime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(String value) {
            addCriterion("datetime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(String value) {
            addCriterion("datetime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("datetime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(String value) {
            addCriterion("datetime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(String value) {
            addCriterion("datetime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLike(String value) {
            addCriterion("datetime like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotLike(String value) {
            addCriterion("datetime not like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<String> values) {
            addCriterion("datetime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<String> values) {
            addCriterion("datetime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(String value1, String value2) {
            addCriterion("datetime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(String value1, String value2) {
            addCriterion("datetime not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDebtcodeIsNull() {
            addCriterion("debtcode is null");
            return (Criteria) this;
        }

        public Criteria andDebtcodeIsNotNull() {
            addCriterion("debtcode is not null");
            return (Criteria) this;
        }

        public Criteria andDebtcodeEqualTo(String value) {
            addCriterion("debtcode =", value, "debtcode");
            return (Criteria) this;
        }

        public Criteria andDebtcodeNotEqualTo(String value) {
            addCriterion("debtcode <>", value, "debtcode");
            return (Criteria) this;
        }

        public Criteria andDebtcodeGreaterThan(String value) {
            addCriterion("debtcode >", value, "debtcode");
            return (Criteria) this;
        }

        public Criteria andDebtcodeGreaterThanOrEqualTo(String value) {
            addCriterion("debtcode >=", value, "debtcode");
            return (Criteria) this;
        }

        public Criteria andDebtcodeLessThan(String value) {
            addCriterion("debtcode <", value, "debtcode");
            return (Criteria) this;
        }

        public Criteria andDebtcodeLessThanOrEqualTo(String value) {
            addCriterion("debtcode <=", value, "debtcode");
            return (Criteria) this;
        }

        public Criteria andDebtcodeLike(String value) {
            addCriterion("debtcode like", value, "debtcode");
            return (Criteria) this;
        }

        public Criteria andDebtcodeNotLike(String value) {
            addCriterion("debtcode not like", value, "debtcode");
            return (Criteria) this;
        }

        public Criteria andDebtcodeIn(List<String> values) {
            addCriterion("debtcode in", values, "debtcode");
            return (Criteria) this;
        }

        public Criteria andDebtcodeNotIn(List<String> values) {
            addCriterion("debtcode not in", values, "debtcode");
            return (Criteria) this;
        }

        public Criteria andDebtcodeBetween(String value1, String value2) {
            addCriterion("debtcode between", value1, value2, "debtcode");
            return (Criteria) this;
        }

        public Criteria andDebtcodeNotBetween(String value1, String value2) {
            addCriterion("debtcode not between", value1, value2, "debtcode");
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