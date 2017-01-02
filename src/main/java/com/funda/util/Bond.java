package com.funda.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Bond {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static String addDays(String 기산일, int month) throws ParseException
    {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(formatter.parse(기산일));
        calendar.add(Calendar.MONTH, month);
        String added_date = null;
        added_date = formatter.format(calendar.getTime());
        return added_date;
    }

    private Payment[] paymentForDebtor;
    private Payment[] paymentForCreditor;
    private void updateData() throws ParseException
    {
        paymentForDebtor = new Payment[총기간];
        paymentForCreditor = new Payment[총기간];
        int i;
        for (i = 0; i < 총기간; i++)
        {
            paymentForDebtor[i] = new Payment();
            paymentForCreditor[i] = new Payment();
            paymentForDebtor[i] = generatePayment(i + 1, true);
            paymentForCreditor[i] = generatePayment(i + 1, false);
            paymentForDebtor[i].date = addDays(채무자기산일, i +1);
            paymentForCreditor[i].date = addDays(채권자기산일, i +1);
        }

        for (i = 0; i < 총기간; i++)
        {
            채무자전체이자 += paymentForDebtor[i].interestAfterTax();
            채권자전체이자 += paymentForCreditor[i].interestAfterTax();
        }
        if (펀딩타입 >= 4)
        {
            int 원금합_보상용_채권자 = 0;
            int 원금합_보상용_채무자 = 0;
            for (i = 0; i < 총기간; i++)
            {
                원금합_보상용_채권자 += paymentForCreditor[i].principal;
                원금합_보상용_채무자 += paymentForDebtor[i].principal;
            }
            int 보상량_채권자 = 대출원금 - 원금합_보상용_채권자;
            int 보상량_채무자 = 대출원금 - 원금합_보상용_채무자;
            paymentForCreditor[총기간 - 1].principal += 보상량_채권자;
            paymentForDebtor[총기간 - 1].principal += 보상량_채무자;
        }
    }


    public Bond(int 대출원금, double 연이율, double 지원이율, int 총기간, int 거치기간, double 이자소득세율, String 채권자기산일2, String 채무자기산일2, int 펀딩타입) throws ParseException
    {
        this.채권자기산일 = 채권자기산일2;
        this.채무자기산일 = 채무자기산일2;
        this.대출원금 = 대출원금;
        this.연이율 = 연이율;
        this.지원연이율 = 지원이율;
        this.거치기간 = 거치기간;
        this.총기간 = 총기간;
        this.이자소득세율 = 이자소득세율;
        this.펀딩타입 = 펀딩타입;
        if(펀딩타입==5)
        {
            this.거치기간 = 총기간 - 1;
        }
        updateData();
    }
    private int 채무자전체이자;
    private int 채권자전체이자;
    private int 대출원금;
    private double 연이율;
    private double 지원연이율;
    private int 총기간;
    private int 거치기간;
    private int 펀딩타입;
    private double 이자소득세율;
    private String 채권자기산일;
    private String 채무자기산일;
    boolean is채무자 = true;

    public int get대출원금() { return 대출원금; }

    public int 상환기간(int 총기간, int 거치기간) // 상환기간
    {
        return 총기간 - 거치기간;
    }

    public double 표시월이율(double 연이율) //공시이율
    {
        return 연이율 / 12.0;
    }
    public double 채무자월이율(double 연이율, double 지원연이율)
    {
        return (연이율 - 지원연이율) / 12.0;
    }

    public double 채권자월이율(double 연이율)
    {
        return 연이율 / 12.0;
    }
    public int 채무자의총이자(int 채무자전체이자)
    {
        return 채무자전체이자;
    }
    public int 채무자의월납입금(double 연이율, double 지원연이율, int 대출원금, int 총기간, int 거치기간)
    {
        double 채무자월이율 = 채무자월이율(연이율,지원연이율);
        return calcInstallment(대출원금, 채무자월이율, 총기간 - 거치기간);
    }

    public int 채권자의월납입금(int 대출원금, int 총기간, int 거치기간, double 연이율)
    {
        double 채권자월이율 = 채권자월이율(연이율);
        return calcInstallment(대출원금, 채권자월이율, 총기간 - 거치기간);
    }

    public int getTotalAmountAfterTax(boolean is채무자)
    {
        int i;
        int retval = 0; ;
        for (i = 1; i <= 총기간; i++)
        {
            //    Payment tt = generatePayment(i, is채무자);
            //    retval += tt.totalAmountAfterTax;
            if (!is채무자)
            {
                retval += paymentForCreditor[i-1].totalAmountAfterTax();
            }
            else
            {
                retval += paymentForDebtor[i-1].totalAmountAfterTax();
            }
        }
        return retval;
    }
    public int getTotalAmountBeforeTax(boolean is채무자)
    {
        int i;
        int retval = 0; ;
        for (i = 1; i <= 총기간; i++)
        {
            Payment tt = generatePayment(i, is채무자);
            retval += tt.totalAmountAfterTax();
        }
        return retval;
    }
    public int getTotalTax(boolean is채무자)
    {
        int i;
        int retval = 0; ;
        for (i = 1; i <= 총기간; i++)
        {
            Payment tt = generatePayment(i, is채무자);
            retval += tt.tax();
        }
        return retval;
    }
    public int getTotalInterestAfterTax(boolean is채무자)
    {
        int i;
        int retval = 0; ;
        for (i = 1; i <= 총기간; i++)
        {
            Payment tt = generatePayment(i, is채무자);
            retval += tt.interestAfterTax();
        }
        return retval;
    }
    public int getTotalInterestBeforeTax(boolean is채무자)
    {
        int i;
        int retval = 0; ;
        for (i = 1; i <= 총기간; i++)
        {
            Payment tt = generatePayment(i, is채무자);
            retval += tt.interestBeforeTax;
        }
        return retval;
    }
    public Payment getPayment(int count, boolean is채무자)
    {
        if (count <= 0 || count > 총기간) return null;

        if (is채무자)
        {
            return paymentForDebtor[count - 1];
        }
        else
        {
            return paymentForCreditor[count - 1];
        }
    }
    private Payment generatePayment(int count, boolean is채무자)
    {
        if (count <= 0 || count > 총기간) return null;

        Payment payment = new Payment();
        payment.index = count;
        double 채무자월이율 = 0;
        double 채권자월이율 = 0;
        if (count <= 거치기간)
        {
            if (is채무자)
            {
                payment.principal = 0;

                채무자월이율 = 채무자월이율(연이율, 지원연이율);
                payment.interestBeforeTax = (int)Math.floor(대출원금 * 채무자월이율);
                payment.tax_national = 0;
                payment.tax_local = 0;

            }
            else
            {
                채권자월이율  = 채권자월이율(연이율);
                payment.principal = 0;
                payment.interestBeforeTax = (int)Math.ceil(대출원금 * 채권자월이율);


                if (펀딩타입 >= 4)
                {
                    // 거치기간임, 4: 원리금균등, 5: 만기상환

                    payment.tax_national = (int)Math.floor(payment.interestBeforeTax * 0.25);
                    payment.tax_national = (payment.tax_national / 10) * 10;

                    payment.tax_local = payment.tax_national / 10;
                    payment.tax_local = (payment.tax_local / 10) * 10;

                }
                else
                {
                    payment.tax_national = (int)Math.floor(payment.interestBeforeTax * 0.25);
                    payment.tax_local = (int)Math.round(payment.interestBeforeTax * 0.025);
                }


            }

        }
        else
        {

            int 채무자의월납입금 = 0;
            if (is채무자)
            {
                payment.index = count;
                payment.tax_national = 0;
                payment.tax_local = 0;

                채무자월이율 = 채무자월이율(연이율, 지원연이율);
                채무자의월납입금  = 채무자의월납입금(연이율, 지원연이율, 대출원금, 총기간, 거치기간);

                int interest_money = calcInterest(대출원금, 채무자월이율, 채무자의월납입금, count - 거치기간, count - 거치기간);

                payment.principal = 채무자의월납입금 - interest_money;

                payment.interestBeforeTax = interest_money;
                payment.tax_national = 0;
                payment.tax_local = 0;

            }
            else
            {
                payment.index = count;

                int 채권자의월납입금 = 0;
                int 상환기간 = 0;
                if (펀딩타입 == 1)
                {
                    // 펀딩타입 1~3은 원천징수

                    int 세후월입금되는돈 = (int)Math.floor((double)(채권자의월납입금 * 상환기간) / (double)(상환기간));
                    int 원금 = (int)Math.floor((double)대출원금 / (double)상환기간);
                    int 세전이자 = 세후월입금되는돈 - 원금;
                    int 세후이자 = (int)Math.floor((double)세전이자 * (1.0 - 0.0));
                    int t;
                    t = 0;
                    payment.principal = 원금;
                    payment.interestBeforeTax = 세전이자;
                    payment.tax_national = (int)Math.floor(세전이자 * 0.0);
                }
                else if (펀딩타입 == 2)
                {
                    int 세후월입금되는돈 = (int)Math.floor((double)(채권자의월납입금 * 상환기간) / (double)(상환기간));
                    int 원금 = (int)Math.floor((double)대출원금 / (double)상환기간);
                    int 세전이자 = 세후월입금되는돈 - 원금;
                    int 세후이자 = (int)Math.floor((double)세전이자 * (1.0 - 0.25));
                    int t;
                    t = 0;
                    payment.principal = 원금;
                    payment.interestBeforeTax = 세전이자;
                    payment.tax_national = (int)Math.floor(세전이자 * 0.25);
                }
                else if (펀딩타입 == 3)
                {

                    int 세후월입금되는돈 = (int)Math.floor((double)(채권자의월납입금 * 상환기간) / (double)(상환기간));
                    int 원금 = (int)Math.floor((double)대출원금 / (double)상환기간);
                    int 세전이자 = 세후월입금되는돈 - 원금;

                    payment.tax_national = (int)Math.floor(세전이자 * 0.275);

                    int interest_money = calcInterest(대출원금,
                            채권자월이율,
                            채권자의월납입금,
                            count - 거치기간,
                            count - 거치기간);

                    payment.principal = 채무자의월납입금 - interest_money;
                    payment.interestBeforeTax = interest_money;

                }
                else if (펀딩타입 == 4)
                {
                    payment.tax_national = (int)Math.ceil((double)채권자전체이자 / (double)총기간 * 이자소득세율);

                    채권자월이율 = 채권자월이율(연이율);
                    채권자의월납입금  = 채권자의월납입금(대출원금, 총기간, 거치기간, 연이율);

                    int interest_money = calcInterest(대출원금,
                            채권자월이율,
                            채권자의월납입금,
                            count - 거치기간,
                            count - 거치기간);

                    payment.principal = 채권자의월납입금 - interest_money;

                    payment.tax_national = (int)Math.floor(interest_money * 0.25);
                    payment.tax_national = (payment.tax_national / 10) * 10;

                    payment.tax_local = payment.tax_national / 10;
                    payment.tax_local = (payment.tax_local / 10) * 10;

                    payment.interestBeforeTax = interest_money;
                }
                else if (펀딩타입 == 5)
                {
                    payment.tax_national = (int)Math.ceil((double)채권자전체이자 / (double)총기간 * 이자소득세율);

                    채권자월이율 = 채권자월이율(연이율);
                    int interest_money = (int)Math.floor(대출원금 * 채권자월이율);

                    //payment.principal = 채무자의월납입금 - interest_money;
                    payment.principal = 대출원금;
                    payment.tax_national = (int)Math.floor(interest_money * 0.25);
                    payment.tax_national = (payment.tax_national / 10) * 10;

                    payment.tax_local = payment.tax_national / 10;
                    payment.tax_local = (payment.tax_local / 10) * 10;

                    payment.interestBeforeTax = interest_money;
                }
            }

        }
        return payment;
    }

    private int calcInstallment(int loan, double monthlyRate, int totalPeriod)
    {
        // TODO Auto-generated method stub

        return (int)Math.ceil(((loan * monthlyRate) * Math.pow((1 + monthlyRate), totalPeriod)) / (Math.pow((1 + monthlyRate), totalPeriod) - 1));
    }

    private int calcInterest(int loan, double interest, int installment, int count, int total)
    {
        // TODO Auto-generated method stub

        count--;
        if (count == 0)
            return (int)(loan * interest);

        loan = (int)(loan * (1 + interest) - installment);


        return calcInterest(loan, interest, installment, count, total);
    }
}
