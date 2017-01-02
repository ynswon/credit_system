package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="application")
public class application {

    public Integer getIindex() {
        return iindex;
    }

    public void setIindex(Integer iindex) {
        this.iindex = iindex;
    }

    public Integer getMiraeindex() {
        return miraeindex;
    }

    public void setMiraeindex(Integer miraeindex) {
        this.miraeindex = miraeindex;
    }

    @XmlElement
    private Integer iindex;

    @XmlElement
    private Integer miraeindex;

    @XmlElement
    private Integer rainbowscore;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlElement
    private String url;

    @XmlElement
    private Integer idx;

   @XmlElement
    private Integer nextIdx;

    @XmlElement
    private String storeName;
    @XmlElement
    private Integer amount;
    @XmlElement
    private String phone;
    @XmlElement
    private Integer storeIdx;
    @XmlElement
    private String userId;

    public String getFundaMemo() {
        return fundaMemo;
    }

    public void setFundaMemo(String fundaMemo) {
        this.fundaMemo = fundaMemo;
    }

    @XmlElement
    private String fundaMemo;

    public String getApplicant_name() {
        return applicantName;
    }

    public void setApplicant_name(String applicant_name) {
        this.applicantName = applicant_name;
    }



    @XmlElement
    private String applicantName;

    public String getApplicantBirthdate() {
        return applicantBirthdate;
    }

    public void setApplicantBirthdate(String applicantBirthdate) {
        this.applicantBirthdate = applicantBirthdate;
    }

    @XmlElement
    private String applicantBirthdate;

    public Integer getRainbowscore() {
        return rainbowscore;
    }

    public void setRainbowscore(Integer rainbowscore) {
        this.rainbowscore = rainbowscore;
    }


    public String getRegisterkey() {
        return registerkey;
    }

    public void setRegisterkey(String registerkey) {
        this.registerkey = registerkey;
    }

    @XmlElement
    private String registerkey;

    public String getReplacekey() {
        return replacekey;
    }

    public void setReplacekey(String replacekey) {
        this.replacekey = replacekey;
    }

    @XmlElement
    private String replacekey;

    @XmlElement
    private String ip;

    public String getCreditrate() {
        return creditrate;
    }

    public void setCreditrate(String creditrate) {
        this.creditrate = creditrate;
    }

    public String getDebtcode() {
        return debtcode;
    }

    public void setDebtcode(String debtcode) {
        this.debtcode = debtcode;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @XmlElement
    private String score;

    @XmlElement
    private String creditrate;

    @XmlElement
    private Date datetime;

    public String getDataform() {
        return dataform;
    }

    public void setDataform(String dataform) {
        this.dataform = dataform;
    }

    @XmlElement
    private String dataform;


    public String getDescmemo() {
        return descmemo;
    }

    public void setDescmemo(String descmemo) {
        this.descmemo = descmemo;
    }

    @XmlElement
    private String descmemo;

    @XmlElement
    private String dayweek;

    public String getDebtCode() {
        return debtcode;
    }

    public void setDebtCode(String debtCode) {
        this.debtcode = debtCode;
    }

    @XmlElement
    private String debtcode;

    public String getDatebyday() {
        return datebyday;
    }

    public void setDatebyday(String datebyday) {
        this.datebyday = datebyday;
    }

    @XmlElement
    private String datebyday;

    public String getChkYn() {
        return chkYn;
    }

    public void setChkYn(String chkYn) {
        this.chkYn = chkYn;
    }

    @XmlElement
    private String chkYn;




    public String getDayweek() {
        return dayweek;
    }

    public void setDayweek(String dayweek) {
        this.dayweek = dayweek;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @XmlElement
    private Integer count;
    @XmlElement
    private Integer isDelete;

    public Integer getIdx() {
        return idx;
    }

   public Integer getnextIdx() {
        return nextIdx;
    }

    public void setnextIdx(Integer nextIdx) {
        this.nextIdx = nextIdx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getStoreIdx() {
        return storeIdx;
    }

    public void setStoreIdx(Integer storeIdx) {
        this.storeIdx = storeIdx;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}