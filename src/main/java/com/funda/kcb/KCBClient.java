package com.funda.kcb;

//import org.json.simple.JSONObject;
import com.funda.mybatis.model.*;
import com.funda.mybatis.service.*;
import com.funda.mybatis.serviceEtc.KCBDAOService;
import com.funda.util.KCBAlgorithm;
import com.funda.util.SendSms;
import com.funda.util.URLShortener;
import org.apache.commons.httpclient.util.*;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.poi.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.annotation.Async;
//import org.springframework.web.util.UriUtils;

//import com.funda.mybatis.model.application_data;
//import com.funda.mybatis.service.ApplicationDataDAOService;
//import com.funda.mybatis.service.ApplicationDataSeriesDAOService;
//import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.text.SimpleDateFormat;
import java.util.*;

// 생년월일
// 성별
// 휴대폰번호
// 신청일자

//
//운영   코드 : 1248
//테스트 코드 : 1240

public class KCBClient
{
    Socket client = null;
    String ipAddress      = "219.255.136.241";               //접속을 요청할 Server의 IP 주소를 저장할 변수
    static final int port = 43500; //접속을 요청할 Server의 port 번호와 동일하게 지정
    static int timeout = 3000;

    //@Autowired
    //ApplicationDataDAOService applicationService;

   // @Autowired
  //  ApplicationDataSeriesDAOService applicationSeriesService;
    //입력용 Stream
    InputStream is;
    BufferedReader ois;

    //출력용 Stream
    OutputStream os;
    BufferedWriter oos;

    HashMap<String, KCB371>    res371_index;

    @Autowired
    KCBDAOService kcbdaoService;


    int commonHeader[]  = { 4, 9, 8 ,4, 3, 1, 4, 7, 14, 7, 14, 16, 43 };
    int commonHeader_temp[]  = { 4, 6, 8 ,4, 3, 1, 4, 7, 14, 7, 14, 16, 22 };
    int reqKcb0100360[] = { 10, 10, 20, 50, 13, 8, 2, 12, 8, 1, 10, 10, 20, 15, 50, 100 };
    int resKcb0100360[] = { 10, 10, 20, 20, 10, 50, 200, 100, 100 };

    int reqKcb0100361[] = { 10, 10, 20, 20, 8, 1, 30, 100 };
    int resKcb0100361[] = { 10, 10, 20, 20, 40, 64, 12 };

    int reqKcb0100371[] = { 12, 2, 2, 20, 15, 13, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2,3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3 , 2 ,3,2,3,2,3,2,3,2,3,2,3,2,3,2,3,3   ,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9};
    int resKcb0100371_000[] = { 12,1, 2,13,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2,3,3,2, 3, 3,2, 3,3,3 };

                              //12      13
    // 017, 018, 019, 020, 023, 024, 025, 026, 027, 028, 029, 031, 032, 033,035, 036, 037, 038, 039
    //String[] code = { "017", "018", "019", "020", "023", "024", "025", "026", "027", "028", "029", "031", "032", "033","035", "036", "037", "038", "039" };
    int resKcb0100371_detail[][] ={{ 3,1,8, 100, 100, 12, 9, 12 },
                                 { 3,4,2 } ,
                                { 3,4,4,4,4,4,4,4,4,4,4,4,4,2,2,2,2,2,2,2,2,2,2,2,2 },
                                { 3,6,6,6,6,6,6 },
                                { 3, 100, 2,8,8, 9, 3 },
                                { 3, 30, 1, 8,8, 9, 9, 1,1,1,1,1,1 },
                                { 3, 3,3,3,3,3,3,3,3,3,3,3,3,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,4,4,4,4,4,4,4,4,4,4,4,4 },
                                { 3, 30, 8, 8, 9 },
                                { 3, 30, 40, 4, 8 },
                                { 3, 2, 2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9, 4,4,4,4,4,4,4,4,4,4,4,4 },
                                { 3, 30, 40, 1, 8, 9, 8, 9, 8, 9 },
                                { 3, 30, 40, 8, 9, 8, 9 },
                                { 3, 30, 40, 8, 9, 9, 8, 2, 4 },
                                { 3, 30, 8, 9, 9, 8, 9, 4 },
                                { 3, 2, 30, 40, 8, 9, 9, 8 ,2, 4},
                                { 3, 30, 8, 8, 9 },
                                { 3, 30, 50, 1,8, 9, 9, 8, 2, 1, 1, 1, 1 },
                                { 3, 30, 2, 8, 9, 9 },
                                 { 3, 5, 30, 8, 9, 9, 9 },
                                      {3,9,9}};


    String resKcb0100371_label[][] ={{ "신상정보", "정보구분코드", "등록일자", "우편번호주소",  "상세주소", "전화번호", "연소득", "휴대폰번호" },
                                     { "신용평점", "평점" , "등급" } ,
                                  { "신용평점연간이력", "01개월전평점", "02개월전평점", "03개월전평점", "04개월전평점", "05개월전평점","06개월전평점","07개월전평점","08개월전평점","09개월전평점","10개월전평점","11개월전평점","12개월전평점","01개월전신용등급", "02개월전신용등급","03개월전신용등급","04개월전신용등급","05개월전신용등급","06개월전신용등급","07개월전신용등급","08개월전신용등급","09개월전신용등급","10개월전신용등급","11개월전신용등급","12개월전신용등급" },
                                  { "신용평점영향요소", "긍정적요인","긍정적요인","긍정적요인","부정적요인","부정적요인","부정적요인" },
                                  { "대출개설정보(KFB)", "기관명", "등록사유코드", "대출일자", "변동일자", "금액", "KFB대출구분코드" },

                                  // 여러개 될 수 있음(TYPE:KCB_대출개설정보)
                                  { "대출개설정보(KCB)", "기관명", "대출형태코드", "대출일자", "만기일자", "약정금액", "대출금액", "신용여부", "담보여부", "보증인여부", "집단대출대납구분코드","연체대환대출여부","신용회복지원여부" },
                                  // 여러개 될 수 없음(PRE_TYPE:KCB, TYPE: 연간대출실적요약(KCB));
                                  { "연간대출실적요약(KCB)", "01개월전총대출계좌수","02개월전총대출계좌수","03개월전총대출계좌수","04개월전총대출계좌수","05개월전총대출계좌수","06개월전총대출계좌수","07개월전총대출계좌수","08개월전총대출계좌수","09개월전총대출계좌수","10개월전총대출계좌수","11개월전총대출계좌수","12개월전총대출계좌수"
                                                            ,"01개월전총약정금액","02개월전총약정금액","03개월전총약정금액","04개월전총약정금액","05개월전총약정금액","06개월전총약정금액","07개월전총약정금액","08개월전총약정금액","09개월전총약정금액","10개월전총약정금액","11개월전총약정금액","12개월전총약정금액"
                                                            ,"01개월전월상환금액" ,"02개월전월상환금액","03개월전월상환금액","04개월전월상환금액","05개월전월상환금액","06개월전월상환금액","07개월전월상환금액","08개월전월상환금액","09개월전월상환금액","10개월전월상환금액","11개월전월상환금액","12개월전월상환금액"
                                                            ,"01개월전대출잔액" ,"02개월전대출잔액","03개월전대출잔액","04개월전대출잔액","05개월전대출잔액","06개월전대출잔액","07개월전대출잔액","08개월전대출잔액","09개월전대출잔액","10개월전대출잔액","11개월전대출잔액","12개월전대출잔액"
                                                            ,"01개월전연체금액"  ,"02개월전연체금액","03개월전연체금액","04개월전연체금액","05개월전연체금액","06개월전연체금액","07개월전연체금액","08개월전연체금액","09개월전연체금액","10개월전연체금액","11개월전연체금액","12개월전연체금액"
                                                            , "01개월전최장연체일수","02개월전최장연체일수","03개월전최장연체일수","04개월전최장연체일수","05개월전최장연체일수","06개월전최장연체일수","07개월전최장연체일수","08개월전최장연체일수","09개월전최장연체일수","10개월전최장연체일수","11개월전최장연체일수" ,"12개월전최장연체일수" },
                                  // 여러개
                                  { "현금서비스정보(KFB)" , "기관명",  "발생일", "변동일", "금액" },
                                  // 여러개
                                  { "카드개설정보(KFB)"   , "기관명", "관리점명", "등록사유코드", "발생일자" },
                                  { "카드실적/연체이력정보(KCB)", "01개월전개설카드수", "02개월전개설카드수","03개월전개설카드수","04개월전개설카드수","05개월전개설카드수","06개월전개설카드수","07개월전개설카드수","08개월전개설카드수","09개월전개설카드수","10개월전개설카드수","11개월전개설카드수" ,"12개월전개설카드수"
                                                                , "01개월전이용카드수","02개월전이용카드수","03개월전이용카드수","04개월전이용카드수","05개월전이용카드수","06개월전이용카드수","07개월전이용카드수","08개월전이용카드수","09개월전이용카드수","10개월전이용카드수","11개월전이용카드수","12개월전이용카드수"
                                                                , "01개월전현금서비스이용카드수","02개월전현금서비스이용카드수","03개월전현금서비스이용카드수","04개월전현금서비스이용카드수","05개월전현금서비스이용카드수","06개월전현금서비스이용카드수","07개월전현금서비스이용카드수","08개월전현금서비스이용카드수","09개월전현금서비스이용카드수","10개월전현금서비스이용카드수","11개월전현금서비스이용카드수","12개월전현금서비스이용카드수"
                                                                , "01개월전총한도합계금액","02개월전총한도합계금액","03개월전총한도합계금액","04개월전총한도합계금액","05개월전총한도합계금액","06개월전총한도합계금액","07개월전총한도합계금액","08개월전총한도합계금액","09개월전총한도합계금액","10개월전총한도합계금액","11개월전총한도합계금액","12개월전총한도합계금액"
                                                                , "01개월전현금서비스한도합계금액","02개월전현금서비스한도합계금액","03개월전현금서비스한도합계금액","04개월전현금서비스한도합계금액","05개월전현금서비스한도합계금액","06개월전현금서비스한도합계금액","07개월전현금서비스한도합계금액","08개월전현금서비스한도합계금액","09개월전현금서비스한도합계금액","10개월전현금서비스한도합계금액","11개월전현금서비스한도합계금액","12개월전현금서비스한도합계금액"
                                                                , "01개월전총이용금액","02개월전총이용금액","03개월전총이용금액","04개월전총이용금액","05개월전총이용금액","06개월전총이용금액","07개월전총이용금액","08개월전총이용금액","09개월전총이용금액","10개월전총이용금액","11개월전총이용금액","12개월전총이용금액"
                                                                , "01개월전현금서비스이용금액","02개월전현금서비스이용금액","03개월전현금서비스이용금액","04개월전현금서비스이용금액","05개월전현금서비스이용금액","06개월전현금서비스이용금액","07개월전현금서비스이용금액","08개월전현금서비스이용금액","09개월전현금서비스이용금액","10개월전현금서비스이용금액","11개월전현금서비스이용금액","12개월전현금서비스이용금액"
                                                                , "01개월전연체금액","02개월전연체금액","03개월전연체금액","04개월전연체금액","05개월전연체금액","06개월전연체금액","07개월전연체금액","08개월전연체금액","09개월전연체금액","10개월전연체금액","11개월전연체금액","12개월전연체금액"
                                                                , "01개월전최장연체일수","02개월전최장연체일수","03개월전최장연체일수","04개월전최장연체일수","05개월전최장연체일수","06개월전최장연체일수","07개월전최장연체일수","08개월전최장연체일수","09개월전최장연체일수","10개월전최장연체일수","11개월전최장연체일수","12개월전최장연체일수"},
                                  { "연체정보(KCB)", "기관명", "관리점명", "거래형태코드",  "최초연체기산일자", "최초연체금액",  "연체기산일자", "연체금액", "연체상환일자", "상환금액" },
                                  { "대지급정보",  "기관명", "관리점명", "대지급발생일자", "대지급금액", "대지급상환일자",  "상환금액" },
                                  { "채무불이행정보(KFB)", "기관명", "관리점명", "거리형태코드", "최초연체기산일자",  "최초연체금액", "연체기산일자", "연체금액",  "연체상환일자" , "상환금액" },
                                  { "채무불이행정보(신용정보사)", "기관명", "발생일자", "등록금액", "연체금액", "상환일자",  "상환금액", "등록사유코드" },
                                  { "공공정보및금융질서문란정보", "자료구분코드", "기관명", "관리점명", "발생일자", "등록금액", "연체금액",  "해제일자" , "해제구분코드",  "등록사유코드"},
                                  { "연대보증정보(KFB)", "기관명", "발생일자", "변동일자", "금액" },
                                  { "지급보증정보(KCB)", "기관명", "보증상대처", "보증종류코드", "보증개시일자",  "보증한도금액", "보증대상금액", "해지일자", "해지사유코드", "신용여부", "담보여부", "보증인여부", "대지급청구여부" },
                                  { "연대보증상세내역(KCB)", "기관명", "보증종류코드", "보증약정일자", "보증한도금액", "보증대상금액" },
                                  { "신용회복위원회정보(KFB)", "직업코드", "직업명", "신청일자", "회복지원통보일자", "조정후최종채무액", "변제후잔존채무액"},
                                  { "CPS정보", "CPS코드", "CPS결과값"}};

