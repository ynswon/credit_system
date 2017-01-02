package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class bank_accountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public bank_accountExample() {
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

        public Criteria andAccountHolderIsNull() {
            addCriterion("account_holder is null");
            return (Criteria) this;
        }

        public Criteria andAccountHolderIsNotNull() {
            addCriterion("account_holder is not null");
            return (Criteria) this;
        }

        public Criteria andAccountHolderEqualTo(String value) {
            addCriterion("account_holder =", value, "accountHolder");
            return (Criteria) this;
        }

        public Criteria andAccountHolderNotEqualTo(String value) {
            addCriterion("account_holder <>", value, "accountHolder");
            return (Criteria) this;
        }

        public Criteria andAccountHolderGreaterThan(String value) {
            addCriterion("account_holder >", value, "accountHolder");
            return (Criteria) this;
        }

        public Criteria andAccountHolderGreaterThanOrEqualTo(String value) {
            addCriterion("account_holder >=", value, "accountHolder");
            return (Criteria) this;
        }

        public Criteria andAccountHolderLessThan(String value) {
            addCriterion("account_holder <", value, "accountHolder");
            return (Criteria) this;
        }

        public Criteria andAccountHolderLessThanOrEqualTo(String value) {
            addCriterion("account_holder <=", value, "accountHolder");
            return (Criteria) this;
        }

        public Criteria andAccountHolderLike(String value) {
            addCriterion("account_holder like", value, "accountHolder");
            return (Criteria) this;
        }

        public Criteria andAccountHolderNotLike(String value) {
            addCriterion("account_holder not like", value, "accountHolder");
            return (Criteria) this;
        }

        public Criteria andAccountHolderIn(List<String> values) {
            addCriterion("account_holder in", values, "accountHolder");
            return (Criteria) this;
        }

        public Criteria andAccountHolderNotIn(List<String> values) {
            addCriterion("account_holder not in", values, "accountHolder");
            return (Criteria) this;
        }

        public Criteria andAccountHolderBetween(String value1, String value2) {
            addCriterion("account_holder between", value1, value2, "accountHolder");
            return (Criteria) this;
        }

        public Criteria andAccountHolderNotBetween(String value1, String value2) {
            addCriterion("account_holder not between", value1, value2, "accountHolder");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
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

        public Criteria andAccountWoHyphenIsNull() {
            addCriterion("account_wo_hyphen is null");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenIsNotNull() {
            addCriterion("account_wo_hyphen is not null");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenEqualTo(String value) {
            addCriterion("account_wo_hyphen =", value, "accountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenNotEqualTo(String value) {
            addCriterion("account_wo_hyphen <>", value, "accountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenGreaterThan(String value) {
            addCriterion("account_wo_hyphen >", value, "accountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenGreaterThanOrEqualTo(String value) {
            addCriterion("account_wo_hyphen >=", value, "accountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenLessThan(String value) {
            addCriterion("account_wo_hyphen <", value, "accountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenLessThanOrEqualTo(String value) {
            addCriterion("account_wo_hyphen <=", value, "accountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenLike(String value) {
            addCriterion("account_wo_hyphen like", value, "accountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenNotLike(String value) {
            addCriterion("account_wo_hyphen not like", value, "accountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenIn(List<String> values) {
            addCriterion("account_wo_hyphen in", values, "accountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenNotIn(List<String> values) {
            addCriterion("account_wo_hyphen not in", values, "accountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenBetween(String value1, String value2) {
            addCriterion("account_wo_hyphen between", value1, value2, "accountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andAccountWoHyphenNotBetween(String value1, String value2) {
            addCriterion("account_wo_hyphen not between", value1, value2, "accountWoHyphen");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIsNull() {
            addCriterion("is_virtual is null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIsNotNull() {
            addCriterion("is_virtual is not null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualEqualTo(Boolean value) {
            addCriterion("is_virtual =", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotEqualTo(Boolean value) {
            addCriterion("is_virtual <>", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThan(Boolean value) {
            addCriterion("is_virtual >", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_virtual >=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThan(Boolean value) {
            addCriterion("is_virtual <", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThanOrEqualTo(Boolean value) {
            addCriterion("is_virtual <=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIn(List<Boolean> values) {
            addCriterion("is_virtual in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotIn(List<Boolean> values) {
            addCriterion("is_virtual not in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualBetween(Boolean value1, Boolean value2) {
            addCriterion("is_virtual between", value1, value2, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_virtual not between", value1, value2, "isVirtual");
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

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andValidationFlagIsNull() {
            addCriterion("validation_flag is null");
            return (Criteria) this;
        }

        public Criteria andValidationFlagIsNotNull() {
            addCriterion("validation_flag is not null");
            return (Criteria) this;
        }

        public Criteria andValidationFlagEqualTo(Integer value) {
            addCriterion("validation_flag =", value, "validationFlag");
            return (Criteria) this;
        }

        public Criteria andValidationFlagNotEqualTo(Integer value) {
            addCriterion("validation_flag <>", value, "validationFlag");
            return (Criteria) this;
        }

        public Criteria andValidationFlagGreaterThan(Integer value) {
            addCriterion("validation_flag >", value, "validationFlag");
            return (Criteria) this;
        }

        public Criteria andValidationFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("validation_flag >=", value, "validationFlag");
            return (Criteria) this;
        }

        public Criteria andValidationFlagLessThan(Integer value) {
            addCriterion("validation_flag <", value, "validationFlag");
            return (Criteria) this;
        }

        public Criteria andValidationFlagLessThanOrEqualTo(Integer value) {
            addCriterion("validation_flag <=", value, "validationFlag");
            return (Criteria) this;
        }

        public Criteria andValidationFlagIn(List<Integer> values) {
            addCriterion("validation_flag in", values, "validationFlag");
            return (Criteria) this;
        }

        public Criteria andValidationFlagNotIn(List<Integer> values) {
            addCriterion("validation_flag not in", values, "validationFlag");
            return (Criteria) this;
        }

        public Criteria andValidationFlagBetween(Integer value1, Integer value2) {
            addCriterion("validation_flag between", value1, value2, "validationFlag");
            return (Criteria) this;
        }

        public Criteria andValidationFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("validation_flag not between", value1, value2, "validationFlag");
            return (Criteria) this;
        }

        public Criteria andTossNameIsNull() {
            addCriterion("toss_name is null");
            return (Criteria) this;
        }

        public Criteria andTossNameIsNotNull() {
            addCriterion("toss_name is not null");
            return (Criteria) this;
        }

        public Criteria andTossNameEqualTo(String value) {
            addCriterion("toss_name =", value, "tossName");
            return (Criteria) this;
        }

        public Criteria andTossNameNotEqualTo(String value) {
            addCriterion("toss_name <>", value, "tossName");
            return (Criteria) this;
        }

        public Criteria andTossNameGreaterThan(String value) {
            addCriterion("toss_name >", value, "tossName");
            return (Criteria) this;
        }

        public Criteria andTossNameGreaterThanOrEqualTo(String value) {
            addCriterion("toss_name >=", value, "tossName");
            return (Criteria) this;
        }

        public Criteria andTossNameLessThan(String value) {
            addCriterion("toss_name <", value, "tossName");
            return (Criteria) this;
        }

        public Criteria andTossNameLessThanOrEqualTo(String value) {
            addCriterion("toss_name <=", value, "tossName");
            return (Criteria) this;
        }

        public Criteria andTossNameLike(String value) {
            addCriterion("toss_name like", value, "tossName");
            return (Criteria) this;
        }

        public Criteria andTossNameNotLike(String value) {
            addCriterion("toss_name not like", value, "tossName");
            return (Criteria) this;
        }

        public Criteria andTossNameIn(List<String> values) {
            addCriterion("toss_name in", values, "tossName");
            return (Criteria) this;
        }

        public Criteria andTossNameNotIn(List<String> values) {
            addCriterion("toss_name not in", values, "tossName");
            return (Criteria) this;
        }

        public Criteria andTossNameBetween(String value1, String value2) {
            addCriterion("toss_name between", value1, value2, "tossName");
            return (Criteria) this;
        }

        public Criteria andTossNameNotBetween(String value1, String value2) {
            addCriterion("toss_name not between", value1, value2, "tossName");
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