package com.funda.mybatis.model;

import java.util.Date;

public class transfer_list {
    private Integer idx;

    private String transferId;

    private String transferCode;

    private Integer fundingIdx;

    private Integer repaymentIdx;

    private Integer withdrawalIdx;

    private String userId;

    private String sessionId;

    private Integer transferStatus;

    private Date datetime;

    private Integer result;

    private String metaData;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId == null ? null : transferId.trim();
    }

    public String getTransferCode() {
        return transferCode;
    }

    public void setTransferCode(String transferCode) {
        this.transferCode = transferCode == null ? null : transferCode.trim();
    }

    public Integer getFundingIdx() {
        return fundingIdx;
    }

    public void setFundingIdx(Integer fundingIdx) {
        this.fundingIdx = fundingIdx;
    }

    public Integer getRepaymentIdx() {
        return repaymentIdx;
    }

    public void setRepaymentIdx(Integer repaymentIdx) {
        this.repaymentIdx = repaymentIdx;
    }

    public Integer getWithdrawalIdx() {
        return withdrawalIdx;
    }

    public void setWithdrawalIdx(Integer withdrawalIdx) {
        this.withdrawalIdx = withdrawalIdx;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public Integer getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(Integer transferStatus) {
        this.transferStatus = transferStatus;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getMetaData() {
        return metaData;
    }

    public void setMetaData(String metaData) {
        this.metaData = metaData == null ? null : metaData.trim();
    }
}