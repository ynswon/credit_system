package com.funda.mybatis.model;

public class login_logWithBLOBs extends login_log {
    private String session;

    private String page;

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session == null ? null : session.trim();
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page == null ? null : page.trim();
    }
}