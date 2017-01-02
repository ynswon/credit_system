package com.funda.util;

public class Payment {

    public Payment()
    {
        index = 0;
    }

    public int index;
    public String date;

    public int totalAmountBeforeTax()
    {
        return principal + interestBeforeTax;
    }

    public int totalAmountAfterTax()
    {
        return principal + interestBeforeTax - tax();

    }

    public int principal;
    public int interestBeforeTax;
    public int interestAfterTax;
    public int totalAmountAfterTax;

    public int interestAfterTax()
    {
        return interestBeforeTax - (tax_national +tax_local);
        //+ tax_local);
    }

    public int tax()
    {
        return tax_national + tax_local;
    }
    public int tax_national;
    public int tax_local;

    public String ToString()
    {
        String ret;
        ret = String.format("회차\t%s\t원금\t%s\t세전이자\t%s\t국세(25%)\t%s\t지방세(2.5%)\t%s\t세후이자\t%s\t실지급액\t%s",
                index,
                principal,
                interestBeforeTax,
                tax_national,
                tax_local,
                interestAfterTax,
                totalAmountAfterTax,
                totalAmountAfterTax
        );
        return ret;
    }

    public Bond bond;
    int count;
    // 테스트 후 지우기
    public int total1;
    public double total2;
    public int total3;
    public int total4;
    public int total5;
    public int total6;
    public int total7;
    // 여기까지

}
