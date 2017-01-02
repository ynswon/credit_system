package com.funda.mybatis.model;

import java.util.Date;

public class tax_version {
    private Integer idx;

    private Float tax;

    private Float localTax;

    private Date registerDate;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public Float getLocalTax() {
        return localTax;
    }

    public void setLocalTax(Float localTax) {
        this.localTax = localTax;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}