 /*   String[] cps_label = {                   "연체건수(미해제)(대지급포함)", "연체건수(대지급포함)(6개월내유지)(해제포함)", "연체건수(대지급포함)(1년내유지)(해제포함)", "연체건수(미해제)", "연체건수(1개월내발생)(해제포함)"
                                          , "연체건수(3개월내발생)(해제포함)", "연체건수(6개월내발생)(해제포함)","연체건수(1년내발생)(해제포함)","연체건수(1개월내유지)(해제포함)","연체건수(3개월내유지)(해제포함)"
                                          ,"연체건수(6개월내유지)(해제포함)" ,"연체건수(1년내유지)(해제포함)","연체기관수(해제포함)","대출연체기관수(해제포함)","대지급건수(미해제)"
                                          ,"대지급건수(1년내발생)(해제포함)","신용도판단정보공공정보건수(KFB)(미해제)","신용도판단정보공공정보건수(KFB)(6개월내발생)(해지포함)" ,"신용도판단정보공공정보건수(KFB)(1년내발생)(해지포함)","신용도판단정보공공정보건수(KFB)(1년내유지)(해지포함)(신용회복지원제외)"
                                          ,"연체등정보건수(KFB)(3년내발생)(해지포함)","채무불이행(신용정보사)건수(미해제)" ,"채무불이행(신용정보사)건수(1년내발생)(해제포함)","총최고(경험)연체금액(대지급포함)(3개월내유지)(해제포함)","총최고(경험)연체금액(대지급포함)(6개월내유지)(해제포함)"
                                          ,"총최고(경험)연체금액(대지급포함)(1년내유지)(해제포함)" ,"최장연체일수(3개월내유지)(해제포함)","최장연체일수(6개월내유지)(해제포함)","최장연체일수(1년내유지)(해제포함)","연대보증건수(미해지)"
                                          ,"개인파산면책정보보유여부(KFB포함)(A~B등급)" ,"개인회생정보보유여부(KFB포함)(A~B등급)" ,"국적상실이탈정보보유여부(A등급)","실종정보보유여부(A등급)","금치산정보보유여부(A~B등급)"
                                          ,"한정치산정보보유여부(A~B등급)"      ,"당좌거래정지정보보유여부(KFB포함)","대출기관수(미해지)","대출기관수(KFB)(미해지)","대출기관수(KFB)(미해지)(대출금액2천만원미만)"
                                          ,"할부금융업종대출건수(해지포함)(1개월내신규개설)"     ,"저축은행업종대출기관수(미해지)","은행업종제외대출기관수(미해지)(지역농협포함)(1년내신규개설)","저축은행업권대출기관수(KFB)(미해지)","은행업권제외대출기관수(KFB)(미해지)"
                                          ,"은행업권제외대출기관수(카드론포함)(KFB)(미해지)"      ,"제2금융업권(카드론포함)대출기관수(KFB)(미해지)","연체대환대출건수(미해지)","신용회복지원관련해지대출건수(해지)","주택담보대출제외대출기관수(KFB)(미해지)"
                                          ,"저축은행업종대출총대출잔액(미해지)" ,"저축은행업권총대출금액(KFB)(미해지)","연체대환대출총대출잔액(미해지)","서브프라임평점"};
*/


      String[] cps_code={
              "L1021000C"
            ,"L1021A000"
            ,"L10220000"
            ,"L10220800"
            ,"L1023C800"
            ,"L10283000"
            ,"L1Z000001"
            ,"L1Z000018"
            ,"C1L120238"
            ,"C1L120333"
            ,"C1M13801P"
            ,"C1M13802P"
            ,"C1M13803P"
            ,"C1M210000"
            ,"C1N228000"
            ,"C1N2C6W06"
            ,"G10210000"
            ,"G10232000"
            ,"D10210000"
            ,"D10110003"
            ,"D10110006"
            ,"D1011000C"
            ,"D1Z000107"
            ,"D1Z000108"
            ,"D1Z000109"
            ,"D10210D00"
            ,"D10110D0N"
            ,"D10110D0T"
            ,"SI0001000"  //SI00010Z0
            ,"D1021060C"
            ,"D10120000"
            ,"D10187D00"
            ,"D1017500C"
            ,"D1017500K"
            ,"D1017500N"
            ,"D1017500T"
            ,"D1Z001202"
            ,"D10132D0K"
            ,"D10132D0N"
            ,"D10132D0T"
            ,"D30110000"
            ,"D30210000"
            ,"D3021000C"
            ,"U6Z000000" //U6Z000000
            ,"L20228000"
            ,"L2Z000133"
            ,"L2Z000032"
            ,"L2Z000042"
            ,"L2Z000134"
            ,"L20220L00"
            ,"L2Z000016"
            ,"L2Z000015"
            ,"L2M000091"
            ,"L20231L00"
            ,"L2Z000145"
            ,"D20210000"
            ,"D20110006"
            ,"D2011000C"
            ,"D2Z000067"
            ,"D2Z000046"
            ,"D2051000F"
            ,"D20384000"
            ,"D20684000"
            ,"D20183000"
            ,"D2058000F"
            ,"D21110000"
            ,"D2111000C"
            ,"D2111000F"
            ,"D22110000"
            ,"D23110000"
            ,"D25110000"
            ,"D2Z000047"
            ,"D2Z000048"
            ,"D2Z000049"
            ,"R11120110"
            ,"R12520120"
            ,"R13720120"
            ,"R13820120"
            ,"R15020620"
            ,"R16020700"
            ,"R17020120"
            ,"R17020520"
            ,"S90001000"
            ,"S83001000"
            ,"LP0210000"
            ,"LP0220000"
            ,"LP0231000"
            ,"LP023C000"
            ,"LP0241000"
            ,"LP024C000"
            ,"LP0273000"
            ,"LP0283000"
            ,"DP0210000"
            ,"DP0220000"
            ,"DP0232000"
            ,"DP023A000"
            ,"DP0292000"
            ,"DP0247000"
            ,"DP0187000"
            ,"DP0275000"};


