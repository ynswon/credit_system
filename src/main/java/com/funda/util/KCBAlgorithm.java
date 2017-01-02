package com.funda.util;

import com.funda.kcb.KCBOptions;
import com.funda.mybatis.model.credit_policy;
import com.funda.mybatis.model.credit_policyExample;
import com.funda.mybatis.model.suggestedPolicy;
import com.funda.mybatis.service.ApplicationDAOService;
import com.funda.mybatis.service.CreditPolicyDAOService;
import com.funda.mybatis.service.SuggestedPolicyDAOService;
import com.itextpdf.text.pdf.parser.Subpath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by wonjun-pc on 2016-10-11.
 */
public class KCBAlgorithm {

    ArrayList<String> reasons=null;
    String[]  CPS =null;
    int seg = 1;

    @Resource(name = "transactionManager")
    protected DataSourceTransactionManager txManager;


    @Autowired
    CreditPolicyDAOService creditPolicyDAOService;

    @Autowired
    SuggestedPolicyDAOService suggestedPolicyDAOService;

    public KCBAlgorithm(ArrayList<String[]> CPSValue)
    {

        CPS     = new String[100];
        reasons = new ArrayList<String>();

        try {
            int i;
            for (i = 0; i < 100; i++)
                this.CPS[i] = CPSValue.get(i)[2];
        }catch (Exception e)
        {
            e.printStackTrace();;
        }
    }

    public int getCreditValue()
    {

        try {
            String SubPrime = CPS[82];
            String RScore   = CPS[83];

            if(SubPrime.trim().equals("E") || SubPrime.trim().equals("C")) SubPrime = "0";
            if(RScore.trim().equals("E") || SubPrime.trim().equals("C"))   RScore   = "0";

            int S90001000 = Integer.parseInt(SubPrime);  //서브프라임 등급
            int S83001000 = Integer.parseInt(RScore);  //R-Score(저축)

            if (S90001000 == 1 && (S83001000 == 1 || S83001000 == 2)) return 1;

            if ((S90001000 == 1 && (S83001000 == 3 || S83001000 == 4)) || (S83001000 == 1 && S90001000 == 2)) return 2;

            if ((S83001000 == 5 && S90001000 == 1) || ((S83001000 >= 2 && S83001000 <= 3) && S90001000 == 2) || (S83001000 == 1 && (S90001000 == 3 && S90001000 <= 4)))
                return 3;

            if ((S83001000 == 6 && S90001000 == 1) || ((S83001000 >= 4 && S83001000 <= 5) && S90001000 == 2) || ((S83001000 >= 2 && S83001000 <= 3) && S90001000 == 3))
                return 4;

            if ((S83001000 == 7 && S90001000 == 1) || (S83001000 == 6 && S90001000 == 2) || ((S83001000 >= 4 && S83001000 <= 5) && S90001000 == 3)
                    || ((S83001000 >= 2 && S83001000 <= 4) && S90001000 == 4)
                    || ((S83001000 >= 1 && S83001000 <= 3) && S90001000 == 5)
                    || (S83001000 == 1 && S90001000 == 6)) return 5;

            if (((S83001000 >= 8 && S83001000 <= 9) && S90001000 == 1)
                    || ((S83001000 >= 7 && S83001000 <= 8) && S90001000 == 2)
                    || ((S83001000 >= 6 && S83001000 <= 7) && S90001000 == 3)
                    || ((S83001000 >= 5 && S83001000 <= 6) && S90001000 == 4)
                    || ((S83001000 >= 4 && S83001000 <= 5) && S90001000 == 5)
                    || ((S83001000 >= 2 && S83001000 <= 4) && S90001000 == 6)
                    || ((S83001000 >= 1 && S83001000 <= 2) && S90001000 == 7)
                    || ((S83001000 >= 1 && S83001000 <= 1) && S90001000 == 8)
                    ) return 6;


        }catch (Exception e )
        {
            e.printStackTrace();
        }
        return 7;
    }
    public int getSeg()
    {
        return this.seg;
    }

