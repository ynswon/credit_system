package com.funda.mybatis.model;

import java.util.Date;

public class schedule_creditor {
    private Integer idx;

    private Integer userIdx;

    private Integer fundingIdx;

    private Integer totalAmount;

    private Integer principalBeforeTax;

    private Integer interestBeforeTax;

    private Integer overdueInterestBefore;

    private Integer tax;

    private Integer taxNational;

    private Integer taxLocal;

    private Integer paybackPresentIdx;

    private Integer paybackTotalTimes;

    private Date dueDate;

    private String repaymentStatus;

    private Integer transferStatus;

    private Integer transferCount;

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

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getPrincipalBeforeTax() {
        return principalBeforeTax;
    }

    public void setPrincipalBeforeTax(Integer principalBeforeTax) {
        this.principalBeforeTax = principalBeforeTax;
    }

    public Integer getInterestBeforeTax() {
        return interestBeforeTax;
    }

    public void setInterestBeforeTax(Integer interestBeforeTax) {
        this.interestBeforeTax = interestBeforeTax;
    }

    public Integer getOverdueInterestBefore() {
        return overdueInterestBefore;
    }

    public void setOverdueInterestBefore(Integer overdueInterestBefore) {
        this.overdueInterestBefore = overdueInterestBefore;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public Integer getTaxNational() {
        return taxNational;
    }

    public void setTaxNational(Integer taxNational) {
        this.taxNational = taxNational;
    }

    public Integer getTaxLocal() {
        return taxLocal;
    }

    public void setTaxLocal(Integer taxLocal) {
        this.taxLocal = taxLocal;
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

    public Integer getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(Integer transferStatus) {
        this.transferStatus = transferStatus;
    }

    public Integer getTransferCount() {
        return transferCount;
    }

    public void setTransferCount(Integer transferCount) {
        this.transferCount = transferCount;
    }
}