    String[] cps_label = {
            "대출건수(해지포함)(1년내신규개설)"
            ,"연체대환대출건수(미해지)"
            ,"대출기관수(미해지)"
            ,"저축은행업종대출기관수(미해지)"
            ,"저축은행업종대출총대출잔액(미해지)"
            ,"최근대출개설일자로부터의경과일수(미해지)"
            ,"연체대환대출총대출잔액(미해지)"
            ,"신용회복지원관련해지대출건수(해지)"
            ,"6개월내(15일)신용카드총이용잔액유효한도소진율(2+)(활성카드)(해지포함)"
            ,"3개월내(15일)신용카드총이용잔액유효한도소진율(2+)(활성카드)(해지포함)"
            ,"1개월전신용카드총단기카드대출(CA)이용잔액(해지포함)"
            ,"2개월전신용카드총단기카드대출(CA)이용잔액(해지포함)"
            ,"3개월전신용카드총단기카드대출(CA)이용잔액(해지포함)"
            ,"신용카드건수(미해지)"
            ,"단기카드대출(CA)이용잔액보유카드기관수(미해지)"
            ,"6개월내(15일)카드단기카드대출(CA)최고이용기관수(해지포함)"
            ,"연대보증건수(미해지)"
            ,"연대보증총대상금액(미해지)"
            ,"연체건수(미해제)"
            ,"연체건수(3개월내발생)(해제포함)"
            ,"연체건수(6개월내발생)(해제포함)"
            ,"연체건수(1년내발생)(해제포함)"
            ,"연체건수(3개월내유지)(해제포함)"
            ,"연체건수(6개월내유지)(해제포함)"
            ,"연체건수(1년내유지)(해제포함)"
            ,"연체건수(미해제)(대지급포함)"
            ,"연체건수(대지급포함)(6개월내유지)(해제포함)"
            ,"연체건수(대지급포함)(1년내유지)(해제포함)"
            ,"I-INDEX"
            ,"대지급건수(1년내발생)(해제포함)"
            ,"연체기관수(해제포함)"
            ,"최근연체해제일자로부터경과일수(대지급포함)"
            ,"최장연체일수(1년내발생)(해제포함)"
            ,"최장연체일수(3개월내유지)(해제포함)"
            ,"최장연체일수(6개월내유지)(해제포함)"
            ,"최장연체일수(1년내유지)(해제포함)"
            ,"최장연체일수(대지급포함)(3년내유지)(해제포함)"
            ,"총최고(경험)연체금액(대지급포함)(3개월내유지)(해제포함)"
            ,"총최고(경험)연체금액(대지급포함)(6개월내유지)(해제포함)"
            ,"총최고(경험)연체금액(대지급포함)(1년내유지)(해제포함)"
            ,"채무불이행(신용정보사)건수(해제포함)"
            ,"채무불이행(신용정보사)건수(미해제)"
            ,"채무불이행(신용정보사)건수(1년내발생)(해제포함)"
            ,"미래능력상환지수"
            ,"대출기관수(CIS)(미해지)(대출금액2천만원미만)"
            ,"대출기관수(CIS계좌단위)(미해지)(주택,신차,예적금,유가증권담보제외)"
            ,"은행업권제외대출기관수(CIS)(미해지)"
            ,"은행업권제외대출기관수(카드론포함)(CIS)(미해지)"
            ,"은행업권제외대출기관수(장기카드대출(카드론)포함)(CIS계좌단위)(미해지)(주택,신차,예적금,유가증권담보제외)"
            ,"저축은행업권대출기관수(CIS)(미해지)"
            ,"주택담보대출제외대출기관수(CIS)(미해지)"
            ,"제2금융업권(카드론포함)대출기관수(CIS)(미해지)"
            ,"제2금융업권신용대출기관수(CIS계좌단위)(미해지)"
            ,"저축은행업권총대출금액(CIS)(미해지)"
            ,"신용대출총대출금액(CIS계좌단위)(1년내신규개설)(미해지)"
            ,"신용도판단정보공공정보건수(CIS)(미해제)"
            ,"신용도판단정보공공정보건수(CIS)(6개월내발생)(해지포함)"
            ,"신용도판단정보공공정보건수(CIS)(1년내발생)(해지포함)"
            ,"신용도판단정보공공정보건수(CIS)(1년내유지)(해제포함)"
            ,"신용도판단정보공공정보건수(CIS)(1년내유지)(해지포함)(신용회복지원제외)"
            ,"신용도판단정보공공정보건수(CIS)(3년내삭제)"
            ,"신용도판단정보공공정보최근해제일자로부터경과일수(CIS)"
            ,"신용도판단정보공공정보최근해제일자로부터경과일수(CIS)(해제,삭제)"
            ,"신용도판단정보공공정보최근발생일자로부터경과일수(CIS)(해지포함)"
            ,"신용도판단정보공공정보최근삭제일자로부터경과일수(CIS)(3년내삭제)"
            ,"연체등정보건수(KFB)(해지포함)"
            ,"연체등정보건수(CIS)(1년내발생)(해지포함)"
            ,"연체등정보건수(CIS)(3년내발생)(해지포함)"
            ,"금융질서문란정보건수(KFB)(해지포함)"
            ,"공공정보(세금체납등)건수(KFB)(해지포함)"
            ,"공공정보(개인워크아웃)최근해제일자로부터경과일수(KFB)(해제)"
            ,"신용회복지원확정여부(CIS)(미해제)"
            ,"개인회생확정여부(CIS)(미해제)"
            ,"파산면책확정여부(CIS)(미해제)"
            ,"국적상실이탈정보보유여부(A등급)"
            ,"실종정보보유여부(A~B)등급"
            ,"금치산정보보유여부(A~B등급)"
            ,"한정치산정보보유여부(A~B등급)"
            ,"개인파산면책정보보유여부(CIS포함)(A~B등급)"
            ,"당좌거래정지정보보유여부(CIS포함)"
            ,"개인회생정보보유(A~B등급)"
            ,"개인회생정보보유여부(CIS포함)(A~B등급)"
            ,"서브프라임 등급"
            ,"R-Score(저축)"
            ,"P2P 대출건수(미해지)"
            ,"P2P 대출기관수(미해지)"
            ,"P2P 총약정금액(미해지)"
            ,"P2P 총대출잔액(미해지)"
            ,"P2P 최고약정금액(미해지)"
            ,"P2P 최고대출잔액(미해지)"
            ,"P2P 최초대출개설일자로부터의경과일수(미해지)"
            ,"P2P 최근대출개설일자로부터의경과일수(미해지)"
            ,"P2P 대출연체건수(미해제)"
            ,"P2P 연체기관수(미해제)"
            ,"P2P 총연체금액(미해제)"
            ,"P2P 총연체일수(미해제)"
            ,"P2P 최고연체금액(미해제)"
            ,"P2P 최근연체상환일자(미해제)"
            ,"P2P 최근연체해제일자로부터경과일수"
            ,"P2P 최장연체일수(미해제)"};



    @Resource(name = "transactionManager")
    protected DataSourceTransactionManager txManager;
    //
    @Autowired
    MemberDAOService memberDAOService;

    @Autowired
    ApplicationDataSeriesDAOService applicationDataSeriesDAOService;

    @Autowired
    ApplicationDAOService applicationDAOService;

    @Autowired
    ApplicationDataDAOService applicationDataDAOService;

    @Autowired
    DisQualifiedReasonDAOService disqualifedDAOService;


    public String trimConcat(String[] kcbRes, int start, int end)
    {
        StringBuffer res = new StringBuffer();
        int i;
        for(i=start; i<=end; i++)
        {
            res.append(kcbRes[i].trim());
        }
        return res.toString();
    }

    public String[] parse_temp(byte[] parse, int[] stringlength)
    {
        System.out.println(parse.length);
        String[] parseString = new String[commonHeader.length + stringlength.length];

        int i, start=0;
        for(i=0; i<commonHeader.length + stringlength.length; i++)
        {
            if(i < commonHeader.length) {

            //    parseString[i] = new String(parse, start, commonHeader_temp[i]);
                //parse.substring(start, start + commonHeader[i]);
                System.out.println(start + " - " + (start+commonHeader_temp[i]) + " : " + parseString[i]);
                start += commonHeader_temp[i];
            }
            else
            {

                parseString[i] = new String(parse, start, stringlength[i-commonHeader.length]);
                System.out.println(start + " - " + (start+stringlength[i-commonHeader.length]) + " : " +  parseString[i]);
                start += stringlength[i-commonHeader.length];
            }
        }

        return parseString;
    }

    public String[] parse(byte[] parse, int[] stringlength) throws UnsupportedEncodingException {

        String[] parseString = new String[commonHeader.length + stringlength.length];


        int i, start=0;
        for(i=0; i<commonHeader.length + stringlength.length; i++)
        {
            if(i < commonHeader.length) {

                parseString[i] = new String(subStringByte(parse, start, commonHeader[i]+ start), "euc-kr");
                //parseString[i] = new String(parse, start, commonHeader[i]);
                //parse.substring(start, start + commonHeader[i]);
                System.out.println(start + " - " + (start+commonHeader[i]) + " : " + parseString[i]);
                start += commonHeader[i];
            }
            else
            {
                parseString[i] = new String(subStringByte(parse, start,  stringlength[i-commonHeader.length]+ start), "euc-kr");
                //parseString[i] = new String(parse, start, stringlength[i-commonHeader.length]);
                System.out.println(start + " - " + (start+stringlength[i-commonHeader.length]) + " : " +  parseString[i]);
                start += stringlength[i-commonHeader.length];
            }
        }

        return parseString;
    }

