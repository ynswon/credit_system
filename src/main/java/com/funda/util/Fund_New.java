package com.funda.util;


/**
 * Created by wonjun-pc on 2016-05-30.
 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.text.ParseException;

public class Fund_New
{
    //jdbc:mysql://14.63.216.102:3306/model1?useUnicode=true&useUnicode=true&characterEncoding=UTF-8
    private static String url = "jdbc:mysql://14.63.216.102:3306/model1?useUnicode=true&useUnicode=true&characterEncoding=UTF-8";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String username = "model1_test";
    private static String password = "1!9b2f@87$aa*c";
    private static Connection con;

    public static void main(String args[]) throws ParseException
    {
        //	System.out.println("test");
        //xmlTest();
//    System.out.println(getFundingData(80));

    }

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found.");
        }
        return (Connection) con;
    }

    public static void xmlTest() throws SAXException, IOException, ParserConfigurationException, FactoryConfigurationError, XPathExpressionException
    {
        try{

            InputSource is = new InputSource(new FileReader("C:\\test.xml"));
            Document document = (Document) DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);

            //Document document =DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("http://xxx.com");
            // xpath 생성
            XPath xpath = XPathFactory.newInstance().newXPath();

            String expression = "//*/input";
            NodeList cols = (NodeList) xpath.compile(expression).evaluate(document, XPathConstants.NODESET);

            System.out.println(cols.getLength());

            for( int idx=0; idx<cols.getLength(); idx++ ){

                ///String ssn= cols.item(idx).getAttributes().item(0).getNodeValue();
                // System.out.println("금액................"+ssn);

                expression = "//*/funding_idx";
                String firstName = xpath.compile(expression).evaluate(document);
                System.out.println("투자금액................"+firstName);

                expression = "//*/amount";
                String lastName = xpath.compile(expression).evaluate(document);
                System.out.println("월상환금_거치_세전................"+lastName);

            }

        }catch(Exception e){
            e.printStackTrace();
        }

        //Document document =DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("http://xxx.com");
        // xpath 생성

        int 펀딩idx = 0;
        int 투자희망금액 = 100000;


        InputSource   is = new InputSource(new FileReader("C:\\test.xml"));
        Document document = (Document) DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);

        XPath  xpath = XPathFactory.newInstance().newXPath();

        String expression="";
        expression = "//*/funding_idx";

        String funding_idx = xpath.compile(expression).evaluate(document);
        펀딩idx = Integer.parseInt(funding_idx);

        expression = "//*/amount";
        String amount = xpath.compile(expression).evaluate(document);
        투자희망금액 = Integer.parseInt(amount);


    }

    @SuppressWarnings("unchecked")
    public String getFundingData(long id, int amount) throws SQLException, SAXException, IOException, ParserConfigurationException, FactoryConfigurationError, XPathExpressionException, ParseException
    {
        int i, j;

        Connection con = getConnection();
        JSONObject item = new JSONObject();

        long 펀딩idx = 0;
        //int 투자희망금액 = 100000;

        double 이율;
        int sample_투자금액;


        int 투자희망금액 = (amount==0 ? 100000 : amount);


        String sql  = "select idx, announced_amount, max_invest_amount, store_idx as '상점idx', total_amount as '대출금'"
                + "  , interest_rate as '연이자율', funda_support_interest_rate as '지원이자', " + "\r\n" +
                "     interest_date as '기산일', monthly_repayment_date as '채권자기산일', total_period as '대출기간', grace_period as '거치기간' "
                + "			, funding_type as '펀딩타입' " + "\r\n" +
                "        from model1.funding_data where idx=" + id;

        펀딩idx = id;

        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs			= pstmt.executeQuery();


        int 		모집금액  		 = 0;
        int 		최대투자가능금액   = 0;
        double 		공시연이율  	 = 0;
        double 		지원이자율 		 = 0;
        int 		총기간  = 24, 거치기간 = 0;
        double 		tax_rate = 0.0;
        String 		채무자기산일    = null ;
        String 		채권자기산일	= null;
        int 		펀딩타입 = 5;



        boolean _fetched_flag = false;
        while (rs.next())
        {
            모집금액  		  = rs.getInt("announced_amount");
            최대투자가능금액    = rs.getInt("max_invest_amount");
            공시연이율 		  = rs.getDouble("연이자율");
            총기간 		        = rs.getInt("대출기간");
            거치기간		  = rs.getInt("거치기간");
            펀딩타입 		  = rs.getInt("펀딩타입");

            채무자기산일 	  = rs.getString("기산일");
            채권자기산일 	  = rs.getString("채권자기산일");
            //  break;
            _fetched_flag = true;
        }

        if (_fetched_flag == false)
        {
            rs.close();
            con.close();
            return "";
        }

        switch (펀딩타입)
        {
            case 1:
                tax_rate = 0.0;
                break;
            case 2:
                tax_rate = 0.25;
                break;
            case 3:
                tax_rate = 0.275;
                break;
        }

        if (최대투자가능금액  > 모집금액 )
        {
            모집금액  = 최대투자가능금액 ;
        }


        //String output = "";

        JSONObject input    = new JSONObject();
        JSONObject output   = new JSONObject();
        JSONObject template = new JSONObject();
        JSONObject 투자가능금액목록_json = new JSONObject();
        JSONArray 금액_json = new JSONArray();

        input.put("funding_idx" , String.valueOf(펀딩idx));


        // 각 상황별 투자 금액 안내
        int[] increment_array = new int[] {1, 2, 3, 4, 5};
        int offset = 100000;
        boolean _flag_template_end = false;
        int k;
        for (i = 0; true; i++)
        {
            for (j = 0; j < increment_array.length; j++)
            {

                JSONObject 금액_detail = new JSONObject();

                sample_투자금액 = offset * increment_array[j];

                if (최대투자가능금액  < sample_투자금액)
                {
                    _flag_template_end = true;
                    break;
                }
                int sum_월상환금_거치_세전 = 0;
                int sum_월상환금_거치_세후 = 0;
                int sum_월상환금_원리금_세전 = 0;
                int sum_월상환금_원리금_세후 = 0;

                Bond bond = new Bond(sample_투자금액, 공시연이율 , 지원이자율, 총기간 , 거치기간, tax_rate, 채무자기산일 , 채권자기산일, 펀딩타입);

                for (k = 0; k < 거치기간; k++)
                {
                    sum_월상환금_거치_세전 += bond.getPayment(k + 1, false).totalAmountBeforeTax();
                    sum_월상환금_거치_세후 += bond.getPayment(k + 1, false).totalAmountAfterTax();
                }
                for (k = 거치기간; k < 총기간 ; k++)
                {
                    sum_월상환금_원리금_세전 += bond.getPayment(k + 1, false).totalAmountBeforeTax();
                    sum_월상환금_원리금_세후 += bond.getPayment(k + 1, false).totalAmountAfterTax();
                }
                if (거치기간 > 0)
                {
                    sum_월상환금_거치_세전 /= 거치기간;
                    sum_월상환금_거치_세후 /= 거치기간;
                }
                sum_월상환금_원리금_세전 /= (총기간  - 거치기간);
                sum_월상환금_원리금_세후 /= (총기간  - 거치기간);



                금액_detail.put("총상환금액_세후"		, String.valueOf(bond.getTotalAmountAfterTax(false)));
                금액_detail.put("총이자수익_세후"		, String.valueOf(bond.getTotalInterestAfterTax(false)));
                금액_detail.put("총이자수익_세전"		, String.valueOf(bond.getTotalInterestBeforeTax(false)));
                금액_detail.put("월상환금_원리금_세후"	, String.valueOf(sum_월상환금_원리금_세후));
                금액_detail.put("월상환금_원리금_세전"	, String.valueOf(sum_월상환금_원리금_세전));
                금액_detail.put("월상환금_거치_세후"	, String.valueOf(sum_월상환금_거치_세후));
                금액_detail.put("월상환금_거치_세전"	, String.valueOf(sum_월상환금_거치_세전));
                금액_detail.put("투자금액"			, String.valueOf(sample_투자금액));



                금액_json.add(금액_detail);
            }
            if (_flag_template_end)
            {
                break;
            }

            offset *= 10;
        }

        JSONObject 금액_list = new JSONObject();
        금액_list.put("금액", 금액_json);

        투자가능금액목록_json.put("투자가능금액목록", 금액_list);
        //template.put("template", 투자가능금액목록_json);

        JSONObject funding_data_json 	= new JSONObject();
        JSONObject funding_data_detail  = new JSONObject();

        funding_data_detail.put("모집금액"			 , String.valueOf(모집금액 ));
        funding_data_detail.put("최대투자가능금액"		 , String.valueOf(최대투자가능금액 ));
        funding_data_detail.put("모집금액_만원"		 , String.valueOf((모집금액  / 10000) ));
        funding_data_detail.put("최대투자가능금액_만원"  , String.valueOf(최대투자가능금액 / 10000 ));

        funding_data_json.put("funding_data", funding_data_detail);

        //output.put("output", funding_data_json);


        JSONObject summary_json 	= new JSONObject();
        JSONObject summary_detail 	= new JSONObject();
        JSONObject schedule		 	= new JSONObject();
        JSONObject schedule_detail 	= new JSONObject();

        JSONArray  repayment  		= new JSONArray();


        //지원이자율 0
        Bond mybond = new Bond(투자희망금액, 공시연이율 , 지원이자율, 총기간 , 거치기간, tax_rate, 채권자기산일, 채무자기산일 , 펀딩타입);






        int 거치기간개수   = 0;
        int 원리금상환개수  = 0;
        int 거치기간총세후  = 0;
        int 원리금상환총세후 = 0;
        for (i = 0; i < 총기간 ; i++)
        {
            JSONObject replayment_json = new JSONObject();

            Payment mypayment = mybond.getPayment(i + 1, false);


            replayment_json.put("회차"	, String.valueOf(i+1));
            replayment_json.put("지급일"	, mypayment.date.toString()); //("yyyy-MM-dd")
            replayment_json.put("원금"	, String.valueOf(mypayment.principal));
            replayment_json.put("세전이자"	, String.valueOf(mypayment.interestBeforeTax));
            replayment_json.put("세후이자"	, String.valueOf(mypayment.interestBeforeTax-mypayment.tax() ));
            replayment_json.put("세금"	, String.valueOf(mypayment.tax()));
            replayment_json.put("소득세"	, String.valueOf(mypayment.tax_national));
            replayment_json.put("지방소득세", String.valueOf(mypayment.tax_local));

            int 합합  = mypayment.totalAmountBeforeTax()-mypayment.tax();

            if (mypayment.principal == 0)
            {
                거치기간개수++;
                거치기간총세후 += 합합 ;
            }
            else
            {
                원리금상환개수++;
                원리금상환총세후 += 합합 ;
            }

            replayment_json.put("합계"	, String.valueOf(합합));

            repayment.add(replayment_json);
        }
        schedule_detail.put("repayment"	, repayment);

        schedule.put("schedule"			, schedule_detail);

        summary_detail.put("펀딩타입", 		String.valueOf(펀딩타입));
        summary_detail.put("총기간", 		String.valueOf(총기간));
        summary_detail.put("거치기간", 		String.valueOf(거치기간));
        summary_detail.put("공시연이율", 	String.valueOf(공시연이율));

        if (원리금상환개수 > 0)
        {
            summary_detail.put("월_세후_원리금", 		String.valueOf((원리금상환총세후 / 원리금상환개수)));
        }

        if (거치기간개수 > 0)
        {
            summary_detail.put("월_세후_거치", 		String.valueOf((거치기간총세후 / 거치기간개수)));
        }

        summary_detail.put("총합", 		String.valueOf(mybond.getTotalAmountAfterTax(false)));
        summary_detail.put("세금",		String.valueOf(mybond.getTotalTax(false)));
        summary_detail.put("세후이자", 		String.valueOf(mybond.getTotalInterestAfterTax(false)));
        summary_detail.put("세전이자",		String.valueOf(mybond.getTotalInterestBeforeTax(false)));
        summary_detail.put("원금_만원",		String.valueOf(투자희망금액 / 10000));
        summary_detail.put("원금", 		String.valueOf(투자희망금액));


        //summary_json.put("summary",	    summary_detail);
        // 2000만원 짜리 상품이면
        // 기본은 10%이지만 예외적으로 금액을 10만원 단위로 변경할 수 있음

        //= xml.CreateElement("투자가능금액목록 ");


		/*
		xml.LoadXml(@"
<item>
	<input>
		<funding_idx>7</funding_idx>
		<amount>1000000</amount>
	</input>
	<template>
		<투자가능금액목록 >
		    <금액>
		        <투자금액>100000</투자금액>
		        <월상환금_거치_세전>0</월상환금_거치_세전>
		        <월상환금_거치_세후>7770</월상환금_거치_세후>
		        <월상환금_원리금_세전>0</월상환금_원리금_세전>
		        <월상환금_원리금_세후>7770</월상환금_원리금_세후>
		        <총이자수익_세후>7770</총이자수익_세후>
		        <총상환금액_세후>7770</총상환금액_세후>
		    </금액>
		    <금액>
		        <투자금액>200000</투자금액>
		        <월상환금_거치_세전>0</월상환금_거치_세전>
		        <월상환금_거치_세후>7770</월상환금_거치_세후>
		        <월상환금_원리금_세전>0</월상환금_원리금_세전>
		        <월상환금_원리금_세후>7770</월상환금_원리금_세후>
		        <총이자수익_세후>7770</총이자수익_세후>
		        <총상환금액_세후>7770</총상환금액_세후>
		    </금액>
		</투자가능금액목록 >
	</template>
	<output>
		<funding_data>
		    <모집금액 >5000000</모집금액 >
		    <모집금액 _만원>5000000</모집금액 _만원>
		</funding_data>
		<summary>
		    <원금>100000000</원금>
		    <세전이자>40000</세전이자>
		    <세후이자>30000</세후이자>
		    <세금>10000</세금>
		</summary>
		<schedule>
		    <repayment>
		        <회차>1</회차>
		        <지급일>2015-09-20</지급일>
		        <원금>16254836</원금>
		        <세전이자>1000000</세전이자>
		        <세후이자>750000</세후이자>
		        <세금>250000</세금>
		        <합계>17254836</합계>
		    </repayment>
		    <repayment>
		        <회차>2</회차>
		        <지급일>2015-10-20</지급일>
		        <원금>16417386</원금>
		        <세전이자>837450</세전이자>
		        <세후이자>628088</세후이자>
		        <세금>209363</세금>
		        <합계>17254836</합계>
		    </repayment>
		    <repayment>
		        <회차>3</회차>
		        <지급일>2015-11-20</지급일>
		        <원금>16581566</원금>
		        <세전이자>673270</세전이자>
		        <세후이자>504953</세후이자>
		        <세금>168318</세금>
		        <합계>17254836</합계>
		    </repayment>
		    <repayment>
		        <회차>4</회차>
		        <지급일>2015-12-20</지급일>
		        <원금>16747376</원금>
		        <세전이자>507460</세전이자>
		        <세후이자>380595</세후이자>
		        <세금>126865</세금>
		        <합계>17254836</합계>
		    </repayment>
		    <repayment>
		        <회차>5</회차>
		        <지급일>2016-01-20</지급일>
		        <원금>16914856</원금>
		        <세전이자>339980</세전이자>
		        <세후이자>254985</세후이자>
		        <세금>84995</세금>
		        <합계>17254836</합계>
		    </repayment>
		    <repayment>
		        <회차>6</회차>
		        <지급일>2016-01-20</지급일>
		        <원금>17083980</원금>
		        <세전이자>170830</세전이자>
		        <세후이자>128123</세후이자>
		        <세금>42708</세금>
		        <합계>17254810</합계>
		    </repayment>
		</schedule>
	</output>
</item>");*/

        JSONObject itemset = new JSONObject();
        schedule.put("funding_data", funding_data_detail);

        item.put ("template"	, 투자가능금액목록_json);
        item.put ("summary"		, summary_detail);

        //item.put ("output"		, funding_data_json);
        item.put ("output"    	, schedule);
        item.put ("input"		, input);


        itemset.put("item", item);

        //String xml = XML.toString(json);

        return itemset.toJSONString();

    }



}