package com.funda.mybatis.model;

import java.util.Date;

public class list_creditor {
    private Integer idx;

    private Integer userIdx;

    private Integer fundingIdx;

    private Integer investmentAmount;

    private String investmentState;

    private Date datetime;

    private Integer bankAccount;

    private Float fundaSupportInterestRate;

    private Integer status;

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

    public Integer getFundingIdx() {
        return fundingIdx;
    }

    public void setFundingIdx(Integer fundingIdx) {
        this.fundingIdx = fundingIdx;
    }

    public Integer getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(Integer investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public String getInvestmentState() {
        return investmentState;
    }

    public void setInvestmentState(String investmentState) {
        this.investmentState = investmentState == null ? null : investmentState.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Integer getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Integer bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Float getFundaSupportInterestRate() {
        return fundaSupportInterestRate;
    }

    public void setFundaSupportInterestRate(Float fundaSupportInterestRate) {
        this.fundaSupportInterestRate = fundaSupportInterestRate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}