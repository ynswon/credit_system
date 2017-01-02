package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class user_authExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public user_authExample() {
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

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("phone_num is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("phone_num =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("phone_num <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("phone_num >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("phone_num >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("phone_num <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("phone_num <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("phone_num like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("phone_num not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("phone_num in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("phone_num not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("phone_num between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("phone_num not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneAckIsNull() {
            addCriterion("phone_ack is null");
            return (Criteria) this;
        }

        public Criteria andPhoneAckIsNotNull() {
            addCriterion("phone_ack is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneAckEqualTo(Integer value) {
            addCriterion("phone_ack =", value, "phoneAck");
            return (Criteria) this;
        }

        public Criteria andPhoneAckNotEqualTo(Integer value) {
            addCriterion("phone_ack <>", value, "phoneAck");
            return (Criteria) this;
        }

        public Criteria andPhoneAckGreaterThan(Integer value) {
            addCriterion("phone_ack >", value, "phoneAck");
            return (Criteria) this;
        }

        public Criteria andPhoneAckGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone_ack >=", value, "phoneAck");
            return (Criteria) this;
        }

        public Criteria andPhoneAckLessThan(Integer value) {
            addCriterion("phone_ack <", value, "phoneAck");
            return (Criteria) this;
        }

        public Criteria andPhoneAckLessThanOrEqualTo(Integer value) {
            addCriterion("phone_ack <=", value, "phoneAck");
            return (Criteria) this;
        }

        public Criteria andPhoneAckIn(List<Integer> values) {
            addCriterion("phone_ack in", values, "phoneAck");
            return (Criteria) this;
        }

        public Criteria andPhoneAckNotIn(List<Integer> values) {
            addCriterion("phone_ack not in", values, "phoneAck");
            return (Criteria) this;
        }

        public Criteria andPhoneAckBetween(Integer value1, Integer value2) {
            addCriterion("phone_ack between", value1, value2, "phoneAck");
            return (Criteria) this;
        }

        public Criteria andPhoneAckNotBetween(Integer value1, Integer value2) {
            addCriterion("phone_ack not between", value1, value2, "phoneAck");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailAckIsNull() {
            addCriterion("email_ack is null");
            return (Criteria) this;
        }

        public Criteria andEmailAckIsNotNull() {
            addCriterion("email_ack is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAckEqualTo(Integer value) {
            addCriterion("email_ack =", value, "emailAck");
            return (Criteria) this;
        }

        public Criteria andEmailAckNotEqualTo(Integer value) {
            addCriterion("email_ack <>", value, "emailAck");
            return (Criteria) this;
        }

        public Criteria andEmailAckGreaterThan(Integer value) {
            addCriterion("email_ack >", value, "emailAck");
            return (Criteria) this;
        }

        public Criteria andEmailAckGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_ack >=", value, "emailAck");
            return (Criteria) this;
        }

        public Criteria andEmailAckLessThan(Integer value) {
            addCriterion("email_ack <", value, "emailAck");
            return (Criteria) this;
        }

        public Criteria andEmailAckLessThanOrEqualTo(Integer value) {
            addCriterion("email_ack <=", value, "emailAck");
            return (Criteria) this;
        }

        public Criteria andEmailAckIn(List<Integer> values) {
            addCriterion("email_ack in", values, "emailAck");
            return (Criteria) this;
        }

        public Criteria andEmailAckNotIn(List<Integer> values) {
            addCriterion("email_ack not in", values, "emailAck");
            return (Criteria) this;
        }

        public Criteria andEmailAckBetween(Integer value1, Integer value2) {
            addCriterion("email_ack between", value1, value2, "emailAck");
            return (Criteria) this;
        }

        public Criteria andEmailAckNotBetween(Integer value1, Integer value2) {
            addCriterion("email_ack not between", value1, value2, "emailAck");
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

        public Criteria andIpAddressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("ip_address =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("ip_address <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("ip_address >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ip_address >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("ip_address <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("ip_address <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("ip_address like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("ip_address not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("ip_address in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("ip_address not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("ip_address between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("ip_address not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyIsNull() {
            addCriterion("auth_phone_key is null");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyIsNotNull() {
            addCriterion("auth_phone_key is not null");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyEqualTo(String value) {
            addCriterion("auth_phone_key =", value, "authPhoneKey");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyNotEqualTo(String value) {
            addCriterion("auth_phone_key <>", value, "authPhoneKey");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyGreaterThan(String value) {
            addCriterion("auth_phone_key >", value, "authPhoneKey");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyGreaterThanOrEqualTo(String value) {
            addCriterion("auth_phone_key >=", value, "authPhoneKey");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyLessThan(String value) {
            addCriterion("auth_phone_key <", value, "authPhoneKey");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyLessThanOrEqualTo(String value) {
            addCriterion("auth_phone_key <=", value, "authPhoneKey");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyLike(String value) {
            addCriterion("auth_phone_key like", value, "authPhoneKey");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyNotLike(String value) {
            addCriterion("auth_phone_key not like", value, "authPhoneKey");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyIn(List<String> values) {
            addCriterion("auth_phone_key in", values, "authPhoneKey");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyNotIn(List<String> values) {
            addCriterion("auth_phone_key not in", values, "authPhoneKey");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyBetween(String value1, String value2) {
            addCriterion("auth_phone_key between", value1, value2, "authPhoneKey");
            return (Criteria) this;
        }

        public Criteria andAuthPhoneKeyNotBetween(String value1, String value2) {
            addCriterion("auth_phone_key not between", value1, value2, "authPhoneKey");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyIsNull() {
            addCriterion("auth_email_key is null");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyIsNotNull() {
            addCriterion("auth_email_key is not null");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyEqualTo(String value) {
            addCriterion("auth_email_key =", value, "authEmailKey");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyNotEqualTo(String value) {
            addCriterion("auth_email_key <>", value, "authEmailKey");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyGreaterThan(String value) {
            addCriterion("auth_email_key >", value, "authEmailKey");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyGreaterThanOrEqualTo(String value) {
            addCriterion("auth_email_key >=", value, "authEmailKey");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyLessThan(String value) {
            addCriterion("auth_email_key <", value, "authEmailKey");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyLessThanOrEqualTo(String value) {
            addCriterion("auth_email_key <=", value, "authEmailKey");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyLike(String value) {
            addCriterion("auth_email_key like", value, "authEmailKey");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyNotLike(String value) {
            addCriterion("auth_email_key not like", value, "authEmailKey");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyIn(List<String> values) {
            addCriterion("auth_email_key in", values, "authEmailKey");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyNotIn(List<String> values) {
            addCriterion("auth_email_key not in", values, "authEmailKey");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyBetween(String value1, String value2) {
            addCriterion("auth_email_key between", value1, value2, "authEmailKey");
            return (Criteria) this;
        }

        public Criteria andAuthEmailKeyNotBetween(String value1, String value2) {
            addCriterion("auth_email_key not between", value1, value2, "authEmailKey");
            return (Criteria) this;
        }

        public Criteria andIssuedDatetimeIsNull() {
            addCriterion("issued_datetime is null");
            return (Criteria) this;
        }

        public Criteria andIssuedDatetimeIsNotNull() {
            addCriterion("issued_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedDatetimeEqualTo(Date value) {
            addCriterion("issued_datetime =", value, "issuedDatetime");
            return (Criteria) this;
        }

        public Criteria andIssuedDatetimeNotEqualTo(Date value) {
            addCriterion("issued_datetime <>", value, "issuedDatetime");
            return (Criteria) this;
        }

        public Criteria andIssuedDatetimeGreaterThan(Date value) {
            addCriterion("issued_datetime >", value, "issuedDatetime");
            return (Criteria) this;
        }

        public Criteria andIssuedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("issued_datetime >=", value, "issuedDatetime");
            return (Criteria) this;
        }

        public Criteria andIssuedDatetimeLessThan(Date value) {
            addCriterion("issued_datetime <", value, "issuedDatetime");
            return (Criteria) this;
        }

        public Criteria andIssuedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("issued_datetime <=", value, "issuedDatetime");
            return (Criteria) this;
        }

        public Criteria andIssuedDatetimeIn(List<Date> values) {
            addCriterion("issued_datetime in", values, "issuedDatetime");
            return (Criteria) this;
        }

        public Criteria andIssuedDatetimeNotIn(List<Date> values) {
            addCriterion("issued_datetime not in", values, "issuedDatetime");
            return (Criteria) this;
        }

        public Criteria andIssuedDatetimeBetween(Date value1, Date value2) {
            addCriterion("issued_datetime between", value1, value2, "issuedDatetime");
            return (Criteria) this;
        }

        public Criteria andIssuedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("issued_datetime not between", value1, value2, "issuedDatetime");
            return (Criteria) this;
        }

        public Criteria andExpireDatetimeIsNull() {
            addCriterion("expire_datetime is null");
            return (Criteria) this;
        }

        public Criteria andExpireDatetimeIsNotNull() {
            addCriterion("expire_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDatetimeEqualTo(Date value) {
            addCriterion("expire_datetime =", value, "expireDatetime");
            return (Criteria) this;
        }

        public Criteria andExpireDatetimeNotEqualTo(Date value) {
            addCriterion("expire_datetime <>", value, "expireDatetime");
            return (Criteria) this;
        }

        public Criteria andExpireDatetimeGreaterThan(Date value) {
            addCriterion("expire_datetime >", value, "expireDatetime");
            return (Criteria) this;
        }

        public Criteria andExpireDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_datetime >=", value, "expireDatetime");
            return (Criteria) this;
        }

        public Criteria andExpireDatetimeLessThan(Date value) {
            addCriterion("expire_datetime <", value, "expireDatetime");
            return (Criteria) this;
        }

        public Criteria andExpireDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("expire_datetime <=", value, "expireDatetime");
            return (Criteria) this;
        }

        public Criteria andExpireDatetimeIn(List<Date> values) {
            addCriterion("expire_datetime in", values, "expireDatetime");
            return (Criteria) this;
        }

        public Criteria andExpireDatetimeNotIn(List<Date> values) {
            addCriterion("expire_datetime not in", values, "expireDatetime");
            return (Criteria) this;
        }

        public Criteria andExpireDatetimeBetween(Date value1, Date value2) {
            addCriterion("expire_datetime between", value1, value2, "expireDatetime");
            return (Criteria) this;
        }

        public Criteria andExpireDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("expire_datetime not between", value1, value2, "expireDatetime");
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