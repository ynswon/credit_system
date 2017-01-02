package com.funda.mybatis.model;

import java.util.Date;

public class user_auth {
    private Integer idx;

    private String purpose;

    private String phoneNum;

    private Integer phoneAck;

    private String email;

    private Integer emailAck;

    private String userId;

    private String ipAddress;

    private String authPhoneKey;

    private String authEmailKey;

    private Date issuedDatetime;

    private Date expireDatetime;

    private Integer result;

    private String message;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public Integer getPhoneAck() {
        return phoneAck;
    }

    public void setPhoneAck(Integer phoneAck) {
        this.phoneAck = phoneAck;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getEmailAck() {
        return emailAck;
    }

    public void setEmailAck(Integer emailAck) {
        this.emailAck = emailAck;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getAuthPhoneKey() {
        return authPhoneKey;
    }

    public void setAuthPhoneKey(String authPhoneKey) {
        this.authPhoneKey = authPhoneKey == null ? null : authPhoneKey.trim();
    }

    public String getAuthEmailKey() {
        return authEmailKey;
    }

    public void setAuthEmailKey(String authEmailKey) {
        this.authEmailKey = authEmailKey == null ? null : authEmailKey.trim();
    }

    public Date getIssuedDatetime() {
        return issuedDatetime;
    }

    public void setIssuedDatetime(Date issuedDatetime) {
        this.issuedDatetime = issuedDatetime;
    }

    public Date getExpireDatetime() {
        return expireDatetime;
    }

    public void setExpireDatetime(Date expireDatetime) {
        this.expireDatetime = expireDatetime;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}