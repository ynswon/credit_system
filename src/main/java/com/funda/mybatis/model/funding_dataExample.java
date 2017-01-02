package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class funding_dataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public funding_dataExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNull() {
            addCriterion("visible is null");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNotNull() {
            addCriterion("visible is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleEqualTo(Integer value) {
            addCriterion("visible =", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotEqualTo(Integer value) {
            addCriterion("visible <>", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThan(Integer value) {
            addCriterion("visible >", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThanOrEqualTo(Integer value) {
            addCriterion("visible >=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThan(Integer value) {
            addCriterion("visible <", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThanOrEqualTo(Integer value) {
            addCriterion("visible <=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleIn(List<Integer> values) {
            addCriterion("visible in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotIn(List<Integer> values) {
            addCriterion("visible not in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleBetween(Integer value1, Integer value2) {
            addCriterion("visible between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotBetween(Integer value1, Integer value2) {
            addCriterion("visible not between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andExtApiOpenIsNull() {
            addCriterion("ext_api_open is null");
            return (Criteria) this;
        }

        public Criteria andExtApiOpenIsNotNull() {
            addCriterion("ext_api_open is not null");
            return (Criteria) this;
        }

        public Criteria andExtApiOpenEqualTo(Integer value) {
            addCriterion("ext_api_open =", value, "extApiOpen");
            return (Criteria) this;
        }

        public Criteria andExtApiOpenNotEqualTo(Integer value) {
            addCriterion("ext_api_open <>", value, "extApiOpen");
            return (Criteria) this;
        }

        public Criteria andExtApiOpenGreaterThan(Integer value) {
            addCriterion("ext_api_open >", value, "extApiOpen");
            return (Criteria) this;
        }

        public Criteria andExtApiOpenGreaterThanOrEqualTo(Integer value) {
            addCriterion("ext_api_open >=", value, "extApiOpen");
            return (Criteria) this;
        }

        public Criteria andExtApiOpenLessThan(Integer value) {
            addCriterion("ext_api_open <", value, "extApiOpen");
            return (Criteria) this;
        }

        public Criteria andExtApiOpenLessThanOrEqualTo(Integer value) {
            addCriterion("ext_api_open <=", value, "extApiOpen");
            return (Criteria) this;
        }

        public Criteria andExtApiOpenIn(List<Integer> values) {
            addCriterion("ext_api_open in", values, "extApiOpen");
            return (Criteria) this;
        }

        public Criteria andExtApiOpenNotIn(List<Integer> values) {
            addCriterion("ext_api_open not in", values, "extApiOpen");
            return (Criteria) this;
        }

        public Criteria andExtApiOpenBetween(Integer value1, Integer value2) {
            addCriterion("ext_api_open between", value1, value2, "extApiOpen");
            return (Criteria) this;
        }

        public Criteria andExtApiOpenNotBetween(Integer value1, Integer value2) {
            addCriterion("ext_api_open not between", value1, value2, "extApiOpen");
            return (Criteria) this;
        }

        public Criteria andAnnouncedAmountIsNull() {
            addCriterion("announced_amount is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncedAmountIsNotNull() {
            addCriterion("announced_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncedAmountEqualTo(Integer value) {
            addCriterion("announced_amount =", value, "announcedAmount");
            return (Criteria) this;
        }

        public Criteria andAnnouncedAmountNotEqualTo(Integer value) {
            addCriterion("announced_amount <>", value, "announcedAmount");
            return (Criteria) this;
        }

        public Criteria andAnnouncedAmountGreaterThan(Integer value) {
            addCriterion("announced_amount >", value, "announcedAmount");
            return (Criteria) this;
        }

        public Criteria andAnnouncedAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("announced_amount >=", value, "announcedAmount");
            return (Criteria) this;
        }

        public Criteria andAnnouncedAmountLessThan(Integer value) {
            addCriterion("announced_amount <", value, "announcedAmount");
            return (Criteria) this;
        }

        public Criteria andAnnouncedAmountLessThanOrEqualTo(Integer value) {
            addCriterion("announced_amount <=", value, "announcedAmount");
            return (Criteria) this;
        }

        public Criteria andAnnouncedAmountIn(List<Integer> values) {
            addCriterion("announced_amount in", values, "announcedAmount");
            return (Criteria) this;
        }

        public Criteria andAnnouncedAmountNotIn(List<Integer> values) {
            addCriterion("announced_amount not in", values, "announcedAmount");
            return (Criteria) this;
        }

        public Criteria andAnnouncedAmountBetween(Integer value1, Integer value2) {
            addCriterion("announced_amount between", value1, value2, "announcedAmount");
            return (Criteria) this;
        }

        public Criteria andAnnouncedAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("announced_amount not between", value1, value2, "announcedAmount");
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

        public Criteria andMaxInvestAmountIsNull() {
            addCriterion("max_invest_amount is null");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountIsNotNull() {
            addCriterion("max_invest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountEqualTo(Integer value) {
            addCriterion("max_invest_amount =", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountNotEqualTo(Integer value) {
            addCriterion("max_invest_amount <>", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountGreaterThan(Integer value) {
            addCriterion("max_invest_amount >", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_invest_amount >=", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountLessThan(Integer value) {
            addCriterion("max_invest_amount <", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountLessThanOrEqualTo(Integer value) {
            addCriterion("max_invest_amount <=", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountIn(List<Integer> values) {
            addCriterion("max_invest_amount in", values, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountNotIn(List<Integer> values) {
            addCriterion("max_invest_amount not in", values, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountBetween(Integer value1, Integer value2) {
            addCriterion("max_invest_amount between", value1, value2, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("max_invest_amount not between", value1, value2, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGraceIsNull() {
            addCriterion("monthly_repayment_grace is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGraceIsNotNull() {
            addCriterion("monthly_repayment_grace is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGraceEqualTo(Integer value) {
            addCriterion("monthly_repayment_grace =", value, "monthlyRepaymentGrace");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGraceNotEqualTo(Integer value) {
            addCriterion("monthly_repayment_grace <>", value, "monthlyRepaymentGrace");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGraceGreaterThan(Integer value) {
            addCriterion("monthly_repayment_grace >", value, "monthlyRepaymentGrace");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGraceGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_repayment_grace >=", value, "monthlyRepaymentGrace");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGraceLessThan(Integer value) {
            addCriterion("monthly_repayment_grace <", value, "monthlyRepaymentGrace");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGraceLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_repayment_grace <=", value, "monthlyRepaymentGrace");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGraceIn(List<Integer> values) {
            addCriterion("monthly_repayment_grace in", values, "monthlyRepaymentGrace");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGraceNotIn(List<Integer> values) {
            addCriterion("monthly_repayment_grace not in", values, "monthlyRepaymentGrace");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGraceBetween(Integer value1, Integer value2) {
            addCriterion("monthly_repayment_grace between", value1, value2, "monthlyRepaymentGrace");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGraceNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_repayment_grace not between", value1, value2, "monthlyRepaymentGrace");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentIsNull() {
            addCriterion("monthly_repayment is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentIsNotNull() {
            addCriterion("monthly_repayment is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentEqualTo(Integer value) {
            addCriterion("monthly_repayment =", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentNotEqualTo(Integer value) {
            addCriterion("monthly_repayment <>", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGreaterThan(Integer value) {
            addCriterion("monthly_repayment >", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_repayment >=", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentLessThan(Integer value) {
            addCriterion("monthly_repayment <", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_repayment <=", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentIn(List<Integer> values) {
            addCriterion("monthly_repayment in", values, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentNotIn(List<Integer> values) {
            addCriterion("monthly_repayment not in", values, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentBetween(Integer value1, Integer value2) {
            addCriterion("monthly_repayment between", value1, value2, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_repayment not between", value1, value2, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNull() {
            addCriterion("interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNotNull() {
            addCriterion("interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateEqualTo(Float value) {
            addCriterion("interest_rate =", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotEqualTo(Float value) {
            addCriterion("interest_rate <>", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThan(Float value) {
            addCriterion("interest_rate >", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThanOrEqualTo(Float value) {
            addCriterion("interest_rate >=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThan(Float value) {
            addCriterion("interest_rate <", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThanOrEqualTo(Float value) {
            addCriterion("interest_rate <=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateIn(List<Float> values) {
            addCriterion("interest_rate in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotIn(List<Float> values) {
            addCriterion("interest_rate not in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateBetween(Float value1, Float value2) {
            addCriterion("interest_rate between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotBetween(Float value1, Float value2) {
            addCriterion("interest_rate not between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andAccruedInterestRateIsNull() {
            addCriterion("accrued_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andAccruedInterestRateIsNotNull() {
            addCriterion("accrued_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAccruedInterestRateEqualTo(Float value) {
            addCriterion("accrued_interest_rate =", value, "accruedInterestRate");
            return (Criteria) this;
        }

        public Criteria andAccruedInterestRateNotEqualTo(Float value) {
            addCriterion("accrued_interest_rate <>", value, "accruedInterestRate");
            return (Criteria) this;
        }

        public Criteria andAccruedInterestRateGreaterThan(Float value) {
            addCriterion("accrued_interest_rate >", value, "accruedInterestRate");
            return (Criteria) this;
        }

        public Criteria andAccruedInterestRateGreaterThanOrEqualTo(Float value) {
            addCriterion("accrued_interest_rate >=", value, "accruedInterestRate");
            return (Criteria) this;
        }

        public Criteria andAccruedInterestRateLessThan(Float value) {
            addCriterion("accrued_interest_rate <", value, "accruedInterestRate");
            return (Criteria) this;
        }

        public Criteria andAccruedInterestRateLessThanOrEqualTo(Float value) {
            addCriterion("accrued_interest_rate <=", value, "accruedInterestRate");
            return (Criteria) this;
        }

        public Criteria andAccruedInterestRateIn(List<Float> values) {
            addCriterion("accrued_interest_rate in", values, "accruedInterestRate");
            return (Criteria) this;
        }

        public Criteria andAccruedInterestRateNotIn(List<Float> values) {
            addCriterion("accrued_interest_rate not in", values, "accruedInterestRate");
            return (Criteria) this;
        }

        public Criteria andAccruedInterestRateBetween(Float value1, Float value2) {
            addCriterion("accrued_interest_rate between", value1, value2, "accruedInterestRate");
            return (Criteria) this;
        }

        public Criteria andAccruedInterestRateNotBetween(Float value1, Float value2) {
            addCriterion("accrued_interest_rate not between", value1, value2, "accruedInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateIsNull() {
            addCriterion("funda_support_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateIsNotNull() {
            addCriterion("funda_support_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateEqualTo(Float value) {
            addCriterion("funda_support_interest_rate =", value, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateNotEqualTo(Float value) {
            addCriterion("funda_support_interest_rate <>", value, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateGreaterThan(Float value) {
            addCriterion("funda_support_interest_rate >", value, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateGreaterThanOrEqualTo(Float value) {
            addCriterion("funda_support_interest_rate >=", value, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateLessThan(Float value) {
            addCriterion("funda_support_interest_rate <", value, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateLessThanOrEqualTo(Float value) {
            addCriterion("funda_support_interest_rate <=", value, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateIn(List<Float> values) {
            addCriterion("funda_support_interest_rate in", values, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateNotIn(List<Float> values) {
            addCriterion("funda_support_interest_rate not in", values, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateBetween(Float value1, Float value2) {
            addCriterion("funda_support_interest_rate between", value1, value2, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andFundaSupportInterestRateNotBetween(Float value1, Float value2) {
            addCriterion("funda_support_interest_rate not between", value1, value2, "fundaSupportInterestRate");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodIsNull() {
            addCriterion("repayment_method is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodIsNotNull() {
            addCriterion("repayment_method is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodEqualTo(String value) {
            addCriterion("repayment_method =", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodNotEqualTo(String value) {
            addCriterion("repayment_method <>", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodGreaterThan(String value) {
            addCriterion("repayment_method >", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_method >=", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodLessThan(String value) {
            addCriterion("repayment_method <", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("repayment_method <=", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodLike(String value) {
            addCriterion("repayment_method like", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodNotLike(String value) {
            addCriterion("repayment_method not like", value, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodIn(List<String> values) {
            addCriterion("repayment_method in", values, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodNotIn(List<String> values) {
            addCriterion("repayment_method not in", values, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodBetween(String value1, String value2) {
            addCriterion("repayment_method between", value1, value2, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRepaymentMethodNotBetween(String value1, String value2) {
            addCriterion("repayment_method not between", value1, value2, "repaymentMethod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNull() {
            addCriterion("loan_period is null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNotNull() {
            addCriterion("loan_period is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodEqualTo(Integer value) {
            addCriterion("loan_period =", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotEqualTo(Integer value) {
            addCriterion("loan_period <>", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThan(Integer value) {
            addCriterion("loan_period >", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_period >=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThan(Integer value) {
            addCriterion("loan_period <", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("loan_period <=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIn(List<Integer> values) {
            addCriterion("loan_period in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotIn(List<Integer> values) {
            addCriterion("loan_period not in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodBetween(Integer value1, Integer value2) {
            addCriterion("loan_period between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_period not between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodIsNull() {
            addCriterion("grace_period is null");
            return (Criteria) this;
        }

        public Criteria andGracePeriodIsNotNull() {
            addCriterion("grace_period is not null");
            return (Criteria) this;
        }

        public Criteria andGracePeriodEqualTo(Integer value) {
            addCriterion("grace_period =", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodNotEqualTo(Integer value) {
            addCriterion("grace_period <>", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodGreaterThan(Integer value) {
            addCriterion("grace_period >", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("grace_period >=", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodLessThan(Integer value) {
            addCriterion("grace_period <", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodLessThanOrEqualTo(Integer value) {
            addCriterion("grace_period <=", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodIn(List<Integer> values) {
            addCriterion("grace_period in", values, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodNotIn(List<Integer> values) {
            addCriterion("grace_period not in", values, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodBetween(Integer value1, Integer value2) {
            addCriterion("grace_period between", value1, value2, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("grace_period not between", value1, value2, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andContractDateIsNull() {
            addCriterion("contract_date is null");
            return (Criteria) this;
        }

        public Criteria andContractDateIsNotNull() {
            addCriterion("contract_date is not null");
            return (Criteria) this;
        }

        public Criteria andContractDateEqualTo(Date value) {
            addCriterionForJDBCDate("contract_date =", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("contract_date <>", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateGreaterThan(Date value) {
            addCriterionForJDBCDate("contract_date >", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contract_date >=", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateLessThan(Date value) {
            addCriterionForJDBCDate("contract_date <", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contract_date <=", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateIn(List<Date> values) {
            addCriterionForJDBCDate("contract_date in", values, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("contract_date not in", values, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contract_date between", value1, value2, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contract_date not between", value1, value2, "contractDate");
            return (Criteria) this;
        }

        public Criteria andBeginningDateIsNull() {
            addCriterion("beginning_date is null");
            return (Criteria) this;
        }

        public Criteria andBeginningDateIsNotNull() {
            addCriterion("beginning_date is not null");
            return (Criteria) this;
        }

        public Criteria andBeginningDateEqualTo(Date value) {
            addCriterionForJDBCDate("beginning_date =", value, "beginningDate");
            return (Criteria) this;
        }

        public Criteria andBeginningDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("beginning_date <>", value, "beginningDate");
            return (Criteria) this;
        }

        public Criteria andBeginningDateGreaterThan(Date value) {
            addCriterionForJDBCDate("beginning_date >", value, "beginningDate");
            return (Criteria) this;
        }

        public Criteria andBeginningDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("beginning_date >=", value, "beginningDate");
            return (Criteria) this;
        }

        public Criteria andBeginningDateLessThan(Date value) {
            addCriterionForJDBCDate("beginning_date <", value, "beginningDate");
            return (Criteria) this;
        }

        public Criteria andBeginningDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("beginning_date <=", value, "beginningDate");
            return (Criteria) this;
        }

        public Criteria andBeginningDateIn(List<Date> values) {
            addCriterionForJDBCDate("beginning_date in", values, "beginningDate");
            return (Criteria) this;
        }

        public Criteria andBeginningDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("beginning_date not in", values, "beginningDate");
            return (Criteria) this;
        }

        public Criteria andBeginningDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("beginning_date between", value1, value2, "beginningDate");
            return (Criteria) this;
        }

        public Criteria andBeginningDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("beginning_date not between", value1, value2, "beginningDate");
            return (Criteria) this;
        }

        public Criteria andInterestDateIsNull() {
            addCriterion("interest_date is null");
            return (Criteria) this;
        }

        public Criteria andInterestDateIsNotNull() {
            addCriterion("interest_date is not null");
            return (Criteria) this;
        }

        public Criteria andInterestDateEqualTo(Date value) {
            addCriterionForJDBCDate("interest_date =", value, "interestDate");
            return (Criteria) this;
        }

        public Criteria andInterestDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("interest_date <>", value, "interestDate");
            return (Criteria) this;
        }

        public Criteria andInterestDateGreaterThan(Date value) {
            addCriterionForJDBCDate("interest_date >", value, "interestDate");
            return (Criteria) this;
        }

        public Criteria andInterestDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("interest_date >=", value, "interestDate");
            return (Criteria) this;
        }

        public Criteria andInterestDateLessThan(Date value) {
            addCriterionForJDBCDate("interest_date <", value, "interestDate");
            return (Criteria) this;
        }

        public Criteria andInterestDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("interest_date <=", value, "interestDate");
            return (Criteria) this;
        }

        public Criteria andInterestDateIn(List<Date> values) {
            addCriterionForJDBCDate("interest_date in", values, "interestDate");
            return (Criteria) this;
        }

        public Criteria andInterestDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("interest_date not in", values, "interestDate");
            return (Criteria) this;
        }

        public Criteria andInterestDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("interest_date between", value1, value2, "interestDate");
            return (Criteria) this;
        }

        public Criteria andInterestDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("interest_date not between", value1, value2, "interestDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentDateIsNull() {
            addCriterion("monthly_repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentDateIsNotNull() {
            addCriterion("monthly_repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentDateEqualTo(Date value) {
            addCriterionForJDBCDate("monthly_repayment_date =", value, "monthlyRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("monthly_repayment_date <>", value, "monthlyRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("monthly_repayment_date >", value, "monthlyRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("monthly_repayment_date >=", value, "monthlyRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentDateLessThan(Date value) {
            addCriterionForJDBCDate("monthly_repayment_date <", value, "monthlyRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("monthly_repayment_date <=", value, "monthlyRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentDateIn(List<Date> values) {
            addCriterionForJDBCDate("monthly_repayment_date in", values, "monthlyRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("monthly_repayment_date not in", values, "monthlyRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("monthly_repayment_date between", value1, value2, "monthlyRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("monthly_repayment_date not between", value1, value2, "monthlyRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andDefaultRateIsNull() {
            addCriterion("default_rate is null");
            return (Criteria) this;
        }

        public Criteria andDefaultRateIsNotNull() {
            addCriterion("default_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultRateEqualTo(Float value) {
            addCriterion("default_rate =", value, "defaultRate");
            return (Criteria) this;
        }

        public Criteria andDefaultRateNotEqualTo(Float value) {
            addCriterion("default_rate <>", value, "defaultRate");
            return (Criteria) this;
        }

        public Criteria andDefaultRateGreaterThan(Float value) {
            addCriterion("default_rate >", value, "defaultRate");
            return (Criteria) this;
        }

        public Criteria andDefaultRateGreaterThanOrEqualTo(Float value) {
            addCriterion("default_rate >=", value, "defaultRate");
            return (Criteria) this;
        }

        public Criteria andDefaultRateLessThan(Float value) {
            addCriterion("default_rate <", value, "defaultRate");
            return (Criteria) this;
        }

        public Criteria andDefaultRateLessThanOrEqualTo(Float value) {
            addCriterion("default_rate <=", value, "defaultRate");
            return (Criteria) this;
        }

        public Criteria andDefaultRateIn(List<Float> values) {
            addCriterion("default_rate in", values, "defaultRate");
            return (Criteria) this;
        }

        public Criteria andDefaultRateNotIn(List<Float> values) {
            addCriterion("default_rate not in", values, "defaultRate");
            return (Criteria) this;
        }

        public Criteria andDefaultRateBetween(Float value1, Float value2) {
            addCriterion("default_rate between", value1, value2, "defaultRate");
            return (Criteria) this;
        }

        public Criteria andDefaultRateNotBetween(Float value1, Float value2) {
            addCriterion("default_rate not between", value1, value2, "defaultRate");
            return (Criteria) this;
        }

        public Criteria andNiceGradeIsNull() {
            addCriterion("nice_grade is null");
            return (Criteria) this;
        }

        public Criteria andNiceGradeIsNotNull() {
            addCriterion("nice_grade is not null");
            return (Criteria) this;
        }

        public Criteria andNiceGradeEqualTo(Integer value) {
            addCriterion("nice_grade =", value, "niceGrade");
            return (Criteria) this;
        }

        public Criteria andNiceGradeNotEqualTo(Integer value) {
            addCriterion("nice_grade <>", value, "niceGrade");
            return (Criteria) this;
        }

        public Criteria andNiceGradeGreaterThan(Integer value) {
            addCriterion("nice_grade >", value, "niceGrade");
            return (Criteria) this;
        }

        public Criteria andNiceGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nice_grade >=", value, "niceGrade");
            return (Criteria) this;
        }

        public Criteria andNiceGradeLessThan(Integer value) {
            addCriterion("nice_grade <", value, "niceGrade");
            return (Criteria) this;
        }

        public Criteria andNiceGradeLessThanOrEqualTo(Integer value) {
            addCriterion("nice_grade <=", value, "niceGrade");
            return (Criteria) this;
        }

        public Criteria andNiceGradeIn(List<Integer> values) {
            addCriterion("nice_grade in", values, "niceGrade");
            return (Criteria) this;
        }

        public Criteria andNiceGradeNotIn(List<Integer> values) {
            addCriterion("nice_grade not in", values, "niceGrade");
            return (Criteria) this;
        }

        public Criteria andNiceGradeBetween(Integer value1, Integer value2) {
            addCriterion("nice_grade between", value1, value2, "niceGrade");
            return (Criteria) this;
        }

        public Criteria andNiceGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("nice_grade not between", value1, value2, "niceGrade");
            return (Criteria) this;
        }

        public Criteria andNiceDefaultRateIsNull() {
            addCriterion("nice_default_rate is null");
            return (Criteria) this;
        }

        public Criteria andNiceDefaultRateIsNotNull() {
            addCriterion("nice_default_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNiceDefaultRateEqualTo(Float value) {
            addCriterion("nice_default_rate =", value, "niceDefaultRate");
            return (Criteria) this;
        }

        public Criteria andNiceDefaultRateNotEqualTo(Float value) {
            addCriterion("nice_default_rate <>", value, "niceDefaultRate");
            return (Criteria) this;
        }

        public Criteria andNiceDefaultRateGreaterThan(Float value) {
            addCriterion("nice_default_rate >", value, "niceDefaultRate");
            return (Criteria) this;
        }

        public Criteria andNiceDefaultRateGreaterThanOrEqualTo(Float value) {
            addCriterion("nice_default_rate >=", value, "niceDefaultRate");
            return (Criteria) this;
        }

        public Criteria andNiceDefaultRateLessThan(Float value) {
            addCriterion("nice_default_rate <", value, "niceDefaultRate");
            return (Criteria) this;
        }

        public Criteria andNiceDefaultRateLessThanOrEqualTo(Float value) {
            addCriterion("nice_default_rate <=", value, "niceDefaultRate");
            return (Criteria) this;
        }

        public Criteria andNiceDefaultRateIn(List<Float> values) {
            addCriterion("nice_default_rate in", values, "niceDefaultRate");
            return (Criteria) this;
        }

        public Criteria andNiceDefaultRateNotIn(List<Float> values) {
            addCriterion("nice_default_rate not in", values, "niceDefaultRate");
            return (Criteria) this;
        }

        public Criteria andNiceDefaultRateBetween(Float value1, Float value2) {
            addCriterion("nice_default_rate between", value1, value2, "niceDefaultRate");
            return (Criteria) this;
        }

        public Criteria andNiceDefaultRateNotBetween(Float value1, Float value2) {
            addCriterion("nice_default_rate not between", value1, value2, "niceDefaultRate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andDisclosureDateIsNull() {
            addCriterion("disclosure_date is null");
            return (Criteria) this;
        }

        public Criteria andDisclosureDateIsNotNull() {
            addCriterion("disclosure_date is not null");
            return (Criteria) this;
        }

        public Criteria andDisclosureDateEqualTo(Date value) {
            addCriterion("disclosure_date =", value, "disclosureDate");
            return (Criteria) this;
        }

        public Criteria andDisclosureDateNotEqualTo(Date value) {
            addCriterion("disclosure_date <>", value, "disclosureDate");
            return (Criteria) this;
        }

        public Criteria andDisclosureDateGreaterThan(Date value) {
            addCriterion("disclosure_date >", value, "disclosureDate");
            return (Criteria) this;
        }

        public Criteria andDisclosureDateGreaterThanOrEqualTo(Date value) {
            addCriterion("disclosure_date >=", value, "disclosureDate");
            return (Criteria) this;
        }

        public Criteria andDisclosureDateLessThan(Date value) {
            addCriterion("disclosure_date <", value, "disclosureDate");
            return (Criteria) this;
        }

        public Criteria andDisclosureDateLessThanOrEqualTo(Date value) {
            addCriterion("disclosure_date <=", value, "disclosureDate");
            return (Criteria) this;
        }

        public Criteria andDisclosureDateIn(List<Date> values) {
            addCriterion("disclosure_date in", values, "disclosureDate");
            return (Criteria) this;
        }

        public Criteria andDisclosureDateNotIn(List<Date> values) {
            addCriterion("disclosure_date not in", values, "disclosureDate");
            return (Criteria) this;
        }

        public Criteria andDisclosureDateBetween(Date value1, Date value2) {
            addCriterion("disclosure_date between", value1, value2, "disclosureDate");
            return (Criteria) this;
        }

        public Criteria andDisclosureDateNotBetween(Date value1, Date value2) {
            addCriterion("disclosure_date not between", value1, value2, "disclosureDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentStartDateIsNull() {
            addCriterion("investment_start_date is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentStartDateIsNotNull() {
            addCriterion("investment_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentStartDateEqualTo(Date value) {
            addCriterion("investment_start_date =", value, "investmentStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentStartDateNotEqualTo(Date value) {
            addCriterion("investment_start_date <>", value, "investmentStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentStartDateGreaterThan(Date value) {
            addCriterion("investment_start_date >", value, "investmentStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("investment_start_date >=", value, "investmentStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentStartDateLessThan(Date value) {
            addCriterion("investment_start_date <", value, "investmentStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentStartDateLessThanOrEqualTo(Date value) {
            addCriterion("investment_start_date <=", value, "investmentStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentStartDateIn(List<Date> values) {
            addCriterion("investment_start_date in", values, "investmentStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentStartDateNotIn(List<Date> values) {
            addCriterion("investment_start_date not in", values, "investmentStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentStartDateBetween(Date value1, Date value2) {
            addCriterion("investment_start_date between", value1, value2, "investmentStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentStartDateNotBetween(Date value1, Date value2) {
            addCriterion("investment_start_date not between", value1, value2, "investmentStartDate");
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

        public Criteria andInvestmentApplicationDateIsNull() {
            addCriterion("investment_application_date is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentApplicationDateIsNotNull() {
            addCriterion("investment_application_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentApplicationDateEqualTo(Date value) {
            addCriterion("investment_application_date =", value, "investmentApplicationDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentApplicationDateNotEqualTo(Date value) {
            addCriterion("investment_application_date <>", value, "investmentApplicationDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentApplicationDateGreaterThan(Date value) {
            addCriterion("investment_application_date >", value, "investmentApplicationDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentApplicationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("investment_application_date >=", value, "investmentApplicationDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentApplicationDateLessThan(Date value) {
            addCriterion("investment_application_date <", value, "investmentApplicationDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentApplicationDateLessThanOrEqualTo(Date value) {
            addCriterion("investment_application_date <=", value, "investmentApplicationDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentApplicationDateIn(List<Date> values) {
            addCriterion("investment_application_date in", values, "investmentApplicationDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentApplicationDateNotIn(List<Date> values) {
            addCriterion("investment_application_date not in", values, "investmentApplicationDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentApplicationDateBetween(Date value1, Date value2) {
            addCriterion("investment_application_date between", value1, value2, "investmentApplicationDate");
            return (Criteria) this;
        }

        public Criteria andInvestmentApplicationDateNotBetween(Date value1, Date value2) {
            addCriterion("investment_application_date not between", value1, value2, "investmentApplicationDate");
            return (Criteria) this;
        }

        public Criteria andFundingStyleIsNull() {
            addCriterion("funding_style is null");
            return (Criteria) this;
        }

        public Criteria andFundingStyleIsNotNull() {
            addCriterion("funding_style is not null");
            return (Criteria) this;
        }

        public Criteria andFundingStyleEqualTo(Integer value) {
            addCriterion("funding_style =", value, "fundingStyle");
            return (Criteria) this;
        }

        public Criteria andFundingStyleNotEqualTo(Integer value) {
            addCriterion("funding_style <>", value, "fundingStyle");
            return (Criteria) this;
        }

        public Criteria andFundingStyleGreaterThan(Integer value) {
            addCriterion("funding_style >", value, "fundingStyle");
            return (Criteria) this;
        }

        public Criteria andFundingStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("funding_style >=", value, "fundingStyle");
            return (Criteria) this;
        }

        public Criteria andFundingStyleLessThan(Integer value) {
            addCriterion("funding_style <", value, "fundingStyle");
            return (Criteria) this;
        }

        public Criteria andFundingStyleLessThanOrEqualTo(Integer value) {
            addCriterion("funding_style <=", value, "fundingStyle");
            return (Criteria) this;
        }

        public Criteria andFundingStyleIn(List<Integer> values) {
            addCriterion("funding_style in", values, "fundingStyle");
            return (Criteria) this;
        }

        public Criteria andFundingStyleNotIn(List<Integer> values) {
            addCriterion("funding_style not in", values, "fundingStyle");
            return (Criteria) this;
        }

        public Criteria andFundingStyleBetween(Integer value1, Integer value2) {
            addCriterion("funding_style between", value1, value2, "fundingStyle");
            return (Criteria) this;
        }

        public Criteria andFundingStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("funding_style not between", value1, value2, "fundingStyle");
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

        public Criteria andFundingTypeIsNull() {
            addCriterion("funding_type is null");
            return (Criteria) this;
        }

        public Criteria andFundingTypeIsNotNull() {
            addCriterion("funding_type is not null");
            return (Criteria) this;
        }

        public Criteria andFundingTypeEqualTo(Integer value) {
            addCriterion("funding_type =", value, "fundingType");
            return (Criteria) this;
        }

        public Criteria andFundingTypeNotEqualTo(Integer value) {
            addCriterion("funding_type <>", value, "fundingType");
            return (Criteria) this;
        }

        public Criteria andFundingTypeGreaterThan(Integer value) {
            addCriterion("funding_type >", value, "fundingType");
            return (Criteria) this;
        }

        public Criteria andFundingTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("funding_type >=", value, "fundingType");
            return (Criteria) this;
        }

        public Criteria andFundingTypeLessThan(Integer value) {
            addCriterion("funding_type <", value, "fundingType");
            return (Criteria) this;
        }

        public Criteria andFundingTypeLessThanOrEqualTo(Integer value) {
            addCriterion("funding_type <=", value, "fundingType");
            return (Criteria) this;
        }

        public Criteria andFundingTypeIn(List<Integer> values) {
            addCriterion("funding_type in", values, "fundingType");
            return (Criteria) this;
        }

        public Criteria andFundingTypeNotIn(List<Integer> values) {
            addCriterion("funding_type not in", values, "fundingType");
            return (Criteria) this;
        }

        public Criteria andFundingTypeBetween(Integer value1, Integer value2) {
            addCriterion("funding_type between", value1, value2, "fundingType");
            return (Criteria) this;
        }

        public Criteria andFundingTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("funding_type not between", value1, value2, "fundingType");
            return (Criteria) this;
        }

        public Criteria andAdditionalInterestFlagIsNull() {
            addCriterion("additional_interest_flag is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalInterestFlagIsNotNull() {
            addCriterion("additional_interest_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalInterestFlagEqualTo(Integer value) {
            addCriterion("additional_interest_flag =", value, "additionalInterestFlag");
            return (Criteria) this;
        }

        public Criteria andAdditionalInterestFlagNotEqualTo(Integer value) {
            addCriterion("additional_interest_flag <>", value, "additionalInterestFlag");
            return (Criteria) this;
        }

        public Criteria andAdditionalInterestFlagGreaterThan(Integer value) {
            addCriterion("additional_interest_flag >", value, "additionalInterestFlag");
            return (Criteria) this;
        }

        public Criteria andAdditionalInterestFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("additional_interest_flag >=", value, "additionalInterestFlag");
            return (Criteria) this;
        }

        public Criteria andAdditionalInterestFlagLessThan(Integer value) {
            addCriterion("additional_interest_flag <", value, "additionalInterestFlag");
            return (Criteria) this;
        }

        public Criteria andAdditionalInterestFlagLessThanOrEqualTo(Integer value) {
            addCriterion("additional_interest_flag <=", value, "additionalInterestFlag");
            return (Criteria) this;
        }

        public Criteria andAdditionalInterestFlagIn(List<Integer> values) {
            addCriterion("additional_interest_flag in", values, "additionalInterestFlag");
            return (Criteria) this;
        }

        public Criteria andAdditionalInterestFlagNotIn(List<Integer> values) {
            addCriterion("additional_interest_flag not in", values, "additionalInterestFlag");
            return (Criteria) this;
        }

        public Criteria andAdditionalInterestFlagBetween(Integer value1, Integer value2) {
            addCriterion("additional_interest_flag between", value1, value2, "additionalInterestFlag");
            return (Criteria) this;
        }

        public Criteria andAdditionalInterestFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("additional_interest_flag not between", value1, value2, "additionalInterestFlag");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andDepositStatusIsNull() {
            addCriterion("deposit_status is null");
            return (Criteria) this;
        }

        public Criteria andDepositStatusIsNotNull() {
            addCriterion("deposit_status is not null");
            return (Criteria) this;
        }

        public Criteria andDepositStatusEqualTo(String value) {
            addCriterion("deposit_status =", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotEqualTo(String value) {
            addCriterion("deposit_status <>", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusGreaterThan(String value) {
            addCriterion("deposit_status >", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_status >=", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusLessThan(String value) {
            addCriterion("deposit_status <", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusLessThanOrEqualTo(String value) {
            addCriterion("deposit_status <=", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusLike(String value) {
            addCriterion("deposit_status like", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotLike(String value) {
            addCriterion("deposit_status not like", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusIn(List<String> values) {
            addCriterion("deposit_status in", values, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotIn(List<String> values) {
            addCriterion("deposit_status not in", values, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusBetween(String value1, String value2) {
            addCriterion("deposit_status between", value1, value2, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotBetween(String value1, String value2) {
            addCriterion("deposit_status not between", value1, value2, "depositStatus");
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