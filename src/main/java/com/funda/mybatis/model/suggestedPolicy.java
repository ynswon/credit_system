package com.funda.mybatis.model;

public class suggestedPolicy {
    private Integer idx;

    private Integer refIdx;

    private Double amount;

    private Double monthlyrepay;

    private Integer period;

    private Double rate;

    private Integer seq;

    private Double limit;

    private String qualityYn;

    private String approvedYn;

    private String datetime;

    private String debtcode;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getRefIdx() {
        return refIdx;
    }

    public void setRefIdx(Integer refIdx) {
        this.refIdx = refIdx;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getMonthlyrepay() {
        return monthlyrepay;
    }

    public void setMonthlyrepay(Double monthlyrepay) {
        this.monthlyrepay = monthlyrepay;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public String getQualityYn() {
        return qualityYn;
    }

    public void setQualityYn(String qualityYn) {
        this.qualityYn = qualityYn == null ? null : qualityYn.trim();
    }

    public String getApprovedYn() {
        return approvedYn;
    }

    public void setApprovedYn(String approvedYn) {
        this.approvedYn = approvedYn == null ? null : approvedYn.trim();
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime == null ? null : datetime.trim();
    }

    public String getDebtcode() {
        return debtcode;
    }

    public void setDebtcode(String debtcode) {
        this.debtcode = debtcode == null ? null : debtcode.trim();
    }
}