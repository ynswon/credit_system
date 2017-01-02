package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class userExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public userExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(String value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(String value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(String value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(String value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(String value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLike(String value) {
            addCriterion("user_gender like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotLike(String value) {
            addCriterion("user_gender not like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<String> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<String> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(String value1, String value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(String value1, String value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailAckIsNull() {
            addCriterion("user_email_ack is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailAckIsNotNull() {
            addCriterion("user_email_ack is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailAckEqualTo(Integer value) {
            addCriterion("user_email_ack =", value, "userEmailAck");
            return (Criteria) this;
        }

        public Criteria andUserEmailAckNotEqualTo(Integer value) {
            addCriterion("user_email_ack <>", value, "userEmailAck");
            return (Criteria) this;
        }

        public Criteria andUserEmailAckGreaterThan(Integer value) {
            addCriterion("user_email_ack >", value, "userEmailAck");
            return (Criteria) this;
        }

        public Criteria andUserEmailAckGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_email_ack >=", value, "userEmailAck");
            return (Criteria) this;
        }

        public Criteria andUserEmailAckLessThan(Integer value) {
            addCriterion("user_email_ack <", value, "userEmailAck");
            return (Criteria) this;
        }

        public Criteria andUserEmailAckLessThanOrEqualTo(Integer value) {
            addCriterion("user_email_ack <=", value, "userEmailAck");
            return (Criteria) this;
        }

        public Criteria andUserEmailAckIn(List<Integer> values) {
            addCriterion("user_email_ack in", values, "userEmailAck");
            return (Criteria) this;
        }

        public Criteria andUserEmailAckNotIn(List<Integer> values) {
            addCriterion("user_email_ack not in", values, "userEmailAck");
            return (Criteria) this;
        }

        public Criteria andUserEmailAckBetween(Integer value1, Integer value2) {
            addCriterion("user_email_ack between", value1, value2, "userEmailAck");
            return (Criteria) this;
        }

        public Criteria andUserEmailAckNotBetween(Integer value1, Integer value2) {
            addCriterion("user_email_ack not between", value1, value2, "userEmailAck");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneAckIsNull() {
            addCriterion("user_phone_ack is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneAckIsNotNull() {
            addCriterion("user_phone_ack is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneAckEqualTo(Integer value) {
            addCriterion("user_phone_ack =", value, "userPhoneAck");
            return (Criteria) this;
        }

        public Criteria andUserPhoneAckNotEqualTo(Integer value) {
            addCriterion("user_phone_ack <>", value, "userPhoneAck");
            return (Criteria) this;
        }

        public Criteria andUserPhoneAckGreaterThan(Integer value) {
            addCriterion("user_phone_ack >", value, "userPhoneAck");
            return (Criteria) this;
        }

        public Criteria andUserPhoneAckGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_phone_ack >=", value, "userPhoneAck");
            return (Criteria) this;
        }

        public Criteria andUserPhoneAckLessThan(Integer value) {
            addCriterion("user_phone_ack <", value, "userPhoneAck");
            return (Criteria) this;
        }

        public Criteria andUserPhoneAckLessThanOrEqualTo(Integer value) {
            addCriterion("user_phone_ack <=", value, "userPhoneAck");
            return (Criteria) this;
        }

        public Criteria andUserPhoneAckIn(List<Integer> values) {
            addCriterion("user_phone_ack in", values, "userPhoneAck");
            return (Criteria) this;
        }

        public Criteria andUserPhoneAckNotIn(List<Integer> values) {
            addCriterion("user_phone_ack not in", values, "userPhoneAck");
            return (Criteria) this;
        }

        public Criteria andUserPhoneAckBetween(Integer value1, Integer value2) {
            addCriterion("user_phone_ack between", value1, value2, "userPhoneAck");
            return (Criteria) this;
        }

        public Criteria andUserPhoneAckNotBetween(Integer value1, Integer value2) {
            addCriterion("user_phone_ack not between", value1, value2, "userPhoneAck");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateIsNull() {
            addCriterion("user_birthdate is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateIsNotNull() {
            addCriterion("user_birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthdate =", value, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthdate <>", value, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_birthdate >", value, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthdate >=", value, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateLessThan(Date value) {
            addCriterionForJDBCDate("user_birthdate <", value, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthdate <=", value, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthdate in", values, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthdate not in", values, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthdate between", value1, value2, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthdate not between", value1, value2, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIsNull() {
            addCriterion("user_category is null");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIsNotNull() {
            addCriterion("user_category is not null");
            return (Criteria) this;
        }

        public Criteria andUserCategoryEqualTo(Integer value) {
            addCriterion("user_category =", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryNotEqualTo(Integer value) {
            addCriterion("user_category <>", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryGreaterThan(Integer value) {
            addCriterion("user_category >", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_category >=", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryLessThan(Integer value) {
            addCriterion("user_category <", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("user_category <=", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIn(List<Integer> values) {
            addCriterion("user_category in", values, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryNotIn(List<Integer> values) {
            addCriterion("user_category not in", values, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryBetween(Integer value1, Integer value2) {
            addCriterion("user_category between", value1, value2, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("user_category not between", value1, value2, "userCategory");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsIsNull() {
            addCriterion("promotion_sms is null");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsIsNotNull() {
            addCriterion("promotion_sms is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsEqualTo(String value) {
            addCriterion("promotion_sms =", value, "promotionSms");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsNotEqualTo(String value) {
            addCriterion("promotion_sms <>", value, "promotionSms");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsGreaterThan(String value) {
            addCriterion("promotion_sms >", value, "promotionSms");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_sms >=", value, "promotionSms");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsLessThan(String value) {
            addCriterion("promotion_sms <", value, "promotionSms");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsLessThanOrEqualTo(String value) {
            addCriterion("promotion_sms <=", value, "promotionSms");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsLike(String value) {
            addCriterion("promotion_sms like", value, "promotionSms");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsNotLike(String value) {
            addCriterion("promotion_sms not like", value, "promotionSms");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsIn(List<String> values) {
            addCriterion("promotion_sms in", values, "promotionSms");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsNotIn(List<String> values) {
            addCriterion("promotion_sms not in", values, "promotionSms");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsBetween(String value1, String value2) {
            addCriterion("promotion_sms between", value1, value2, "promotionSms");
            return (Criteria) this;
        }

        public Criteria andPromotionSmsNotBetween(String value1, String value2) {
            addCriterion("promotion_sms not between", value1, value2, "promotionSms");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailIsNull() {
            addCriterion("promotion_email is null");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailIsNotNull() {
            addCriterion("promotion_email is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailEqualTo(String value) {
            addCriterion("promotion_email =", value, "promotionEmail");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailNotEqualTo(String value) {
            addCriterion("promotion_email <>", value, "promotionEmail");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailGreaterThan(String value) {
            addCriterion("promotion_email >", value, "promotionEmail");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_email >=", value, "promotionEmail");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailLessThan(String value) {
            addCriterion("promotion_email <", value, "promotionEmail");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailLessThanOrEqualTo(String value) {
            addCriterion("promotion_email <=", value, "promotionEmail");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailLike(String value) {
            addCriterion("promotion_email like", value, "promotionEmail");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailNotLike(String value) {
            addCriterion("promotion_email not like", value, "promotionEmail");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailIn(List<String> values) {
            addCriterion("promotion_email in", values, "promotionEmail");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailNotIn(List<String> values) {
            addCriterion("promotion_email not in", values, "promotionEmail");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailBetween(String value1, String value2) {
            addCriterion("promotion_email between", value1, value2, "promotionEmail");
            return (Criteria) this;
        }

        public Criteria andPromotionEmailNotBetween(String value1, String value2) {
            addCriterion("promotion_email not between", value1, value2, "promotionEmail");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterion("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterion("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterion("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterion("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterion("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterion("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterion("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("register_date not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("last_login_date is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("last_login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(Date value) {
            addCriterion("last_login_date =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(Date value) {
            addCriterion("last_login_date <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(Date value) {
            addCriterion("last_login_date >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_date >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(Date value) {
            addCriterion("last_login_date <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("last_login_date <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<Date> values) {
            addCriterion("last_login_date in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<Date> values) {
            addCriterion("last_login_date not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(Date value1, Date value2) {
            addCriterion("last_login_date between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("last_login_date not between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNull() {
            addCriterion("is_admin is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNotNull() {
            addCriterion("is_admin is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminEqualTo(Integer value) {
            addCriterion("is_admin =", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotEqualTo(Integer value) {
            addCriterion("is_admin <>", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThan(Integer value) {
            addCriterion("is_admin >", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_admin >=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThan(Integer value) {
            addCriterion("is_admin <", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThanOrEqualTo(Integer value) {
            addCriterion("is_admin <=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminIn(List<Integer> values) {
            addCriterion("is_admin in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotIn(List<Integer> values) {
            addCriterion("is_admin not in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminBetween(Integer value1, Integer value2) {
            addCriterion("is_admin between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("is_admin not between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdxIsNull() {
            addCriterion("bank_account_idx is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdxIsNotNull() {
            addCriterion("bank_account_idx is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdxEqualTo(Integer value) {
            addCriterion("bank_account_idx =", value, "bankAccountIdx");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdxNotEqualTo(Integer value) {
            addCriterion("bank_account_idx <>", value, "bankAccountIdx");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdxGreaterThan(Integer value) {
            addCriterion("bank_account_idx >", value, "bankAccountIdx");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_account_idx >=", value, "bankAccountIdx");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdxLessThan(Integer value) {
            addCriterion("bank_account_idx <", value, "bankAccountIdx");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdxLessThanOrEqualTo(Integer value) {
            addCriterion("bank_account_idx <=", value, "bankAccountIdx");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdxIn(List<Integer> values) {
            addCriterion("bank_account_idx in", values, "bankAccountIdx");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdxNotIn(List<Integer> values) {
            addCriterion("bank_account_idx not in", values, "bankAccountIdx");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdxBetween(Integer value1, Integer value2) {
            addCriterion("bank_account_idx between", value1, value2, "bankAccountIdx");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_account_idx not between", value1, value2, "bankAccountIdx");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyIsNull() {
            addCriterion("sms_validation_key is null");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyIsNotNull() {
            addCriterion("sms_validation_key is not null");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyEqualTo(String value) {
            addCriterion("sms_validation_key =", value, "smsValidationKey");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyNotEqualTo(String value) {
            addCriterion("sms_validation_key <>", value, "smsValidationKey");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyGreaterThan(String value) {
            addCriterion("sms_validation_key >", value, "smsValidationKey");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyGreaterThanOrEqualTo(String value) {
            addCriterion("sms_validation_key >=", value, "smsValidationKey");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyLessThan(String value) {
            addCriterion("sms_validation_key <", value, "smsValidationKey");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyLessThanOrEqualTo(String value) {
            addCriterion("sms_validation_key <=", value, "smsValidationKey");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyLike(String value) {
            addCriterion("sms_validation_key like", value, "smsValidationKey");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyNotLike(String value) {
            addCriterion("sms_validation_key not like", value, "smsValidationKey");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyIn(List<String> values) {
            addCriterion("sms_validation_key in", values, "smsValidationKey");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyNotIn(List<String> values) {
            addCriterion("sms_validation_key not in", values, "smsValidationKey");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyBetween(String value1, String value2) {
            addCriterion("sms_validation_key between", value1, value2, "smsValidationKey");
            return (Criteria) this;
        }

        public Criteria andSmsValidationKeyNotBetween(String value1, String value2) {
            addCriterion("sms_validation_key not between", value1, value2, "smsValidationKey");
            return (Criteria) this;
        }

        public Criteria andSmsValidationExpireIsNull() {
            addCriterion("sms_validation_expire is null");
            return (Criteria) this;
        }

        public Criteria andSmsValidationExpireIsNotNull() {
            addCriterion("sms_validation_expire is not null");
            return (Criteria) this;
        }

        public Criteria andSmsValidationExpireEqualTo(Date value) {
            addCriterion("sms_validation_expire =", value, "smsValidationExpire");
            return (Criteria) this;
        }

        public Criteria andSmsValidationExpireNotEqualTo(Date value) {
            addCriterion("sms_validation_expire <>", value, "smsValidationExpire");
            return (Criteria) this;
        }

        public Criteria andSmsValidationExpireGreaterThan(Date value) {
            addCriterion("sms_validation_expire >", value, "smsValidationExpire");
            return (Criteria) this;
        }

        public Criteria andSmsValidationExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("sms_validation_expire >=", value, "smsValidationExpire");
            return (Criteria) this;
        }

        public Criteria andSmsValidationExpireLessThan(Date value) {
            addCriterion("sms_validation_expire <", value, "smsValidationExpire");
            return (Criteria) this;
        }

        public Criteria andSmsValidationExpireLessThanOrEqualTo(Date value) {
            addCriterion("sms_validation_expire <=", value, "smsValidationExpire");
            return (Criteria) this;
        }

        public Criteria andSmsValidationExpireIn(List<Date> values) {
            addCriterion("sms_validation_expire in", values, "smsValidationExpire");
            return (Criteria) this;
        }

        public Criteria andSmsValidationExpireNotIn(List<Date> values) {
            addCriterion("sms_validation_expire not in", values, "smsValidationExpire");
            return (Criteria) this;
        }

        public Criteria andSmsValidationExpireBetween(Date value1, Date value2) {
            addCriterion("sms_validation_expire between", value1, value2, "smsValidationExpire");
            return (Criteria) this;
        }

        public Criteria andSmsValidationExpireNotBetween(Date value1, Date value2) {
            addCriterion("sms_validation_expire not between", value1, value2, "smsValidationExpire");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyIsNull() {
            addCriterion("email_validation_key is null");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyIsNotNull() {
            addCriterion("email_validation_key is not null");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyEqualTo(String value) {
            addCriterion("email_validation_key =", value, "emailValidationKey");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyNotEqualTo(String value) {
            addCriterion("email_validation_key <>", value, "emailValidationKey");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyGreaterThan(String value) {
            addCriterion("email_validation_key >", value, "emailValidationKey");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyGreaterThanOrEqualTo(String value) {
            addCriterion("email_validation_key >=", value, "emailValidationKey");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyLessThan(String value) {
            addCriterion("email_validation_key <", value, "emailValidationKey");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyLessThanOrEqualTo(String value) {
            addCriterion("email_validation_key <=", value, "emailValidationKey");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyLike(String value) {
            addCriterion("email_validation_key like", value, "emailValidationKey");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyNotLike(String value) {
            addCriterion("email_validation_key not like", value, "emailValidationKey");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyIn(List<String> values) {
            addCriterion("email_validation_key in", values, "emailValidationKey");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyNotIn(List<String> values) {
            addCriterion("email_validation_key not in", values, "emailValidationKey");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyBetween(String value1, String value2) {
            addCriterion("email_validation_key between", value1, value2, "emailValidationKey");
            return (Criteria) this;
        }

        public Criteria andEmailValidationKeyNotBetween(String value1, String value2) {
            addCriterion("email_validation_key not between", value1, value2, "emailValidationKey");
            return (Criteria) this;
        }

        public Criteria andEmailValidationExpireIsNull() {
            addCriterion("email_validation_expire is null");
            return (Criteria) this;
        }

        public Criteria andEmailValidationExpireIsNotNull() {
            addCriterion("email_validation_expire is not null");
            return (Criteria) this;
        }

        public Criteria andEmailValidationExpireEqualTo(Date value) {
            addCriterion("email_validation_expire =", value, "emailValidationExpire");
            return (Criteria) this;
        }

        public Criteria andEmailValidationExpireNotEqualTo(Date value) {
            addCriterion("email_validation_expire <>", value, "emailValidationExpire");
            return (Criteria) this;
        }

        public Criteria andEmailValidationExpireGreaterThan(Date value) {
            addCriterion("email_validation_expire >", value, "emailValidationExpire");
            return (Criteria) this;
        }

        public Criteria andEmailValidationExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("email_validation_expire >=", value, "emailValidationExpire");
            return (Criteria) this;
        }

        public Criteria andEmailValidationExpireLessThan(Date value) {
            addCriterion("email_validation_expire <", value, "emailValidationExpire");
            return (Criteria) this;
        }

        public Criteria andEmailValidationExpireLessThanOrEqualTo(Date value) {
            addCriterion("email_validation_expire <=", value, "emailValidationExpire");
            return (Criteria) this;
        }

        public Criteria andEmailValidationExpireIn(List<Date> values) {
            addCriterion("email_validation_expire in", values, "emailValidationExpire");
            return (Criteria) this;
        }

        public Criteria andEmailValidationExpireNotIn(List<Date> values) {
            addCriterion("email_validation_expire not in", values, "emailValidationExpire");
            return (Criteria) this;
        }

        public Criteria andEmailValidationExpireBetween(Date value1, Date value2) {
            addCriterion("email_validation_expire between", value1, value2, "emailValidationExpire");
            return (Criteria) this;
        }

        public Criteria andEmailValidationExpireNotBetween(Date value1, Date value2) {
            addCriterion("email_validation_expire not between", value1, value2, "emailValidationExpire");
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

        public Criteria andVipCardNoIsNull() {
            addCriterion("vip_card_no is null");
            return (Criteria) this;
        }

        public Criteria andVipCardNoIsNotNull() {
            addCriterion("vip_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andVipCardNoEqualTo(String value) {
            addCriterion("vip_card_no =", value, "vipCardNo");
            return (Criteria) this;
        }

        public Criteria andVipCardNoNotEqualTo(String value) {
            addCriterion("vip_card_no <>", value, "vipCardNo");
            return (Criteria) this;
        }

        public Criteria andVipCardNoGreaterThan(String value) {
            addCriterion("vip_card_no >", value, "vipCardNo");
            return (Criteria) this;
        }

        public Criteria andVipCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("vip_card_no >=", value, "vipCardNo");
            return (Criteria) this;
        }

        public Criteria andVipCardNoLessThan(String value) {
            addCriterion("vip_card_no <", value, "vipCardNo");
            return (Criteria) this;
        }

        public Criteria andVipCardNoLessThanOrEqualTo(String value) {
            addCriterion("vip_card_no <=", value, "vipCardNo");
            return (Criteria) this;
        }

        public Criteria andVipCardNoLike(String value) {
            addCriterion("vip_card_no like", value, "vipCardNo");
            return (Criteria) this;
        }

        public Criteria andVipCardNoNotLike(String value) {
            addCriterion("vip_card_no not like", value, "vipCardNo");
            return (Criteria) this;
        }

        public Criteria andVipCardNoIn(List<String> values) {
            addCriterion("vip_card_no in", values, "vipCardNo");
            return (Criteria) this;
        }

        public Criteria andVipCardNoNotIn(List<String> values) {
            addCriterion("vip_card_no not in", values, "vipCardNo");
            return (Criteria) this;
        }

        public Criteria andVipCardNoBetween(String value1, String value2) {
            addCriterion("vip_card_no between", value1, value2, "vipCardNo");
            return (Criteria) this;
        }

        public Criteria andVipCardNoNotBetween(String value1, String value2) {
            addCriterion("vip_card_no not between", value1, value2, "vipCardNo");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenIsNull() {
            addCriterion("reg_num_open is null");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenIsNotNull() {
            addCriterion("reg_num_open is not null");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenEqualTo(String value) {
            addCriterion("reg_num_open =", value, "regNumOpen");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenNotEqualTo(String value) {
            addCriterion("reg_num_open <>", value, "regNumOpen");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenGreaterThan(String value) {
            addCriterion("reg_num_open >", value, "regNumOpen");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenGreaterThanOrEqualTo(String value) {
            addCriterion("reg_num_open >=", value, "regNumOpen");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenLessThan(String value) {
            addCriterion("reg_num_open <", value, "regNumOpen");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenLessThanOrEqualTo(String value) {
            addCriterion("reg_num_open <=", value, "regNumOpen");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenLike(String value) {
            addCriterion("reg_num_open like", value, "regNumOpen");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenNotLike(String value) {
            addCriterion("reg_num_open not like", value, "regNumOpen");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenIn(List<String> values) {
            addCriterion("reg_num_open in", values, "regNumOpen");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenNotIn(List<String> values) {
            addCriterion("reg_num_open not in", values, "regNumOpen");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenBetween(String value1, String value2) {
            addCriterion("reg_num_open between", value1, value2, "regNumOpen");
            return (Criteria) this;
        }

        public Criteria andRegNumOpenNotBetween(String value1, String value2) {
            addCriterion("reg_num_open not between", value1, value2, "regNumOpen");
            return (Criteria) this;
        }

        public Criteria andAddressOpenIsNull() {
            addCriterion("address_open is null");
            return (Criteria) this;
        }

        public Criteria andAddressOpenIsNotNull() {
            addCriterion("address_open is not null");
            return (Criteria) this;
        }

        public Criteria andAddressOpenEqualTo(String value) {
            addCriterion("address_open =", value, "addressOpen");
            return (Criteria) this;
        }

        public Criteria andAddressOpenNotEqualTo(String value) {
            addCriterion("address_open <>", value, "addressOpen");
            return (Criteria) this;
        }

        public Criteria andAddressOpenGreaterThan(String value) {
            addCriterion("address_open >", value, "addressOpen");
            return (Criteria) this;
        }

        public Criteria andAddressOpenGreaterThanOrEqualTo(String value) {
            addCriterion("address_open >=", value, "addressOpen");
            return (Criteria) this;
        }

        public Criteria andAddressOpenLessThan(String value) {
            addCriterion("address_open <", value, "addressOpen");
            return (Criteria) this;
        }

        public Criteria andAddressOpenLessThanOrEqualTo(String value) {
            addCriterion("address_open <=", value, "addressOpen");
            return (Criteria) this;
        }

        public Criteria andAddressOpenLike(String value) {
            addCriterion("address_open like", value, "addressOpen");
            return (Criteria) this;
        }

        public Criteria andAddressOpenNotLike(String value) {
            addCriterion("address_open not like", value, "addressOpen");
            return (Criteria) this;
        }

        public Criteria andAddressOpenIn(List<String> values) {
            addCriterion("address_open in", values, "addressOpen");
            return (Criteria) this;
        }

        public Criteria andAddressOpenNotIn(List<String> values) {
            addCriterion("address_open not in", values, "addressOpen");
            return (Criteria) this;
        }

        public Criteria andAddressOpenBetween(String value1, String value2) {
            addCriterion("address_open between", value1, value2, "addressOpen");
            return (Criteria) this;
        }

        public Criteria andAddressOpenNotBetween(String value1, String value2) {
            addCriterion("address_open not between", value1, value2, "addressOpen");
            return (Criteria) this;
        }

        public Criteria andWithholdingIsNull() {
            addCriterion("withholding is null");
            return (Criteria) this;
        }

        public Criteria andWithholdingIsNotNull() {
            addCriterion("withholding is not null");
            return (Criteria) this;
        }

        public Criteria andWithholdingEqualTo(String value) {
            addCriterion("withholding =", value, "withholding");
            return (Criteria) this;
        }

        public Criteria andWithholdingNotEqualTo(String value) {
            addCriterion("withholding <>", value, "withholding");
            return (Criteria) this;
        }

        public Criteria andWithholdingGreaterThan(String value) {
            addCriterion("withholding >", value, "withholding");
            return (Criteria) this;
        }

        public Criteria andWithholdingGreaterThanOrEqualTo(String value) {
            addCriterion("withholding >=", value, "withholding");
            return (Criteria) this;
        }

        public Criteria andWithholdingLessThan(String value) {
            addCriterion("withholding <", value, "withholding");
            return (Criteria) this;
        }

        public Criteria andWithholdingLessThanOrEqualTo(String value) {
            addCriterion("withholding <=", value, "withholding");
            return (Criteria) this;
        }

        public Criteria andWithholdingLike(String value) {
            addCriterion("withholding like", value, "withholding");
            return (Criteria) this;
        }

        public Criteria andWithholdingNotLike(String value) {
            addCriterion("withholding not like", value, "withholding");
            return (Criteria) this;
        }

        public Criteria andWithholdingIn(List<String> values) {
            addCriterion("withholding in", values, "withholding");
            return (Criteria) this;
        }

        public Criteria andWithholdingNotIn(List<String> values) {
            addCriterion("withholding not in", values, "withholding");
            return (Criteria) this;
        }

        public Criteria andWithholdingBetween(String value1, String value2) {
            addCriterion("withholding between", value1, value2, "withholding");
            return (Criteria) this;
        }

        public Criteria andWithholdingNotBetween(String value1, String value2) {
            addCriterion("withholding not between", value1, value2, "withholding");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsIsNull() {
            addCriterion("agree_terms is null");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsIsNotNull() {
            addCriterion("agree_terms is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsEqualTo(String value) {
            addCriterion("agree_terms =", value, "agreeTerms");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsNotEqualTo(String value) {
            addCriterion("agree_terms <>", value, "agreeTerms");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsGreaterThan(String value) {
            addCriterion("agree_terms >", value, "agreeTerms");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsGreaterThanOrEqualTo(String value) {
            addCriterion("agree_terms >=", value, "agreeTerms");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsLessThan(String value) {
            addCriterion("agree_terms <", value, "agreeTerms");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsLessThanOrEqualTo(String value) {
            addCriterion("agree_terms <=", value, "agreeTerms");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsLike(String value) {
            addCriterion("agree_terms like", value, "agreeTerms");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsNotLike(String value) {
            addCriterion("agree_terms not like", value, "agreeTerms");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsIn(List<String> values) {
            addCriterion("agree_terms in", values, "agreeTerms");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsNotIn(List<String> values) {
            addCriterion("agree_terms not in", values, "agreeTerms");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsBetween(String value1, String value2) {
            addCriterion("agree_terms between", value1, value2, "agreeTerms");
            return (Criteria) this;
        }

        public Criteria andAgreeTermsNotBetween(String value1, String value2) {
            addCriterion("agree_terms not between", value1, value2, "agreeTerms");
            return (Criteria) this;
        }

        public Criteria andAddressRewardIsNull() {
            addCriterion("address_reward is null");
            return (Criteria) this;
        }

        public Criteria andAddressRewardIsNotNull() {
            addCriterion("address_reward is not null");
            return (Criteria) this;
        }

        public Criteria andAddressRewardEqualTo(String value) {
            addCriterion("address_reward =", value, "addressReward");
            return (Criteria) this;
        }

        public Criteria andAddressRewardNotEqualTo(String value) {
            addCriterion("address_reward <>", value, "addressReward");
            return (Criteria) this;
        }

        public Criteria andAddressRewardGreaterThan(String value) {
            addCriterion("address_reward >", value, "addressReward");
            return (Criteria) this;
        }

        public Criteria andAddressRewardGreaterThanOrEqualTo(String value) {
            addCriterion("address_reward >=", value, "addressReward");
            return (Criteria) this;
        }

        public Criteria andAddressRewardLessThan(String value) {
            addCriterion("address_reward <", value, "addressReward");
            return (Criteria) this;
        }

        public Criteria andAddressRewardLessThanOrEqualTo(String value) {
            addCriterion("address_reward <=", value, "addressReward");
            return (Criteria) this;
        }

        public Criteria andAddressRewardLike(String value) {
            addCriterion("address_reward like", value, "addressReward");
            return (Criteria) this;
        }

        public Criteria andAddressRewardNotLike(String value) {
            addCriterion("address_reward not like", value, "addressReward");
            return (Criteria) this;
        }

        public Criteria andAddressRewardIn(List<String> values) {
            addCriterion("address_reward in", values, "addressReward");
            return (Criteria) this;
        }

        public Criteria andAddressRewardNotIn(List<String> values) {
            addCriterion("address_reward not in", values, "addressReward");
            return (Criteria) this;
        }

        public Criteria andAddressRewardBetween(String value1, String value2) {
            addCriterion("address_reward between", value1, value2, "addressReward");
            return (Criteria) this;
        }

        public Criteria andAddressRewardNotBetween(String value1, String value2) {
            addCriterion("address_reward not between", value1, value2, "addressReward");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardIsNull() {
            addCriterion("phone_reward is null");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardIsNotNull() {
            addCriterion("phone_reward is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardEqualTo(String value) {
            addCriterion("phone_reward =", value, "phoneReward");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardNotEqualTo(String value) {
            addCriterion("phone_reward <>", value, "phoneReward");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardGreaterThan(String value) {
            addCriterion("phone_reward >", value, "phoneReward");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardGreaterThanOrEqualTo(String value) {
            addCriterion("phone_reward >=", value, "phoneReward");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardLessThan(String value) {
            addCriterion("phone_reward <", value, "phoneReward");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardLessThanOrEqualTo(String value) {
            addCriterion("phone_reward <=", value, "phoneReward");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardLike(String value) {
            addCriterion("phone_reward like", value, "phoneReward");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardNotLike(String value) {
            addCriterion("phone_reward not like", value, "phoneReward");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardIn(List<String> values) {
            addCriterion("phone_reward in", values, "phoneReward");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardNotIn(List<String> values) {
            addCriterion("phone_reward not in", values, "phoneReward");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardBetween(String value1, String value2) {
            addCriterion("phone_reward between", value1, value2, "phoneReward");
            return (Criteria) this;
        }

        public Criteria andPhoneRewardNotBetween(String value1, String value2) {
            addCriterion("phone_reward not between", value1, value2, "phoneReward");
            return (Criteria) this;
        }

        public Criteria andNameRewardIsNull() {
            addCriterion("name_reward is null");
            return (Criteria) this;
        }

        public Criteria andNameRewardIsNotNull() {
            addCriterion("name_reward is not null");
            return (Criteria) this;
        }

        public Criteria andNameRewardEqualTo(String value) {
            addCriterion("name_reward =", value, "nameReward");
            return (Criteria) this;
        }

        public Criteria andNameRewardNotEqualTo(String value) {
            addCriterion("name_reward <>", value, "nameReward");
            return (Criteria) this;
        }

        public Criteria andNameRewardGreaterThan(String value) {
            addCriterion("name_reward >", value, "nameReward");
            return (Criteria) this;
        }

        public Criteria andNameRewardGreaterThanOrEqualTo(String value) {
            addCriterion("name_reward >=", value, "nameReward");
            return (Criteria) this;
        }

        public Criteria andNameRewardLessThan(String value) {
            addCriterion("name_reward <", value, "nameReward");
            return (Criteria) this;
        }

        public Criteria andNameRewardLessThanOrEqualTo(String value) {
            addCriterion("name_reward <=", value, "nameReward");
            return (Criteria) this;
        }

        public Criteria andNameRewardLike(String value) {
            addCriterion("name_reward like", value, "nameReward");
            return (Criteria) this;
        }

        public Criteria andNameRewardNotLike(String value) {
            addCriterion("name_reward not like", value, "nameReward");
            return (Criteria) this;
        }

        public Criteria andNameRewardIn(List<String> values) {
            addCriterion("name_reward in", values, "nameReward");
            return (Criteria) this;
        }

        public Criteria andNameRewardNotIn(List<String> values) {
            addCriterion("name_reward not in", values, "nameReward");
            return (Criteria) this;
        }

        public Criteria andNameRewardBetween(String value1, String value2) {
            addCriterion("name_reward between", value1, value2, "nameReward");
            return (Criteria) this;
        }

        public Criteria andNameRewardNotBetween(String value1, String value2) {
            addCriterion("name_reward not between", value1, value2, "nameReward");
            return (Criteria) this;
        }

        public Criteria andEventIsNull() {
            addCriterion("event is null");
            return (Criteria) this;
        }

        public Criteria andEventIsNotNull() {
            addCriterion("event is not null");
            return (Criteria) this;
        }

        public Criteria andEventEqualTo(Integer value) {
            addCriterion("event =", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotEqualTo(Integer value) {
            addCriterion("event <>", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThan(Integer value) {
            addCriterion("event >", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThanOrEqualTo(Integer value) {
            addCriterion("event >=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThan(Integer value) {
            addCriterion("event <", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThanOrEqualTo(Integer value) {
            addCriterion("event <=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventIn(List<Integer> values) {
            addCriterion("event in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotIn(List<Integer> values) {
            addCriterion("event not in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventBetween(Integer value1, Integer value2) {
            addCriterion("event between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotBetween(Integer value1, Integer value2) {
            addCriterion("event not between", value1, value2, "event");
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