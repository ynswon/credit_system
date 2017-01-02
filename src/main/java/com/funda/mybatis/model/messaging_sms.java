package com.funda.mybatis.model;

import java.util.Date;

public class messaging_sms {
    private Integer idx;

    private Integer userIdx;

    private String phoneNum;

    private String finalNumber;

    private Integer status;

    private Date datetime;

    private String text;

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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getFinalNumber() {
        return finalNumber;
    }

    public void setFinalNumber(String finalNumber) {
        this.finalNumber = finalNumber == null ? null : finalNumber.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}