    public String[] parse(byte[] parse, int[] stringlength, int ReceviedNum) throws UnsupportedEncodingException {

        String[] parseString = new String[commonHeader.length + stringlength.length];


        int i, start=0;
        for(i=0; i<commonHeader.length + stringlength.length; i++)
        {
            if(i < commonHeader.length) {

                parseString[i] = new String(subStringByte(parse, start, commonHeader[i]+ start), "euc-kr");
                //parseString[i] = new String(parse, start, commonHeader[i]);
                //parse.substring(start, start + commonHeader[i]);
                System.out.println(start + " - " + (start+commonHeader[i]) + " : " + parseString[i]);
                start += commonHeader[i];
            }
            else
            {
                parseString[i] = new String(subStringByte(parse, start,  stringlength[i-commonHeader.length]+ start), "euc-kr");
                //parseString[i] = new String(parse, start, stringlength[i-commonHeader.length]);
                System.out.println(start + " - " + (start+stringlength[i-commonHeader.length]) + " : " +  parseString[i]);
                start += stringlength[i-commonHeader.length];
            }
        }

        return parseString;
    }

    public String[] parse371(String parse, int[] stringlength) throws UnsupportedEncodingException {
        //System.out.println("parse371");
        String[] parseString = new String[stringlength.length];

        int i, start=0;
        for(i=0; i< stringlength.length; i++)
        {

                byte[] b = parse.getBytes("euc-kr");
                //parseString[i] = parse.substring(start, start+stringlength[i]);

                parseString[i] = new String(subStringByte(b, start, stringlength[i]+ start), "euc-kr");

            //    System.out.println(start + " - " + (start+stringlength[i]) + " : " +  parseString[i]);

                start += stringlength[i];
        }

        return parseString;
    }

    public String deParse(String[] parseString)
    {
        int i;
        StringBuffer totalString = new StringBuffer();
        for(i=0; i<parseString.length; i++)
        {
            totalString.append(parseString[i]);
            System.out.println( i + " : " + parseString[i]);
        }
        return totalString.toString();
    }

    public String setKCB360(KCBPerson kcbPerson) throws UnsupportedEncodingException {

        String birthdate = kcbPerson.getBirthdate();
        String sex       = kcbPerson.getSex();
        String phone     = kcbPerson.getPhone();
        String name      = kcbPerson.getName();


        //현재 시간 가져오기
        SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat ( "yyyyMMdd", Locale.KOREA );
        Date currentTime = new Date ( );
        String mTime = mSimpleDateFormat.format ( currentTime );


        //// 전화번호 포맷 갱신
        if(phone.length() >=11)
        {
            phone = phone.substring(0,3).concat(" ").concat(phone.substring(3,7).concat(phone.substring(7,11)));
        }
        else
        {
            phone = phone.substring(0,3).concat(" ").concat(phone.substring(3,6).concat(" ").concat(phone.substring(6,10)));
        }

      //  String word="0469SCDEV    X00070000100360B0000002004220160513000000000000020160513000000                                                           1000001240360       1090131536          나원준                                                         198804181 010 5040025820160513Y0100360   100       s07036972703        192.168.28.1   allcredit.co.kr                                   0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";
         //String word="0469SCDEV    fundajun0100360B0000002004220160513000000000000020160513000000                                                           1000001240360       1090131536          나원준                                                         198804181 010 5040025820160513Y0100360   200       s08160933241        192.168.28.1   allcredit.co.kr                                   0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";
        String word="0469SCDEV    X00070000100360B0000002004220160513000000000000020160513000000                                                           1000001248360       1090131536          나원준                                                         198804181 010 5040025820160513Y0100360   200       s08160933241        192.168.28.1   allcredit.co.kr                                   0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";

        //0469SCDEV    X00070000100360B0000002004220160513000000000000020160513000000                                                           1000001240360       1090131536          wonjun                                            8804181075610198804181 010 5040025820160513Y0100360   100       s07036972703        192.168.28.1   allcredit.co.kr                                   0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789
        //0469SCDEV    X00070000100360B0000002004220160513000000000000020160513000000                                                           1000001240360       1090131536          나원준                                                         198804181 010 5040025820160513Y0100360   100       s07036972703        192.168.28.1   allcredit.co.kr                                   0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789

        String word_euc = new String(word.getBytes("euc-kr"), "euc-kr");

        int i;
        StringBuffer space = new StringBuffer();
        for(i=0; i<50-name.getBytes("euc-kr").length; i++)    {   space.append(" ");            }


        String[] kcb360 = parse(word.getBytes("euc-kr"), reqKcb0100360);
        kcb360[16] = name.concat(space.toString());
        kcb360[18] = birthdate;
        kcb360[19] = sex.concat(" ");
        kcb360[20] = phone;
        kcb360[21] = mTime;

        String fulltext = deParse(kcb360);

        return fulltext;
    }



    public String setKCB361(KCBPerson kcbPerson) throws UnsupportedEncodingException {


        String registerkey  = kcbPerson.getRegisterkey();
        String word="0329SCDEV    X00070000100361B0000002004220160513000000000000020160513000000                                                           1000001248360       1090131536          2016051316064811111120160513Yfundajun                                                                                                                          ";
                                                                                                                                                                                            //     20160601112350111101
        String[] kcb361 = parse(word.getBytes("euc-kr"), reqKcb0100361);
        kcb361[16] = registerkey;

        String fulltext = deParse(kcb361);

        return fulltext;
    }

    public static String escape(String string){
        StringBuffer sb = new StringBuffer();
        String ncStr = "*-./0123456789@ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz ";
        char c;

        for(int i=0;i<string.length();i++){
            c = string.charAt(i);
            if(c>0x7f)
                sb.append("%u" + Integer.toHexString((int)c).toUpperCase());
            else if(ncStr.indexOf((int)c)==-1){
                sb.append('%');
                if(c<=0xf)
                    sb.append('0');
                sb.append(Integer.toHexString((int)c).toUpperCase());
            }
            else
                sb.append(c);
        }

        return sb.toString();
    }

    /**
     * 100개 CPS 코드 추가
     * @param sentence
     * @return
     */
    public String setCPSCode(String sentence ,int totalNum, int receivedNum)
    {


        StringBuffer word = new StringBuffer();
        word.append(sentence);

        word.append(String.format("%03d", receivedNum));
        word.append(String.format("%03d", totalNum));

        System.out.println( receivedNum + " - " + totalNum + receivedNum);
        int i;
        for(i=receivedNum; i<totalNum+receivedNum; i++)
        {
            word.append("103");
            word.append(cps_code[i]);
        }

        return word.toString();

    }

    public  String setKCB371(KCBPerson kcbPerson) throws UnsupportedEncodingException {

//        System.out.println("-----------------------setKCB371-------------------------------------------------");

        String replaceKey  = kcbPerson.getReplacekey();

        //System.out.println(replaceKey);
        //String word = "0943SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 fundajun       7044065490     099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000054103D10210D00103D10110D0N103D10110D0T103D10210000103D10110001103D10110003103D10110006103D1011000C103D1Z000106103D1Z000107103D1Z000108103D1Z000109103D10120000103D1L120000103D10210600103D1021060C103D20210000103D20110006103D2011000C103D2Z000046103D2111000F103D30210000103D3021000C103D10132D0K103D10132D0N103D10132D0T103D1017500K103D1017500N103D1017500T103G10210000103R15020620103R17020520103R11120110103R12520110103R13720120103R13820120103R16020700103L10220000103L20220000103L20228000103L90210301103L10220800103L9Z000373103L20220L00103L2Z000032103L2Z000042103L2Z000015103L1021A000103L1Z000018103L2Z000016103L1023C800103L20231L00103L1Z000001103S9100100 ";
        String word = "1495SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 fundajun       7044065490     099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099";
        //054103D10210D00103D10110D0N103D10110D0T103D10210000103D10110001103D10110003103D10110006103D1011000C103D1Z000106103D1Z000107103D1Z000108103D1Z000109103D10120000103D1L120000103D10210600103D1021060C103D20210000103D20110006103D2011000C103D2Z000046103D2111000F103D30210000103D3021000C103D10132D0K103D10132D0N103D10132D0T103D1017500K103D1017500N103D1017500T103G10210000103R15020620103R17020520103R11120110103R12520110103R13720120103R13820120103R16020700103L10220000103L20220000103L20228000103L90210301103L10220800103L9Z000373103L20220L00103L2Z000032103L2Z000042103L2Z000015103L1021A000103L1Z000018103L2Z000016103L1023C800103L20231L00103L1Z000001103S9100100 ";
        //String word = "0295SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 fundajun       7044065490     099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000000";
        //             0295SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 zooc010        7044065490  099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000000
        //

        word = setCPSCode(word, 100, 0);

        String[] kcb371 = parse(word.getBytes("euc-kr"), reqKcb0100371);

        int i;
        for(i=0; i<= reqKcb0100371[5] -replaceKey.length()+1; i++)  replaceKey = replaceKey.concat(" ");

        kcb371[18] = replaceKey;

        //System.out.println(replaceKey);

        String fulltext = deParse(kcb371);

//        System.out.println("-----------------------endsetKCB371-------------------------------------------------" + fulltext);

        return fulltext;
    }


    /**
     * 371 전문 항목 세팅(재조회시)
     * @param kcbPerson
     * @param AuthNum
     * @return
     * @throws UnsupportedEncodingException
     */

