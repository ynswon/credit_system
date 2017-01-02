package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="bankaccountList")
public class bankaccountList extends bank_account {

    @XmlElement(name = "bank_account")
    private List<bank_account> persons = null;

    public List<bank_account> getbank_account() {
        return persons;
    }

    public void setbank_account(List<bank_account> persons) {
        this.persons = persons;
    }

}