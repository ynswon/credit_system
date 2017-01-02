package com.funda.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class login_logExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public login_logExample() {
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

        public Criteria andTriedPasswordIsNull() {
            addCriterion("tried_password is null");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordIsNotNull() {
            addCriterion("tried_password is not null");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordEqualTo(String value) {
            addCriterion("tried_password =", value, "triedPassword");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordNotEqualTo(String value) {
            addCriterion("tried_password <>", value, "triedPassword");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordGreaterThan(String value) {
            addCriterion("tried_password >", value, "triedPassword");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("tried_password >=", value, "triedPassword");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordLessThan(String value) {
            addCriterion("tried_password <", value, "triedPassword");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordLessThanOrEqualTo(String value) {
            addCriterion("tried_password <=", value, "triedPassword");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordLike(String value) {
            addCriterion("tried_password like", value, "triedPassword");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordNotLike(String value) {
            addCriterion("tried_password not like", value, "triedPassword");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordIn(List<String> values) {
            addCriterion("tried_password in", values, "triedPassword");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordNotIn(List<String> values) {
            addCriterion("tried_password not in", values, "triedPassword");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordBetween(String value1, String value2) {
            addCriterion("tried_password between", value1, value2, "triedPassword");
            return (Criteria) this;
        }

        public Criteria andTriedPasswordNotBetween(String value1, String value2) {
            addCriterion("tried_password not between", value1, value2, "triedPassword");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNull() {
            addCriterion("user_ip is null");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNotNull() {
            addCriterion("user_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUserIpEqualTo(String value) {
            addCriterion("user_ip =", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotEqualTo(String value) {
            addCriterion("user_ip <>", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThan(String value) {
            addCriterion("user_ip >", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("user_ip >=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThan(String value) {
            addCriterion("user_ip <", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThanOrEqualTo(String value) {
            addCriterion("user_ip <=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLike(String value) {
            addCriterion("user_ip like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotLike(String value) {
            addCriterion("user_ip not like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpIn(List<String> values) {
            addCriterion("user_ip in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotIn(List<String> values) {
            addCriterion("user_ip not in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpBetween(String value1, String value2) {
            addCriterion("user_ip between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotBetween(String value1, String value2) {
            addCriterion("user_ip not between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordIsNull() {
            addCriterion("using_super_password is null");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordIsNotNull() {
            addCriterion("using_super_password is not null");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordEqualTo(String value) {
            addCriterion("using_super_password =", value, "usingSuperPassword");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordNotEqualTo(String value) {
            addCriterion("using_super_password <>", value, "usingSuperPassword");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordGreaterThan(String value) {
            addCriterion("using_super_password >", value, "usingSuperPassword");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("using_super_password >=", value, "usingSuperPassword");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordLessThan(String value) {
            addCriterion("using_super_password <", value, "usingSuperPassword");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordLessThanOrEqualTo(String value) {
            addCriterion("using_super_password <=", value, "usingSuperPassword");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordLike(String value) {
            addCriterion("using_super_password like", value, "usingSuperPassword");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordNotLike(String value) {
            addCriterion("using_super_password not like", value, "usingSuperPassword");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordIn(List<String> values) {
            addCriterion("using_super_password in", values, "usingSuperPassword");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordNotIn(List<String> values) {
            addCriterion("using_super_password not in", values, "usingSuperPassword");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordBetween(String value1, String value2) {
            addCriterion("using_super_password between", value1, value2, "usingSuperPassword");
            return (Criteria) this;
        }

        public Criteria andUsingSuperPasswordNotBetween(String value1, String value2) {
            addCriterion("using_super_password not between", value1, value2, "usingSuperPassword");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNull() {
            addCriterion("browser is null");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNotNull() {
            addCriterion("browser is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserEqualTo(String value) {
            addCriterion("browser =", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotEqualTo(String value) {
            addCriterion("browser <>", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThan(String value) {
            addCriterion("browser >", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThanOrEqualTo(String value) {
            addCriterion("browser >=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThan(String value) {
            addCriterion("browser <", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThanOrEqualTo(String value) {
            addCriterion("browser <=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLike(String value) {
            addCriterion("browser like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotLike(String value) {
            addCriterion("browser not like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserIn(List<String> values) {
            addCriterion("browser in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotIn(List<String> values) {
            addCriterion("browser not in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserBetween(String value1, String value2) {
            addCriterion("browser between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotBetween(String value1, String value2) {
            addCriterion("browser not between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andOsIsNull() {
            addCriterion("os is null");
            return (Criteria) this;
        }

        public Criteria andOsIsNotNull() {
            addCriterion("os is not null");
            return (Criteria) this;
        }

        public Criteria andOsEqualTo(String value) {
            addCriterion("os =", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotEqualTo(String value) {
            addCriterion("os <>", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThan(String value) {
            addCriterion("os >", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThanOrEqualTo(String value) {
            addCriterion("os >=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThan(String value) {
            addCriterion("os <", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThanOrEqualTo(String value) {
            addCriterion("os <=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLike(String value) {
            addCriterion("os like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotLike(String value) {
            addCriterion("os not like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsIn(List<String> values) {
            addCriterion("os in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotIn(List<String> values) {
            addCriterion("os not in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsBetween(String value1, String value2) {
            addCriterion("os between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotBetween(String value1, String value2) {
            addCriterion("os not between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessIsNull() {
            addCriterion("login_success is null");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessIsNotNull() {
            addCriterion("login_success is not null");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessEqualTo(String value) {
            addCriterion("login_success =", value, "loginSuccess");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessNotEqualTo(String value) {
            addCriterion("login_success <>", value, "loginSuccess");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessGreaterThan(String value) {
            addCriterion("login_success >", value, "loginSuccess");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessGreaterThanOrEqualTo(String value) {
            addCriterion("login_success >=", value, "loginSuccess");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessLessThan(String value) {
            addCriterion("login_success <", value, "loginSuccess");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessLessThanOrEqualTo(String value) {
            addCriterion("login_success <=", value, "loginSuccess");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessLike(String value) {
            addCriterion("login_success like", value, "loginSuccess");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessNotLike(String value) {
            addCriterion("login_success not like", value, "loginSuccess");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessIn(List<String> values) {
            addCriterion("login_success in", values, "loginSuccess");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessNotIn(List<String> values) {
            addCriterion("login_success not in", values, "loginSuccess");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessBetween(String value1, String value2) {
            addCriterion("login_success between", value1, value2, "loginSuccess");
            return (Criteria) this;
        }

        public Criteria andLoginSuccessNotBetween(String value1, String value2) {
            addCriterion("login_success not between", value1, value2, "loginSuccess");
            return (Criteria) this;
        }

        public Criteria andAutoLoginIsNull() {
            addCriterion("auto_login is null");
            return (Criteria) this;
        }

        public Criteria andAutoLoginIsNotNull() {
            addCriterion("auto_login is not null");
            return (Criteria) this;
        }

        public Criteria andAutoLoginEqualTo(String value) {
            addCriterion("auto_login =", value, "autoLogin");
            return (Criteria) this;
        }

        public Criteria andAutoLoginNotEqualTo(String value) {
            addCriterion("auto_login <>", value, "autoLogin");
            return (Criteria) this;
        }

        public Criteria andAutoLoginGreaterThan(String value) {
            addCriterion("auto_login >", value, "autoLogin");
            return (Criteria) this;
        }

        public Criteria andAutoLoginGreaterThanOrEqualTo(String value) {
            addCriterion("auto_login >=", value, "autoLogin");
            return (Criteria) this;
        }

        public Criteria andAutoLoginLessThan(String value) {
            addCriterion("auto_login <", value, "autoLogin");
            return (Criteria) this;
        }

        public Criteria andAutoLoginLessThanOrEqualTo(String value) {
            addCriterion("auto_login <=", value, "autoLogin");
            return (Criteria) this;
        }

        public Criteria andAutoLoginLike(String value) {
            addCriterion("auto_login like", value, "autoLogin");
            return (Criteria) this;
        }

        public Criteria andAutoLoginNotLike(String value) {
            addCriterion("auto_login not like", value, "autoLogin");
            return (Criteria) this;
        }

        public Criteria andAutoLoginIn(List<String> values) {
            addCriterion("auto_login in", values, "autoLogin");
            return (Criteria) this;
        }

        public Criteria andAutoLoginNotIn(List<String> values) {
            addCriterion("auto_login not in", values, "autoLogin");
            return (Criteria) this;
        }

        public Criteria andAutoLoginBetween(String value1, String value2) {
            addCriterion("auto_login between", value1, value2, "autoLogin");
            return (Criteria) this;
        }

        public Criteria andAutoLoginNotBetween(String value1, String value2) {
            addCriterion("auto_login not between", value1, value2, "autoLogin");
            return (Criteria) this;
        }

        public Criteria andVirtualBankIsNull() {
            addCriterion("virtual_bank is null");
            return (Criteria) this;
        }

        public Criteria andVirtualBankIsNotNull() {
            addCriterion("virtual_bank is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualBankEqualTo(String value) {
            addCriterion("virtual_bank =", value, "virtualBank");
            return (Criteria) this;
        }

        public Criteria andVirtualBankNotEqualTo(String value) {
            addCriterion("virtual_bank <>", value, "virtualBank");
            return (Criteria) this;
        }

        public Criteria andVirtualBankGreaterThan(String value) {
            addCriterion("virtual_bank >", value, "virtualBank");
            return (Criteria) this;
        }

        public Criteria andVirtualBankGreaterThanOrEqualTo(String value) {
            addCriterion("virtual_bank >=", value, "virtualBank");
            return (Criteria) this;
        }

        public Criteria andVirtualBankLessThan(String value) {
            addCriterion("virtual_bank <", value, "virtualBank");
            return (Criteria) this;
        }

        public Criteria andVirtualBankLessThanOrEqualTo(String value) {
            addCriterion("virtual_bank <=", value, "virtualBank");
            return (Criteria) this;
        }

        public Criteria andVirtualBankLike(String value) {
            addCriterion("virtual_bank like", value, "virtualBank");
            return (Criteria) this;
        }

        public Criteria andVirtualBankNotLike(String value) {
            addCriterion("virtual_bank not like", value, "virtualBank");
            return (Criteria) this;
        }

        public Criteria andVirtualBankIn(List<String> values) {
            addCriterion("virtual_bank in", values, "virtualBank");
            return (Criteria) this;
        }

        public Criteria andVirtualBankNotIn(List<String> values) {
            addCriterion("virtual_bank not in", values, "virtualBank");
            return (Criteria) this;
        }

        public Criteria andVirtualBankBetween(String value1, String value2) {
            addCriterion("virtual_bank between", value1, value2, "virtualBank");
            return (Criteria) this;
        }

        public Criteria andVirtualBankNotBetween(String value1, String value2) {
            addCriterion("virtual_bank not between", value1, value2, "virtualBank");
            return (Criteria) this;
        }

        public Criteria andLoginDatetimeIsNull() {
            addCriterion("login_datetime is null");
            return (Criteria) this;
        }

        public Criteria andLoginDatetimeIsNotNull() {
            addCriterion("login_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDatetimeEqualTo(Date value) {
            addCriterion("login_datetime =", value, "loginDatetime");
            return (Criteria) this;
        }

        public Criteria andLoginDatetimeNotEqualTo(Date value) {
            addCriterion("login_datetime <>", value, "loginDatetime");
            return (Criteria) this;
        }

        public Criteria andLoginDatetimeGreaterThan(Date value) {
            addCriterion("login_datetime >", value, "loginDatetime");
            return (Criteria) this;
        }

        public Criteria andLoginDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_datetime >=", value, "loginDatetime");
            return (Criteria) this;
        }

        public Criteria andLoginDatetimeLessThan(Date value) {
            addCriterion("login_datetime <", value, "loginDatetime");
            return (Criteria) this;
        }

        public Criteria andLoginDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("login_datetime <=", value, "loginDatetime");
            return (Criteria) this;
        }

        public Criteria andLoginDatetimeIn(List<Date> values) {
            addCriterion("login_datetime in", values, "loginDatetime");
            return (Criteria) this;
        }

        public Criteria andLoginDatetimeNotIn(List<Date> values) {
            addCriterion("login_datetime not in", values, "loginDatetime");
            return (Criteria) this;
        }

        public Criteria andLoginDatetimeBetween(Date value1, Date value2) {
            addCriterion("login_datetime between", value1, value2, "loginDatetime");
            return (Criteria) this;
        }

        public Criteria andLoginDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("login_datetime not between", value1, value2, "loginDatetime");
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