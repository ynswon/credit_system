package com.funda.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;


public class Schedule
{
	 public static void main(String[] args){
		 
		 try {
			 //button12_Click();
             Schedule test = new Schedule();
             test.schedule_creditor(89, 89);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    private static String url = "jdbc:mysql://14.63.216.102:3306/model1?useUnicode=true&useUnicode=true&characterEncoding=UTF-8";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String username = "model1_test";
    private static String password = "1!9b2f@87$aa*c";
    private static Connection con;
    private static final Logger logger = LoggerFactory.getLogger(Schedule.class);


    public static Connection getConnection() {
        try {
            logger.info("Connection-..................");
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                System.out.println("디비연결에 실패!");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found.");
        }
        return (Connection)con;
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


    public void schedule_creditor(long start_funding_idx, long end_funding_idx) throws SQLException, ParseException
    {

        logger.info("Method : schedule_creditor-----------------START-------------------------------------");
        Connection con = getConnection();
        String Rec;
        //int start_funding_idx = 85;
        //int end_funding_idx = 85;
        /*String sql = String.format("select idx, store_idx as '상점idx', total_amount as '대출금', interest_rate as '이자', funda_support_interest_rate as '지원이자'" +
                ", interest_date as '기산일'" +
                ", monthly_repayment_date as '채권자기산일', loan_period as '대출기간', grace_period as '거치기간' , funding_type as '펀딩타입' from model1.funding_data " +
                " where %d >= idx and idx>=%d  " +
                "order by idx asc", end_funding_idx, start_funding_idx);
        */
        String sql = String.format("select  idx, store_idx , total_amount , interest_rate , funda_support_interest_rate " +
                ", interest_date " +
                ", monthly_repayment_date , loan_period , grace_period , funding_type  from model1.funding_data " +
                " where %d >= idx and idx>=%d  " +
                "order by idx asc", end_funding_idx, start_funding_idx);


        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();


        while (rs.next())
        {
            int 펀딩idx = rs.getInt("idx");
            String sql1 = "select a.*,b.withholding as 'withholding' from model1.list_creditor a left outer join model1.user b on a.user_idx = b.idx where  investment_state='투자완료' and funding_idx=" + 펀딩idx;
            ResultSet rs1=null;


            PreparedStatement pstmt1 = con.prepareStatement(sql1);
            rs1 = pstmt1.executeQuery();

            HashMap<Integer, Integer> 투자자리스트              = new HashMap<Integer, Integer>();
            HashMap<Integer, Double>  투자자리스트_지원이율     = new HashMap<Integer, Double>();
            HashMap<Integer, Boolean> 투자자리스트_원천징수여부 = new HashMap<Integer, Boolean>();
            while (rs1.next())
            {
                투자자리스트.put(rs1.getInt("user_idx"), rs1.getInt("investment_amount"));
                투자자리스트_지원이율.put(rs1.getInt("user_idx"), rs1.getDouble("funda_support_interest_rate"));
                String 원천징수데이터 = rs1.getString("withholding");
                if (원천징수데이터.equals("여"))
                {
                    투자자리스트_원천징수여부.put(rs1.getInt("user_idx"), true);
                }
                else
                {
                    투자자리스트_원천징수여부.put(rs1.getInt("user_idx"), false);
                }

            }
            rs1.close();


            int 대출금    	= rs.getInt("total_amount"); //대출 금액
            float 이자    	= rs.getFloat("interest_rate");  //대출 연이율
            float 지원이자  = rs.getFloat("funda_support_interest_rate"); //대출 연이율
            int 거치기간    = rs.getInt("grace_period");
            int 총기간 	    = rs.getInt("loan_period");  //총 대출 기간
            int 상점idx     = rs.getInt("store_idx");
            int 펀딩타입    = rs.getInt("funding_type");
            String 채무자기산일 =  rs.getString("interest_date");
            String 채권자기산일 = rs.getString("monthly_repayment_date");
            Bond bond;
            int i;
            String 채무자상환일;
            String 채권자입금일;

            if (true)
            {
                double tax_rate = 0.0;
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
                bond = new Bond(대출금, 이자, 지원이자, 총기간, 거치기간, tax_rate, 채권자기산일, 채무자기산일, 펀딩타입);

                // 월 상환
                for (i = 1; i <= 총기간; i++)
                {
                    채무자상환일 = addDays(채무자기산일, i);
                    Payment ttFor채무자 = bond.getPayment(i, true);
                    String sql2 = "insert into model1.schedule_debtor (store_idx, funding_data_idx, total_amount, payback_present_idx, payback_total_times, due_date) values(?, ?, ?, ?, ?, ?) "
                            + "ON DUPLICATE KEY UPDATE  payback_total_times = ?, due_date = ?";
                    PreparedStatement pstmt2 = con.prepareStatement(sql2);

                    pstmt2.setInt(1, 상점idx);
                    pstmt2.setInt(2, 펀딩idx);
                    pstmt2.setInt(3, ttFor채무자.totalAmountBeforeTax());
                    pstmt2.setInt(4, i);
                    pstmt2.setInt(5, 총기간);
                    pstmt2.setString(6, 채무자상환일);

                    pstmt2.setInt(7, 총기간);
                    pstmt2.setString(8, 채무자상환일);

                    try
                    {
                        pstmt2.executeUpdate();

                    }
                    catch (RuntimeException eeee)
                    {
                    }
                }


            }
            else
            {
                // 일 상환
            }

            if (true) // 투자자 프로세스
            {


                for (Map.Entry<Integer, Integer> data : 투자자리스트.entrySet())
                {
                    boolean 원천징수여부 = 투자자리스트_원천징수여부.get(data.getKey());
                    double tax_rate = 0.0;
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
                    bond = new Bond(data.getValue(), 이자 + 투자자리스트_지원이율.get(data.getKey()), 지원이자, 총기간, 거치기간, tax_rate, 채권자기산일, 채무자기산일, 펀딩타입);
                    int 원금합 = 0;

                    for (i = 1; i <= 총기간; i++)
                    {
                        boolean is_거치기간 = false;
                        Payment ttFor채권자 = bond.getPayment(i, false);
                        채권자입금일 = ttFor채권자.date;
                        if (i <= 거치기간)
                        {
                            is_거치기간 = true;
                        }

                        String sql3 = "insert into model1.schedule_creditor " + "\r\n" +
                                "                            (user_idx, funding_idx, total_amount, principal_before_tax, interest_before_tax, tax, payback_present_idx, payback_total_times, due_date) " + "\r\n" +
                                "                            values(?, ?, ?, ?, ?, ?, ?, ?, ?)" + "\r\n" +
                                "                            ON DUPLICATE KEY UPDATE  total_amount = ?, principal_before_tax = ?, interest_before_tax = ?, tax = ?, payback_present_idx=?, payback_total_times = ?";

                        PreparedStatement pstmt3 = con.prepareStatement(sql3);

                        if(펀딩타입 == 4 || 펀딩타입 == 5)
                        {
                            if (i == 총기간)
                            {
                                i = i;
                            }
                            bond = new Bond(data.getValue(), 이자 + 투자자리스트_지원이율.get(data.getKey()), 지원이자, 총기간, 거치기간, tax_rate, 채권자기산일, 채무자기산일, 펀딩타입);
                            Payment mypayment = bond.getPayment(i, false);

                            double 채권자별비율 = (double)data.getValue() / (double)대출금;
                            int 채권자입금금액 = (int)Math.floor(채권자별비율 * ttFor채권자.totalAmountBeforeTax());
                            int 채권자입금금액에대한원천징수 = (int)Math.floor(채권자별비율 * ttFor채권자.tax());

                            pstmt3.setInt(1, data.getKey());
                            pstmt3.setInt(2, 펀딩idx);
                            int mytax = mypayment.tax();
                            int myinterest_before_tax = mypayment.interestBeforeTax;
                            pstmt3.setInt(3, (int)(mypayment.principal) + myinterest_before_tax - mytax);
                            pstmt3.setInt(4, (int)(mypayment.principal));
                            pstmt3.setInt(6, mytax);
                            if (!원천징수여부)
                            {
                                pstmt3.setInt(6, 0);
                            }
                            int 이자보상량 = ((int)(mypayment.principal) + myinterest_before_tax - mytax) - ((int)(mypayment.principal) + myinterest_before_tax - mytax);
                            if (이자보상량 > 0)
                            {
                                이자보상량 = 이자보상량;
                            }
                            pstmt3.setInt(5, myinterest_before_tax + 이자보상량);
                            pstmt3.setInt(7, i);
                            pstmt3.setInt(8, 총기간);
                            pstmt3.setString(9, 채권자입금일);


                            pstmt3.setInt(10, (int)(mypayment.principal) + myinterest_before_tax - mytax);
                            pstmt3.setInt(11, (int)(mypayment.principal));
                            pstmt3.setInt(12, myinterest_before_tax + 이자보상량);
                            pstmt3.setInt(13, mytax);
                            pstmt3.setInt(14, i);
                            pstmt3.setInt(15, 총기간);


                            try
                            {
                                pstmt3.executeUpdate();
                                logger.info("update");
                            }
                            catch (RuntimeException eeee)
                            {
                                logger.info(String.valueOf(eeee));
                            }
                        }
                    }
                }
            }
        }
        rs.close();
        con.close();

        logger.info("Method : schedule_creditor-----------------END----------------------------------------------");
    }

    public int bank_idx = 1;

    //  schedule creditor update
    public void update_schedule_creditor() throws SQLException
    {

        logger.info("Method : update_schedule_creditor-----------------START-------------------------------------");

        Connection con = getConnection();

        String sql = ("select a.idx as list_creditor_idx, b.idx as schedule_creditor_idx, a.funding_idx,  a.investment_amount as amount, a.user_idx as user_idx, b.payback_present_idx, "
                + " (SELECT sum(principal_before_tax) FROM model1.schedule_creditor where user_idx = a.user_idx and funding_idx = a.funding_idx) as sum " + " from model1.list_creditor a "
                + " left outer join model1.schedule_creditor b on a.funding_idx = b.funding_idx and payback_present_idx = payback_total_times and a.user_idx=b.user_idx where a.user_idx>0; ");
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next())
        {
            Object Rec = String.format("A: %d, B: %d", rs.getInt("list_creditor_idx"), rs.getInt("schedule_creditor_idx"));
            int amount = rs.getInt("amount");
            int user_idx = rs.getInt("user_idx");
            if (rs.getInt("user_idx") == 0)
            {
                continue;
            }
            if (rs.getInt("schedule_creditor_idx") == 0)
            {
                continue;
            }
            int schedule_creditor_idx = -1;
            try
            {
                schedule_creditor_idx = rs.getInt("schedule_creditor_idx");
            }
            catch (RuntimeException ee)
            {
                continue;
            }
            int funding_idx = rs.getInt("funding_idx");
            if (rs.getInt("sum") == 0)
            {
                continue;
            }
            int sum = rs.getInt("sum");
            int diff = amount - sum;
            String[] query = {"begin;", String.format("update model1.schedule_creditor set principal_before_tax = ( principal_before_tax + %1$s) where idx = %2$s and payback_present_idx = payback_total_times",diff,schedule_creditor_idx), String.format("set @sum_a = (SELECT investment_amount FROM model1.list_creditor where user_idx = %1$s and funding_idx = %2$s)", user_idx,funding_idx), String.format("set @sum_b = (SELECT sum(principal_before_tax) FROM model1.schedule_creditor where user_idx = %1$s and funding_idx = %2$s)", user_idx,funding_idx), "select @sum_a as sum_a, @sum_b as sum_b", "commit;"};
            PreparedStatement pstmt2 = con.prepareStatement(query[1]);
            pstmt2.executeUpdate();
        }
        rs.close();
        con.close();
        logger.info("Method : update_schedule_creditor-----------------END-------------------------------------");
    }

    public void schedule_debtor(int start_funding_idx, int end_funding_idx) throws SQLException, ParseException
    {

        logger.info("Method : schedule_debtor----------------------START-------------------------------------");
        Connection con = getConnection();

        //	int end_funding_idx = 79;
        //	int start_funding_idx = 79;
      /*  String sql = (String.format("select idx, store_idx as '상점idx', total_amount as `대출금`, interest_rate as `이자`, funda_support_interest_rate as `지원이자`, interest_date as `기산일`" +
                "               , monthly_repayment_date as `채권자기산일`, loan_period as `대출기간`, grace_period as `거치기간` , funding_type as `펀딩타입` from model1.funding_data " + "\r\n" +
                "                where %d >= idx and idx>=%d order by idx asc", end_funding_idx, start_funding_idx));
*/
        String sql = String.format("select  idx, store_idx , total_amount , interest_rate , funda_support_interest_rate " +
                ", interest_date " +
                ", monthly_repayment_date , loan_period , grace_period , funding_type  from model1.funding_data " +
                " where %d >= idx and idx>=%d  " +
                "order by idx asc", end_funding_idx, start_funding_idx);

        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs            = pstmt.executeQuery();
        while (rs.next())
        {
            int 펀딩idx = rs.getInt("idx");

            String sql1 = "select * from model1.list_creditor where funding_idx=" + 펀딩idx;

            PreparedStatement pstmt1 = con.prepareStatement(sql1);
            ResultSet rs1            = pstmt1.executeQuery();

            HashMap<Integer, Integer> 투자자리스트         = new HashMap<Integer, Integer>();
            HashMap<Integer, Double> 투자자리스트_지원이율 = new HashMap<Integer, Double>();

            while (rs1.next())
            {
                투자자리스트.put(rs1.getInt("user_idx"), rs1.getInt("investment_amount"));
                투자자리스트_지원이율.put(rs1.getInt("user_idx"), (double) rs1.getFloat("funda_support_interest_rate"));
            }
            rs1.close();

            int 대출금     = rs.getInt("total_amount"); //대출 금액
            float 이자     = rs.getFloat("interest_rate");//대출 연이율
            float 지원이자 = rs.getFloat("funda_support_interest_rate");//대출 연이율
            int 거치기간   = rs.getInt("grace_period");
            int 총기간     = rs.getInt("loan_period");//총 대출 기간
            int 상점idx    = rs.getInt("store_idx");
            int 펀딩타입   = rs.getInt("funding_type");
            String 채무자기산일;

            try
            {
                채무자기산일 = rs.getString("interest_date");
            }
            catch (RuntimeException ee11)
            {
                continue;
            }
            String 채권자기산일 =  rs.getString("monthly_repayment_date");
            Bond bond;
            int i;
            String 채무자상환일;
            String 채권자입금일;

            bond        = new Bond(대출금, 이자, 0.0, 총기간, 거치기간, 0.0, 채권자기산일, 채무자기산일, 펀딩타입);
            String sql2 = "update model1.schedule_debtor set due_date = ?" + "\r\n" +
                    "                                where store_idx = ? and funding_data_idx = ? and payback_present_idx = ? and  payback_total_times = ?";

            PreparedStatement pstmt2 = con.prepareStatement(sql2);

            for (i = 1; i <= 총기간; i++)
            {
                boolean is_거치기간 = false;
                Payment ttFor채무자 = bond.getPayment(i, true);
                채무자상환일 = ttFor채무자.date;
                pstmt2.setString(1 , 채무자상환일);
                pstmt2.setInt(2, 상점idx);
                pstmt2.setInt(3, 펀딩idx);
                pstmt2.setInt(4, i);
                pstmt2.setInt(5, 총기간);
                Payment mypayment = bond.getPayment(i, false);
                try
                {
                    pstmt2.executeUpdate();
                }
                catch (RuntimeException eeee)
                {
                }
            }
        }
        con.close();
        logger.info("Method : schedule_debtor-------------------------END----------------------------------------");
    }

    public final  boolean ExistFundingIdx(int 중도상환idx) throws SQLException
    {

        logger.info("Method : ExistFundingIdx-------------------------START---------------------------------------");

        Connection con = getConnection();

        String sql = (String.format("" + "\r\n" +
                "                   SELECT " + "\r\n" +
                "                        count(*) as `count`" + "\r\n" +
                "                    FROM" + "\r\n" +
                "                        model1.schedule_creditor a" + "\r\n" +
                "                    WHERE" + "\r\n" +
                "                        a.funding_idx = %d ", 중도상환idx));
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        int count = 0;
        while (rs.next())
        {
            count = rs.getInt("count");
        }
        rs.close();
        if (count <= 0)
        {
            return false;
        }
        logger.info("Method : ExistFundingIdx------------------------END-------------------------------------");
        return true;
    }

    public final  boolean ProcessEarlyDone(int 중도상환idx, Date 기준일) throws SQLException
    {

        logger.info("Method : ProcessEarlyDone----------------------START-------------------------------------");

        Connection con = getConnection();
        String sql = String.format("" + "\r\n" +
                "                   SELECT " + "\r\n" +
                "                        a.user_idx," + "\r\n" +
                "                        MAX(b.due_date) AS `최종상환일`" + "\r\n" +
                "                    FROM" + "\r\n" +
                "                        model1.list_creditor a" + "\r\n" +
                "                            LEFT OUTER JOIN" + "\r\n" +
                "                        model1.schedule_creditor b ON b.funding_idx = a.funding_idx" + "\r\n" +
                "                            AND b.user_idx = a.user_idx " + "\r\n" +
                "                    WHERE" + "\r\n" +
                "                        a.funding_idx = %d " + "\r\n" +
                "                            AND b.repayment_status IN ('상환완료')" + "\r\n" +
                "                            AND a.investment_state = '투자완료'" + "\r\n" +
                "                    GROUP BY b.user_idx" + "\r\n" +
                "                    ORDER BY b.user_idx", 중도상환idx);
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        HashMap<Integer, Date> last_due_date = new HashMap<Integer, Date>();
        while (rs.next())
        {
            int 유저idx = rs.getInt("user_idx");
            last_due_date.put(유저idx, rs.getDate("최종상환일"));
        }
        rs.close();


        String sql1 = String.format("" + "\r\n" +
                "                SELECT " + "\r\n" +
                "                    a.*," + "\r\n" +
                "                    SUM(principal_before_tax) AS `잔여원금`," + "\r\n" +
                "                    MAX(interest_before_tax)  AS `현재회차이자`," + "\r\n" +
                "                    MIN(b.payback_present_idx) AS `현재상환회차`," + "\r\n" +
                "                    b.payback_total_times AS `총회차`," + "\r\n" +
                "                    MIN(b.due_date) AS `상환예정일`," + "\r\n" +
                "                    (c.interest_rate + a.funda_support_interest_rate) AS `최종이자율`" + "\r\n" +
                "                FROM" + "\r\n" +
                "                    model1.list_creditor a" + "\r\n" +
                "                    LEFT OUTER JOIN" + "\r\n" +
                "                        model1.schedule_creditor b ON b.funding_idx = a.funding_idx AND b.user_idx = a.user_idx " + "\r\n" +
                "                    LEFT OUTER JOIN" + "\r\n" +
                "                        model1.funding_data c on c.idx = a.funding_idx" + "\r\n" +
                "\r\n" +
                "                WHERE" + "\r\n" +
                "                    a.funding_idx = %d " + "\r\n" +
                "                        AND b.repayment_status NOT IN ('상환완료' , '중도상환')" + "\r\n" +
                "                        AND a.investment_state = '투자완료'" + "\r\n" +
                "                GROUP BY b.user_idx" + "\r\n" +
                "                ORDER BY b.user_idx", 중도상환idx);

        PreparedStatement pstmt1 = con.prepareStatement(sql1);
        ResultSet rs1 = pstmt1.executeQuery();

        ArrayList<String> data = new ArrayList<String>();
        String sql2 = null;
        while (rs1.next())
        {
            int 유저idx = rs1.getInt("user_idx");
            int 잔여원금 = 0, 현재회차이자 = 0, 현재상환회차 = 0, 총회차 = 0;
            int 새로계산된이자 = 0;
            int 새로계산된세금 = 0;
            int 새로계산된세금_국세 = 0;
            int 새로계산된세금_지방세 = 0;
            int 상환예정일 = 0;
            int 총투자금액 = rs1.getInt("investment_amount");
            double 최종이자율 = rs1.getDouble("최종이자율");
            잔여원금 = rs1.getInt("잔여원금");
            if (잔여원금 != 0)
            {
                잔여원금 = 잔여원금;
            }
            현재회차이자 = rs1.getInt("현재회차이자");
            현재상환회차 = rs1.getInt("현재상환회차");
            총회차 = rs1.getInt("총회차");
            Date dt = last_due_date.get(유저idx);
            Date dt_now = 기준일;
            long ts = dt_now.getTime() - dt.getTime();
            int td = (int)ts;
            if (td >= 30)
            {
                td = 30;
            }
            double ratio = (30.0 - td) / 30.0;
            새로계산된이자 = (int)Math.round((double)(잔여원금) * 최종이자율 * (double)td / 365.0);
            새로계산된이자 = 현재회차이자;
            새로계산된세금_국세 = (int)((double)새로계산된이자 * 0.25);
            새로계산된세금_국세 = 새로계산된세금_국세 - (새로계산된세금_국세 % 10);
            새로계산된세금_지방세 = 새로계산된세금_국세 / 10;
            새로계산된세금_지방세 = 새로계산된세금_지방세 - (새로계산된세금_지방세 % 10);
            새로계산된세금 = 새로계산된세금_국세 + 새로계산된세금_지방세;

            sql2 = String.format("" + "\r\n" +
                    "                    update model1.schedule_creditor set" + "\r\n" +
                    "                        principal_before_tax = %d," + "\r\n" +
                    "                        interest_before_tax = %d," + "\r\n" +
                    "                        tax = %d," + "\r\n" +
                    "                        tax_national = %d," + "\r\n" +
                    "                        tax_local = %d," + "\r\n" +
                    "                        repayment_status = '중도상환완료'" + "\r\n" +
                    "                    where user_idx = %d and payback_present_idx = %d and funding_idx = %d", 잔여원금, 새로계산된이자, 새로계산된세금, 새로계산된세금_국세, 새로계산된세금_지방세, 유저idx, 현재상환회차, 중도상환idx);
            data.add(sql2);

            sql2 = String.format("" + "\r\n" +
                    "                    update model1.schedule_creditor set" + "\r\n" +
                    "                        principal_before_tax = 0," + "\r\n" +
                    "                        interest_before_tax = 0," + "\r\n" +
                    "                        tax = 0," + "\r\n" +
                    "                        tax_national = 0," + "\r\n" +
                    "                        tax_local = 0," + "\r\n" +
                    "                        repayment_status = '중도상환완료'" + "\r\n" +
                    "                    where user_idx = %d and payback_present_idx > %d and repayment_status = '상환예정' and funding_idx = %d", 유저idx, 현재상환회차, 중도상환idx);

            data.add(sql2);
        }
        rs.close();
        for (String query : data)
        {
            try
            {
                Connection con2 = getConnection();
                PreparedStatement pstmt2 = con2.prepareStatement(query);
                pstmt2.executeUpdate();
            }
            catch (RuntimeException ee)
            {
            }
        }
        rs1.close();

        logger.info("Method : ProcessEarlyDone-----------------END-------------------------------------");

        return false;

    }
    public final boolean ExistOverdueSchedule(int 중도상환idx) throws SQLException
    {

        logger.info("Method : ExistOverdueSchedule-----------------START-------------------------------------");

        Connection con = getConnection();
        String sql = String.format("" + "\r\n" +
                "                   SELECT " + "\r\n" +
                "                        count(*) as `count`" + "\r\n" +
                "                    FROM" + "\r\n" +
                "                        model1.schedule_creditor" + "\r\n" +
                "                    WHERE" + "\r\n" +
                "                        funding_idx = %d" + "\r\n" +
                "                            AND repayment_status = '연체' ", 중도상환idx);
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet            rs = pstmt.executeQuery();
        int count = 0;
        while (rs.next())
        {
            count = rs.getInt("count");
        }
        rs.close();
        if (count <= 0)
        {
            return false;
        }

        logger.info("Method : ExistOverdueSchedule-----------------END-------------------------------------");

        return true;
    }

    /// 중도상환
    public  void make_funding_early_done(int funding_idx) throws SQLException
    {

        logger.info("Method : make_funding_early_done-----------------START-------------------------------------");

        Connection con = getConnection();
        int 중도상환idx = funding_idx;
        HashMap<Integer, Integer> user_list = new HashMap<Integer, Integer>();
        boolean exist_flag;
        boolean exist_overdue;
        exist_flag = ExistFundingIdx(중도상환idx);
        if (!exist_flag)
        {
            return;
        }
        exist_overdue = ExistOverdueSchedule(중도상환idx);
        if (exist_overdue)
        {
            System.out.println("exit");
            return;
        }
        ProcessEarlyDone(중도상환idx, Calendar.getInstance().getTime());
        con.close();

        logger.info("Method : make_funding_early_done-----------------END-------------------------------------");
    }
}