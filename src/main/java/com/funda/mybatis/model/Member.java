package com.funda.mybatis.model;

public class Member {
    private String date;
    private String type;
    private String comment;

    public Member(){

    }

    public String get_name() {
        return date;
    }

    public void set_name(String date) {
        this.date = date;
    }

    public String get_email() {
        return type;
    }

    public void set_email(String type) {
        this.type = type;
    }

    public String get_phone() {
        return comment;
    }

    public void set_phone(String comment) {
        this.comment = comment;
    }

}
