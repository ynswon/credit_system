package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class schedule_creditorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public schedule_creditorExample() {
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

        public Criteria andFundingIdxIsNull() {
            addCriterion("funding_idx is null");
            return (Criteria) this;
        }

        public Criteria andFundingIdxIsNotNull() {
            addCriterion("funding_idx is not null");
            return (Criteria) this;
        }

        public Criteria andFundingIdxEqualTo(Integer value) {
            addCriterion("funding_idx =", value, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxNotEqualTo(Integer value) {
            addCriterion("funding_idx <>", value, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxGreaterThan(Integer value) {
            addCriterion("funding_idx >", value, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("funding_idx >=", value, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxLessThan(Integer value) {
            addCriterion("funding_idx <", value, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxLessThanOrEqualTo(Integer value) {
            addCriterion("funding_idx <=", value, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxIn(List<Integer> values) {
            addCriterion("funding_idx in", values, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxNotIn(List<Integer> values) {
            addCriterion("funding_idx not in", values, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxBetween(Integer value1, Integer value2) {
            addCriterion("funding_idx between", value1, value2, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andFundingIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("funding_idx not between", value1, value2, "fundingIdx");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Integer value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Integer value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Integer value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Integer value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Integer value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Integer> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Integer> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Integer value1, Integer value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalBeforeTaxIsNull() {
            addCriterion("principal_before_tax is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalBeforeTaxIsNotNull() {
            addCriterion("principal_before_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalBeforeTaxEqualTo(Integer value) {
            addCriterion("principal_before_tax =", value, "principalBeforeTax");
            return (Criteria) this;
        }

        public Criteria andPrincipalBeforeTaxNotEqualTo(Integer value) {
            addCriterion("principal_before_tax <>", value, "principalBeforeTax");
            return (Criteria) this;
        }

        public Criteria andPrincipalBeforeTaxGreaterThan(Integer value) {
            addCriterion("principal_before_tax >", value, "principalBeforeTax");
            return (Criteria) this;
        }

        public Criteria andPrincipalBeforeTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("principal_before_tax >=", value, "principalBeforeTax");
            return (Criteria) this;
        }

        public Criteria andPrincipalBeforeTaxLessThan(Integer value) {
            addCriterion("principal_before_tax <", value, "principalBeforeTax");
            return (Criteria) this;
        }

        public Criteria andPrincipalBeforeTaxLessThanOrEqualTo(Integer value) {
            addCriterion("principal_before_tax <=", value, "principalBeforeTax");
            return (Criteria) this;
        }

        public Criteria andPrincipalBeforeTaxIn(List<Integer> values) {
            addCriterion("principal_before_tax in", values, "principalBeforeTax");
            return (Criteria) this;
        }

        public Criteria andPrincipalBeforeTaxNotIn(List<Integer> values) {
            addCriterion("principal_before_tax not in", values, "principalBeforeTax");
            return (Criteria) this;
        }

        public Criteria andPrincipalBeforeTaxBetween(Integer value1, Integer value2) {
            addCriterion("principal_before_tax between", value1, value2, "principalBeforeTax");
            return (Criteria) this;
        }

        public Criteria andPrincipalBeforeTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("principal_before_tax not between", value1, value2, "principalBeforeTax");
            return (Criteria) this;
        }

        public Criteria andInterestBeforeTaxIsNull() {
            addCriterion("interest_before_tax is null");
            return (Criteria) this;
        }

        public Criteria andInterestBeforeTaxIsNotNull() {
            addCriterion("interest_before_tax is not null");
            return (Criteria) this;
        }

        public Criteria andInterestBeforeTaxEqualTo(Integer value) {
            addCriterion("interest_before_tax =", value, "interestBeforeTax");
            return (Criteria) this;
        }

        public Criteria andInterestBeforeTaxNotEqualTo(Integer value) {
            addCriterion("interest_before_tax <>", value, "interestBeforeTax");
            return (Criteria) this;
        }

        public Criteria andInterestBeforeTaxGreaterThan(Integer value) {
            addCriterion("interest_before_tax >", value, "interestBeforeTax");
            return (Criteria) this;
        }

        public Criteria andInterestBeforeTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("interest_before_tax >=", value, "interestBeforeTax");
            return (Criteria) this;
        }

        public Criteria andInterestBeforeTaxLessThan(Integer value) {
            addCriterion("interest_before_tax <", value, "interestBeforeTax");
            return (Criteria) this;
        }

        public Criteria andInterestBeforeTaxLessThanOrEqualTo(Integer value) {
            addCriterion("interest_before_tax <=", value, "interestBeforeTax");
            return (Criteria) this;
        }

        public Criteria andInterestBeforeTaxIn(List<Integer> values) {
            addCriterion("interest_before_tax in", values, "interestBeforeTax");
            return (Criteria) this;
        }

        public Criteria andInterestBeforeTaxNotIn(List<Integer> values) {
            addCriterion("interest_before_tax not in", values, "interestBeforeTax");
            return (Criteria) this;
        }

        public Criteria andInterestBeforeTaxBetween(Integer value1, Integer value2) {
            addCriterion("interest_before_tax between", value1, value2, "interestBeforeTax");
            return (Criteria) this;
        }

        public Criteria andInterestBeforeTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("interest_before_tax not between", value1, value2, "interestBeforeTax");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBeforeIsNull() {
            addCriterion("overdue_interest_before is null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBeforeIsNotNull() {
            addCriterion("overdue_interest_before is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBeforeEqualTo(Integer value) {
            addCriterion("overdue_interest_before =", value, "overdueInterestBefore");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBeforeNotEqualTo(Integer value) {
            addCriterion("overdue_interest_before <>", value, "overdueInterestBefore");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBeforeGreaterThan(Integer value) {
            addCriterion("overdue_interest_before >", value, "overdueInterestBefore");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_interest_before >=", value, "overdueInterestBefore");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBeforeLessThan(Integer value) {
            addCriterion("overdue_interest_before <", value, "overdueInterestBefore");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBeforeLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_interest_before <=", value, "overdueInterestBefore");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBeforeIn(List<Integer> values) {
            addCriterion("overdue_interest_before in", values, "overdueInterestBefore");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBeforeNotIn(List<Integer> values) {
            addCriterion("overdue_interest_before not in", values, "overdueInterestBefore");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBeforeBetween(Integer value1, Integer value2) {
            addCriterion("overdue_interest_before between", value1, value2, "overdueInterestBefore");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_interest_before not between", value1, value2, "overdueInterestBefore");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(Integer value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(Integer value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(Integer value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(Integer value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(Integer value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<Integer> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<Integer> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(Integer value1, Integer value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNationalIsNull() {
            addCriterion("tax_national is null");
            return (Criteria) this;
        }

        public Criteria andTaxNationalIsNotNull() {
            addCriterion("tax_national is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNationalEqualTo(Integer value) {
            addCriterion("tax_national =", value, "taxNational");
            return (Criteria) this;
        }

        public Criteria andTaxNationalNotEqualTo(Integer value) {
            addCriterion("tax_national <>", value, "taxNational");
            return (Criteria) this;
        }

        public Criteria andTaxNationalGreaterThan(Integer value) {
            addCriterion("tax_national >", value, "taxNational");
            return (Criteria) this;
        }

        public Criteria andTaxNationalGreaterThanOrEqualTo(Integer value) {
            addCriterion("tax_national >=", value, "taxNational");
            return (Criteria) this;
        }

        public Criteria andTaxNationalLessThan(Integer value) {
            addCriterion("tax_national <", value, "taxNational");
            return (Criteria) this;
        }

        public Criteria andTaxNationalLessThanOrEqualTo(Integer value) {
            addCriterion("tax_national <=", value, "taxNational");
            return (Criteria) this;
        }

        public Criteria andTaxNationalIn(List<Integer> values) {
            addCriterion("tax_national in", values, "taxNational");
            return (Criteria) this;
        }

        public Criteria andTaxNationalNotIn(List<Integer> values) {
            addCriterion("tax_national not in", values, "taxNational");
            return (Criteria) this;
        }

        public Criteria andTaxNationalBetween(Integer value1, Integer value2) {
            addCriterion("tax_national between", value1, value2, "taxNational");
            return (Criteria) this;
        }

        public Criteria andTaxNationalNotBetween(Integer value1, Integer value2) {
            addCriterion("tax_national not between", value1, value2, "taxNational");
            return (Criteria) this;
        }

        public Criteria andTaxLocalIsNull() {
            addCriterion("tax_local is null");
            return (Criteria) this;
        }

        public Criteria andTaxLocalIsNotNull() {
            addCriterion("tax_local is not null");
            return (Criteria) this;
        }

        public Criteria andTaxLocalEqualTo(Integer value) {
            addCriterion("tax_local =", value, "taxLocal");
            return (Criteria) this;
        }

        public Criteria andTaxLocalNotEqualTo(Integer value) {
            addCriterion("tax_local <>", value, "taxLocal");
            return (Criteria) this;
        }

        public Criteria andTaxLocalGreaterThan(Integer value) {
            addCriterion("tax_local >", value, "taxLocal");
            return (Criteria) this;
        }

        public Criteria andTaxLocalGreaterThanOrEqualTo(Integer value) {
            addCriterion("tax_local >=", value, "taxLocal");
            return (Criteria) this;
        }

        public Criteria andTaxLocalLessThan(Integer value) {
            addCriterion("tax_local <", value, "taxLocal");
            return (Criteria) this;
        }

        public Criteria andTaxLocalLessThanOrEqualTo(Integer value) {
            addCriterion("tax_local <=", value, "taxLocal");
            return (Criteria) this;
        }

        public Criteria andTaxLocalIn(List<Integer> values) {
            addCriterion("tax_local in", values, "taxLocal");
            return (Criteria) this;
        }

        public Criteria andTaxLocalNotIn(List<Integer> values) {
            addCriterion("tax_local not in", values, "taxLocal");
            return (Criteria) this;
        }

        public Criteria andTaxLocalBetween(Integer value1, Integer value2) {
            addCriterion("tax_local between", value1, value2, "taxLocal");
            return (Criteria) this;
        }

        public Criteria andTaxLocalNotBetween(Integer value1, Integer value2) {
            addCriterion("tax_local not between", value1, value2, "taxLocal");
            return (Criteria) this;
        }

        public Criteria andPaybackPresentIdxIsNull() {
            addCriterion("payback_present_idx is null");
            return (Criteria) this;
        }

        public Criteria andPaybackPresentIdxIsNotNull() {
            addCriterion("payback_present_idx is not null");
            return (Criteria) this;
        }

        public Criteria andPaybackPresentIdxEqualTo(Integer value) {
            addCriterion("payback_present_idx =", value, "paybackPresentIdx");
            return (Criteria) this;
        }

        public Criteria andPaybackPresentIdxNotEqualTo(Integer value) {
            addCriterion("payback_present_idx <>", value, "paybackPresentIdx");
            return (Criteria) this;
        }

        public Criteria andPaybackPresentIdxGreaterThan(Integer value) {
            addCriterion("payback_present_idx >", value, "paybackPresentIdx");
            return (Criteria) this;
        }

        public Criteria andPaybackPresentIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("payback_present_idx >=", value, "paybackPresentIdx");
            return (Criteria) this;
        }

        public Criteria andPaybackPresentIdxLessThan(Integer value) {
            addCriterion("payback_present_idx <", value, "paybackPresentIdx");
            return (Criteria) this;
        }

        public Criteria andPaybackPresentIdxLessThanOrEqualTo(Integer value) {
            addCriterion("payback_present_idx <=", value, "paybackPresentIdx");
            return (Criteria) this;
        }

        public Criteria andPaybackPresentIdxIn(List<Integer> values) {
            addCriterion("payback_present_idx in", values, "paybackPresentIdx");
            return (Criteria) this;
        }

        public Criteria andPaybackPresentIdxNotIn(List<Integer> values) {
            addCriterion("payback_present_idx not in", values, "paybackPresentIdx");
            return (Criteria) this;
        }

        public Criteria andPaybackPresentIdxBetween(Integer value1, Integer value2) {
            addCriterion("payback_present_idx between", value1, value2, "paybackPresentIdx");
            return (Criteria) this;
        }

        public Criteria andPaybackPresentIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("payback_present_idx not between", value1, value2, "paybackPresentIdx");
            return (Criteria) this;
        }

        public Criteria andPaybackTotalTimesIsNull() {
            addCriterion("payback_total_times is null");
            return (Criteria) this;
        }

        public Criteria andPaybackTotalTimesIsNotNull() {
            addCriterion("payback_total_times is not null");
            return (Criteria) this;
        }

        public Criteria andPaybackTotalTimesEqualTo(Integer value) {
            addCriterion("payback_total_times =", value, "paybackTotalTimes");
            return (Criteria) this;
        }

        public Criteria andPaybackTotalTimesNotEqualTo(Integer value) {
            addCriterion("payback_total_times <>", value, "paybackTotalTimes");
            return (Criteria) this;
        }

        public Criteria andPaybackTotalTimesGreaterThan(Integer value) {
            addCriterion("payback_total_times >", value, "paybackTotalTimes");
            return (Criteria) this;
        }

        public Criteria andPaybackTotalTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("payback_total_times >=", value, "paybackTotalTimes");
            return (Criteria) this;
        }

        public Criteria andPaybackTotalTimesLessThan(Integer value) {
            addCriterion("payback_total_times <", value, "paybackTotalTimes");
            return (Criteria) this;
        }

        public Criteria andPaybackTotalTimesLessThanOrEqualTo(Integer value) {
            addCriterion("payback_total_times <=", value, "paybackTotalTimes");
            return (Criteria) this;
        }

        public Criteria andPaybackTotalTimesIn(List<Integer> values) {
            addCriterion("payback_total_times in", values, "paybackTotalTimes");
            return (Criteria) this;
        }

        public Criteria andPaybackTotalTimesNotIn(List<Integer> values) {
            addCriterion("payback_total_times not in", values, "paybackTotalTimes");
            return (Criteria) this;
        }

        public Criteria andPaybackTotalTimesBetween(Integer value1, Integer value2) {
            addCriterion("payback_total_times between", value1, value2, "paybackTotalTimes");
            return (Criteria) this;
        }

        public Criteria andPaybackTotalTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("payback_total_times not between", value1, value2, "paybackTotalTimes");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNull() {
            addCriterion("due_date is null");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNotNull() {
            addCriterion("due_date is not null");
            return (Criteria) this;
        }

        public Criteria andDueDateEqualTo(Date value) {
            addCriterionForJDBCDate("due_date =", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("due_date <>", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThan(Date value) {
            addCriterionForJDBCDate("due_date >", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("due_date >=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThan(Date value) {
            addCriterionForJDBCDate("due_date <", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("due_date <=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIn(List<Date> values) {
            addCriterionForJDBCDate("due_date in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("due_date not in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("due_date between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("due_date not between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusIsNull() {
            addCriterion("repayment_status is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusIsNotNull() {
            addCriterion("repayment_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusEqualTo(String value) {
            addCriterion("repayment_status =", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotEqualTo(String value) {
            addCriterion("repayment_status <>", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusGreaterThan(String value) {
            addCriterion("repayment_status >", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_status >=", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusLessThan(String value) {
            addCriterion("repayment_status <", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusLessThanOrEqualTo(String value) {
            addCriterion("repayment_status <=", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusLike(String value) {
            addCriterion("repayment_status like", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotLike(String value) {
            addCriterion("repayment_status not like", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusIn(List<String> values) {
            addCriterion("repayment_status in", values, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotIn(List<String> values) {
            addCriterion("repayment_status not in", values, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusBetween(String value1, String value2) {
            addCriterion("repayment_status between", value1, value2, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotBetween(String value1, String value2) {
            addCriterion("repayment_status not between", value1, value2, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusIsNull() {
            addCriterion("transfer_status is null");
            return (Criteria) this;
        }

        public Criteria andTransferStatusIsNotNull() {
            addCriterion("transfer_status is not null");
            return (Criteria) this;
        }

        public Criteria andTransferStatusEqualTo(Integer value) {
            addCriterion("transfer_status =", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotEqualTo(Integer value) {
            addCriterion("transfer_status <>", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusGreaterThan(Integer value) {
            addCriterion("transfer_status >", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("transfer_status >=", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusLessThan(Integer value) {
            addCriterion("transfer_status <", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusLessThanOrEqualTo(Integer value) {
            addCriterion("transfer_status <=", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusIn(List<Integer> values) {
            addCriterion("transfer_status in", values, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotIn(List<Integer> values) {
            addCriterion("transfer_status not in", values, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusBetween(Integer value1, Integer value2) {
            addCriterion("transfer_status between", value1, value2, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("transfer_status not between", value1, value2, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferCountIsNull() {
            addCriterion("transfer_count is null");
            return (Criteria) this;
        }

        public Criteria andTransferCountIsNotNull() {
            addCriterion("transfer_count is not null");
            return (Criteria) this;
        }

        public Criteria andTransferCountEqualTo(Integer value) {
            addCriterion("transfer_count =", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountNotEqualTo(Integer value) {
            addCriterion("transfer_count <>", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountGreaterThan(Integer value) {
            addCriterion("transfer_count >", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("transfer_count >=", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountLessThan(Integer value) {
            addCriterion("transfer_count <", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountLessThanOrEqualTo(Integer value) {
            addCriterion("transfer_count <=", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountIn(List<Integer> values) {
            addCriterion("transfer_count in", values, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountNotIn(List<Integer> values) {
            addCriterion("transfer_count not in", values, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountBetween(Integer value1, Integer value2) {
            addCriterion("transfer_count between", value1, value2, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountNotBetween(Integer value1, Integer value2) {
            addCriterion("transfer_count not between", value1, value2, "transferCount");
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