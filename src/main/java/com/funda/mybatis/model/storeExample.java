package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class storeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public storeExample() {
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

        public Criteria andStoreCodeIsNull() {
            addCriterion("store_code is null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNotNull() {
            addCriterion("store_code is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeEqualTo(String value) {
            addCriterion("store_code =", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotEqualTo(String value) {
            addCriterion("store_code <>", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThan(String value) {
            addCriterion("store_code >", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store_code >=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThan(String value) {
            addCriterion("store_code <", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThanOrEqualTo(String value) {
            addCriterion("store_code <=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLike(String value) {
            addCriterion("store_code like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotLike(String value) {
            addCriterion("store_code not like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIn(List<String> values) {
            addCriterion("store_code in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotIn(List<String> values) {
            addCriterion("store_code not in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeBetween(String value1, String value2) {
            addCriterion("store_code between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotBetween(String value1, String value2) {
            addCriterion("store_code not between", value1, value2, "storeCode");
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

        public Criteria andAddress2IsNull() {
            addCriterion("address2 is null");
            return (Criteria) this;
        }

        public Criteria andAddress2IsNotNull() {
            addCriterion("address2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress2EqualTo(String value) {
            addCriterion("address2 =", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotEqualTo(String value) {
            addCriterion("address2 <>", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2GreaterThan(String value) {
            addCriterion("address2 >", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2GreaterThanOrEqualTo(String value) {
            addCriterion("address2 >=", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2LessThan(String value) {
            addCriterion("address2 <", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2LessThanOrEqualTo(String value) {
            addCriterion("address2 <=", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2Like(String value) {
            addCriterion("address2 like", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotLike(String value) {
            addCriterion("address2 not like", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2In(List<String> values) {
            addCriterion("address2 in", values, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotIn(List<String> values) {
            addCriterion("address2 not in", values, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2Between(String value1, String value2) {
            addCriterion("address2 between", value1, value2, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotBetween(String value1, String value2) {
            addCriterion("address2 not between", value1, value2, "address2");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andType1IsNull() {
            addCriterion("type1 is null");
            return (Criteria) this;
        }

        public Criteria andType1IsNotNull() {
            addCriterion("type1 is not null");
            return (Criteria) this;
        }

        public Criteria andType1EqualTo(String value) {
            addCriterion("type1 =", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotEqualTo(String value) {
            addCriterion("type1 <>", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThan(String value) {
            addCriterion("type1 >", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThanOrEqualTo(String value) {
            addCriterion("type1 >=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThan(String value) {
            addCriterion("type1 <", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThanOrEqualTo(String value) {
            addCriterion("type1 <=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Like(String value) {
            addCriterion("type1 like", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotLike(String value) {
            addCriterion("type1 not like", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1In(List<String> values) {
            addCriterion("type1 in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotIn(List<String> values) {
            addCriterion("type1 not in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Between(String value1, String value2) {
            addCriterion("type1 between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotBetween(String value1, String value2) {
            addCriterion("type1 not between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipcode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipcode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipcode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipcode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipcode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipcode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipcode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipcode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipcode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipcode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipcode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipcode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipcode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andHomepageIsNull() {
            addCriterion("homepage is null");
            return (Criteria) this;
        }

        public Criteria andHomepageIsNotNull() {
            addCriterion("homepage is not null");
            return (Criteria) this;
        }

        public Criteria andHomepageEqualTo(String value) {
            addCriterion("homepage =", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotEqualTo(String value) {
            addCriterion("homepage <>", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageGreaterThan(String value) {
            addCriterion("homepage >", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageGreaterThanOrEqualTo(String value) {
            addCriterion("homepage >=", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLessThan(String value) {
            addCriterion("homepage <", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLessThanOrEqualTo(String value) {
            addCriterion("homepage <=", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLike(String value) {
            addCriterion("homepage like", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotLike(String value) {
            addCriterion("homepage not like", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageIn(List<String> values) {
            addCriterion("homepage in", values, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotIn(List<String> values) {
            addCriterion("homepage not in", values, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageBetween(String value1, String value2) {
            addCriterion("homepage between", value1, value2, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotBetween(String value1, String value2) {
            addCriterion("homepage not between", value1, value2, "homepage");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("capital is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("capital is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(Integer value) {
            addCriterion("capital =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(Integer value) {
            addCriterion("capital <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(Integer value) {
            addCriterion("capital >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("capital >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(Integer value) {
            addCriterion("capital <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("capital <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<Integer> values) {
            addCriterion("capital in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<Integer> values) {
            addCriterion("capital not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(Integer value1, Integer value2) {
            addCriterion("capital between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("capital not between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andDebtIsNull() {
            addCriterion("debt is null");
            return (Criteria) this;
        }

        public Criteria andDebtIsNotNull() {
            addCriterion("debt is not null");
            return (Criteria) this;
        }

        public Criteria andDebtEqualTo(Integer value) {
            addCriterion("debt =", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotEqualTo(Integer value) {
            addCriterion("debt <>", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtGreaterThan(Integer value) {
            addCriterion("debt >", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtGreaterThanOrEqualTo(Integer value) {
            addCriterion("debt >=", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtLessThan(Integer value) {
            addCriterion("debt <", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtLessThanOrEqualTo(Integer value) {
            addCriterion("debt <=", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtIn(List<Integer> values) {
            addCriterion("debt in", values, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotIn(List<Integer> values) {
            addCriterion("debt not in", values, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtBetween(Integer value1, Integer value2) {
            addCriterion("debt between", value1, value2, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotBetween(Integer value1, Integer value2) {
            addCriterion("debt not between", value1, value2, "debt");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesIsNull() {
            addCriterion("monthly_sales is null");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesIsNotNull() {
            addCriterion("monthly_sales is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesEqualTo(Integer value) {
            addCriterion("monthly_sales =", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesNotEqualTo(Integer value) {
            addCriterion("monthly_sales <>", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesGreaterThan(Integer value) {
            addCriterion("monthly_sales >", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_sales >=", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesLessThan(Integer value) {
            addCriterion("monthly_sales <", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_sales <=", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesIn(List<Integer> values) {
            addCriterion("monthly_sales in", values, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesNotIn(List<Integer> values) {
            addCriterion("monthly_sales not in", values, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesBetween(Integer value1, Integer value2) {
            addCriterion("monthly_sales between", value1, value2, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_sales not between", value1, value2, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlyProfitIsNull() {
            addCriterion("monthly_profit is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyProfitIsNotNull() {
            addCriterion("monthly_profit is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyProfitEqualTo(Integer value) {
            addCriterion("monthly_profit =", value, "monthlyProfit");
            return (Criteria) this;
        }

        public Criteria andMonthlyProfitNotEqualTo(Integer value) {
            addCriterion("monthly_profit <>", value, "monthlyProfit");
            return (Criteria) this;
        }

        public Criteria andMonthlyProfitGreaterThan(Integer value) {
            addCriterion("monthly_profit >", value, "monthlyProfit");
            return (Criteria) this;
        }

        public Criteria andMonthlyProfitGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_profit >=", value, "monthlyProfit");
            return (Criteria) this;
        }

        public Criteria andMonthlyProfitLessThan(Integer value) {
            addCriterion("monthly_profit <", value, "monthlyProfit");
            return (Criteria) this;
        }

        public Criteria andMonthlyProfitLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_profit <=", value, "monthlyProfit");
            return (Criteria) this;
        }

        public Criteria andMonthlyProfitIn(List<Integer> values) {
            addCriterion("monthly_profit in", values, "monthlyProfit");
            return (Criteria) this;
        }

        public Criteria andMonthlyProfitNotIn(List<Integer> values) {
            addCriterion("monthly_profit not in", values, "monthlyProfit");
            return (Criteria) this;
        }

        public Criteria andMonthlyProfitBetween(Integer value1, Integer value2) {
            addCriterion("monthly_profit between", value1, value2, "monthlyProfit");
            return (Criteria) this;
        }

        public Criteria andMonthlyProfitNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_profit not between", value1, value2, "monthlyProfit");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberIsNull() {
            addCriterion("register_number is null");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberIsNotNull() {
            addCriterion("register_number is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberEqualTo(String value) {
            addCriterion("register_number =", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberNotEqualTo(String value) {
            addCriterion("register_number <>", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberGreaterThan(String value) {
            addCriterion("register_number >", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberGreaterThanOrEqualTo(String value) {
            addCriterion("register_number >=", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberLessThan(String value) {
            addCriterion("register_number <", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberLessThanOrEqualTo(String value) {
            addCriterion("register_number <=", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberLike(String value) {
            addCriterion("register_number like", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberNotLike(String value) {
            addCriterion("register_number not like", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberIn(List<String> values) {
            addCriterion("register_number in", values, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberNotIn(List<String> values) {
            addCriterion("register_number not in", values, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberBetween(String value1, String value2) {
            addCriterion("register_number between", value1, value2, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberNotBetween(String value1, String value2) {
            addCriterion("register_number not between", value1, value2, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andFoundationDateIsNull() {
            addCriterion("foundation_date is null");
            return (Criteria) this;
        }

        public Criteria andFoundationDateIsNotNull() {
            addCriterion("foundation_date is not null");
            return (Criteria) this;
        }

        public Criteria andFoundationDateEqualTo(Date value) {
            addCriterion("foundation_date =", value, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateNotEqualTo(Date value) {
            addCriterion("foundation_date <>", value, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateGreaterThan(Date value) {
            addCriterion("foundation_date >", value, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("foundation_date >=", value, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateLessThan(Date value) {
            addCriterion("foundation_date <", value, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateLessThanOrEqualTo(Date value) {
            addCriterion("foundation_date <=", value, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateIn(List<Date> values) {
            addCriterion("foundation_date in", values, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateNotIn(List<Date> values) {
            addCriterion("foundation_date not in", values, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateBetween(Date value1, Date value2) {
            addCriterion("foundation_date between", value1, value2, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andFoundationDateNotBetween(Date value1, Date value2) {
            addCriterion("foundation_date not between", value1, value2, "foundationDate");
            return (Criteria) this;
        }

        public Criteria andOperatingHourIsNull() {
            addCriterion("operating_hour is null");
            return (Criteria) this;
        }

        public Criteria andOperatingHourIsNotNull() {
            addCriterion("operating_hour is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingHourEqualTo(String value) {
            addCriterion("operating_hour =", value, "operatingHour");
            return (Criteria) this;
        }

        public Criteria andOperatingHourNotEqualTo(String value) {
            addCriterion("operating_hour <>", value, "operatingHour");
            return (Criteria) this;
        }

        public Criteria andOperatingHourGreaterThan(String value) {
            addCriterion("operating_hour >", value, "operatingHour");
            return (Criteria) this;
        }

        public Criteria andOperatingHourGreaterThanOrEqualTo(String value) {
            addCriterion("operating_hour >=", value, "operatingHour");
            return (Criteria) this;
        }

        public Criteria andOperatingHourLessThan(String value) {
            addCriterion("operating_hour <", value, "operatingHour");
            return (Criteria) this;
        }

        public Criteria andOperatingHourLessThanOrEqualTo(String value) {
            addCriterion("operating_hour <=", value, "operatingHour");
            return (Criteria) this;
        }

        public Criteria andOperatingHourLike(String value) {
            addCriterion("operating_hour like", value, "operatingHour");
            return (Criteria) this;
        }

        public Criteria andOperatingHourNotLike(String value) {
            addCriterion("operating_hour not like", value, "operatingHour");
            return (Criteria) this;
        }

        public Criteria andOperatingHourIn(List<String> values) {
            addCriterion("operating_hour in", values, "operatingHour");
            return (Criteria) this;
        }

        public Criteria andOperatingHourNotIn(List<String> values) {
            addCriterion("operating_hour not in", values, "operatingHour");
            return (Criteria) this;
        }

        public Criteria andOperatingHourBetween(String value1, String value2) {
            addCriterion("operating_hour between", value1, value2, "operatingHour");
            return (Criteria) this;
        }

        public Criteria andOperatingHourNotBetween(String value1, String value2) {
            addCriterion("operating_hour not between", value1, value2, "operatingHour");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodIsNull() {
            addCriterion("operating_period is null");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodIsNotNull() {
            addCriterion("operating_period is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodEqualTo(String value) {
            addCriterion("operating_period =", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodNotEqualTo(String value) {
            addCriterion("operating_period <>", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodGreaterThan(String value) {
            addCriterion("operating_period >", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("operating_period >=", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodLessThan(String value) {
            addCriterion("operating_period <", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodLessThanOrEqualTo(String value) {
            addCriterion("operating_period <=", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodLike(String value) {
            addCriterion("operating_period like", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodNotLike(String value) {
            addCriterion("operating_period not like", value, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodIn(List<String> values) {
            addCriterion("operating_period in", values, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodNotIn(List<String> values) {
            addCriterion("operating_period not in", values, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodBetween(String value1, String value2) {
            addCriterion("operating_period between", value1, value2, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingPeriodNotBetween(String value1, String value2) {
            addCriterion("operating_period not between", value1, value2, "operatingPeriod");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNull() {
            addCriterion("employee_number is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNotNull() {
            addCriterion("employee_number is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberEqualTo(Integer value) {
            addCriterion("employee_number =", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotEqualTo(Integer value) {
            addCriterion("employee_number <>", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThan(Integer value) {
            addCriterion("employee_number >", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_number >=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThan(Integer value) {
            addCriterion("employee_number <", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("employee_number <=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIn(List<Integer> values) {
            addCriterion("employee_number in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotIn(List<Integer> values) {
            addCriterion("employee_number not in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberBetween(Integer value1, Integer value2) {
            addCriterion("employee_number between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_number not between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andSeatIsNull() {
            addCriterion("seat is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("seat is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(Integer value) {
            addCriterion("seat =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(Integer value) {
            addCriterion("seat <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(Integer value) {
            addCriterion("seat >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(Integer value) {
            addCriterion("seat <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(Integer value) {
            addCriterion("seat <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<Integer> values) {
            addCriterion("seat in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<Integer> values) {
            addCriterion("seat not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(Integer value1, Integer value2) {
            addCriterion("seat between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(Integer value1, Integer value2) {
            addCriterion("seat not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andStoreDigitIsNull() {
            addCriterion("store_digit is null");
            return (Criteria) this;
        }

        public Criteria andStoreDigitIsNotNull() {
            addCriterion("store_digit is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDigitEqualTo(String value) {
            addCriterion("store_digit =", value, "storeDigit");
            return (Criteria) this;
        }

        public Criteria andStoreDigitNotEqualTo(String value) {
            addCriterion("store_digit <>", value, "storeDigit");
            return (Criteria) this;
        }

        public Criteria andStoreDigitGreaterThan(String value) {
            addCriterion("store_digit >", value, "storeDigit");
            return (Criteria) this;
        }

        public Criteria andStoreDigitGreaterThanOrEqualTo(String value) {
            addCriterion("store_digit >=", value, "storeDigit");
            return (Criteria) this;
        }

        public Criteria andStoreDigitLessThan(String value) {
            addCriterion("store_digit <", value, "storeDigit");
            return (Criteria) this;
        }

        public Criteria andStoreDigitLessThanOrEqualTo(String value) {
            addCriterion("store_digit <=", value, "storeDigit");
            return (Criteria) this;
        }

        public Criteria andStoreDigitLike(String value) {
            addCriterion("store_digit like", value, "storeDigit");
            return (Criteria) this;
        }

        public Criteria andStoreDigitNotLike(String value) {
            addCriterion("store_digit not like", value, "storeDigit");
            return (Criteria) this;
        }

        public Criteria andStoreDigitIn(List<String> values) {
            addCriterion("store_digit in", values, "storeDigit");
            return (Criteria) this;
        }

        public Criteria andStoreDigitNotIn(List<String> values) {
            addCriterion("store_digit not in", values, "storeDigit");
            return (Criteria) this;
        }

        public Criteria andStoreDigitBetween(String value1, String value2) {
            addCriterion("store_digit between", value1, value2, "storeDigit");
            return (Criteria) this;
        }

        public Criteria andStoreDigitNotBetween(String value1, String value2) {
            addCriterion("store_digit not between", value1, value2, "storeDigit");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(String value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(String value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(String value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(String value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(String value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(String value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLike(String value) {
            addCriterion("valid like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotLike(String value) {
            addCriterion("valid not like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<String> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<String> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(String value1, String value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(String value1, String value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentIsNull() {
            addCriterion("password_for_funda_agent is null");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentIsNotNull() {
            addCriterion("password_for_funda_agent is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentEqualTo(String value) {
            addCriterion("password_for_funda_agent =", value, "passwordForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentNotEqualTo(String value) {
            addCriterion("password_for_funda_agent <>", value, "passwordForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentGreaterThan(String value) {
            addCriterion("password_for_funda_agent >", value, "passwordForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentGreaterThanOrEqualTo(String value) {
            addCriterion("password_for_funda_agent >=", value, "passwordForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentLessThan(String value) {
            addCriterion("password_for_funda_agent <", value, "passwordForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentLessThanOrEqualTo(String value) {
            addCriterion("password_for_funda_agent <=", value, "passwordForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentLike(String value) {
            addCriterion("password_for_funda_agent like", value, "passwordForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentNotLike(String value) {
            addCriterion("password_for_funda_agent not like", value, "passwordForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentIn(List<String> values) {
            addCriterion("password_for_funda_agent in", values, "passwordForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentNotIn(List<String> values) {
            addCriterion("password_for_funda_agent not in", values, "passwordForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentBetween(String value1, String value2) {
            addCriterion("password_for_funda_agent between", value1, value2, "passwordForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andPasswordForFundaAgentNotBetween(String value1, String value2) {
            addCriterion("password_for_funda_agent not between", value1, value2, "passwordForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentIsNull() {
            addCriterion("apikey_for_funda_agent is null");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentIsNotNull() {
            addCriterion("apikey_for_funda_agent is not null");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentEqualTo(String value) {
            addCriterion("apikey_for_funda_agent =", value, "apikeyForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentNotEqualTo(String value) {
            addCriterion("apikey_for_funda_agent <>", value, "apikeyForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentGreaterThan(String value) {
            addCriterion("apikey_for_funda_agent >", value, "apikeyForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentGreaterThanOrEqualTo(String value) {
            addCriterion("apikey_for_funda_agent >=", value, "apikeyForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentLessThan(String value) {
            addCriterion("apikey_for_funda_agent <", value, "apikeyForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentLessThanOrEqualTo(String value) {
            addCriterion("apikey_for_funda_agent <=", value, "apikeyForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentLike(String value) {
            addCriterion("apikey_for_funda_agent like", value, "apikeyForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentNotLike(String value) {
            addCriterion("apikey_for_funda_agent not like", value, "apikeyForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentIn(List<String> values) {
            addCriterion("apikey_for_funda_agent in", values, "apikeyForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentNotIn(List<String> values) {
            addCriterion("apikey_for_funda_agent not in", values, "apikeyForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentBetween(String value1, String value2) {
            addCriterion("apikey_for_funda_agent between", value1, value2, "apikeyForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentNotBetween(String value1, String value2) {
            addCriterion("apikey_for_funda_agent not between", value1, value2, "apikeyForFundaAgent");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateIsNull() {
            addCriterion("apikey_for_funda_agent_private is null");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateIsNotNull() {
            addCriterion("apikey_for_funda_agent_private is not null");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateEqualTo(String value) {
            addCriterion("apikey_for_funda_agent_private =", value, "apikeyForFundaAgentPrivate");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateNotEqualTo(String value) {
            addCriterion("apikey_for_funda_agent_private <>", value, "apikeyForFundaAgentPrivate");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateGreaterThan(String value) {
            addCriterion("apikey_for_funda_agent_private >", value, "apikeyForFundaAgentPrivate");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateGreaterThanOrEqualTo(String value) {
            addCriterion("apikey_for_funda_agent_private >=", value, "apikeyForFundaAgentPrivate");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateLessThan(String value) {
            addCriterion("apikey_for_funda_agent_private <", value, "apikeyForFundaAgentPrivate");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateLessThanOrEqualTo(String value) {
            addCriterion("apikey_for_funda_agent_private <=", value, "apikeyForFundaAgentPrivate");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateLike(String value) {
            addCriterion("apikey_for_funda_agent_private like", value, "apikeyForFundaAgentPrivate");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateNotLike(String value) {
            addCriterion("apikey_for_funda_agent_private not like", value, "apikeyForFundaAgentPrivate");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateIn(List<String> values) {
            addCriterion("apikey_for_funda_agent_private in", values, "apikeyForFundaAgentPrivate");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateNotIn(List<String> values) {
            addCriterion("apikey_for_funda_agent_private not in", values, "apikeyForFundaAgentPrivate");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateBetween(String value1, String value2) {
            addCriterion("apikey_for_funda_agent_private between", value1, value2, "apikeyForFundaAgentPrivate");
            return (Criteria) this;
        }

        public Criteria andApikeyForFundaAgentPrivateNotBetween(String value1, String value2) {
            addCriterion("apikey_for_funda_agent_private not between", value1, value2, "apikeyForFundaAgentPrivate");
            return (Criteria) this;
        }

        public Criteria andIsActualIsNull() {
            addCriterion("is_actual is null");
            return (Criteria) this;
        }

        public Criteria andIsActualIsNotNull() {
            addCriterion("is_actual is not null");
            return (Criteria) this;
        }

        public Criteria andIsActualEqualTo(Integer value) {
            addCriterion("is_actual =", value, "isActual");
            return (Criteria) this;
        }

        public Criteria andIsActualNotEqualTo(Integer value) {
            addCriterion("is_actual <>", value, "isActual");
            return (Criteria) this;
        }

        public Criteria andIsActualGreaterThan(Integer value) {
            addCriterion("is_actual >", value, "isActual");
            return (Criteria) this;
        }

        public Criteria andIsActualGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_actual >=", value, "isActual");
            return (Criteria) this;
        }

        public Criteria andIsActualLessThan(Integer value) {
            addCriterion("is_actual <", value, "isActual");
            return (Criteria) this;
        }

        public Criteria andIsActualLessThanOrEqualTo(Integer value) {
            addCriterion("is_actual <=", value, "isActual");
            return (Criteria) this;
        }

        public Criteria andIsActualIn(List<Integer> values) {
            addCriterion("is_actual in", values, "isActual");
            return (Criteria) this;
        }

        public Criteria andIsActualNotIn(List<Integer> values) {
            addCriterion("is_actual not in", values, "isActual");
            return (Criteria) this;
        }

        public Criteria andIsActualBetween(Integer value1, Integer value2) {
            addCriterion("is_actual between", value1, value2, "isActual");
            return (Criteria) this;
        }

        public Criteria andIsActualNotBetween(Integer value1, Integer value2) {
            addCriterion("is_actual not between", value1, value2, "isActual");
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