    public  String setKCB371(KCBPerson kcbPerson, String AuthNum, String CPSTotal, String CPSReceived) throws UnsupportedEncodingException {

        System.out.println("-----------------------setKCB371(readd)-------------------------------------------------");

        String replaceKey  = kcbPerson.getReplacekey();
        int CPSTotalNum     = Integer.valueOf(CPSTotal);
        int CPSReceivedNum  = Integer.valueOf(CPSReceived);
        int CPSSendNum      = CPSTotalNum - CPSReceivedNum;

        //System.out.println(replaceKey);
        //String word = "0943SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 fundajun       7044065490     099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000054103D10210D00103D10110D0N103D10110D0T103D10210000103D10110001103D10110003103D10110006103D1011000C103D1Z000106103D1Z000107103D1Z000108103D1Z000109103D10120000103D1L120000103D10210600103D1021060C103D20210000103D20110006103D2011000C103D2Z000046103D2111000F103D30210000103D3021000C103D10132D0K103D10132D0N103D10132D0T103D1017500K103D1017500N103D1017500T103G10210000103R15020620103R17020520103R11120110103R12520110103R13720120103R13820120103R16020700103L10220000103L20220000103L20228000103L90210301103L10220800103L9Z000373103L20220L00103L2Z000032103L2Z000042103L2Z000015103L1021A000103L1Z000018103L2Z000016103L1023C800103L20231L00103L1Z000001103S9100100 ";
        String word = "1495SCDEV    X00070000500371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000177KCB                 fundajun       7044065490     000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
        //054103D10210D00103D10110D0N103D10110D0T103D10210000103D10110001103D10110003103D10110006103D1011000C103D1Z000106103D1Z000107103D1Z000108103D1Z000109103D10120000103D1L120000103D10210600103D1021060C103D20210000103D20110006103D2011000C103D2Z000046103D2111000F103D30210000103D3021000C103D10132D0K103D10132D0N103D10132D0T103D1017500K103D1017500N103D1017500T103G10210000103R15020620103R17020520103R11120110103R12520110103R13720120103R13820120103R16020700103L10220000103L20220000103L20228000103L90210301103L10220800103L9Z000373103L20220L00103L2Z000032103L2Z000042103L2Z000015103L1021A000103L1Z000018103L2Z000016103L1023C800103L20231L00103L1Z000001103S9100100 ";
        //String word = "0295SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 fundajun       7044065490     099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000000";
        //             0295SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 zooc010        7044065490  099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000000
        //



        word = setCPSCode(word , CPSSendNum, CPSReceivedNum);

        int i;
        int[] reqKcb0500371  = new int[46+CPSSendNum*2];
        for(i=0; i<reqKcb0500371.length; i++) {
            reqKcb0500371[i] = reqKcb0100371[i];
            System.out.print(reqKcb0500371[i]);
        }

        System.out.println();
        System.out.println ("테스트키" + AuthNum+ " - " +  String.format("%03d", CPSReceivedNum)  + " - " +String.format("%03d", CPSSendNum) );


        String[] kcb371 = parse(word.getBytes("euc-kr"), reqKcb0500371);

        for(i=0; i<= reqKcb0100371[5] -replaceKey.length()+1; i++)  replaceKey = replaceKey.concat(" ");

        kcb371[0] =   String.format("%04d", word.length()-4) ;
        kcb371[18] =  replaceKey;
        kcb371[13] =  AuthNum;
        kcb371[57] =  String.format("%03d", CPSReceivedNum) ;
        kcb371[58] =  String.format("%03d", CPSSendNum) ;

        String fulltext = deParse(kcb371);


        return fulltext;
    }


    /**
     * 371 전문 항목 세팅(재조회시)
     * @param kcbPerson
     * @param AuthNum
     * @return
     * @throws UnsupportedEncodingException
     */

    public  String setKCB371(String[] fullText, KCBPerson kcbPerson, String AuthNum, String CPSTotal, String CPSReceived) throws UnsupportedEncodingException {

        System.out.println("-----------------------setKCB371(readd)-------------------------------------------------");

        String replaceKey  = kcbPerson.getReplacekey();
        int CPSTotalNum     = Integer.valueOf(CPSTotal);
        int CPSReceivedNum  = Integer.valueOf(CPSReceived);
        int CPSSendNum      = CPSTotalNum - CPSReceivedNum;

        //System.out.println(replaceKey);
        //String  word = "0943SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 fundajun       7044065490     099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000054103D10210D00103D10110D0N103D10110D0T103D10210000103D10110001103D10110003103D10110006103D1011000C103D1Z000106103D1Z000107103D1Z000108103D1Z000109103D10120000103D1L120000103D10210600103D1021060C103D20210000103D20110006103D2011000C103D2Z000046103D2111000F103D30210000103D3021000C103D10132D0K103D10132D0N103D10132D0T103D1017500K103D1017500N103D1017500T103G10210000103R15020620103R17020520103R11120110103R12520110103R13720120103R13820120103R16020700103L10220000103L20220000103L20228000103L90210301103L10220800103L9Z000373103L20220L00103L2Z000032103L2Z000042103L2Z000015103L1021A000103L1Z000018103L2Z000016103L1023C800103L20231L00103L1Z000001103S9100100 ";
        String word = "1495SCDEV    X00070000500371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 fundajun       7044065490     000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
        //054103D10210D00103D10110D0N103D10110D0T103D10210000103D10110001103D10110003103D10110006103D1011000C103D1Z000106103D1Z000107103D1Z000108103D1Z000109103D10120000103D1L120000103D10210600103D1021060C103D20210000103D20110006103D2011000C103D2Z000046103D2111000F103D30210000103D3021000C103D10132D0K103D10132D0N103D10132D0T103D1017500K103D1017500N103D1017500T103G10210000103R15020620103R17020520103R11120110103R12520110103R13720120103R13820120103R16020700103L10220000103L20220000103L20228000103L90210301103L10220800103L9Z000373103L20220L00103L2Z000032103L2Z000042103L2Z000015103L1021A000103L1Z000018103L2Z000016103L1023C800103L20231L00103L1Z000001103S9100100 ";
        //String word = "0295SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 fundajun       7044065490     099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000000";
        //             0295SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 zooc010        7044065490  099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000000
        //



        word = setCPSCode(word , CPSSendNum, CPSReceivedNum);

        int i;
        int[] reqKcb0500371  = new int[46+CPSSendNum*2];
        for(i=0; i<reqKcb0500371.length; i++) {
            reqKcb0500371[i] = reqKcb0100371[i];
            System.out.print(reqKcb0500371[i]);
        }

        System.out.println();
        System.out.println ("테스트키" + AuthNum+ " - " +  String.format("%03d", CPSReceivedNum)  + " - " +String.format("%03d", CPSSendNum) );


        String[] kcb371 = parse(word.getBytes("euc-kr"), reqKcb0500371);

        for(i=0; i<= reqKcb0100371[5] -replaceKey.length()+1; i++)  replaceKey = replaceKey.concat(" ");

        kcb371[0] =   String.format("%04d", word.length()-4) ;
        kcb371[18] =  replaceKey;
        kcb371[13] =  AuthNum; //String.format("%12d", AuthNum) ;
        kcb371[14] =  String.format("%02d", Integer.parseInt(kcb371[14].trim()) + 1) ;

        int index = 19;

        for(i=17; i<=71; i+=3)
        {
                kcb371[index]   =  String.format("%03d", Integer.parseInt(fullText[i+1]));                                                                   // 수신건수
                kcb371[index+1] =  String.format("%02d", Integer.parseInt(fullText[i]) - Integer.parseInt(fullText[i+1])); // 요청건수
                index+=2;
        }


        kcb371[57] =  String.format("%03d", Integer.parseInt(fullText[i+1])) ;
        kcb371[58] =  String.format("%03d", Integer.parseInt(fullText[i]) - Integer.parseInt(fullText[i+1])) ;

        //kcb371[57] =  String.format("%03d", CPSReceivedNum) ;
        //kcb371[58] =  String.format("%03d", CPSSendNum) ;



        String fulltext = deParse(kcb371);


        return fulltext;
    }

