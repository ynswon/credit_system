package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class bank_account_fundaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public bank_account_fundaExample() {
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

        public Criteria andBankEqualTo(Integer value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(Integer value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(Integer value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(Integer value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(Integer value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<Integer> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<Integer> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(Integer value1, Integer value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(Integer value1, Integer value2) {
            addCriterion("bank not between", value1, value2, "bank");
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

        public Criteria andIsVirtualEqualTo(String value) {
            addCriterion("is_virtual =", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotEqualTo(String value) {
            addCriterion("is_virtual <>", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThan(String value) {
            addCriterion("is_virtual >", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThanOrEqualTo(String value) {
            addCriterion("is_virtual >=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThan(String value) {
            addCriterion("is_virtual <", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThanOrEqualTo(String value) {
            addCriterion("is_virtual <=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLike(String value) {
            addCriterion("is_virtual like", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotLike(String value) {
            addCriterion("is_virtual not like", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIn(List<String> values) {
            addCriterion("is_virtual in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotIn(List<String> values) {
            addCriterion("is_virtual not in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualBetween(String value1, String value2) {
            addCriterion("is_virtual between", value1, value2, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotBetween(String value1, String value2) {
            addCriterion("is_virtual not between", value1, value2, "isVirtual");
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