    public ArrayList<KCBOptions> getOptions(int amount, int ref_idx)
    {
        ArrayList<KCBOptions> optionList = new ArrayList<>();


        try {
            String IINDEX = CPS[28].trim();
            String MiraeSnag = CPS[43].trim();

            if (IINDEX.trim().equals("E") || IINDEX.trim().equals("C"))          IINDEX = "0";
            if (MiraeSnag.trim().equals("E") || MiraeSnag.trim().equals("C")) MiraeSnag = "0";

        }catch
                (Exception e)
        {

            e.printStackTrace();
        }
        return optionList;
    }
    public ArrayList<String> getPreJudgeYN()
    {

        try {
            double L2Z000133 = Double.parseDouble(CPS[45]);  // 대출기관수(CIS계좌단위)(미해지)(주택,신차,예적금,유가증권담보제외)
            double L2Z000134 = Double.parseDouble(CPS[48]);  // 은행업권제외대출기관수(장기카드대출(카드론)포함)(CIS계좌단위)(미해지)(주택,신차,예적금,유가증권담보제외)

            double L1021000C = Double.parseDouble(CPS[0]); //대출건수(해지포함)(1년내신규개설)
            double L10283000 = Double.parseDouble(CPS[5]); //최근대출개설일자로부터의경과일수(미해지)

            double C1L120238 = Double.parseDouble(CPS[8]); //6개월내(15일)신용카드총이용잔액유효한도소진율(2+)(활성카드)(해지포함)


            double C1L120333 = Double.parseDouble(CPS[9]);   //3개월내(15일)신용카드총이용잔액유효한도소진율(2+)(활성카드)(해지포함)
            double C1M13801P = Double.parseDouble(CPS[10]);  //1개월전신용카드총단기카드대출(CA)이용잔액(해지포함)
            double C1M13802P = Double.parseDouble(CPS[11]);  //2개월전신용카드총단기카드대출(CA)이용잔액(해지포함)
            double C1M13803P = Double.parseDouble(CPS[12]);  //3개월전신용카드총단기카드대출(CA)이용잔액(해지포함)
            double C1M210000 = Double.parseDouble(CPS[13]);  //신용카드건수(미해지)
            double C1N228000 = Double.parseDouble(CPS[14]);  //단기카드대출(CA)이용잔액보유카드기관수(미해지)
            double C1N2C6W06 = Double.parseDouble(CPS[15]);  //6개월내(15일)카드단기카드대출(CA)최고이용기관수(해지포함)
            double G10210000 = Double.parseDouble(CPS[16]);  //연대보증건수(미해지)
            double G10232000 = Double.parseDouble(CPS[17]);  //연대보증총대상금액(미해지)


            double D1Z000109 = Double.parseDouble(CPS[24]); // 연체건수(1년내유지)(해제포함)
            double D10110D0T = Double.parseDouble(CPS[27]);  // 연체건수(대지급포함)(1년내유지)(해제포함)

            double D10187D00 = Double.parseDouble(CPS[31]); // 최근연체해제일자로부터경과일수(대지급포함)
            double D1017500C = Double.parseDouble(CPS[32]);  // 최장연체일수(1년내발생)(해제포함)

            double D1Z001202 = Double.parseDouble(CPS[36]); //최장연체일수(대지급포함)(3년내유지)(해제포함)

            double D30110000 = Double.parseDouble(CPS[40]);  //채무불이행(신용정보사)건수(해제포함)
            double D30210000 = Double.parseDouble(CPS[41]);  //채무불이행(신용정보사)건수(미해제)
            double D3021000C = Double.parseDouble(CPS[42]);  //채무불이행(신용정보사)건수(1년내발생)(해제포함)

            double L2M000091 = Double.parseDouble(CPS[52]);  //제2금융업권신용대출기관수(CIS계좌단위)(미해지)
            double L20231L00 = Double.parseDouble(CPS[53]);  //저축은행업권총대출금액(CIS)(미해지)
            double L2Z000145 = Double.parseDouble(CPS[54]);  //신용대출총대출금액(CIS계좌단위)(1년내신규개설)(미해지)
            double D20210000 = Double.parseDouble(CPS[55]);  //신용도판단정보공공정보건수(CIS)(미해제)
            double D20110006 = Double.parseDouble(CPS[56]);  //신용도판단정보공공정보건수(CIS)(6개월내발생)(해지포함)
            double D2011000C = Double.parseDouble(CPS[57]);  //신용도판단정보공공정보건수(CIS)(1년내발생)(해지포함)
            double D2Z000067 = Double.parseDouble(CPS[58]);  //신용도판단정보공공정보건수(CIS)(1년내유지)(해제포함)
            double D2Z000046 = Double.parseDouble(CPS[59]);  //신용도판단정보공공정보건수(CIS)(1년내유지)(해지포함)(신용회복지원제외)
            double D2051000F = Double.parseDouble(CPS[60]);  //신용도판단정보공공정보건수(CIS)(3년내삭제)
            double D20384000 = Double.parseDouble(CPS[61]);  //신용도판단정보공공정보최근해제일자로부터경과일수(CIS)
            double D20684000 = Double.parseDouble(CPS[62]);  //신용도판단정보공공정보최근해제일자로부터경과일수(CIS)(해제,삭제)
            double D20183000 = Double.parseDouble(CPS[63]);  //신용도판단정보공공정보최근발생일자로부터경과일수(CIS)(해지포함)
            double D2058000F = Double.parseDouble(CPS[64]);  //신용도판단정보공공정보최근삭제일자로부터경과일수(CIS)(3년내삭제)
            double D21110000 = Double.parseDouble(CPS[65]);  //연체등정보건수(KFB)(해지포함)
            double D2111000C = Double.parseDouble(CPS[66]);  //연체등정보건수(CIS)(1년내발생)(해지포함)
            double D2111000F = Double.parseDouble(CPS[67]);  //연체등정보건수(CIS)(3년내발생)(해지포함)
            double D22110000 = Double.parseDouble(CPS[68]);  //금융질서문란정보건수(KFB)(해지포함)
            double D23110000 = Double.parseDouble(CPS[69]);  //공공정보(세금체납등)건수(KFB)(해지포함)
            double D25110000 = Double.parseDouble(CPS[70]);  //공공정보(개인워크아웃)최근해제일자로부터경과일수(KFB)(해제)
            double D2Z000047 = Double.parseDouble(CPS[71]);  //신용회복지원확정여부(CIS)(미해제)
            double D2Z000048 = Double.parseDouble(CPS[72]);  //개인회생확정여부(CIS)(미해제)
            double D2Z000049 = Double.parseDouble(CPS[73]);  //파산면책확정여부(CIS)(미해제)

            int S90001000 = Integer.parseInt(CPS[82]);  //서브프라임 등급
            int S83001000 = Integer.parseInt(CPS[83]);  //R-Score(저축)

            String R11120110 = (CPS[74]);  //국적상실이탈정보보유여부(A등급)
            String R12520120 = (CPS[75]);  //실종정보보유여부(A~B)등급
            String R13720120 = (CPS[76]);  //금치산정보보유여부(A~B등급)
            String R13820120 = (CPS[77]);  //한정치산정보보유여부(A~B등급)
            String R15020620 = (CPS[78]);  //개인파산면책정보보유여부(CIS포함)(A~B등급)
            String R16020700 = (CPS[79]);  //당좌거래정지정보보유여부(CIS포함)
            String R17020120 = (CPS[80]);  //개인회생정보보유(A~B등급)
            String R17020520 = (CPS[81]);  //개인회생정보보유여부(CIS포함)(A~B등급)


            /**
             * 관보
             */


            if (R11120110.trim().equals("Y")) reasons.add("R11120110");
            if (R12520120.trim().equals("Y")) reasons.add("R12520120");
            if (R13720120.trim().equals("Y")) reasons.add("R13720120");
            if (R13820120.trim().equals("Y")) reasons.add("R13820120");
            if (R15020620.trim().equals("Y")) reasons.add("R15020620");
            if (R16020700.trim().equals("Y")) reasons.add("R16020700");
            if (R17020120.trim().equals("Y")) reasons.add("R17020120");
            if (R17020520.trim().equals("Y")) reasons.add("R17020520");

            /**
             *   SEG1
             */
            if (L2Z000133 == 0) {
                /**
                 * 신용
                 */
                if (S90001000 > 9 || S90001000 == 0) reasons.add("S90001000");

                /**
                 *  카드
                 */

                if (C1L120238 > 70 && C1L120238 < 8888888) reasons.add("C1L120238");
                if (C1L120333 > 70 && C1L120333 < 8888888) reasons.add("C1L120333");
                if (C1M13801P > 1300)  reasons.add("C1M13801P");
                if (C1M13802P > 1300)  reasons.add("C1M13802P");
                if (C1M13803P > 1300)  reasons.add("C1M13803P");
                if (C1N228000 > 1)  reasons.add("C1N228000");
                if (C1N2C6W06 > 1)  reasons.add("C1N2C6W06");


                /**
                 * 연체
                 */
                if (D10110D0T > 5) reasons.add("D10110D0T");
                if (D1017500C > 60) reasons.add("D1017500C");
                if (D10187D00 >= 0 && D10187D00 <= 60) reasons.add("D10187D00");

                if (D1Z000109 > 2) reasons.add("D1Z000109");
                if (D1Z001202 > 120) reasons.add("D1Z001202");
                if (D20110006 > 0) reasons.add("D20110006");
                if (D2011000C > 0) reasons.add("D2011000C");
                if (D20183000 > 0) reasons.add("D20183000");
                if (D20210000 > 0) reasons.add("D20210000");
                if (D20384000 > 0) reasons.add("D20384000");
                if (D2051000F > 2) reasons.add("D2051000F");
                if (D2058000F > 0 && D2058000F <= 450) reasons.add("D2058000F");
                if (D20684000 > 0 && D20684000 <= 480) reasons.add("D20684000");
                if (D21110000 > 0) reasons.add("D21110000");
                if (D2111000C > 0) reasons.add("D2111000C");
                if (D2111000F > 0) reasons.add("D2111000F");
                if (D22110000 > 0) reasons.add("D22110000");
                if (D23110000 > 0) reasons.add("D23110000");
                if (D25110000 > 0) reasons.add("D25110000");
                if (D2Z000046 > 0) reasons.add("D2Z000046");
                if (D2Z000047 > 0) reasons.add("D2Z000047");
                if (D2Z000048 > 0) reasons.add("D2Z000048");
                if (D2Z000049 > 0) reasons.add("D2Z000049");
                if (D2Z000067 > 0) reasons.add("D2Z000067");
                if (D30110000 > 0) reasons.add("D30110000");
                if (D30210000 > 0) reasons.add("D30210000");
                if (D3021000C > 0) reasons.add("D3021000C");

                /**
                 * 보증
                 */
                if (G10210000 > 0) reasons.add("G10210000");
                if (G10232000 > 0 && G10232000 < 8888888) reasons.add("G10232000");

                seg = 1;
                //if(  L2M000091 > 70 ) return false;

            } else if (L2Z000134 > 0) {

                //reasons.add("G10232000");
                /**
                 * 신용
                 */
                if (S90001000 > 8 || S90001000 == 0) reasons.add("S90001000");

                /**
                 *  카드
                 */

                if (C1L120238 > 90 && C1L120238 < 8888888) reasons.add("C1L120238");
                if (C1L120333 > 90 && C1L120333 < 8888888) reasons.add("C1L120333");
                //    if(  C1M13801P > 1300 ) return 2;
                //    if(  C1M13802P > 1300 ) return 2;
                //    if(  C1M13803P > 1300 ) return 2;
                if (C1N228000 > 6) reasons.add("C1N228000");
                if (C1N2C6W06 > 5) reasons.add("C1N2C6W06");
                if (D10110D0T > 6) reasons.add("D10110D0T");
                if (D1017500C > 70) reasons.add("D1017500C");


                /**
                 * 연체
                 */
                if (D10187D00 >= 0 && D10187D00 <= 30) reasons.add("D10187D00");
                if (D1Z000109 > 6) reasons.add("D1Z000109");
                if (D1Z001202 > 120) reasons.add("D1Z001202");
                if (D20110006 > 0) reasons.add("D20110006");
                if (D2011000C > 0) reasons.add("D2011000C");
                if (D20183000 > 0)  reasons.add("D20183000");
                if (D20210000 > 2) reasons.add("D20210000");
                if (D20384000 > 0) reasons.add("D20384000");
                if (D2051000F > 0)  reasons.add("D2051000F");

                if (D2058000F > 0 && D2058000F <= 240) reasons.add("D2058000F");
                if (D20684000 > 0 && D20684000 <= 240) reasons.add("D20684000");

                if (D21110000 > 0) reasons.add("D21110000");
                if (D2111000C > 0) reasons.add("D2111000C");
                if (D2111000F > 0) reasons.add("D2111000F");
                if (D22110000 > 0) reasons.add("D22110000");
                if (D23110000 > 0) reasons.add("D23110000");
                if (D25110000 > 0) reasons.add("D25110000");
                if (D2Z000046 > 0) reasons.add("D2Z000046");
                if (D2Z000047 > 0) reasons.add("D2Z000047");
                if (D2Z000048 > 0) reasons.add("D2Z000048");
                if (D2Z000049 > 0) reasons.add("D2Z000049");
                if (D2Z000067 > 2) reasons.add("D2Z000067");
                if (D30110000 > 0) reasons.add("D30110000");
                if (D30210000 > 0) reasons.add("D30210000");
                if (D3021000C > 0) reasons.add("D3021000C");


                /**
                 * 보증
                 */
                if (G10210000 > 0) reasons.add("G10210000");
                if (G10232000 > 0 && G10232000 < 8888888) reasons.add("G10232000");


                /**
                 * 대출
                 */
                if (L2M000091 > 3) reasons.add("L2M000091");

                seg = 2;

            } else if (L2Z000134 == 0 && L2Z000133 > 0) {

                /**
                 * 신용
                 */
                if (S90001000 > 8 || S90001000 == 0) reasons.add("S90001000");

                /**
                 *  카드
                 */
                if (C1L120238 > 90 && C1L120238 < 8888888) reasons.add("C1L120238");
                if (C1L120333 > 90 && C1L120333 < 8888888) reasons.add("C1L120333");
                if (C1M13801P > 1300) reasons.add("C1M13801P");
                if (C1M13802P > 1300) reasons.add("C1M13802P");
                if (C1M13803P > 1300) reasons.add("C1M13803P");

                if (C1N228000 > 1)  reasons.add("C1N228000");
                if (C1N2C6W06 > 3)  reasons.add("C1N2C6W06");
                if (D10110D0T > 5)  reasons.add("D10110D0T");
                if (D1017500C > 50)  reasons.add("D1017500C");
                if (D10187D00 >= 0 && D10187D00 < 50)  reasons.add("D10187D00");

                /**
                 * 연체
                 */

                if (D1Z000109 > 5) reasons.add("D1Z000109");
                if (D1Z001202 > 60) reasons.add("D1Z001202");
                if (D20110006 > 0) reasons.add("D20110006");
                if (D2011000C > 0) reasons.add("D2011000C");
                if (D20183000 > 0) reasons.add("D20183000");
                if (D20210000 > 0) reasons.add("D20210000");
                if (D20384000 > 0) reasons.add("D20384000");
                if (D2051000F > 2) reasons.add("D2051000F");
                if (D2058000F > 0 && D2058000F < 550) reasons.add("D2058000F");
                if (D20684000 > 0 && D20684000 < 580) reasons.add("D20684000");
                if (D21110000 > 0) reasons.add("D21110000");
                if (D2111000C > 0) reasons.add("D2111000C");
                if (D2111000F > 0) reasons.add("D2111000F");
                if (D22110000 > 0) reasons.add("D22110000");
                if (D23110000 > 0) reasons.add("D23110000");
                if (D25110000 > 0) reasons.add("D25110000");
                if (D2Z000046 > 0) reasons.add("D2Z000046");
                if (D2Z000047 > 0) reasons.add("D2Z000047");
                if (D2Z000048 > 0) reasons.add("D2Z000048");
                if (D2Z000049 > 0) reasons.add("D2Z000049");
                if (D2Z000067 > 0) reasons.add("D2Z000067");
                if (D30110000 > 0) reasons.add("D30110000");
                if (D30210000 > 0) reasons.add("D30210000");
                if (D3021000C > 0) reasons.add("D3021000C");

                /**
                 * 보증
                 */

                if (G10210000 > 0) reasons.add("G10210000");
                if (G10232000 > 0 && G10232000 < 8888888 ) reasons.add("G10232000");

                seg = 3;
            }

            return reasons;  //통과
        }catch(Exception e )
        {
            e.printStackTrace();
        }
        return reasons;  //통과
    }
}
