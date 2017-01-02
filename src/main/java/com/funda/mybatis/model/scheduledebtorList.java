package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Accounts")
public class scheduledebtorList extends account_contentsWithBLOBs {

    @XmlElement(name = "account")
    private List<account_contentsWithBLOBs> persons = null;

    public List<account_contentsWithBLOBs> getAccounts() {
        return persons;
    }

    public void setAccounts(List<account_contentsWithBLOBs> persons) {
        this.persons = persons;
    }

}