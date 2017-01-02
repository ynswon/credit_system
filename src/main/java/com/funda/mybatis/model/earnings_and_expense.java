package com.funda.mybatis.model;

public class earnings_and_expense {
    private Integer idx;

    private Integer accountContentsIdx;

    private String type;

    private String contents;

    private Integer earning;

    private String expense;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getAccountContentsIdx() {
        return accountContentsIdx;
    }

    public void setAccountContentsIdx(Integer accountContentsIdx) {
        this.accountContentsIdx = accountContentsIdx;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }

    public Integer getEarning() {
        return earning;
    }

    public void setEarning(Integer earning) {
        this.earning = earning;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense == null ? null : expense.trim();
    }
}