    public KCBPerson getKCBClient360(KCBPerson kcbPerson) throws IOException {
        // String birthdate, String sex, String phone, String name
        String ip ="219.255.136.241";
        String url ="";
        String birthdate = kcbPerson.getBirthdate();
        String sex       = kcbPerson.getSex();
        String phone     = kcbPerson.getPhone();
        String name      = kcbPerson.getName();
        //JSONObject input    = new JSONObject();

        //ipAddress = ip; //생성자의 IP Address를 ipAddress 맴버변수에 저장
        try
        {
            client = new Socket(ipAddress,port);
          //  client.setSoTimeout(timeout);
            //client.setTcpNoDelay(true);

           os = client.getOutputStream();
           oos = new BufferedWriter(new OutputStreamWriter(os, "euc-kr"));

           is = client.getInputStream();
           ois = new BufferedReader(new InputStreamReader(is, "euc-kr"));



           // String word_euc = new String(word.getBytes("euc-kr"), "euc-kr");

            String word_euc = setKCB360(kcbPerson);
            System.out.println(word_euc.length() + "input : ");
            System.out.println(word_euc);
            oos.write(word_euc);
            oos.flush();

            System.out.print("입력 →" + word_euc);

            char[] cTot = new char[1000];

            //String ttt= "0650SCDEV    X00070000110360C0000002004220160530201932000000020160513000000PT10010028201932                                           1000001240360       1090131536          20160530201932110820http://   test.allcredit.co.kr:18888                        /ADFCommonSvl?SCRN_ID=s07036972703&EPARAM=                                                                                                                                                              1v3NakGkIKJRIS01AxYgWsvGr6oClWg8o6KwCzG+fG4=                                                        0123456789012345678901234567890123456789012345                                                      ";


            StringBuffer rtnStr = new StringBuffer("");
            if(ois.read(cTot)!=-1){
                rtnStr.append(new String(cTot));
                System.out.println("output : ");
                System.out.println(rtnStr);
                System.out.println("=====================================================");
                System.out.println(rtnStr.length());
                String[] kcb360res = parse(rtnStr.toString().getBytes(), resKcb0100360);

                kcb360res[20] = escape(kcb360res[20]);
                //kcb360res[20]=   kcb360res[20].replace("+", "%2B");

                //String rtn_url = "222.231.28.29:8080/finish_page?registerkey=" +kcb360res[16];
                String rtn_url = "www.naver.com";

                url       = trimConcat(kcb360res, 17, 20);
             //   url       = url.concat("&RTN_URL=").concat(rtn_url);


                kcbPerson.setResponseCode(kcb360res[6]);
                kcbPerson.setRegisterkey(kcb360res[16]);



                //kcbPerson.setUrl(URIUtil.encodeQuery(url));
              //
                //kcbPerson.setUrl(URLShortener.getShortenUrl(url));
                kcbPerson.setUrl(url);
                kcbPerson.setOriginalUrl(url);

                //input.put("", );
                // 전문길이가 전문 맨앞자리에 포함되므로 이미꺼낸 10 byte 는 빼고 꺼낸다.
            }

        }
        catch (Exception e)
        {

            kcbPerson.setErrorMsg(e.getMessage());
            e.printStackTrace();

        }
        finally {
            try{

              /*  if(ois != null) try{ois.close();}catch(IOException e){}
                if(is != null) try{is.close();}catch(IOException e){}
                if(oos != null) try{oos.close();}catch(IOException e){}
                if(os != null) try{os.close();}catch(IOException e){}
                if(client != null) try{client.close();}catch(IOException e){}*/

                ois.close();
                is.close();

                oos.close();
                os.close();

                client.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        return kcbPerson;
    }


    public KCBPerson getKCBClient361(KCBPerson kcbPerson) throws IOException {
        // String birthdate, String sex, String phone, String name
        String ip ="219.255.136.241";
        String url ="";
        String birthdate = kcbPerson.getBirthdate();
        String sex       = kcbPerson.getSex();
        String phone     = kcbPerson.getPhone();
        String name      = kcbPerson.getName();
        //
        // JSONObject input    = new JSONObject();

/*        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");


        File file = new File("home/kcb_bc/"+kcbPerson.getRegisterkey()+"_"+df.format(now));

        FileOutputStream fs = new FileOutputStream(file);
        OutputStreamWriter ow = new OutputStreamWriter(fs,"utf-8");


        //FileWriter fw = new FileWriter("home/kcb/"+kcbPerson.getReplacekey()+"_"+df.format(now));
        BufferedWriter bw = new BufferedWriter(ow);


        bw.write("====================================================================================================");
        bw.newLine();
*/
        //ipAddress = ip; //생성자의 IP Address를 ipAddress 맴버변수에 저장
        try
        {
            client = new Socket(ipAddress,port);
            client.setSoTimeout(timeout);
         //   client.setTcpNoDelay(true);

            os = client.getOutputStream();
            oos = new BufferedWriter(new OutputStreamWriter(os, "euc-kr"));


            is = client.getInputStream();
            ois = new BufferedReader(new InputStreamReader(is, "euc-kr"));

            String word_euc = setKCB361(kcbPerson);
            System.out.println(word_euc.length()+ "input2 :" +word_euc);


            oos.write(word_euc);
            oos.flush();

            //char[] cTot2 = new char[1000];

            int response;
            int totCnt = 0;
            char[] cTot = new char[4];


            StringBuffer rtnStr2 = new StringBuffer("");
            if (ois.read(cTot) != -1) {

                rtnStr2.append(new String(cTot));

                System.out.println("처음 파싱한 4자리 값 : " + rtnStr2.toString());
                System.out.println("처음 파싱한 4자리 값의  길이 : " + rtnStr2.toString().length());

                totCnt = Integer.parseInt((rtnStr2.toString()==null ? "0" : rtnStr2.toString()));

                // 전문길이가 전문 맨앞자리에 포함되므로 이미꺼낸 4 byte 는 빼고 꺼낸다.
                for (int i = 0; i < totCnt; i++) {  //totCnt-4
                    response = ois.read();

                    if(response >=0 && response <=128)
                    {

                    }
                    else i++;

                    //bw.write(response);
                    //bw.newLine();;

                    rtnStr2.append((char) response);
                }

                 ///rtnStr2.append(new String(cTot2));
                 System.out.println("output2 : ");
                 System.out.println(rtnStr2);

          //      bw.write(rtnStr2.toString());
        //        bw.newLine();


                    // 전문길이가 전문 맨앞자리에 포함되므로 이미꺼낸 10 byte 는 빼고 꺼낸다.
             }

            String[] kcb361res = parse(rtnStr2.toString().getBytes(), resKcb0100361);
            //String full_text ="";
            //for(int i=0;i<kcb361res.length; i++)
            //   full_text = full_text.concat(kcb361res[i]);


            kcbPerson.setReplaceKey(kcb361res[17].trim());
            kcbPerson.setResponseCode(kcb361res[6].trim());

            System.out.println("kcb code" + kcbPerson.getReplacekey() + "END");




        }
        catch (Exception e)
        {

            kcbPerson.setErrorMsg(e.getMessage());
            e.printStackTrace();
            System.out.println("통신 Error !!");

        }
        finally {
            try {
                ois.close();
                is.close();

                oos.close();
                os.close();

                client.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return kcbPerson;

    }

    public void getKCBClient371withNIO(KCBPerson kcbPerson) throws IOException, InterruptedException {


        //"219.255.136.241", 43500

    }


    public static String readToEnd(InputStream in) throws IOException {
        byte[] b = new byte[1024];
        int n;
        StringBuilder sb = new StringBuilder();
        while ((n = in.read(b)) >= 0) {
            sb.append(b);
        }
        return sb.toString();
    }

    public void readFileToSaveKCB(String filename)
    {

        ArrayList<String[]> kcb371list       = new ArrayList<String[]>();
        ArrayList<String[]> kcb371list_label = new ArrayList<String[]>();

        ArrayList<KCB371>res371_index = new ArrayList<KCB371>();
        KCBPerson kcbPerson = new KCBPerson();



        try {
            StringBuffer rtnStr3 = new StringBuffer("");

            BufferedReader in = new BufferedReader(new FileReader("/home/kcb_bc/"+filename));
            String s;
            int iex=0;

            while ((s = in.readLine()) != null) {
                System.out.println(s);
                if(iex==6)  { rtnStr3.append(s) ; break;}
                iex++;
            }
            in.close();

            System.out.println(s);

            if (rtnStr3.length() > 323) {

                String 응답전문1 = rtnStr3.toString().substring(0, 323);
                String 응답전문2 = rtnStr3.toString().substring(323);

                System.out.println("answer : " + 응답전문1);
                String[] kcb371res = parse(응답전문1.getBytes(), resKcb0100371_000);

                kcb371res[74] = String.valueOf(cps_code.length);

                int CPSindex=0;
                int i, j, segId = 0, k, length = 323;
                for (i = 17, segId = 0; i <= 74; i += 3, segId++) {  // 19, 76
                    int index = Integer.parseInt(kcb371res[i]);
                    System.out.println("index : " + index);

                    if (index > 0) {
                        //    System.out.println("아이 : " + index + " : " + i + " : " + 응답전문2.substring(0, 3) + " : " + resKcb0100371_label[segId][0]);
                        res371_index.add(new KCB371(index, resKcb0100371_label[segId][0], 응답전문2.substring(0, 3)));


                        for (j = 0; j < index; j++) {
                            int sum = 0;
                            for (k = 0; k < resKcb0100371_detail[segId].length; k++)
                                sum += resKcb0100371_detail[segId][k];

                            byte[] b = 응답전문2.getBytes();

                            System.out.println(b);

                            String[] kcb371res_detail = parse371(new String(subStringByte(b, 0, sum)), resKcb0100371_detail[segId]);
                            String[] kcb371res_label = resKcb0100371_label[segId];

                            if (i == 74) {

                                String[] label = {"CPS정보", "CPS코드", "CPS결과값"};
                                label[1] = cps_label[j];
                                kcb371list_label.add(label);
                                CPSindex++;

                            } else {
                                kcb371list_label.add(kcb371res_label);
                            }

                            kcb371list.add(kcb371res_detail);

                            응답전문2 = new String(subStringByte(b, sum, b.length));


                        }
                    }
                }


                //  kcbPerson.setResponseCode( esg.toString());
                System.out.println(res371_index.size() + " : " + kcb371list.size() + " : " + kcb371list_label.size());
                kcbPerson.setLabel(res371_index);
                kcbPerson.setReport(kcb371list);
                kcbPerson.setCPScount(CPSindex);
                kcbPerson.setReport_label(kcb371list_label);
                kcbPerson.setRegisterkey("20161026164401237886");
                // 전문길이가 전문 맨앞자리에 포함되므로 이미꺼낸 10 byte 는 빼고 꺼낸다.

                DBSave(kcbPerson);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void DBSave (KCBPerson getList)
    {

        try {


                ArrayList<String[]> report = getList.getReport();
                ArrayList<KCB371> label = getList.getLabel();
                ArrayList<String[]> report_label = getList.getReport_label();

                /**
                 *  KCB 가심사 알고리즘 적용 10-11
                 */


                System.out.println("=======================================CPS가심사=======================================");
                ArrayList<String[]> CPS = new ArrayList<String[]>();
                int i;

                ArrayList<String[]> dummy =  new ArrayList<String[]>();

                for (i = report.size() - 100; i < report.size(); i++) {
                    if(report.get(i)[2].trim().equals("C") || report.get(i)[2].trim().equals("E"))
                    {
                        String[] tmp = new String[3];
                        tmp[2] = "123456789";
                        dummy.add(tmp);
                        CPS.add(dummy.get(0));
                    }
                    else CPS.add(report.get(i));
                    System.out.println(report.get(i)[2]);
                }

                System.out.println("=======================================CPS가심사(끝)=======================================");


                KCBAlgorithm algo = new KCBAlgorithm(CPS);

                /**
                 *   0 : 관보
                 *   1 : 신용
                 *   2 : 카드
                 *   3 : 연체
                 *   4 : 보증
                 *   5 : 대출
                 *   6 : 통과
                 */
                ArrayList<String> YesNo = algo.getPreJudgeYN();
                int rainbow_credit = algo.getCreditValue();


                applicationExample getNextId = new applicationExample();
                getNextId.createCriteria().andRegisterkeyEqualTo(getList.getRegisterkey());

                List<application> nextIndex = applicationDAOService.selectByExample(getNextId);
                int idxs = nextIndex.get(0).getIdx();

                String judgeCode = "심사대기";
                if (YesNo.size() == 0) {
                    judgeCode = "심사완료";
                } else {
                    judgeCode = "심사탈락";

                    disqualifiedReasons records = new disqualifiedReasons();

                    for (i = 0; i < YesNo.size(); i++) {
                        records.setRefIdx(idxs);
                        records.setCode(YesNo.get(i).toString());
                        disqualifedDAOService.insertSelective(records);
                    }

                }
            /*
            if(YesNo>=6)   judgeCode="심사완료";
            else           judgeCode="심사탈락";
*/
                System.out.println("=======================================결과" + YesNo + " =======================================");
                String reason = "";

            /*
            if(YesNo==0)       reason = "관보";
            else if(YesNo==1)  reason = "신용";
            else if(YesNo==2)  reason = "카드";
            else if(YesNo==3)  reason = "연체";
            else if(YesNo==4)  reason = "보증";
            else if(YesNo==5)  reason = "대출";
            else if(YesNo==6)  reason = "통과";
*/

                System.out.println("=======================================결과" + reason + " =======================================");

                if (rainbow_credit >= 7) {
                    judgeCode = "심사탈락";
                    reason = "";
                }

                getList.setRainbowscore(rainbow_credit);

                /**
                 * 가심사 끝
                 */


                applicationExample records = new applicationExample();
                applicationWithBLOBs record = new applicationWithBLOBs();
                application_data record1 = new application_data();
                application_data_series record2 = new application_data_series();

                //  record.setStoreName("어드민화면신청");
        ///        record.setAmount(100000);
                //record.setPhone(phone);
                //if(person.getPhone()==null || person.getPhone().equals("")  ) record.setPhone("01050400258");

                records.createCriteria().andIdxEqualTo(idxs);
                //record.setUserNote("테스트");
                //record.setStoreIdx(1);
                record.setDebtCode(judgeCode);

                //record.setRegisterkey(person.getRegisterkey());
                record.setReplacekey(getList.getReplacekey());
                record.setRainbowscore(rainbow_credit);
                record.setDescmemo(reason);

//            applicationDAOService.insertSelective(record);
                applicationDAOService.updateByExampleSelective(record, records);


//                logger.info("kcb index : " + idxs);

                if (label != null) {
                    int j, idx = 0, k;
                    for (i = 0; i < label.size(); i++) {
                        KCB371 index = label.get(i);

                        if (!index.getSeg().isEmpty()) {
                            System.out.println("controller: " + label.get(i).getCount() + " : " + label.get(i).getLabel());
                            record1.setRefIdx(idxs);
                            //record1.setType("KCB");
                            record1.setTypePrefix("KCB");
                            record1.setValue(index.getSeg());
                            record1.setType(index.getLabel());
                            record1.setSeriesCount(index.getCount());
                            record1.setDate(new Date());

                            applicationDataDAOService.insertSelective(record1);

                            for (j = 0; j < index.getCount(); j++) {
                                String[] label_re = report_label.get(idx);
                                String[] temp = report.get(idx++);
                                int month = 12;

                                //    System.out.println(idx + "LABEL : " +label_re[1]);

                                for (k = 1; k < temp.length; k++) {
                                    record2.setRefIdx(idxs);
                                    record2.setSegIdx(temp[0]);
                                    record2.setSeriesIdx(String.valueOf(j + 1));
                                    record2.setValue(temp[k]);
                                    record2.setDate(new Date());
                                    record2.setSegName(label_re[0]);
                                    record2.setSeriesName(label_re[k]);


                                    if (temp[0].equals("025") || temp[0].equals("028") || temp[0].equals("019")) {
                                        record2.setDetailIdx(String.valueOf((int) (k - 1) / 12 + 1));
                                        record2.setSeriesDetailIdx(String.valueOf(month--));
                                        if (month <= 0) month = 12;
                                    } else {
                                        record2.setDetailIdx(String.valueOf(1));
                                        record2.setSeriesDetailIdx(String.valueOf(1));
                                    }
                                    applicationDataSeriesDAOService.insertSelective(record2);

                                }
                            }

                        }


                    }
                    SendSms sms = new SendSms();
                    StringBuffer content = new StringBuffer("");

                    if (reason.equals("통과")) {

                        content.append("안녕하세요 FUNDA 입니다.                          \n");
                        content.append("심사 통과 되었습니다.                             \n");
                        content.append("추후 안내 전화 드리겠습니다 .                     \n");
                        content.append("관심 가져주셔서 감사드립니다.                     \n");
                        content.append("www.funda.kr                                      \n");
                    } else {
                        content.append("안녕하세요 FUNDA 입니다.                                                               \n");
                        content.append("심사 결과 ").append(reason).append("항목 때문에 진행이 어렵다는 내용을 전달 받았습니다. \n");
                        content.append("빠른 성장으로 조만간 더 넓은 지역, 다양한 업권으로 서비스를 확대하도록 하겠습니다. \n");
                        content.append("관심 가져주셔서 감사드립니다. \n");
                        content.append("www.funda.kr \n");
                    }
                    // sms.apiSendSms(person.getPhone(),"14.32.55.87",  reason);

                  ////  txManager.commit(txStatus);

            }

//             return getList;
        }catch(Exception e)
        {
            //txManager.rollback(txStatus);
            e.printStackTrace();
        }

    }
    public KCBPerson getKCBClient371(KCBPerson kcbPerson) throws IOException {


        System.out.println(" -------------------------------------------------getKCBClient371 -------------------------------------------------" + kcbPerson.getReplacekey());


        ArrayList<String[]> kcb371list       = new ArrayList<String[]>();
        ArrayList<String[]> kcb371list_label = new ArrayList<String[]>();

        ArrayList<KCB371>res371_index = new ArrayList<KCB371>();


        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");

        File file = new File("home/kcb_bc/"+kcbPerson.getReplacekey()+"_"+df.format(now));

        FileOutputStream fs = new FileOutputStream(file);
        OutputStreamWriter ow = new OutputStreamWriter(fs,"utf-8");


        //FileWriter fw = new FileWriter("home/kcb/"+kcbPerson.getReplacekey()+"_"+df.format(now));
        BufferedWriter bw = new BufferedWriter(ow);


        bw.write("====================================================================================================");
        bw.newLine();


        try {

            client = new Socket(ipAddress, port);

            os = client.getOutputStream();
            oos = new BufferedWriter(new OutputStreamWriter(os, "euc-kr"));

            is = client.getInputStream();
            ois = new BufferedReader(new InputStreamReader(is, "euc-kr"));


            String word_euc = setKCB371(kcbPerson);

            oos.write(word_euc);
            oos.flush();



            StringBuffer rtnStr3 = new StringBuffer("");
            String line = null;

            long start = System.currentTimeMillis(); // 시작시간
            long end = System.currentTimeMillis();  //종료시간


        /*      while (ois.read(cTot3) > 0 ) {

                  end = System.currentTimeMillis();  //종료시간
                 // bw.newLine();
                  //bw.write(cTot3.toString());
                  //bw.newLine();

                  rtnStr3.append(new String(cTot3));
                  bw.write((end-start)+" milliseconds");
                  start = System.currentTimeMillis(); // 시작시간

              }
*/
            //StringBuffer rtnStr = new StringBuffer("");
            int response;
            int totCnt = 0;
            char[] cTot = new char[4];

            if (ois.read(cTot) != -1) {
                rtnStr3.append(new String(cTot));

                System.out.println("처음 파싱한 4자리 값 : " + rtnStr3.toString());
                System.out.println("처음 파싱한 4자리 값의  길이 : " + rtnStr3.toString().length());

                totCnt = Integer.parseInt((rtnStr3.toString()==null ? "0" : rtnStr3.toString()));

                 // 전문길이가 전문 맨앞자리에 포함되므로 이미꺼낸 4 byte 는 빼고 꺼낸다.
                for (int i = 0; i < totCnt; i++) {
                    response = ois.read();

                    if(response >=0 && response <=128)
                    {

                    }
                    else i++;

                    //bw.write(response);
                    //bw.newLine();;

                    rtnStr3.append((char) response);
                }
            }


            /**
             *   추가 전문 개발
             */

            String 응답 = rtnStr3.toString();
            int totalNum = Integer.valueOf(rtnStr3.toString().substring(0,4));

          /*  bw.write("응답 : " + 응답);
            bw.newLine(); // 줄바꿈
            bw.write("응답Y코드 : " + 응답.charAt(146));*/
            /**
             *  정보연속 여부가 있다면
             */

            while(응답.charAt(146)=='Y') {

                bw.write("응답 : " + 응답);
                bw.newLine(); // 줄바꿈
                bw.write("응답Y코드 : " + 응답.charAt(146));
                bw.newLine(); // 줄바꿈

                //String 응답전문1 = rtnStr3.toString().substring(0, 323);
                String 응답전문1 = 응답.toString().substring(0, 323);

                String[] kcb371res = parse(응답전문1.getBytes("euc-kr"), resKcb0100371_000);

                bw.write("output(add): " + 응답전문1);
                bw.newLine(); // 줄바꿈
                bw.write("응답cps코드 : " + kcb371res[13] + " - " + kcb371res[74] + " - " + kcb371res[75]);
                bw.newLine(); // 줄바꿈

                //String word_euc_add = setKCB371(kcbPerson, kcb371res[13], kcb371res[74], kcb371res[75]);
                String word_euc_add = setKCB371(kcb371res, kcbPerson, kcb371res[13], kcb371res[74], kcb371res[75]);

                bw.write("0051전문 : " + word_euc_add);
                bw.newLine(); // 줄바꿈

                oos.write(word_euc_add);
                oos.flush();



                StringBuffer rtnStr4 = new StringBuffer("");

                if (ois.read(cTot) != -1) {
                    rtnStr4.append(new String(cTot));

                    System.out.println("처음 파싱한 4자리 값(추가) : " + rtnStr4.toString());
                    System.out.println("처음 파싱한 4자리 값의  길이(추가) : " + rtnStr4.toString().length());

                    totCnt = Integer.parseInt((rtnStr4.toString() == null ? "0" : rtnStr4.toString()));

                    // 전문길이가 전문 맨앞자리에 포함되므로 이미꺼낸 4 byte 는 빼고 꺼낸다.
                    for (int i = 0; i < totCnt; i++) {
                        response = ois.read();

                        if (response >= 0 && response <= 128) {

                        } else i++;

                        //bw.write(response);
                        //bw.newLine();;

                        rtnStr4.append((char) response);
                    }
                    응답 = rtnStr4.toString();
                    rtnStr3.append(rtnStr4.substring(323));

                    totalNum += totCnt;

                    bw.write(응답);
                    bw.newLine();;
                    //rtnStr3.substring(0,4) = String.format("%04d", totalNum);
                }

            }

            /**
             *     추가 전문 개발 끝
             */


              int CPSindex=0;
              bw.write("output: ");
              bw.newLine(); // 줄바꿈
              bw.write(rtnStr3.toString());
              bw.newLine(); // 줄바꿈


                start = System.currentTimeMillis(); // 시작시간
                if (rtnStr3.length() > 323) {

                    String 응답전문1 = rtnStr3.toString().substring(0, 323);
                    String 응답전문2 = rtnStr3.toString().substring(323);

                    bw.newLine();
                    bw.write(응답전문1);
                    bw.newLine();
                    //System.out.println("answer : " + 응답전문1);
                    String[] kcb371res = parse(응답전문1.getBytes("euc-kr"), resKcb0100371_000);

                    kcb371res[74] = String.valueOf(cps_code.length);
                                            //StringBuffer esg = new StringBuffer("");
                   // esg.append( rtnStr3.toString()  + " :" + 응답전문2);
                    kcbPerson.setResponseCode(kcb371res[6]);
                    //kcbPerson.setResponseCode(rtnStr3.toString());

                    int i, j, segId = 0, k , length=323;
                    for (i = 17, segId = 0; i <= 74; i += 3, segId++) {  // 19, 76
                        int index = Integer.parseInt(kcb371res[i]);
                        System.out.println("index : " + index);
                        bw.write("index : " + index);
                        bw.newLine(); // 줄바꿈
                        if (index > 0) {
                        //    System.out.println("아이 : " + index + " : " + i + " : " + 응답전문2.substring(0, 3) + " : " + resKcb0100371_label[segId][0]);
                            res371_index.add(new KCB371(index, resKcb0100371_label[segId][0], 응답전문2.substring(0, 3)));


                            for (j = 0; j < index; j++) {
                                int sum = 0;
                                for (k = 0; k < resKcb0100371_detail[segId].length; k++)
                                    sum += resKcb0100371_detail[segId][k];

                                byte[] b = 응답전문2.getBytes("euc-kr");

                                System.out.println("length : "  + sum);
                                System.out.println(b.toString());

                                String[] kcb371res_detail = parse371(new String(subStringByte(b, 0, sum), "euc-kr"), resKcb0100371_detail[segId]);
                                String[] kcb371res_label = resKcb0100371_label[segId];

                                if(i==74) {

                                    String[] label = { "CPS정보", "CPS코드", "CPS결과값"};
                                    label[1] = cps_label[j];
                                    kcb371list_label.add(label);
                                    CPSindex++;

                                }
                                else
                                {
                                    kcb371list_label.add(kcb371res_label);
                                }

                                kcb371list.add(kcb371res_detail);

                                bw.write(응답전문2.toString());
                                bw.newLine(); // 줄바꿈
                                bw.write(sum + "-" + b.length + "-" + 응답전문2.length());
                                bw.newLine(); // 줄바꿈

                                응답전문2 = new String(subStringByte(b, sum, b.length), "euc-kr");

                                if(sum == b.length) break;

                            }
                        }
                    }


                  //  kcbPerson.setResponseCode( esg.toString());
                    System.out.println("====================================================================");
                    System.out.println(res371_index.size() + " : " + kcb371list.size() + " : " + kcb371list_label.size());
                    kcbPerson.setLabel(res371_index);
                    kcbPerson.setReport(kcb371list);
                    kcbPerson.setCPScount(CPSindex);
                    kcbPerson.setReport_label(kcb371list_label);
                    //kcbPerson.setReplaceKey(kcb361res[18]);
                    // 전문길이가 전문 맨앞자리에 포함되므로 이미꺼낸 10 byte 는 빼고 꺼낸다.
                }
          end = System.currentTimeMillis();  //종료시간
          bw.write((end-start)+" milliseconds");
          bw.write("====================================================================================================");


        }catch(Exception e)
        {

            e.printStackTrace();
            kcbPerson.setErrorMsg(e.getMessage());
        }finally {
            try{

            ois.close();
            is.close();

            oos.close();
            os.close();

            client.close();
            bw.close();
            ow.close();
            fs.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }


        return kcbPerson;
    }

    public byte[] subStringByte(byte[] b, int start, int end)
    {
        int i;
        byte[] c= new byte[end-start];
        for(i=start ;i<end; i++)
            c[i-start] = b[i];
        return c;
    }

    public static void main(String[] args) throws IOException {
        KCBPerson test =new KCBPerson();
        /*test.setBirthdate("19880418");
        test.setSex("1");
        test.setPhone("01050400258");
        test.setName("나원준");
        test.setRegisterkey("20160601112350111101");*/
        test.setReplaceKey("7375543202");
        KCBClient tt=  new KCBClient(); //Server Program이 실행되는 컴퓨터의 IP Address를 입력
    //    KCBPerson test2 =tt.getKCBClient371(test);

        //System.out.println(tt.getKCBClient361(test));

        char[] cTot33 ={ '나', '는'};

        String tes2t ="새마을금고";
     //   byte[] b = tes2t.getBytes("euc-kr");
      //      System.out.println(b.length);
//        System.out.println(new String(b, "euc-kr"));

   /*       String word_euc = tt.setKCB371(test);
        System.out.println(word_euc);


        String word = "1495SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 fundajun       7044065490     099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000";
        //054103D10210D00103D10110D0N103D10110D0T103D10210000103D10110001103D10110003103D10110006103D1011000C103D1Z000106103D1Z000107103D1Z000108103D1Z000109103D10120000103D1L120000103D10210600103D1021060C103D20210000103D20110006103D2011000C103D2Z000046103D2111000F103D30210000103D3021000C103D10132D0K103D10132D0N103D10132D0T103D1017500K103D1017500N103D1017500T103G10210000103R15020620103R17020520103R11120110103R12520110103R13720120103R13820120103R16020700103L10220000103L20220000103L20228000103L90210301103L10220800103L9Z000373103L20220L00103L2Z000032103L2Z000042103L2Z000015103L1021A000103L1Z000018103L2Z000016103L1023C800103L20231L00103L1Z000001103S9100100 ";
        //String word = "0295SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 fundajun       7044065490     099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000000";
        //             0295SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 zooc010        7044065490  099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000000
        //
        String test2 = tt.setCPSCode(word,  40, 60);

       // System.out.println(reqKcb0100371.length);
        System.out.println(test2);
        System.out.println("371: " + test2.length());

        String test2b="+";
        StringEscapeUtils te2st =new StringEscapeUtils();
        System.out.println(te2st.escapeJavaScript("+"));
        System.out.println(te2st.escapeHtml("+"));

        System.out.println(escape("+"));

        //64222660     - 100 - 060
        String temp =  tt.setKCB371(test, "64222660    ", "100", "60");
        if("ABCD".charAt(0)=='A')
        { System.out.println("teta");}

        System.out.println( String.format("%04d", word.length()-4));
        System.out.println( temp);
*/

        tt.readFileToSaveKCB("7964142723_20161026084920");

    }
}
