package com.funda.mybatis.model;

public class refund_data_change_logWithBLOBs extends refund_data_change_log {
    private String reason;

    private String memo;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}