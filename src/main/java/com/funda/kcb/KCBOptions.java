package com.funda.kcb;

/**
 * Created by wonjun-pc on 2016-10-21.
 */
public class KCBOptions {

    private double rate;
    private int period;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getMonthlyRepay() {
        return monthlyRepay;
    }

    public void setMonthlyRepay(double monthlyRepay) {
        this.monthlyRepay = monthlyRepay;
    }

    private double amount;
    private double monthlyRepay;
}
