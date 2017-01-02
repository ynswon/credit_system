package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class bank_codeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public bank_codeExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTossCodeIsNull() {
            addCriterion("toss_code is null");
            return (Criteria) this;
        }

        public Criteria andTossCodeIsNotNull() {
            addCriterion("toss_code is not null");
            return (Criteria) this;
        }

        public Criteria andTossCodeEqualTo(String value) {
            addCriterion("toss_code =", value, "tossCode");
            return (Criteria) this;
        }

        public Criteria andTossCodeNotEqualTo(String value) {
            addCriterion("toss_code <>", value, "tossCode");
            return (Criteria) this;
        }

        public Criteria andTossCodeGreaterThan(String value) {
            addCriterion("toss_code >", value, "tossCode");
            return (Criteria) this;
        }

        public Criteria andTossCodeGreaterThanOrEqualTo(String value) {
            addCriterion("toss_code >=", value, "tossCode");
            return (Criteria) this;
        }

        public Criteria andTossCodeLessThan(String value) {
            addCriterion("toss_code <", value, "tossCode");
            return (Criteria) this;
        }

        public Criteria andTossCodeLessThanOrEqualTo(String value) {
            addCriterion("toss_code <=", value, "tossCode");
            return (Criteria) this;
        }

        public Criteria andTossCodeLike(String value) {
            addCriterion("toss_code like", value, "tossCode");
            return (Criteria) this;
        }

        public Criteria andTossCodeNotLike(String value) {
            addCriterion("toss_code not like", value, "tossCode");
            return (Criteria) this;
        }

        public Criteria andTossCodeIn(List<String> values) {
            addCriterion("toss_code in", values, "tossCode");
            return (Criteria) this;
        }

        public Criteria andTossCodeNotIn(List<String> values) {
            addCriterion("toss_code not in", values, "tossCode");
            return (Criteria) this;
        }

        public Criteria andTossCodeBetween(String value1, String value2) {
            addCriterion("toss_code between", value1, value2, "tossCode");
            return (Criteria) this;
        }

        public Criteria andTossCodeNotBetween(String value1, String value2) {
            addCriterion("toss_code not between", value1, value2, "tossCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeIsNull() {
            addCriterion("settlebank_code is null");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeIsNotNull() {
            addCriterion("settlebank_code is not null");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeEqualTo(String value) {
            addCriterion("settlebank_code =", value, "settlebankCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeNotEqualTo(String value) {
            addCriterion("settlebank_code <>", value, "settlebankCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeGreaterThan(String value) {
            addCriterion("settlebank_code >", value, "settlebankCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("settlebank_code >=", value, "settlebankCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeLessThan(String value) {
            addCriterion("settlebank_code <", value, "settlebankCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeLessThanOrEqualTo(String value) {
            addCriterion("settlebank_code <=", value, "settlebankCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeLike(String value) {
            addCriterion("settlebank_code like", value, "settlebankCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeNotLike(String value) {
            addCriterion("settlebank_code not like", value, "settlebankCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeIn(List<String> values) {
            addCriterion("settlebank_code in", values, "settlebankCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeNotIn(List<String> values) {
            addCriterion("settlebank_code not in", values, "settlebankCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeBetween(String value1, String value2) {
            addCriterion("settlebank_code between", value1, value2, "settlebankCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankCodeNotBetween(String value1, String value2) {
            addCriterion("settlebank_code not between", value1, value2, "settlebankCode");
            return (Criteria) this;
        }

        public Criteria andSettlebankIssuableIsNull() {
            addCriterion("settlebank_issuable is null");
            return (Criteria) this;
        }

        public Criteria andSettlebankIssuableIsNotNull() {
            addCriterion("settlebank_issuable is not null");
            return (Criteria) this;
        }

        public Criteria andSettlebankIssuableEqualTo(Integer value) {
            addCriterion("settlebank_issuable =", value, "settlebankIssuable");
            return (Criteria) this;
        }

        public Criteria andSettlebankIssuableNotEqualTo(Integer value) {
            addCriterion("settlebank_issuable <>", value, "settlebankIssuable");
            return (Criteria) this;
        }

        public Criteria andSettlebankIssuableGreaterThan(Integer value) {
            addCriterion("settlebank_issuable >", value, "settlebankIssuable");
            return (Criteria) this;
        }

        public Criteria andSettlebankIssuableGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlebank_issuable >=", value, "settlebankIssuable");
            return (Criteria) this;
        }

        public Criteria andSettlebankIssuableLessThan(Integer value) {
            addCriterion("settlebank_issuable <", value, "settlebankIssuable");
            return (Criteria) this;
        }

        public Criteria andSettlebankIssuableLessThanOrEqualTo(Integer value) {
            addCriterion("settlebank_issuable <=", value, "settlebankIssuable");
            return (Criteria) this;
        }

        public Criteria andSettlebankIssuableIn(List<Integer> values) {
            addCriterion("settlebank_issuable in", values, "settlebankIssuable");
            return (Criteria) this;
        }

        public Criteria andSettlebankIssuableNotIn(List<Integer> values) {
            addCriterion("settlebank_issuable not in", values, "settlebankIssuable");
            return (Criteria) this;
        }

        public Criteria andSettlebankIssuableBetween(Integer value1, Integer value2) {
            addCriterion("settlebank_issuable between", value1, value2, "settlebankIssuable");
            return (Criteria) this;
        }

        public Criteria andSettlebankIssuableNotBetween(Integer value1, Integer value2) {
            addCriterion("settlebank_issuable not between", value1, value2, "settlebankIssuable");
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