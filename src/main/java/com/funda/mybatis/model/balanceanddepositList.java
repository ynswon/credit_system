package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="balanceanddepositList")
public class balanceanddepositList extends balance_and_deposit {

    @XmlElement(name = "balanceanddeposit")
    private List<balance_and_deposit> persons = null;

    public List<balance_and_deposit> getbalance_and_deposit() {
        return persons;
    }

    public void setbalance_and_deposit(List<balance_and_deposit> persons) {
        this.persons = persons;
    }

}