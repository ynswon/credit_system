package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="balance_and_deposit")
public class balance_and_deposit {

    @XmlElement
    private Integer idx;
    @XmlElement
    private Integer amount;
    @XmlElement
    private Integer bankCommission;
    @XmlElement
    private Long balance;
    @XmlElement
    private Integer idxAccountContent;
    @XmlElement
    private Integer idxListCreditor;
    @XmlElement
    private Integer idxFundingDataDebtor;
    @XmlElement
    private Integer idxScheduleCreditor;
    @XmlElement
    private Integer idxScheduleDebtor;
    @XmlElement
    private Integer idxDepositWithdrawalRequest;
    @XmlElement
    private Integer idxCouponIssue;
    @XmlElement
    private Integer idxListCoupon;
    @XmlElement
    private Integer userIdx;
    @XmlElement
    private Integer storeIdx;
    @XmlElement
    private Date transactTime;
    @XmlElement
    private String withdrawalableFlag;
    @XmlElement
    private String memo;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getBankCommission() {
        return bankCommission;
    }

    public void setBankCommission(Integer bankCommission) {
        this.bankCommission = bankCommission;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Integer getIdxAccountContent() {
        return idxAccountContent;
    }

    public void setIdxAccountContent(Integer idxAccountContent) {
        this.idxAccountContent = idxAccountContent;
    }

    public Integer getIdxListCreditor() {
        return idxListCreditor;
    }

    public void setIdxListCreditor(Integer idxListCreditor) {
        this.idxListCreditor = idxListCreditor;
    }

    public Integer getIdxFundingDataDebtor() {
        return idxFundingDataDebtor;
    }

    public void setIdxFundingDataDebtor(Integer idxFundingDataDebtor) {
        this.idxFundingDataDebtor = idxFundingDataDebtor;
    }

    public Integer getIdxScheduleCreditor() {
        return idxScheduleCreditor;
    }

    public void setIdxScheduleCreditor(Integer idxScheduleCreditor) {
        this.idxScheduleCreditor = idxScheduleCreditor;
    }

    public Integer getIdxScheduleDebtor() {
        return idxScheduleDebtor;
    }

    public void setIdxScheduleDebtor(Integer idxScheduleDebtor) {
        this.idxScheduleDebtor = idxScheduleDebtor;
    }

    public Integer getIdxDepositWithdrawalRequest() {
        return idxDepositWithdrawalRequest;
    }

    public void setIdxDepositWithdrawalRequest(Integer idxDepositWithdrawalRequest) {
        this.idxDepositWithdrawalRequest = idxDepositWithdrawalRequest;
    }

    public Integer getIdxCouponIssue() {
        return idxCouponIssue;
    }

    public void setIdxCouponIssue(Integer idxCouponIssue) {
        this.idxCouponIssue = idxCouponIssue;
    }

    public Integer getIdxListCoupon() {
        return idxListCoupon;
    }

    public void setIdxListCoupon(Integer idxListCoupon) {
        this.idxListCoupon = idxListCoupon;
    }

    public Integer getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Integer userIdx) {
        this.userIdx = userIdx;
    }

    public Integer getStoreIdx() {
        return storeIdx;
    }

    public void setStoreIdx(Integer storeIdx) {
        this.storeIdx = storeIdx;
    }

    public Date getTransactTime() {
        return transactTime;
    }

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }

    public String getWithdrawalableFlag() {
        return withdrawalableFlag;
    }

    public void setWithdrawalableFlag(String withdrawalableFlag) {
        this.withdrawalableFlag = withdrawalableFlag == null ? null : withdrawalableFlag.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}