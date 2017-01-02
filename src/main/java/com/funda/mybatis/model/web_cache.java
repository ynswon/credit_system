package com.funda.mybatis.model;

import java.util.Date;

public class web_cache {
    private Integer idx;

    private Date lastUpdate;

    private Long fundingAcc;

    private Double averageInterestRate;

    private Integer creditorAcc;

    private Integer itemAcc;

    private Date presentFundingDate;

    private Date nextFundingDate;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getFundingAcc() {
        return fundingAcc;
    }

    public void setFundingAcc(Long fundingAcc) {
        this.fundingAcc = fundingAcc;
    }

    public Double getAverageInterestRate() {
        return averageInterestRate;
    }

    public void setAverageInterestRate(Double averageInterestRate) {
        this.averageInterestRate = averageInterestRate;
    }

    public Integer getCreditorAcc() {
        return creditorAcc;
    }

    public void setCreditorAcc(Integer creditorAcc) {
        this.creditorAcc = creditorAcc;
    }

    public Integer getItemAcc() {
        return itemAcc;
    }

    public void setItemAcc(Integer itemAcc) {
        this.itemAcc = itemAcc;
    }

    public Date getPresentFundingDate() {
        return presentFundingDate;
    }

    public void setPresentFundingDate(Date presentFundingDate) {
        this.presentFundingDate = presentFundingDate;
    }

    public Date getNextFundingDate() {
        return nextFundingDate;
    }

    public void setNextFundingDate(Date nextFundingDate) {
        this.nextFundingDate = nextFundingDate;
    }
}