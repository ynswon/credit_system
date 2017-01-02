package com.funda.mybatis.model;

import java.util.Date;

public class schedule_debtor {
    private Integer idx;

    private Integer storeIdx;

    private Integer fundingDataIdx;

    private Integer totalAmount;

    private Integer principal;

    private Integer interest;

    private Integer overdueInterest;

    private Integer paybackPresentIdx;

    private Integer paybackTotalTimes;

    private Date dueDate;

    private String repaymentStatus;

    private String overdueStatus;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getStoreIdx() {
        return storeIdx;
    }

    public void setStoreIdx(Integer storeIdx) {
        this.storeIdx = storeIdx;
    }

    public Integer getFundingDataIdx() {
        return fundingDataIdx;
    }

    public void setFundingDataIdx(Integer fundingDataIdx) {
        this.fundingDataIdx = fundingDataIdx;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getPrincipal() {
        return principal;
    }

    public void setPrincipal(Integer principal) {
        this.principal = principal;
    }

    public Integer getInterest() {
        return interest;
    }

    public void setInterest(Integer interest) {
        this.interest = interest;
    }

    public Integer getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(Integer overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public Integer getPaybackPresentIdx() {
        return paybackPresentIdx;
    }

    public void setPaybackPresentIdx(Integer paybackPresentIdx) {
        this.paybackPresentIdx = paybackPresentIdx;
    }

    public Integer getPaybackTotalTimes() {
        return paybackTotalTimes;
    }

    public void setPaybackTotalTimes(Integer paybackTotalTimes) {
        this.paybackTotalTimes = paybackTotalTimes;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getRepaymentStatus() {
        return repaymentStatus;
    }

    public void setRepaymentStatus(String repaymentStatus) {
        this.repaymentStatus = repaymentStatus == null ? null : repaymentStatus.trim();
    }

    public String getOverdueStatus() {
        return overdueStatus;
    }

    public void setOverdueStatus(String overdueStatus) {
        this.overdueStatus = overdueStatus == null ? null : overdueStatus.trim();
    }
}