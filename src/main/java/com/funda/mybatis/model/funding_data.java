package com.funda.mybatis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="funding_data")
public class funding_data {

    @XmlElement
    private Integer idx;
    @XmlElement
    private Integer storeIdx;
    @XmlElement
    private String code;
    @XmlElement
    private String title;
    @XmlElement
    private Integer visible;
    @XmlElement
    private Integer extApiOpen;
    @XmlElement
    private Integer announcedAmount;
    @XmlElement
    private Integer totalAmount;
    @XmlElement
    private Integer maxInvestAmount;
    @XmlElement
    private Integer monthlyRepaymentGrace;
    @XmlElement
    private Integer monthlyRepayment;
    @XmlElement
    private Float interestRate;
    @XmlElement
    private Float accruedInterestRate;
    @XmlElement
    private Float fundaSupportInterestRate;
    @XmlElement
    private String repaymentMethod;
    @XmlElement
    private Integer loanPeriod;
    @XmlElement
    private Integer gracePeriod;
    @XmlElement
    private Date contractDate;
    @XmlElement
    private Date beginningDate;
    @XmlElement
    private Date interestDate;
    @XmlElement
    private Date monthlyRepaymentDate;
    @XmlElement
    private Integer score;
    @XmlElement
    private Float defaultRate;
    @XmlElement
    private Integer niceGrade;
    @XmlElement
    private Float niceDefaultRate;
    @XmlElement
    private Date updateDate;
    @XmlElement
    private Date disclosureDate;
    @XmlElement
    private Date investmentStartDate;
    @XmlElement
    private Date registerDate;
    @XmlElement
    private Date investmentApplicationDate;
    @XmlElement
    private Integer fundingStyle;
    @XmlElement
    private Integer isActual;
    @XmlElement
    private Integer fundingType;
    @XmlElement
    private Integer additionalInterestFlag;
    @XmlElement
    private String status;
    @XmlElement
    private String repaymentStatus;
    @XmlElement
    private String depositStatus;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getStoreIdx() {
        return storeIdx;
    }

    public void setStoreIdx(Integer storeIdx) {
        this.storeIdx = storeIdx;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Integer getExtApiOpen() {
        return extApiOpen;
    }

    public void setExtApiOpen(Integer extApiOpen) {
        this.extApiOpen = extApiOpen;
    }

    public Integer getAnnouncedAmount() {
        return announcedAmount;
    }

    public void setAnnouncedAmount(Integer announcedAmount) {
        this.announcedAmount = announcedAmount;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getMaxInvestAmount() {
        return maxInvestAmount;
    }

    public void setMaxInvestAmount(Integer maxInvestAmount) {
        this.maxInvestAmount = maxInvestAmount;
    }

    public Integer getMonthlyRepaymentGrace() {
        return monthlyRepaymentGrace;
    }

    public void setMonthlyRepaymentGrace(Integer monthlyRepaymentGrace) {
        this.monthlyRepaymentGrace = monthlyRepaymentGrace;
    }

    public Integer getMonthlyRepayment() {
        return monthlyRepayment;
    }

    public void setMonthlyRepayment(Integer monthlyRepayment) {
        this.monthlyRepayment = monthlyRepayment;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    public Float getAccruedInterestRate() {
        return accruedInterestRate;
    }

    public void setAccruedInterestRate(Float accruedInterestRate) {
        this.accruedInterestRate = accruedInterestRate;
    }

    public Float getFundaSupportInterestRate() {
        return fundaSupportInterestRate;
    }

    public void setFundaSupportInterestRate(Float fundaSupportInterestRate) {
        this.fundaSupportInterestRate = fundaSupportInterestRate;
    }

    public String getRepaymentMethod() {
        return repaymentMethod;
    }

    public void setRepaymentMethod(String repaymentMethod) {
        this.repaymentMethod = repaymentMethod == null ? null : repaymentMethod.trim();
    }

    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Integer loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public Integer getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(Integer gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Date getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(Date beginningDate) {
        this.beginningDate = beginningDate;
    }

    public Date getInterestDate() {
        return interestDate;
    }

    public void setInterestDate(Date interestDate) {
        this.interestDate = interestDate;
    }

    public Date getMonthlyRepaymentDate() {
        return monthlyRepaymentDate;
    }

    public void setMonthlyRepaymentDate(Date monthlyRepaymentDate) {
        this.monthlyRepaymentDate = monthlyRepaymentDate;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Float getDefaultRate() {
        return defaultRate;
    }

    public void setDefaultRate(Float defaultRate) {
        this.defaultRate = defaultRate;
    }

    public Integer getNiceGrade() {
        return niceGrade;
    }

    public void setNiceGrade(Integer niceGrade) {
        this.niceGrade = niceGrade;
    }

    public Float getNiceDefaultRate() {
        return niceDefaultRate;
    }

    public void setNiceDefaultRate(Float niceDefaultRate) {
        this.niceDefaultRate = niceDefaultRate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getDisclosureDate() {
        return disclosureDate;
    }

    public void setDisclosureDate(Date disclosureDate) {
        this.disclosureDate = disclosureDate;
    }

    public Date getInvestmentStartDate() {
        return investmentStartDate;
    }

    public void setInvestmentStartDate(Date investmentStartDate) {
        this.investmentStartDate = investmentStartDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getInvestmentApplicationDate() {
        return investmentApplicationDate;
    }

    public void setInvestmentApplicationDate(Date investmentApplicationDate) {
        this.investmentApplicationDate = investmentApplicationDate;
    }

    public Integer getFundingStyle() {
        return fundingStyle;
    }

    public void setFundingStyle(Integer fundingStyle) {
        this.fundingStyle = fundingStyle;
    }

    public Integer getIsActual() {
        return isActual;
    }

    public void setIsActual(Integer isActual) {
        this.isActual = isActual;
    }

    public Integer getFundingType() {
        return fundingType;
    }

    public void setFundingType(Integer fundingType) {
        this.fundingType = fundingType;
    }

    public Integer getAdditionalInterestFlag() {
        return additionalInterestFlag;
    }

    public void setAdditionalInterestFlag(Integer additionalInterestFlag) {
        this.additionalInterestFlag = additionalInterestFlag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRepaymentStatus() {
        return repaymentStatus;
    }

    public void setRepaymentStatus(String repaymentStatus) {
        this.repaymentStatus = repaymentStatus == null ? null : repaymentStatus.trim();
    }

    public String getDepositStatus() {
        return depositStatus;
    }

    public void setDepositStatus(String depositStatus) {
        this.depositStatus = depositStatus == null ? null : depositStatus.trim();
    }
}