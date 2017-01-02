package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class balance_and_depositExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public balance_and_depositExample() {
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andBankCommissionIsNull() {
            addCriterion("bank_commission is null");
            return (Criteria) this;
        }

        public Criteria andBankCommissionIsNotNull() {
            addCriterion("bank_commission is not null");
            return (Criteria) this;
        }

        public Criteria andBankCommissionEqualTo(Integer value) {
            addCriterion("bank_commission =", value, "bankCommission");
            return (Criteria) this;
        }

        public Criteria andBankCommissionNotEqualTo(Integer value) {
            addCriterion("bank_commission <>", value, "bankCommission");
            return (Criteria) this;
        }

        public Criteria andBankCommissionGreaterThan(Integer value) {
            addCriterion("bank_commission >", value, "bankCommission");
            return (Criteria) this;
        }

        public Criteria andBankCommissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_commission >=", value, "bankCommission");
            return (Criteria) this;
        }

        public Criteria andBankCommissionLessThan(Integer value) {
            addCriterion("bank_commission <", value, "bankCommission");
            return (Criteria) this;
        }

        public Criteria andBankCommissionLessThanOrEqualTo(Integer value) {
            addCriterion("bank_commission <=", value, "bankCommission");
            return (Criteria) this;
        }

        public Criteria andBankCommissionIn(List<Integer> values) {
            addCriterion("bank_commission in", values, "bankCommission");
            return (Criteria) this;
        }

        public Criteria andBankCommissionNotIn(List<Integer> values) {
            addCriterion("bank_commission not in", values, "bankCommission");
            return (Criteria) this;
        }

        public Criteria andBankCommissionBetween(Integer value1, Integer value2) {
            addCriterion("bank_commission between", value1, value2, "bankCommission");
            return (Criteria) this;
        }

        public Criteria andBankCommissionNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_commission not between", value1, value2, "bankCommission");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Long value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Long value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Long value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Long value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Long value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Long> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Long> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Long value1, Long value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Long value1, Long value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andIdxAccountContentIsNull() {
            addCriterion("idx_account_content is null");
            return (Criteria) this;
        }

        public Criteria andIdxAccountContentIsNotNull() {
            addCriterion("idx_account_content is not null");
            return (Criteria) this;
        }

        public Criteria andIdxAccountContentEqualTo(Integer value) {
            addCriterion("idx_account_content =", value, "idxAccountContent");
            return (Criteria) this;
        }

        public Criteria andIdxAccountContentNotEqualTo(Integer value) {
            addCriterion("idx_account_content <>", value, "idxAccountContent");
            return (Criteria) this;
        }

        public Criteria andIdxAccountContentGreaterThan(Integer value) {
            addCriterion("idx_account_content >", value, "idxAccountContent");
            return (Criteria) this;
        }

        public Criteria andIdxAccountContentGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx_account_content >=", value, "idxAccountContent");
            return (Criteria) this;
        }

        public Criteria andIdxAccountContentLessThan(Integer value) {
            addCriterion("idx_account_content <", value, "idxAccountContent");
            return (Criteria) this;
        }

        public Criteria andIdxAccountContentLessThanOrEqualTo(Integer value) {
            addCriterion("idx_account_content <=", value, "idxAccountContent");
            return (Criteria) this;
        }

        public Criteria andIdxAccountContentIn(List<Integer> values) {
            addCriterion("idx_account_content in", values, "idxAccountContent");
            return (Criteria) this;
        }

        public Criteria andIdxAccountContentNotIn(List<Integer> values) {
            addCriterion("idx_account_content not in", values, "idxAccountContent");
            return (Criteria) this;
        }

        public Criteria andIdxAccountContentBetween(Integer value1, Integer value2) {
            addCriterion("idx_account_content between", value1, value2, "idxAccountContent");
            return (Criteria) this;
        }

        public Criteria andIdxAccountContentNotBetween(Integer value1, Integer value2) {
            addCriterion("idx_account_content not between", value1, value2, "idxAccountContent");
            return (Criteria) this;
        }

        public Criteria andIdxListCreditorIsNull() {
            addCriterion("idx_list_creditor is null");
            return (Criteria) this;
        }

        public Criteria andIdxListCreditorIsNotNull() {
            addCriterion("idx_list_creditor is not null");
            return (Criteria) this;
        }

        public Criteria andIdxListCreditorEqualTo(Integer value) {
            addCriterion("idx_list_creditor =", value, "idxListCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxListCreditorNotEqualTo(Integer value) {
            addCriterion("idx_list_creditor <>", value, "idxListCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxListCreditorGreaterThan(Integer value) {
            addCriterion("idx_list_creditor >", value, "idxListCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxListCreditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx_list_creditor >=", value, "idxListCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxListCreditorLessThan(Integer value) {
            addCriterion("idx_list_creditor <", value, "idxListCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxListCreditorLessThanOrEqualTo(Integer value) {
            addCriterion("idx_list_creditor <=", value, "idxListCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxListCreditorIn(List<Integer> values) {
            addCriterion("idx_list_creditor in", values, "idxListCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxListCreditorNotIn(List<Integer> values) {
            addCriterion("idx_list_creditor not in", values, "idxListCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxListCreditorBetween(Integer value1, Integer value2) {
            addCriterion("idx_list_creditor between", value1, value2, "idxListCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxListCreditorNotBetween(Integer value1, Integer value2) {
            addCriterion("idx_list_creditor not between", value1, value2, "idxListCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxFundingDataDebtorIsNull() {
            addCriterion("idx_funding_data_debtor is null");
            return (Criteria) this;
        }

        public Criteria andIdxFundingDataDebtorIsNotNull() {
            addCriterion("idx_funding_data_debtor is not null");
            return (Criteria) this;
        }

        public Criteria andIdxFundingDataDebtorEqualTo(Integer value) {
            addCriterion("idx_funding_data_debtor =", value, "idxFundingDataDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxFundingDataDebtorNotEqualTo(Integer value) {
            addCriterion("idx_funding_data_debtor <>", value, "idxFundingDataDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxFundingDataDebtorGreaterThan(Integer value) {
            addCriterion("idx_funding_data_debtor >", value, "idxFundingDataDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxFundingDataDebtorGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx_funding_data_debtor >=", value, "idxFundingDataDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxFundingDataDebtorLessThan(Integer value) {
            addCriterion("idx_funding_data_debtor <", value, "idxFundingDataDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxFundingDataDebtorLessThanOrEqualTo(Integer value) {
            addCriterion("idx_funding_data_debtor <=", value, "idxFundingDataDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxFundingDataDebtorIn(List<Integer> values) {
            addCriterion("idx_funding_data_debtor in", values, "idxFundingDataDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxFundingDataDebtorNotIn(List<Integer> values) {
            addCriterion("idx_funding_data_debtor not in", values, "idxFundingDataDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxFundingDataDebtorBetween(Integer value1, Integer value2) {
            addCriterion("idx_funding_data_debtor between", value1, value2, "idxFundingDataDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxFundingDataDebtorNotBetween(Integer value1, Integer value2) {
            addCriterion("idx_funding_data_debtor not between", value1, value2, "idxFundingDataDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleCreditorIsNull() {
            addCriterion("idx_schedule_creditor is null");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleCreditorIsNotNull() {
            addCriterion("idx_schedule_creditor is not null");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleCreditorEqualTo(Integer value) {
            addCriterion("idx_schedule_creditor =", value, "idxScheduleCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleCreditorNotEqualTo(Integer value) {
            addCriterion("idx_schedule_creditor <>", value, "idxScheduleCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleCreditorGreaterThan(Integer value) {
            addCriterion("idx_schedule_creditor >", value, "idxScheduleCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleCreditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx_schedule_creditor >=", value, "idxScheduleCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleCreditorLessThan(Integer value) {
            addCriterion("idx_schedule_creditor <", value, "idxScheduleCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleCreditorLessThanOrEqualTo(Integer value) {
            addCriterion("idx_schedule_creditor <=", value, "idxScheduleCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleCreditorIn(List<Integer> values) {
            addCriterion("idx_schedule_creditor in", values, "idxScheduleCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleCreditorNotIn(List<Integer> values) {
            addCriterion("idx_schedule_creditor not in", values, "idxScheduleCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleCreditorBetween(Integer value1, Integer value2) {
            addCriterion("idx_schedule_creditor between", value1, value2, "idxScheduleCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleCreditorNotBetween(Integer value1, Integer value2) {
            addCriterion("idx_schedule_creditor not between", value1, value2, "idxScheduleCreditor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleDebtorIsNull() {
            addCriterion("idx_schedule_debtor is null");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleDebtorIsNotNull() {
            addCriterion("idx_schedule_debtor is not null");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleDebtorEqualTo(Integer value) {
            addCriterion("idx_schedule_debtor =", value, "idxScheduleDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleDebtorNotEqualTo(Integer value) {
            addCriterion("idx_schedule_debtor <>", value, "idxScheduleDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleDebtorGreaterThan(Integer value) {
            addCriterion("idx_schedule_debtor >", value, "idxScheduleDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleDebtorGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx_schedule_debtor >=", value, "idxScheduleDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleDebtorLessThan(Integer value) {
            addCriterion("idx_schedule_debtor <", value, "idxScheduleDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleDebtorLessThanOrEqualTo(Integer value) {
            addCriterion("idx_schedule_debtor <=", value, "idxScheduleDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleDebtorIn(List<Integer> values) {
            addCriterion("idx_schedule_debtor in", values, "idxScheduleDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleDebtorNotIn(List<Integer> values) {
            addCriterion("idx_schedule_debtor not in", values, "idxScheduleDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleDebtorBetween(Integer value1, Integer value2) {
            addCriterion("idx_schedule_debtor between", value1, value2, "idxScheduleDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxScheduleDebtorNotBetween(Integer value1, Integer value2) {
            addCriterion("idx_schedule_debtor not between", value1, value2, "idxScheduleDebtor");
            return (Criteria) this;
        }

        public Criteria andIdxDepositWithdrawalRequestIsNull() {
            addCriterion("idx_deposit_withdrawal_request is null");
            return (Criteria) this;
        }

        public Criteria andIdxDepositWithdrawalRequestIsNotNull() {
            addCriterion("idx_deposit_withdrawal_request is not null");
            return (Criteria) this;
        }

        public Criteria andIdxDepositWithdrawalRequestEqualTo(Integer value) {
            addCriterion("idx_deposit_withdrawal_request =", value, "idxDepositWithdrawalRequest");
            return (Criteria) this;
        }

        public Criteria andIdxDepositWithdrawalRequestNotEqualTo(Integer value) {
            addCriterion("idx_deposit_withdrawal_request <>", value, "idxDepositWithdrawalRequest");
            return (Criteria) this;
        }

        public Criteria andIdxDepositWithdrawalRequestGreaterThan(Integer value) {
            addCriterion("idx_deposit_withdrawal_request >", value, "idxDepositWithdrawalRequest");
            return (Criteria) this;
        }

        public Criteria andIdxDepositWithdrawalRequestGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx_deposit_withdrawal_request >=", value, "idxDepositWithdrawalRequest");
            return (Criteria) this;
        }

        public Criteria andIdxDepositWithdrawalRequestLessThan(Integer value) {
            addCriterion("idx_deposit_withdrawal_request <", value, "idxDepositWithdrawalRequest");
            return (Criteria) this;
        }

        public Criteria andIdxDepositWithdrawalRequestLessThanOrEqualTo(Integer value) {
            addCriterion("idx_deposit_withdrawal_request <=", value, "idxDepositWithdrawalRequest");
            return (Criteria) this;
        }

        public Criteria andIdxDepositWithdrawalRequestIn(List<Integer> values) {
            addCriterion("idx_deposit_withdrawal_request in", values, "idxDepositWithdrawalRequest");
            return (Criteria) this;
        }

        public Criteria andIdxDepositWithdrawalRequestNotIn(List<Integer> values) {
            addCriterion("idx_deposit_withdrawal_request not in", values, "idxDepositWithdrawalRequest");
            return (Criteria) this;
        }

        public Criteria andIdxDepositWithdrawalRequestBetween(Integer value1, Integer value2) {
            addCriterion("idx_deposit_withdrawal_request between", value1, value2, "idxDepositWithdrawalRequest");
            return (Criteria) this;
        }

        public Criteria andIdxDepositWithdrawalRequestNotBetween(Integer value1, Integer value2) {
            addCriterion("idx_deposit_withdrawal_request not between", value1, value2, "idxDepositWithdrawalRequest");
            return (Criteria) this;
        }

        public Criteria andIdxCouponIssueIsNull() {
            addCriterion("idx_coupon_issue is null");
            return (Criteria) this;
        }

        public Criteria andIdxCouponIssueIsNotNull() {
            addCriterion("idx_coupon_issue is not null");
            return (Criteria) this;
        }

        public Criteria andIdxCouponIssueEqualTo(Integer value) {
            addCriterion("idx_coupon_issue =", value, "idxCouponIssue");
            return (Criteria) this;
        }

        public Criteria andIdxCouponIssueNotEqualTo(Integer value) {
            addCriterion("idx_coupon_issue <>", value, "idxCouponIssue");
            return (Criteria) this;
        }

        public Criteria andIdxCouponIssueGreaterThan(Integer value) {
            addCriterion("idx_coupon_issue >", value, "idxCouponIssue");
            return (Criteria) this;
        }

        public Criteria andIdxCouponIssueGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx_coupon_issue >=", value, "idxCouponIssue");
            return (Criteria) this;
        }

        public Criteria andIdxCouponIssueLessThan(Integer value) {
            addCriterion("idx_coupon_issue <", value, "idxCouponIssue");
            return (Criteria) this;
        }

        public Criteria andIdxCouponIssueLessThanOrEqualTo(Integer value) {
            addCriterion("idx_coupon_issue <=", value, "idxCouponIssue");
            return (Criteria) this;
        }

        public Criteria andIdxCouponIssueIn(List<Integer> values) {
            addCriterion("idx_coupon_issue in", values, "idxCouponIssue");
            return (Criteria) this;
        }

        public Criteria andIdxCouponIssueNotIn(List<Integer> values) {
            addCriterion("idx_coupon_issue not in", values, "idxCouponIssue");
            return (Criteria) this;
        }

        public Criteria andIdxCouponIssueBetween(Integer value1, Integer value2) {
            addCriterion("idx_coupon_issue between", value1, value2, "idxCouponIssue");
            return (Criteria) this;
        }

        public Criteria andIdxCouponIssueNotBetween(Integer value1, Integer value2) {
            addCriterion("idx_coupon_issue not between", value1, value2, "idxCouponIssue");
            return (Criteria) this;
        }

        public Criteria andIdxListCouponIsNull() {
            addCriterion("idx_list_coupon is null");
            return (Criteria) this;
        }

        public Criteria andIdxListCouponIsNotNull() {
            addCriterion("idx_list_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andIdxListCouponEqualTo(Integer value) {
            addCriterion("idx_list_coupon =", value, "idxListCoupon");
            return (Criteria) this;
        }

        public Criteria andIdxListCouponNotEqualTo(Integer value) {
            addCriterion("idx_list_coupon <>", value, "idxListCoupon");
            return (Criteria) this;
        }

        public Criteria andIdxListCouponGreaterThan(Integer value) {
            addCriterion("idx_list_coupon >", value, "idxListCoupon");
            return (Criteria) this;
        }

        public Criteria andIdxListCouponGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx_list_coupon >=", value, "idxListCoupon");
            return (Criteria) this;
        }

        public Criteria andIdxListCouponLessThan(Integer value) {
            addCriterion("idx_list_coupon <", value, "idxListCoupon");
            return (Criteria) this;
        }

        public Criteria andIdxListCouponLessThanOrEqualTo(Integer value) {
            addCriterion("idx_list_coupon <=", value, "idxListCoupon");
            return (Criteria) this;
        }

        public Criteria andIdxListCouponIn(List<Integer> values) {
            addCriterion("idx_list_coupon in", values, "idxListCoupon");
            return (Criteria) this;
        }

        public Criteria andIdxListCouponNotIn(List<Integer> values) {
            addCriterion("idx_list_coupon not in", values, "idxListCoupon");
            return (Criteria) this;
        }

        public Criteria andIdxListCouponBetween(Integer value1, Integer value2) {
            addCriterion("idx_list_coupon between", value1, value2, "idxListCoupon");
            return (Criteria) this;
        }

        public Criteria andIdxListCouponNotBetween(Integer value1, Integer value2) {
            addCriterion("idx_list_coupon not between", value1, value2, "idxListCoupon");
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

        public Criteria andStoreIdxIsNull() {
            addCriterion("store_idx is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdxIsNotNull() {
            addCriterion("store_idx is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdxEqualTo(Integer value) {
            addCriterion("store_idx =", value, "storeIdx");
            return (Criteria) this;
        }

        public Criteria andStoreIdxNotEqualTo(Integer value) {
            addCriterion("store_idx <>", value, "storeIdx");
            return (Criteria) this;
        }

        public Criteria andStoreIdxGreaterThan(Integer value) {
            addCriterion("store_idx >", value, "storeIdx");
            return (Criteria) this;
        }

        public Criteria andStoreIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_idx >=", value, "storeIdx");
            return (Criteria) this;
        }

        public Criteria andStoreIdxLessThan(Integer value) {
            addCriterion("store_idx <", value, "storeIdx");
            return (Criteria) this;
        }

        public Criteria andStoreIdxLessThanOrEqualTo(Integer value) {
            addCriterion("store_idx <=", value, "storeIdx");
            return (Criteria) this;
        }

        public Criteria andStoreIdxIn(List<Integer> values) {
            addCriterion("store_idx in", values, "storeIdx");
            return (Criteria) this;
        }

        public Criteria andStoreIdxNotIn(List<Integer> values) {
            addCriterion("store_idx not in", values, "storeIdx");
            return (Criteria) this;
        }

        public Criteria andStoreIdxBetween(Integer value1, Integer value2) {
            addCriterion("store_idx between", value1, value2, "storeIdx");
            return (Criteria) this;
        }

        public Criteria andStoreIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("store_idx not between", value1, value2, "storeIdx");
            return (Criteria) this;
        }

        public Criteria andTransactTimeIsNull() {
            addCriterion("transact_time is null");
            return (Criteria) this;
        }

        public Criteria andTransactTimeIsNotNull() {
            addCriterion("transact_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransactTimeEqualTo(Date value) {
            addCriterion("transact_time =", value, "transactTime");
            return (Criteria) this;
        }

        public Criteria andTransactTimeNotEqualTo(Date value) {
            addCriterion("transact_time <>", value, "transactTime");
            return (Criteria) this;
        }

        public Criteria andTransactTimeGreaterThan(Date value) {
            addCriterion("transact_time >", value, "transactTime");
            return (Criteria) this;
        }

        public Criteria andTransactTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("transact_time >=", value, "transactTime");
            return (Criteria) this;
        }

        public Criteria andTransactTimeLessThan(Date value) {
            addCriterion("transact_time <", value, "transactTime");
            return (Criteria) this;
        }

        public Criteria andTransactTimeLessThanOrEqualTo(Date value) {
            addCriterion("transact_time <=", value, "transactTime");
            return (Criteria) this;
        }

        public Criteria andTransactTimeIn(List<Date> values) {
            addCriterion("transact_time in", values, "transactTime");
            return (Criteria) this;
        }

        public Criteria andTransactTimeNotIn(List<Date> values) {
            addCriterion("transact_time not in", values, "transactTime");
            return (Criteria) this;
        }

        public Criteria andTransactTimeBetween(Date value1, Date value2) {
            addCriterion("transact_time between", value1, value2, "transactTime");
            return (Criteria) this;
        }

        public Criteria andTransactTimeNotBetween(Date value1, Date value2) {
            addCriterion("transact_time not between", value1, value2, "transactTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagIsNull() {
            addCriterion("withdrawalable_flag is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagIsNotNull() {
            addCriterion("withdrawalable_flag is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagEqualTo(String value) {
            addCriterion("withdrawalable_flag =", value, "withdrawalableFlag");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagNotEqualTo(String value) {
            addCriterion("withdrawalable_flag <>", value, "withdrawalableFlag");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagGreaterThan(String value) {
            addCriterion("withdrawalable_flag >", value, "withdrawalableFlag");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagGreaterThanOrEqualTo(String value) {
            addCriterion("withdrawalable_flag >=", value, "withdrawalableFlag");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagLessThan(String value) {
            addCriterion("withdrawalable_flag <", value, "withdrawalableFlag");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagLessThanOrEqualTo(String value) {
            addCriterion("withdrawalable_flag <=", value, "withdrawalableFlag");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagLike(String value) {
            addCriterion("withdrawalable_flag like", value, "withdrawalableFlag");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagNotLike(String value) {
            addCriterion("withdrawalable_flag not like", value, "withdrawalableFlag");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagIn(List<String> values) {
            addCriterion("withdrawalable_flag in", values, "withdrawalableFlag");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagNotIn(List<String> values) {
            addCriterion("withdrawalable_flag not in", values, "withdrawalableFlag");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagBetween(String value1, String value2) {
            addCriterion("withdrawalable_flag between", value1, value2, "withdrawalableFlag");
            return (Criteria) this;
        }

        public Criteria andWithdrawalableFlagNotBetween(String value1, String value2) {
            addCriterion("withdrawalable_flag not between", value1, value2, "withdrawalableFlag");
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