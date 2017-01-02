package com.funda.kcb;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by wonjun-pc on 2016-05-30.
 */
//"19880418", "1", "01050400258", "나원준"
public class KCBPerson {


    public boolean isExceededMaximumCreditLine() {
        return exceededMaximumCreditLine;
    }

    public void setExceededMaximumCreditLine(boolean exceededMaximumCreditLine) {
        this.exceededMaximumCreditLine = exceededMaximumCreditLine;
    }

    public boolean isHasTooLowScore() {
        return hasTooLowScore;
    }

    public void setHasTooLowScore(boolean hasTooLowScore) {
        this.hasTooLowScore = hasTooLowScore;
    }

    public boolean isHasTooLowLimit() {
        return hasTooLowLimit;
    }

    public void setHasTooLowLimit(boolean hasTooLowLimit) {
        this.hasTooLowLimit = hasTooLowLimit;
    }

    private boolean hasTooLowLimit;

    private boolean exceededMaximumCreditLine;

    private boolean hasTooLowScore;

    private int rainbowscore;

    public int getCPScount() {
        return CPScount;
    }

    public void setCPScount(int CPScount) {
        this.CPScount = CPScount;
    }

    private int CPScount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    private int amount;

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    private double sales;

    private double expense;

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    private double limit;

    private String period;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    private int idx;

    private int rank;

    public int getFrci() {
        return frci;
    }

    public void setFrci(int frci) {
        this.frci = frci;
    }

    public int getiIndex() {
        return iIndex;
    }

    public void setiIndex(int iIndex) {
        this.iIndex = iIndex;
    }

    private int frci;

    private int iIndex;


    private String storename;

    private boolean isApproved;

    private String birthdate;

    private String sex;

    private String phone;

    private String name;

    private String url;

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    private String originalUrl;

    private String registerkey;

    private ArrayList<KCBOptions> options;

    private ArrayList<String> reasons;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public ArrayList<KCBOptions> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<KCBOptions> options) {
        this.options = options;
    }

    public ArrayList<String> getReasons() {
        return reasons;
    }

    public void setReasons(ArrayList<String> reasons) {
        this.reasons = reasons;
    }


    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public int getRainbowscore() {
        return rainbowscore;
    }

    public void setRainbowscore(int rainbowscore) {
        this.rainbowscore = rainbowscore;
    }


    public ArrayList<KCB371> getLabel() {
        return label;
    }

    public void setLabel(ArrayList<KCB371> label) {
        this.label = label;
    }

    private ArrayList<KCB371> label;

    public String[] getReportIdx() {
        return reportIdx;
    }

    public void setReportIdx(String[] reportIdx) {
        this.reportIdx = reportIdx;
    }

    private String[] reportIdx;

    public ArrayList<String[]> getReport() {
        return report;
    }

    public void setReport(ArrayList<String[]> report) {
        this.report = report;
    }

    private ArrayList<String[]> report;

    public ArrayList<String[]> getReport_label() {
        return report_label;
    }

    public void setReport_label(ArrayList<String[]> report_label) {
        this.report_label = report_label;
    }

    private ArrayList<String[]> report_label;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    private String responseCode;

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    private String ok;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    private String errorMsg;

    public String getReplacekey() {
        return replacekey;
    }

    public void setReplaceKey(String replacekey) {
        this.replacekey = replacekey;
    }

    private String replacekey;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRegisterkey() {
        return registerkey;
    }

    public void setRegisterkey(String registerkey) {
        this.registerkey = registerkey;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
