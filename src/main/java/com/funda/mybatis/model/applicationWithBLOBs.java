package com.funda.mybatis.model;

public class applicationWithBLOBs extends application {
    private String userNote;

    private String fundaMemo;

    public String getDescmemo() {
        return descmemo;
    }

    public void setDescmemo(String descmemo) {
        this.descmemo = descmemo;
    }

    private String descmemo;

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote == null ? null : userNote.trim();
    }

    public String getFundaMemo() {
        return fundaMemo;
    }

    public void setFundaMemo(String fundaMemo) {
        this.fundaMemo = fundaMemo == null ? null : fundaMemo.trim();
    }
}