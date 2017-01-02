package com.funda.mybatis.model;

import java.util.Date;

public class transfer_code {
    private Integer idx;

    private String commonCode;

    private Integer codeIncrement;

    private String code;

    private String sessionId;

    private Date requestedDatetime;

    private Integer fundingIdx;

    private Integer repaymentIdx;

    private Integer result;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getCommonCode() {
        return commonCode;
    }

    public void setCommonCode(String commonCode) {
        this.commonCode = commonCode == null ? null : commonCode.trim();
    }

    public Integer getCodeIncrement() {
        return codeIncrement;
    }

    public void setCodeIncrement(Integer codeIncrement) {
        this.codeIncrement = codeIncrement;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public Date getRequestedDatetime() {
        return requestedDatetime;
    }

    public void setRequestedDatetime(Date requestedDatetime) {
        this.requestedDatetime = requestedDatetime;
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

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}