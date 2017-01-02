package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class refund_data_change_logExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public refund_data_change_logExample() {
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

        public Criteria andBankAccountHolderIsNull() {
            addCriterion("bank_account_holder is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderIsNotNull() {
            addCriterion("bank_account_holder is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderEqualTo(String value) {
            addCriterion("bank_account_holder =", value, "bankAccountHolder");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderNotEqualTo(String value) {
            addCriterion("bank_account_holder <>", value, "bankAccountHolder");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderGreaterThan(String value) {
            addCriterion("bank_account_holder >", value, "bankAccountHolder");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_holder >=", value, "bankAccountHolder");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderLessThan(String value) {
            addCriterion("bank_account_holder <", value, "bankAccountHolder");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderLessThanOrEqualTo(String value) {
            addCriterion("bank_account_holder <=", value, "bankAccountHolder");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderLike(String value) {
            addCriterion("bank_account_holder like", value, "bankAccountHolder");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderNotLike(String value) {
            addCriterion("bank_account_holder not like", value, "bankAccountHolder");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderIn(List<String> values) {
            addCriterion("bank_account_holder in", values, "bankAccountHolder");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderNotIn(List<String> values) {
            addCriterion("bank_account_holder not in", values, "bankAccountHolder");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderBetween(String value1, String value2) {
            addCriterion("bank_account_holder between", value1, value2, "bankAccountHolder");
            return (Criteria) this;
        }

        public Criteria andBankAccountHolderNotBetween(String value1, String value2) {
            addCriterion("bank_account_holder not between", value1, value2, "bankAccountHolder");
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

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenIsNull() {
            addCriterion("bank_account_wo_hyphen is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenIsNotNull() {
            addCriterion("bank_account_wo_hyphen is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenEqualTo(String value) {
            addCriterion("bank_account_wo_hyphen =", value, "bankAccountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenNotEqualTo(String value) {
            addCriterion("bank_account_wo_hyphen <>", value, "bankAccountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenGreaterThan(String value) {
            addCriterion("bank_account_wo_hyphen >", value, "bankAccountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_wo_hyphen >=", value, "bankAccountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenLessThan(String value) {
            addCriterion("bank_account_wo_hyphen <", value, "bankAccountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenLessThanOrEqualTo(String value) {
            addCriterion("bank_account_wo_hyphen <=", value, "bankAccountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenLike(String value) {
            addCriterion("bank_account_wo_hyphen like", value, "bankAccountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenNotLike(String value) {
            addCriterion("bank_account_wo_hyphen not like", value, "bankAccountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenIn(List<String> values) {
            addCriterion("bank_account_wo_hyphen in", values, "bankAccountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenNotIn(List<String> values) {
            addCriterion("bank_account_wo_hyphen not in", values, "bankAccountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenBetween(String value1, String value2) {
            addCriterion("bank_account_wo_hyphen between", value1, value2, "bankAccountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andBankAccountWoHyphenNotBetween(String value1, String value2) {
            addCriterion("bank_account_wo_hyphen not between", value1, value2, "bankAccountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(Integer value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(Integer value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(Integer value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(Integer value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(Integer value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<Integer> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<Integer> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(Integer value1, Integer value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andRegNumIsNull() {
            addCriterion("reg_num is null");
            return (Criteria) this;
        }

        public Criteria andRegNumIsNotNull() {
            addCriterion("reg_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegNumEqualTo(String value) {
            addCriterion("reg_num =", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumNotEqualTo(String value) {
            addCriterion("reg_num <>", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumGreaterThan(String value) {
            addCriterion("reg_num >", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumGreaterThanOrEqualTo(String value) {
            addCriterion("reg_num >=", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumLessThan(String value) {
            addCriterion("reg_num <", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumLessThanOrEqualTo(String value) {
            addCriterion("reg_num <=", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumLike(String value) {
            addCriterion("reg_num like", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumNotLike(String value) {
            addCriterion("reg_num not like", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumIn(List<String> values) {
            addCriterion("reg_num in", values, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumNotIn(List<String> values) {
            addCriterion("reg_num not in", values, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumBetween(String value1, String value2) {
            addCriterion("reg_num between", value1, value2, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumNotBetween(String value1, String value2) {
            addCriterion("reg_num not between", value1, value2, "regNum");
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

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
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

        public Criteria andSessionIpIsNull() {
            addCriterion("session_ip is null");
            return (Criteria) this;
        }

        public Criteria andSessionIpIsNotNull() {
            addCriterion("session_ip is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIpEqualTo(String value) {
            addCriterion("session_ip =", value, "sessionIp");
            return (Criteria) this;
        }

        public Criteria andSessionIpNotEqualTo(String value) {
            addCriterion("session_ip <>", value, "sessionIp");
            return (Criteria) this;
        }

        public Criteria andSessionIpGreaterThan(String value) {
            addCriterion("session_ip >", value, "sessionIp");
            return (Criteria) this;
        }

        public Criteria andSessionIpGreaterThanOrEqualTo(String value) {
            addCriterion("session_ip >=", value, "sessionIp");
            return (Criteria) this;
        }

        public Criteria andSessionIpLessThan(String value) {
            addCriterion("session_ip <", value, "sessionIp");
            return (Criteria) this;
        }

        public Criteria andSessionIpLessThanOrEqualTo(String value) {
            addCriterion("session_ip <=", value, "sessionIp");
            return (Criteria) this;
        }

        public Criteria andSessionIpLike(String value) {
            addCriterion("session_ip like", value, "sessionIp");
            return (Criteria) this;
        }

        public Criteria andSessionIpNotLike(String value) {
            addCriterion("session_ip not like", value, "sessionIp");
            return (Criteria) this;
        }

        public Criteria andSessionIpIn(List<String> values) {
            addCriterion("session_ip in", values, "sessionIp");
            return (Criteria) this;
        }

        public Criteria andSessionIpNotIn(List<String> values) {
            addCriterion("session_ip not in", values, "sessionIp");
            return (Criteria) this;
        }

        public Criteria andSessionIpBetween(String value1, String value2) {
            addCriterion("session_ip between", value1, value2, "sessionIp");
            return (Criteria) this;
        }

        public Criteria andSessionIpNotBetween(String value1, String value2) {
            addCriterion("session_ip not between", value1, value2, "sessionIp");
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