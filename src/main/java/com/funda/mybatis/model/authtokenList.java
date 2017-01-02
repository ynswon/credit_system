package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="authtokens")
public class authtokenList extends auto_token {

    @XmlElement(name = "authtoken")
    private List<auto_token> persons = null;

    public List<auto_token> getAuthTokens() {
        return persons;
    }

    public void setAuthTokens(List<auto_token> persons) {
        this.persons = persons;
    }

}