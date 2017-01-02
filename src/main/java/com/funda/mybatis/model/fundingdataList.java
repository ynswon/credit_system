package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="FundingDatas")
public class fundingdataList extends funding_data {

    @XmlElement(name = "funding")
    private List<funding_data> persons = null;

    public List<funding_data> getFundings() {
        return persons;
    }

    public void setFundings(List<funding_data> persons) {
        this.persons = persons;
    }

}