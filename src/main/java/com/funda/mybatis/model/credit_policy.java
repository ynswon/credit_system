package com.funda.mybatis.model;

public class credit_policy {
    private Integer idx;

    private Integer period;

    private String iindex;

    private String repayFuture;

    private String value;

    private String seg;

    private String policy;

    private String qualifiedYn;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getIindex() {
        return iindex;
    }

    public void setIindex(String iindex) {
        this.iindex = iindex == null ? null : iindex.trim();
    }

    public String getRepayFuture() {
        return repayFuture;
    }

    public void setRepayFuture(String repayFuture) {
        this.repayFuture = repayFuture == null ? null : repayFuture.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getSeg() {
        return seg;
    }

    public void setSeg(String seg) {
        this.seg = seg == null ? null : seg.trim();
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy == null ? null : policy.trim();
    }

    public String getQualifiedYn() {
        return qualifiedYn;
    }

    public void setQualifiedYn(String qualifiedYn) {
        this.qualifiedYn = qualifiedYn == null ? null : qualifiedYn.trim();
    }
}