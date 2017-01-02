package com.funda.mybatis.model;

import java.util.Date;

public class login_log {
    private Integer idx;

    private Integer userIdx;

    private String userId;

    private String triedPassword;

    private String userIp;

    private String usingSuperPassword;

    private String browser;

    private String os;

    private String loginSuccess;

    private String autoLogin;

    private String virtualBank;

    private Date loginDatetime;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Integer userIdx) {
        this.userIdx = userIdx;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTriedPassword() {
        return triedPassword;
    }

    public void setTriedPassword(String triedPassword) {
        this.triedPassword = triedPassword == null ? null : triedPassword.trim();
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public String getUsingSuperPassword() {
        return usingSuperPassword;
    }

    public void setUsingSuperPassword(String usingSuperPassword) {
        this.usingSuperPassword = usingSuperPassword == null ? null : usingSuperPassword.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getLoginSuccess() {
        return loginSuccess;
    }

    public void setLoginSuccess(String loginSuccess) {
        this.loginSuccess = loginSuccess == null ? null : loginSuccess.trim();
    }

    public String getAutoLogin() {
        return autoLogin;
    }

    public void setAutoLogin(String autoLogin) {
        this.autoLogin = autoLogin == null ? null : autoLogin.trim();
    }

    public String getVirtualBank() {
        return virtualBank;
    }

    public void setVirtualBank(String virtualBank) {
        this.virtualBank = virtualBank == null ? null : virtualBank.trim();
    }

    public Date getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }
}