package com.funda.mybatis.model;

import java.util.Date;

public class user_login_log {
    private Integer idx;

    private String userId;

    private String triedPassword;

    private Integer userIdx;

    private String sessionIp;

    private String usingSuperPassword;

    private Date loginDatetime;

    private String browser;

    private String os;

    private String referer;

    private String target;

    private String loginSuccess;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
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

    public Integer getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Integer userIdx) {
        this.userIdx = userIdx;
    }

    public String getSessionIp() {
        return sessionIp;
    }

    public void setSessionIp(String sessionIp) {
        this.sessionIp = sessionIp == null ? null : sessionIp.trim();
    }

    public String getUsingSuperPassword() {
        return usingSuperPassword;
    }

    public void setUsingSuperPassword(String usingSuperPassword) {
        this.usingSuperPassword = usingSuperPassword == null ? null : usingSuperPassword.trim();
    }

    public Date getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
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

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer == null ? null : referer.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getLoginSuccess() {
        return loginSuccess;
    }

    public void setLoginSuccess(String loginSuccess) {
        this.loginSuccess = loginSuccess == null ? null : loginSuccess.trim();
    }
}