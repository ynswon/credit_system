package com.funda.mybatis.model;

public class disqualifiedReasons {
    private Integer idx;

    private Integer refIdx;

    private String code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    private String reason;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}