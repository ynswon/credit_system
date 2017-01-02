package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class applicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public applicationExample() {
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

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
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

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNull() {
            addCriterion("owner_name is null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNotNull() {
            addCriterion("owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameEqualTo(String value) {
            addCriterion("owner_name =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotEqualTo(String value) {
            addCriterion("owner_name <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThan(String value) {
            addCriterion("owner_name >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("owner_name >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThan(String value) {
            addCriterion("owner_name <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("owner_name <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLike(String value) {
            addCriterion("owner_name like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotLike(String value) {
            addCriterion("owner_name not like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIn(List<String> values) {
            addCriterion("owner_name in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotIn(List<String> values) {
            addCriterion("owner_name not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameBetween(String value1, String value2) {
            addCriterion("owner_name between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotBetween(String value1, String value2) {
            addCriterion("owner_name not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateIsNull() {
            addCriterion("owner_birthdate is null");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateIsNotNull() {
            addCriterion("owner_birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateEqualTo(String value) {
            addCriterion("owner_birthdate =", value, "ownerBirthdate");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateNotEqualTo(String value) {
            addCriterion("owner_birthdate <>", value, "ownerBirthdate");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateGreaterThan(String value) {
            addCriterion("owner_birthdate >", value, "ownerBirthdate");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("owner_birthdate >=", value, "ownerBirthdate");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateLessThan(String value) {
            addCriterion("owner_birthdate <", value, "ownerBirthdate");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateLessThanOrEqualTo(String value) {
            addCriterion("owner_birthdate <=", value, "ownerBirthdate");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateLike(String value) {
            addCriterion("owner_birthdate like", value, "ownerBirthdate");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateNotLike(String value) {
            addCriterion("owner_birthdate not like", value, "ownerBirthdate");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateIn(List<String> values) {
            addCriterion("owner_birthdate in", values, "ownerBirthdate");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateNotIn(List<String> values) {
            addCriterion("owner_birthdate not in", values, "ownerBirthdate");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateBetween(String value1, String value2) {
            addCriterion("owner_birthdate between", value1, value2, "ownerBirthdate");
            return (Criteria) this;
        }

        public Criteria andOwnerBirthdateNotBetween(String value1, String value2) {
            addCriterion("owner_birthdate not between", value1, value2, "ownerBirthdate");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderIsNull() {
            addCriterion("owner_gender is null");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderIsNotNull() {
            addCriterion("owner_gender is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderEqualTo(String value) {
            addCriterion("owner_gender =", value, "ownerGender");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderNotEqualTo(String value) {
            addCriterion("owner_gender <>", value, "ownerGender");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderGreaterThan(String value) {
            addCriterion("owner_gender >", value, "ownerGender");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderGreaterThanOrEqualTo(String value) {
            addCriterion("owner_gender >=", value, "ownerGender");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderLessThan(String value) {
            addCriterion("owner_gender <", value, "ownerGender");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderLessThanOrEqualTo(String value) {
            addCriterion("owner_gender <=", value, "ownerGender");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderLike(String value) {
            addCriterion("owner_gender like", value, "ownerGender");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderNotLike(String value) {
            addCriterion("owner_gender not like", value, "ownerGender");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderIn(List<String> values) {
            addCriterion("owner_gender in", values, "ownerGender");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderNotIn(List<String> values) {
            addCriterion("owner_gender not in", values, "ownerGender");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderBetween(String value1, String value2) {
            addCriterion("owner_gender between", value1, value2, "ownerGender");
            return (Criteria) this;
        }

        public Criteria andOwnerGenderNotBetween(String value1, String value2) {
            addCriterion("owner_gender not between", value1, value2, "ownerGender");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneIsNull() {
            addCriterion("owner_phone is null");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneIsNotNull() {
            addCriterion("owner_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneEqualTo(String value) {
            addCriterion("owner_phone =", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneNotEqualTo(String value) {
            addCriterion("owner_phone <>", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneGreaterThan(String value) {
            addCriterion("owner_phone >", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("owner_phone >=", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneLessThan(String value) {
            addCriterion("owner_phone <", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneLessThanOrEqualTo(String value) {
            addCriterion("owner_phone <=", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneLike(String value) {
            addCriterion("owner_phone like", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneNotLike(String value) {
            addCriterion("owner_phone not like", value, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneIn(List<String> values) {
            addCriterion("owner_phone in", values, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneNotIn(List<String> values) {
            addCriterion("owner_phone not in", values, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneBetween(String value1, String value2) {
            addCriterion("owner_phone between", value1, value2, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andOwnerPhoneNotBetween(String value1, String value2) {
            addCriterion("owner_phone not between", value1, value2, "ownerPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantNameIsNull() {
            addCriterion("applicant_name is null");
            return (Criteria) this;
        }

        public Criteria andApplicantNameIsNotNull() {
            addCriterion("applicant_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantNameEqualTo(String value) {
            addCriterion("applicant_name =", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotEqualTo(String value) {
            addCriterion("applicant_name <>", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameGreaterThan(String value) {
            addCriterion("applicant_name >", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_name >=", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameLessThan(String value) {
            addCriterion("applicant_name <", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameLessThanOrEqualTo(String value) {
            addCriterion("applicant_name <=", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameLike(String value) {
            addCriterion("applicant_name like", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotLike(String value) {
            addCriterion("applicant_name not like", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameIn(List<String> values) {
            addCriterion("applicant_name in", values, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotIn(List<String> values) {
            addCriterion("applicant_name not in", values, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameBetween(String value1, String value2) {
            addCriterion("applicant_name between", value1, value2, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotBetween(String value1, String value2) {
            addCriterion("applicant_name not between", value1, value2, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateIsNull() {
            addCriterion("applicant_birthdate is null");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateIsNotNull() {
            addCriterion("applicant_birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateEqualTo(String value) {
            addCriterion("applicant_birthdate =", value, "applicantBirthdate");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateNotEqualTo(String value) {
            addCriterion("applicant_birthdate <>", value, "applicantBirthdate");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateGreaterThan(String value) {
            addCriterion("applicant_birthdate >", value, "applicantBirthdate");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_birthdate >=", value, "applicantBirthdate");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateLessThan(String value) {
            addCriterion("applicant_birthdate <", value, "applicantBirthdate");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateLessThanOrEqualTo(String value) {
            addCriterion("applicant_birthdate <=", value, "applicantBirthdate");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateLike(String value) {
            addCriterion("applicant_birthdate like", value, "applicantBirthdate");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateNotLike(String value) {
            addCriterion("applicant_birthdate not like", value, "applicantBirthdate");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateIn(List<String> values) {
            addCriterion("applicant_birthdate in", values, "applicantBirthdate");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateNotIn(List<String> values) {
            addCriterion("applicant_birthdate not in", values, "applicantBirthdate");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateBetween(String value1, String value2) {
            addCriterion("applicant_birthdate between", value1, value2, "applicantBirthdate");
            return (Criteria) this;
        }

        public Criteria andApplicantBirthdateNotBetween(String value1, String value2) {
            addCriterion("applicant_birthdate not between", value1, value2, "applicantBirthdate");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderIsNull() {
            addCriterion("applicant_gender is null");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderIsNotNull() {
            addCriterion("applicant_gender is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderEqualTo(String value) {
            addCriterion("applicant_gender =", value, "applicantGender");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderNotEqualTo(String value) {
            addCriterion("applicant_gender <>", value, "applicantGender");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderGreaterThan(String value) {
            addCriterion("applicant_gender >", value, "applicantGender");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_gender >=", value, "applicantGender");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderLessThan(String value) {
            addCriterion("applicant_gender <", value, "applicantGender");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderLessThanOrEqualTo(String value) {
            addCriterion("applicant_gender <=", value, "applicantGender");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderLike(String value) {
            addCriterion("applicant_gender like", value, "applicantGender");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderNotLike(String value) {
            addCriterion("applicant_gender not like", value, "applicantGender");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderIn(List<String> values) {
            addCriterion("applicant_gender in", values, "applicantGender");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderNotIn(List<String> values) {
            addCriterion("applicant_gender not in", values, "applicantGender");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderBetween(String value1, String value2) {
            addCriterion("applicant_gender between", value1, value2, "applicantGender");
            return (Criteria) this;
        }

        public Criteria andApplicantGenderNotBetween(String value1, String value2) {
            addCriterion("applicant_gender not between", value1, value2, "applicantGender");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneIsNull() {
            addCriterion("applicant_phone is null");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneIsNotNull() {
            addCriterion("applicant_phone is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneEqualTo(String value) {
            addCriterion("applicant_phone =", value, "applicantPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNotEqualTo(String value) {
            addCriterion("applicant_phone <>", value, "applicantPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneGreaterThan(String value) {
            addCriterion("applicant_phone >", value, "applicantPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_phone >=", value, "applicantPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneLessThan(String value) {
            addCriterion("applicant_phone <", value, "applicantPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneLessThanOrEqualTo(String value) {
            addCriterion("applicant_phone <=", value, "applicantPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneLike(String value) {
            addCriterion("applicant_phone like", value, "applicantPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNotLike(String value) {
            addCriterion("applicant_phone not like", value, "applicantPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneIn(List<String> values) {
            addCriterion("applicant_phone in", values, "applicantPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNotIn(List<String> values) {
            addCriterion("applicant_phone not in", values, "applicantPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneBetween(String value1, String value2) {
            addCriterion("applicant_phone between", value1, value2, "applicantPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNotBetween(String value1, String value2) {
            addCriterion("applicant_phone not between", value1, value2, "applicantPhone");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationIsNull() {
            addCriterion("applicant_relation is null");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationIsNotNull() {
            addCriterion("applicant_relation is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationEqualTo(String value) {
            addCriterion("applicant_relation =", value, "applicantRelation");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationNotEqualTo(String value) {
            addCriterion("applicant_relation <>", value, "applicantRelation");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationGreaterThan(String value) {
            addCriterion("applicant_relation >", value, "applicantRelation");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_relation >=", value, "applicantRelation");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationLessThan(String value) {
            addCriterion("applicant_relation <", value, "applicantRelation");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationLessThanOrEqualTo(String value) {
            addCriterion("applicant_relation <=", value, "applicantRelation");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationLike(String value) {
            addCriterion("applicant_relation like", value, "applicantRelation");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationNotLike(String value) {
            addCriterion("applicant_relation not like", value, "applicantRelation");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationIn(List<String> values) {
            addCriterion("applicant_relation in", values, "applicantRelation");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationNotIn(List<String> values) {
            addCriterion("applicant_relation not in", values, "applicantRelation");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationBetween(String value1, String value2) {
            addCriterion("applicant_relation between", value1, value2, "applicantRelation");
            return (Criteria) this;
        }

        public Criteria andApplicantRelationNotBetween(String value1, String value2) {
            addCriterion("applicant_relation not between", value1, value2, "applicantRelation");
            return (Criteria) this;
        }

        public Criteria andCorperateNameIsNull() {
            addCriterion("corperate_name is null");
            return (Criteria) this;
        }

        public Criteria andCorperateNameIsNotNull() {
            addCriterion("corperate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCorperateNameEqualTo(String value) {
            addCriterion("corperate_name =", value, "corperateName");
            return (Criteria) this;
        }

        public Criteria andCorperateNameNotEqualTo(String value) {
            addCriterion("corperate_name <>", value, "corperateName");
            return (Criteria) this;
        }

        public Criteria andCorperateNameGreaterThan(String value) {
            addCriterion("corperate_name >", value, "corperateName");
            return (Criteria) this;
        }

        public Criteria andCorperateNameGreaterThanOrEqualTo(String value) {
            addCriterion("corperate_name >=", value, "corperateName");
            return (Criteria) this;
        }

        public Criteria andCorperateNameLessThan(String value) {
            addCriterion("corperate_name <", value, "corperateName");
            return (Criteria) this;
        }

        public Criteria andCorperateNameLessThanOrEqualTo(String value) {
            addCriterion("corperate_name <=", value, "corperateName");
            return (Criteria) this;
        }

        public Criteria andCorperateNameLike(String value) {
            addCriterion("corperate_name like", value, "corperateName");
            return (Criteria) this;
        }

        public Criteria andCorperateNameNotLike(String value) {
            addCriterion("corperate_name not like", value, "corperateName");
            return (Criteria) this;
        }

        public Criteria andCorperateNameIn(List<String> values) {
            addCriterion("corperate_name in", values, "corperateName");
            return (Criteria) this;
        }

        public Criteria andCorperateNameNotIn(List<String> values) {
            addCriterion("corperate_name not in", values, "corperateName");
            return (Criteria) this;
        }

        public Criteria andCorperateNameBetween(String value1, String value2) {
            addCriterion("corperate_name between", value1, value2, "corperateName");
            return (Criteria) this;
        }

        public Criteria andCorperateNameNotBetween(String value1, String value2) {
            addCriterion("corperate_name not between", value1, value2, "corperateName");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeIsNull() {
            addCriterion("corperate_type is null");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeIsNotNull() {
            addCriterion("corperate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeEqualTo(String value) {
            addCriterion("corperate_type =", value, "corperateType");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeNotEqualTo(String value) {
            addCriterion("corperate_type <>", value, "corperateType");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeGreaterThan(String value) {
            addCriterion("corperate_type >", value, "corperateType");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("corperate_type >=", value, "corperateType");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeLessThan(String value) {
            addCriterion("corperate_type <", value, "corperateType");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeLessThanOrEqualTo(String value) {
            addCriterion("corperate_type <=", value, "corperateType");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeLike(String value) {
            addCriterion("corperate_type like", value, "corperateType");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeNotLike(String value) {
            addCriterion("corperate_type not like", value, "corperateType");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeIn(List<String> values) {
            addCriterion("corperate_type in", values, "corperateType");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeNotIn(List<String> values) {
            addCriterion("corperate_type not in", values, "corperateType");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeBetween(String value1, String value2) {
            addCriterion("corperate_type between", value1, value2, "corperateType");
            return (Criteria) this;
        }

        public Criteria andCorperateTypeNotBetween(String value1, String value2) {
            addCriterion("corperate_type not between", value1, value2, "corperateType");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressIsNull() {
            addCriterion("corperate_address is null");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressIsNotNull() {
            addCriterion("corperate_address is not null");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressEqualTo(String value) {
            addCriterion("corperate_address =", value, "corperateAddress");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressNotEqualTo(String value) {
            addCriterion("corperate_address <>", value, "corperateAddress");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressGreaterThan(String value) {
            addCriterion("corperate_address >", value, "corperateAddress");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressGreaterThanOrEqualTo(String value) {
            addCriterion("corperate_address >=", value, "corperateAddress");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressLessThan(String value) {
            addCriterion("corperate_address <", value, "corperateAddress");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressLessThanOrEqualTo(String value) {
            addCriterion("corperate_address <=", value, "corperateAddress");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressLike(String value) {
            addCriterion("corperate_address like", value, "corperateAddress");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressNotLike(String value) {
            addCriterion("corperate_address not like", value, "corperateAddress");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressIn(List<String> values) {
            addCriterion("corperate_address in", values, "corperateAddress");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressNotIn(List<String> values) {
            addCriterion("corperate_address not in", values, "corperateAddress");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressBetween(String value1, String value2) {
            addCriterion("corperate_address between", value1, value2, "corperateAddress");
            return (Criteria) this;
        }

        public Criteria andCorperateAddressNotBetween(String value1, String value2) {
            addCriterion("corperate_address not between", value1, value2, "corperateAddress");
            return (Criteria) this;
        }

        public Criteria andCorperateYearIsNull() {
            addCriterion("corperate_year is null");
            return (Criteria) this;
        }

        public Criteria andCorperateYearIsNotNull() {
            addCriterion("corperate_year is not null");
            return (Criteria) this;
        }

        public Criteria andCorperateYearEqualTo(String value) {
            addCriterion("corperate_year =", value, "corperateYear");
            return (Criteria) this;
        }

        public Criteria andCorperateYearNotEqualTo(String value) {
            addCriterion("corperate_year <>", value, "corperateYear");
            return (Criteria) this;
        }

        public Criteria andCorperateYearGreaterThan(String value) {
            addCriterion("corperate_year >", value, "corperateYear");
            return (Criteria) this;
        }

        public Criteria andCorperateYearGreaterThanOrEqualTo(String value) {
            addCriterion("corperate_year >=", value, "corperateYear");
            return (Criteria) this;
        }

        public Criteria andCorperateYearLessThan(String value) {
            addCriterion("corperate_year <", value, "corperateYear");
            return (Criteria) this;
        }

        public Criteria andCorperateYearLessThanOrEqualTo(String value) {
            addCriterion("corperate_year <=", value, "corperateYear");
            return (Criteria) this;
        }

        public Criteria andCorperateYearLike(String value) {
            addCriterion("corperate_year like", value, "corperateYear");
            return (Criteria) this;
        }

        public Criteria andCorperateYearNotLike(String value) {
            addCriterion("corperate_year not like", value, "corperateYear");
            return (Criteria) this;
        }

        public Criteria andCorperateYearIn(List<String> values) {
            addCriterion("corperate_year in", values, "corperateYear");
            return (Criteria) this;
        }

        public Criteria andCorperateYearNotIn(List<String> values) {
            addCriterion("corperate_year not in", values, "corperateYear");
            return (Criteria) this;
        }

        public Criteria andCorperateYearBetween(String value1, String value2) {
            addCriterion("corperate_year between", value1, value2, "corperateYear");
            return (Criteria) this;
        }

        public Criteria andCorperateYearNotBetween(String value1, String value2) {
            addCriterion("corperate_year not between", value1, value2, "corperateYear");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneIsNull() {
            addCriterion("corperate_phone is null");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneIsNotNull() {
            addCriterion("corperate_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneEqualTo(String value) {
            addCriterion("corperate_phone =", value, "corperatePhone");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneNotEqualTo(String value) {
            addCriterion("corperate_phone <>", value, "corperatePhone");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneGreaterThan(String value) {
            addCriterion("corperate_phone >", value, "corperatePhone");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("corperate_phone >=", value, "corperatePhone");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneLessThan(String value) {
            addCriterion("corperate_phone <", value, "corperatePhone");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneLessThanOrEqualTo(String value) {
            addCriterion("corperate_phone <=", value, "corperatePhone");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneLike(String value) {
            addCriterion("corperate_phone like", value, "corperatePhone");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneNotLike(String value) {
            addCriterion("corperate_phone not like", value, "corperatePhone");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneIn(List<String> values) {
            addCriterion("corperate_phone in", values, "corperatePhone");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneNotIn(List<String> values) {
            addCriterion("corperate_phone not in", values, "corperatePhone");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneBetween(String value1, String value2) {
            addCriterion("corperate_phone between", value1, value2, "corperatePhone");
            return (Criteria) this;
        }

        public Criteria andCorperatePhoneNotBetween(String value1, String value2) {
            addCriterion("corperate_phone not between", value1, value2, "corperatePhone");
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

        public Criteria andUtmSourceIsNull() {
            addCriterion("utm_source is null");
            return (Criteria) this;
        }

        public Criteria andUtmSourceIsNotNull() {
            addCriterion("utm_source is not null");
            return (Criteria) this;
        }

        public Criteria andUtmSourceEqualTo(String value) {
            addCriterion("utm_source =", value, "utmSource");
            return (Criteria) this;
        }

        public Criteria andUtmSourceNotEqualTo(String value) {
            addCriterion("utm_source <>", value, "utmSource");
            return (Criteria) this;
        }

        public Criteria andUtmSourceGreaterThan(String value) {
            addCriterion("utm_source >", value, "utmSource");
            return (Criteria) this;
        }

        public Criteria andUtmSourceGreaterThanOrEqualTo(String value) {
            addCriterion("utm_source >=", value, "utmSource");
            return (Criteria) this;
        }

        public Criteria andUtmSourceLessThan(String value) {
            addCriterion("utm_source <", value, "utmSource");
            return (Criteria) this;
        }

        public Criteria andUtmSourceLessThanOrEqualTo(String value) {
            addCriterion("utm_source <=", value, "utmSource");
            return (Criteria) this;
        }

        public Criteria andUtmSourceLike(String value) {
            addCriterion("utm_source like", value, "utmSource");
            return (Criteria) this;
        }

        public Criteria andUtmSourceNotLike(String value) {
            addCriterion("utm_source not like", value, "utmSource");
            return (Criteria) this;
        }

        public Criteria andUtmSourceIn(List<String> values) {
            addCriterion("utm_source in", values, "utmSource");
            return (Criteria) this;
        }

        public Criteria andUtmSourceNotIn(List<String> values) {
            addCriterion("utm_source not in", values, "utmSource");
            return (Criteria) this;
        }

        public Criteria andUtmSourceBetween(String value1, String value2) {
            addCriterion("utm_source between", value1, value2, "utmSource");
            return (Criteria) this;
        }

        public Criteria andUtmSourceNotBetween(String value1, String value2) {
            addCriterion("utm_source not between", value1, value2, "utmSource");
            return (Criteria) this;
        }

        public Criteria andUtmMediumIsNull() {
            addCriterion("utm_medium is null");
            return (Criteria) this;
        }

        public Criteria andUtmMediumIsNotNull() {
            addCriterion("utm_medium is not null");
            return (Criteria) this;
        }

        public Criteria andUtmMediumEqualTo(String value) {
            addCriterion("utm_medium =", value, "utmMedium");
            return (Criteria) this;
        }

        public Criteria andUtmMediumNotEqualTo(String value) {
            addCriterion("utm_medium <>", value, "utmMedium");
            return (Criteria) this;
        }

        public Criteria andUtmMediumGreaterThan(String value) {
            addCriterion("utm_medium >", value, "utmMedium");
            return (Criteria) this;
        }

        public Criteria andUtmMediumGreaterThanOrEqualTo(String value) {
            addCriterion("utm_medium >=", value, "utmMedium");
            return (Criteria) this;
        }

        public Criteria andUtmMediumLessThan(String value) {
            addCriterion("utm_medium <", value, "utmMedium");
            return (Criteria) this;
        }

        public Criteria andUtmMediumLessThanOrEqualTo(String value) {
            addCriterion("utm_medium <=", value, "utmMedium");
            return (Criteria) this;
        }

        public Criteria andUtmMediumLike(String value) {
            addCriterion("utm_medium like", value, "utmMedium");
            return (Criteria) this;
        }

        public Criteria andUtmMediumNotLike(String value) {
            addCriterion("utm_medium not like", value, "utmMedium");
            return (Criteria) this;
        }

        public Criteria andUtmMediumIn(List<String> values) {
            addCriterion("utm_medium in", values, "utmMedium");
            return (Criteria) this;
        }

        public Criteria andUtmMediumNotIn(List<String> values) {
            addCriterion("utm_medium not in", values, "utmMedium");
            return (Criteria) this;
        }

        public Criteria andUtmMediumBetween(String value1, String value2) {
            addCriterion("utm_medium between", value1, value2, "utmMedium");
            return (Criteria) this;
        }

        public Criteria andUtmMediumNotBetween(String value1, String value2) {
            addCriterion("utm_medium not between", value1, value2, "utmMedium");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordIsNull() {
            addCriterion("utm_keyword is null");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordIsNotNull() {
            addCriterion("utm_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordEqualTo(String value) {
            addCriterion("utm_keyword =", value, "utmKeyword");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordNotEqualTo(String value) {
            addCriterion("utm_keyword <>", value, "utmKeyword");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordGreaterThan(String value) {
            addCriterion("utm_keyword >", value, "utmKeyword");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("utm_keyword >=", value, "utmKeyword");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordLessThan(String value) {
            addCriterion("utm_keyword <", value, "utmKeyword");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordLessThanOrEqualTo(String value) {
            addCriterion("utm_keyword <=", value, "utmKeyword");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordLike(String value) {
            addCriterion("utm_keyword like", value, "utmKeyword");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordNotLike(String value) {
            addCriterion("utm_keyword not like", value, "utmKeyword");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordIn(List<String> values) {
            addCriterion("utm_keyword in", values, "utmKeyword");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordNotIn(List<String> values) {
            addCriterion("utm_keyword not in", values, "utmKeyword");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordBetween(String value1, String value2) {
            addCriterion("utm_keyword between", value1, value2, "utmKeyword");
            return (Criteria) this;
        }

        public Criteria andUtmKeywordNotBetween(String value1, String value2) {
            addCriterion("utm_keyword not between", value1, value2, "utmKeyword");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignIsNull() {
            addCriterion("utm_campaign is null");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignIsNotNull() {
            addCriterion("utm_campaign is not null");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignEqualTo(String value) {
            addCriterion("utm_campaign =", value, "utmCampaign");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignNotEqualTo(String value) {
            addCriterion("utm_campaign <>", value, "utmCampaign");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignGreaterThan(String value) {
            addCriterion("utm_campaign >", value, "utmCampaign");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignGreaterThanOrEqualTo(String value) {
            addCriterion("utm_campaign >=", value, "utmCampaign");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignLessThan(String value) {
            addCriterion("utm_campaign <", value, "utmCampaign");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignLessThanOrEqualTo(String value) {
            addCriterion("utm_campaign <=", value, "utmCampaign");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignLike(String value) {
            addCriterion("utm_campaign like", value, "utmCampaign");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignNotLike(String value) {
            addCriterion("utm_campaign not like", value, "utmCampaign");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignIn(List<String> values) {
            addCriterion("utm_campaign in", values, "utmCampaign");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignNotIn(List<String> values) {
            addCriterion("utm_campaign not in", values, "utmCampaign");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignBetween(String value1, String value2) {
            addCriterion("utm_campaign between", value1, value2, "utmCampaign");
            return (Criteria) this;
        }

        public Criteria andUtmCampaignNotBetween(String value1, String value2) {
            addCriterion("utm_campaign not between", value1, value2, "utmCampaign");
            return (Criteria) this;
        }

        public Criteria andMarketingIsNull() {
            addCriterion("marketing is null");
            return (Criteria) this;
        }

        public Criteria andMarketingIsNotNull() {
            addCriterion("marketing is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingEqualTo(String value) {
            addCriterion("marketing =", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingNotEqualTo(String value) {
            addCriterion("marketing <>", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingGreaterThan(String value) {
            addCriterion("marketing >", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingGreaterThanOrEqualTo(String value) {
            addCriterion("marketing >=", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingLessThan(String value) {
            addCriterion("marketing <", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingLessThanOrEqualTo(String value) {
            addCriterion("marketing <=", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingLike(String value) {
            addCriterion("marketing like", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingNotLike(String value) {
            addCriterion("marketing not like", value, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingIn(List<String> values) {
            addCriterion("marketing in", values, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingNotIn(List<String> values) {
            addCriterion("marketing not in", values, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingBetween(String value1, String value2) {
            addCriterion("marketing between", value1, value2, "marketing");
            return (Criteria) this;
        }

        public Criteria andMarketingNotBetween(String value1, String value2) {
            addCriterion("marketing not between", value1, value2, "marketing");
            return (Criteria) this;
        }

        public Criteria andValidationIsNull() {
            addCriterion("validation is null");
            return (Criteria) this;
        }

        public Criteria andValidationIsNotNull() {
            addCriterion("validation is not null");
            return (Criteria) this;
        }

        public Criteria andValidationEqualTo(Integer value) {
            addCriterion("validation =", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationNotEqualTo(Integer value) {
            addCriterion("validation <>", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationGreaterThan(Integer value) {
            addCriterion("validation >", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationGreaterThanOrEqualTo(Integer value) {
            addCriterion("validation >=", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationLessThan(Integer value) {
            addCriterion("validation <", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationLessThanOrEqualTo(Integer value) {
            addCriterion("validation <=", value, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationIn(List<Integer> values) {
            addCriterion("validation in", values, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationNotIn(List<Integer> values) {
            addCriterion("validation not in", values, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationBetween(Integer value1, Integer value2) {
            addCriterion("validation between", value1, value2, "validation");
            return (Criteria) this;
        }

        public Criteria andValidationNotBetween(Integer value1, Integer value2) {
            addCriterion("validation not between", value1, value2, "validation");
            return (Criteria) this;
        }

        public Criteria andDropOutcdIsNull() {
            addCriterion("drop_outCd is null");
            return (Criteria) this;
        }

        public Criteria andDropOutcdIsNotNull() {
            addCriterion("drop_outCd is not null");
            return (Criteria) this;
        }

        public Criteria andDropOutcdEqualTo(String value) {
            addCriterion("drop_outCd =", value, "dropOutcd");
            return (Criteria) this;
        }

        public Criteria andDropOutcdNotEqualTo(String value) {
            addCriterion("drop_outCd <>", value, "dropOutcd");
            return (Criteria) this;
        }

        public Criteria andDropOutcdGreaterThan(String value) {
            addCriterion("drop_outCd >", value, "dropOutcd");
            return (Criteria) this;
        }

        public Criteria andDropOutcdGreaterThanOrEqualTo(String value) {
            addCriterion("drop_outCd >=", value, "dropOutcd");
            return (Criteria) this;
        }

        public Criteria andDropOutcdLessThan(String value) {
            addCriterion("drop_outCd <", value, "dropOutcd");
            return (Criteria) this;
        }

        public Criteria andDropOutcdLessThanOrEqualTo(String value) {
            addCriterion("drop_outCd <=", value, "dropOutcd");
            return (Criteria) this;
        }

        public Criteria andDropOutcdLike(String value) {
            addCriterion("drop_outCd like", value, "dropOutcd");
            return (Criteria) this;
        }

        public Criteria andDropOutcdNotLike(String value) {
            addCriterion("drop_outCd not like", value, "dropOutcd");
            return (Criteria) this;
        }

        public Criteria andDropOutcdIn(List<String> values) {
            addCriterion("drop_outCd in", values, "dropOutcd");
            return (Criteria) this;
        }

        public Criteria andDropOutcdNotIn(List<String> values) {
            addCriterion("drop_outCd not in", values, "dropOutcd");
            return (Criteria) this;
        }

        public Criteria andDropOutcdBetween(String value1, String value2) {
            addCriterion("drop_outCd between", value1, value2, "dropOutcd");
            return (Criteria) this;
        }

        public Criteria andDropOutcdNotBetween(String value1, String value2) {
            addCriterion("drop_outCd not between", value1, value2, "dropOutcd");
            return (Criteria) this;
        }

        public Criteria andProgressIsNull() {
            addCriterion("progress is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("progress is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(String value) {
            addCriterion("progress =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(String value) {
            addCriterion("progress <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(String value) {
            addCriterion("progress >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(String value) {
            addCriterion("progress >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(String value) {
            addCriterion("progress <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(String value) {
            addCriterion("progress <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLike(String value) {
            addCriterion("progress like", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotLike(String value) {
            addCriterion("progress not like", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<String> values) {
            addCriterion("progress in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<String> values) {
            addCriterion("progress not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(String value1, String value2) {
            addCriterion("progress between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(String value1, String value2) {
            addCriterion("progress not between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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

        public Criteria andDescmemoIsNull() {
            addCriterion("descmemo is null");
            return (Criteria) this;
        }

        public Criteria andDescmemoIsNotNull() {
            addCriterion("descmemo is not null");
            return (Criteria) this;
        }

        public Criteria andDescmemoEqualTo(String value) {
            addCriterion("descmemo =", value, "descmemo");
            return (Criteria) this;
        }

        public Criteria andDescmemoNotEqualTo(String value) {
            addCriterion("descmemo <>", value, "descmemo");
            return (Criteria) this;
        }

        public Criteria andDescmemoGreaterThan(String value) {
            addCriterion("descmemo >", value, "descmemo");
            return (Criteria) this;
        }

        public Criteria andDescmemoGreaterThanOrEqualTo(String value) {
            addCriterion("descmemo >=", value, "descmemo");
            return (Criteria) this;
        }

        public Criteria andDescmemoLessThan(String value) {
            addCriterion("descmemo <", value, "descmemo");
            return (Criteria) this;
        }

        public Criteria andDescmemoLessThanOrEqualTo(String value) {
            addCriterion("descmemo <=", value, "descmemo");
            return (Criteria) this;
        }

        public Criteria andDescmemoLike(String value) {
            addCriterion("descmemo like", value, "descmemo");
            return (Criteria) this;
        }

        public Criteria andDescmemoNotLike(String value) {
            addCriterion("descmemo not like", value, "descmemo");
            return (Criteria) this;
        }

        public Criteria andDescmemoIn(List<String> values) {
            addCriterion("descmemo in", values, "descmemo");
            return (Criteria) this;
        }

        public Criteria andDescmemoNotIn(List<String> values) {
            addCriterion("descmemo not in", values, "descmemo");
            return (Criteria) this;
        }

        public Criteria andDescmemoBetween(String value1, String value2) {
            addCriterion("descmemo between", value1, value2, "descmemo");
            return (Criteria) this;
        }

        public Criteria andDescmemoNotBetween(String value1, String value2) {
            addCriterion("descmemo not between", value1, value2, "descmemo");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyIsNull() {
            addCriterion("registerkey is null");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyIsNotNull() {
            addCriterion("registerkey is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyEqualTo(String value) {
            addCriterion("registerkey =", value, "registerkey");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyNotEqualTo(String value) {
            addCriterion("registerkey <>", value, "registerkey");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyGreaterThan(String value) {
            addCriterion("registerkey >", value, "registerkey");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyGreaterThanOrEqualTo(String value) {
            addCriterion("registerkey >=", value, "registerkey");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyLessThan(String value) {
            addCriterion("registerkey <", value, "registerkey");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyLessThanOrEqualTo(String value) {
            addCriterion("registerkey <=", value, "registerkey");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyLike(String value) {
            addCriterion("registerkey like", value, "registerkey");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyNotLike(String value) {
            addCriterion("registerkey not like", value, "registerkey");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyIn(List<String> values) {
            addCriterion("registerkey in", values, "registerkey");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyNotIn(List<String> values) {
            addCriterion("registerkey not in", values, "registerkey");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyBetween(String value1, String value2) {
            addCriterion("registerkey between", value1, value2, "registerkey");
            return (Criteria) this;
        }

        public Criteria andRegisterkeyNotBetween(String value1, String value2) {
            addCriterion("registerkey not between", value1, value2, "registerkey");
            return (Criteria) this;
        }

        public Criteria andReplacekeyIsNull() {
            addCriterion("replacekey is null");
            return (Criteria) this;
        }

        public Criteria andReplacekeyIsNotNull() {
            addCriterion("replacekey is not null");
            return (Criteria) this;
        }

        public Criteria andReplacekeyEqualTo(String value) {
            addCriterion("replacekey =", value, "replacekey");
            return (Criteria) this;
        }

        public Criteria andReplacekeyNotEqualTo(String value) {
            addCriterion("replacekey <>", value, "replacekey");
            return (Criteria) this;
        }

        public Criteria andReplacekeyGreaterThan(String value) {
            addCriterion("replacekey >", value, "replacekey");
            return (Criteria) this;
        }

        public Criteria andReplacekeyGreaterThanOrEqualTo(String value) {
            addCriterion("replacekey >=", value, "replacekey");
            return (Criteria) this;
        }

        public Criteria andReplacekeyLessThan(String value) {
            addCriterion("replacekey <", value, "replacekey");
            return (Criteria) this;
        }

        public Criteria andReplacekeyLessThanOrEqualTo(String value) {
            addCriterion("replacekey <=", value, "replacekey");
            return (Criteria) this;
        }

        public Criteria andReplacekeyLike(String value) {
            addCriterion("replacekey like", value, "replacekey");
            return (Criteria) this;
        }

        public Criteria andReplacekeyNotLike(String value) {
            addCriterion("replacekey not like", value, "replacekey");
            return (Criteria) this;
        }

        public Criteria andReplacekeyIn(List<String> values) {
            addCriterion("replacekey in", values, "replacekey");
            return (Criteria) this;
        }

        public Criteria andReplacekeyNotIn(List<String> values) {
            addCriterion("replacekey not in", values, "replacekey");
            return (Criteria) this;
        }

        public Criteria andReplacekeyBetween(String value1, String value2) {
            addCriterion("replacekey between", value1, value2, "replacekey");
            return (Criteria) this;
        }

        public Criteria andReplacekeyNotBetween(String value1, String value2) {
            addCriterion("replacekey not between", value1, value2, "replacekey");
            return (Criteria) this;
        }

        public Criteria andRainbowscoreIsNull() {
            addCriterion("rainbowscore is null");
            return (Criteria) this;
        }

        public Criteria andRainbowscoreIsNotNull() {
            addCriterion("rainbowscore is not null");
            return (Criteria) this;
        }

        public Criteria andRainbowscoreEqualTo(Integer value) {
            addCriterion("rainbowscore =", value, "rainbowscore");
            return (Criteria) this;
        }

        public Criteria andRainbowscoreNotEqualTo(Integer value) {
            addCriterion("rainbowscore <>", value, "rainbowscore");
            return (Criteria) this;
        }

        public Criteria andRainbowscoreGreaterThan(Integer value) {
            addCriterion("rainbowscore >", value, "rainbowscore");
            return (Criteria) this;
        }

        public Criteria andRainbowscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("rainbowscore >=", value, "rainbowscore");
            return (Criteria) this;
        }

        public Criteria andRainbowscoreLessThan(Integer value) {
            addCriterion("rainbowscore <", value, "rainbowscore");
            return (Criteria) this;
        }

        public Criteria andRainbowscoreLessThanOrEqualTo(Integer value) {
            addCriterion("rainbowscore <=", value, "rainbowscore");
            return (Criteria) this;
        }

        public Criteria andRainbowscoreIn(List<Integer> values) {
            addCriterion("rainbowscore in", values, "rainbowscore");
            return (Criteria) this;
        }

        public Criteria andRainbowscoreNotIn(List<Integer> values) {
            addCriterion("rainbowscore not in", values, "rainbowscore");
            return (Criteria) this;
        }

        public Criteria andRainbowscoreBetween(Integer value1, Integer value2) {
            addCriterion("rainbowscore between", value1, value2, "rainbowscore");
            return (Criteria) this;
        }

        public Criteria andRainbowscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("rainbowscore not between", value1, value2, "rainbowscore");
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