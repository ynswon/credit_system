package com.funda.controller;

import com.funda.kcb.*;
import com.funda.mybatis.model.*;
import com.funda.mybatis.service.*;
import com.funda.util.KCBAlgorithm;
import com.funda.util.SendSms;
import com.funda.util.URLShortener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

@Controller
@RequestMapping("/v1")
public class KCBController {

    //@Resource(name = "transactionManager")
    //protected DataSourceTransactionManager txManager;


    @Autowired
    CreditPolicyDAOService creditPolicyDAOService;

    @Autowired
    SuggestedPolicyDAOService suggestedPolicyDAOService;

    @Autowired
    ApplicationDAOService applicationDAOService;

    @Autowired
    ApplicationDataDAOService applicationDataDAOService;


    @Autowired
    ApplicationDataSeriesDAOService applicationDataSeriesDAOService;

    @Autowired
    DisQualifiedReasonDAOService disqualifedDAOService;


    private static final Logger logger = LoggerFactory.getLogger(KCBController.class);


    @RequestMapping(value = "/kcb_test", method = RequestMethod.GET)
    @ResponseBody
    public KCBPerson getUrl_test() throws IOException {

        KCBPerson person = new KCBPerson();
        KCBClient newText = new KCBClient();


        applicationWithBLOBs     record  = new applicationWithBLOBs();

        record.setStoreName("선호대출신청2");
        record.setAmount(100000);
        record.setPhone("01050540232");
        record.setUserNote("테스트");
        record.setStoreIdx(1);
        record.setDebtCode("심사대기");

        applicationDAOService.insertSelective(record);

/*        person.setName("백선호");
        person.setPhone("01074077535");
        person.setSex("1");
        person.setBirthdate("19870604");*/
        logger.info("getUrl: "+ person.getBirthdate() + ", " + person.getName());
        return person;
    }

	// this method responses to GET request http://localhost:8080/api/vi/person
	// return Person object as json
    @RequestMapping(value = "/kcb1", method = RequestMethod.POST)
    @ResponseBody
    public KCBPerson getUrl1(@ModelAttribute KCBPerson person) throws IOException {

       // KCBPerson person = new KCBPerson();
        KCBClient newText = new KCBClient();

        /*person.setName("나원준");
        person.setPhone("01050400258");
        person.setSex("1");
        person.setBirthdate("19880418");
*/
/*        person.setName("백선호");
        person.setPhone("01074077535");
        person.setSex("1");
        person.setBirthdate("19870604");*/

        logger.info("getUrl: "+ person.getBirthdate() + ", " + person.getName());
        return newText.getKCBClient360(person);
    }

    @RequestMapping(value = "/kcbv1", method = RequestMethod.POST)
    @ResponseBody
    public KCBPerson getUrlKcb(@ModelAttribute KCBPerson person) throws IOException {


        SendSms sms = new SendSms();

        KCBPerson newPerson = new KCBPerson();
        KCBClient newText = new KCBClient();

        newPerson = newText.getKCBClient360(person);

        if(newPerson.getRegisterkey()!=null && !newPerson.getRegisterkey().equals("")) {

            applicationWithBLOBs     record  = new applicationWithBLOBs();

            if( person.getStorename()==null || person.getStorename().equals("")) record.setStoreName("KCB홈페이지 신청");
            else record.setStoreName(person.getStorename());

            record.setAmount(person.getAmount());
            record.setPhone(newPerson.getPhone());
            if (newPerson.getPhone() == null || newPerson.getPhone().equals(""))
                record.setPhone("01050400258");

            record.setFundaMemo("홈페이지");
            record.setStoreIdx(1);
            record.setDebtCode("심사대기");
            record.setApplicantBirthdate(person.getBirthdate());
            record.setApplicant_name(person.getName());
            record.setUrl(person.getUrl());
            record.setRegisterkey(newPerson.getRegisterkey());

            applicationDAOService.insertSelective(record);

            newPerson.setIdx(record.getnextIdx());

            try {

//                sms.apiSendSms(newPerson.getPhone(),"14.32.55.87", URLShortener.getShortenUrl(newPerson.getUrl()));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        logger.info("getUrl: "+ person.getBirthdate() + ", " + person.getName());
        return newPerson;
    }

    @RequestMapping(value = "/kcb2/{registerKey}", method = RequestMethod.GET)
    @ResponseBody
    public KCBPerson getUrl2(@PathVariable String registerKey) throws IOException {

        KCBPerson person = new KCBPerson();
        KCBClient newText = new KCBClient();

        person.setName("나원준");
        person.setPhone("01050400258");
        person.setSex("1");
        person.setBirthdate("19880418");
        person.setRegisterkey(registerKey);
        logger.info("getUrl: "+ person.getBirthdate() + ", " + person.getRegisterkey());
        return newText.getKCBClient361(person);
    }
/*
    @RequestMapping(value = "/kcbsend", method = RequestMethod.POST)
    @ResponseBody
    public KCBPerson kcbsend(@ModelAttribute KCBPerson person) throws IOException {


        KCBClient newText = new KCBClient();


     //   person.setRegisterkey(person.getRegisterkey());

        System.out.println("register_key : " + person.getRegisterkey());
        System.out.println("before 361//phone : " + person.getPhone());

        KCBPerson getList =null;
        try {

            if(!person.getRegisterkey().equals("") && person.getRegisterkey()!=null) {
                // System.out.println("register_key : " + person.getRegisterkey());

                 getList = newText.getKCBClient361(person);

                 System.out.println("361//phone : " + person.getPhone());

                 if (!person.getReplacekey().equals("") && person.getReplacekey() != null && person.getReplacekey().length() <=11) {

                     System.out.println("371//phone : " + person.getPhone());

                    getList = newText.getKCBClient371(getList);


                    ArrayList<String[]> report       = getList.getReport();
                    ArrayList<KCB371> label          = getList.getLabel();
                    ArrayList<String[]> report_label = getList.getReport_label();


                     System.out.println("=======================================CPS가심사=======================================");
                     ArrayList<String[]> CPS = new ArrayList<String[]>();
                     int i, sum=0;
                     for(i=0; i<label.size()-2;i++)
                     {
                         sum+= label.get(i).getCount();
                         System.out.println(sum);
                     }

                     for(i=report.size()-100; i<report.size(); i++)
                     {
                         CPS.add(report.get(i));
                         System.out.println(report.get(i)[2]);
                     }

                     System.out.println("=======================================CPS가심사(끝)=======================================");

                     KCBAlgorithm algo      = new KCBAlgorithm(CPS);


                     ArrayList<String>     YesNo          = algo.getPreJudgeYN();
                     int     rainbow_credit               = algo.getCreditValue();
                     boolean isApproved  = true;

                     String judgeCode= "심사대기";
                     String reason = "";


                     if(YesNo.size()==0)  {  judgeCode="심사완료"; isApproved = true;}
                     else       {            judgeCode="심사탈락";  isApproved = false;
                     }


                     if(YesNo==0)       reason = "관보";
                     else if(YesNo==1)  reason = "신용";
                     else if(YesNo==2)  reason = "카드";
                     else if(YesNo==3)  reason = "연체";
                     else if(YesNo==4)  reason = "보증";
                     else if(YesNo==5)  reason = "대출";
                     else if(YesNo==6)  reason = "통과";

                     if(rainbow_credit >=7 )         {
                         judgeCode   = "심사탈락";
                         isApproved  = false;
                         reason    = "";
                     }


                     person.setRainbowscore(rainbow_credit);



                    applicationExample records       = new applicationExample();
                    applicationWithBLOBs record      = new applicationWithBLOBs();
                    application_data record1         = new application_data();
                    application_data_series record2  = new application_data_series();

                    record.setStoreName(person.getStorename());
                    if(person.getStorename()==null || person.getStorename().equals("") )
                    record.setStoreName("KCB홈페이지신청");

                    record.setAmount(person.getAmount());
                    record.setPhone(person.getPhone());
                    if(person.getPhone()==null || person.getPhone().equals("")  ) record.setPhone("01050400258");

                    record.setUserNote("KCB신용송부인증신청");
                    record.setStoreIdx(1);
                    record.setDebtCode(judgeCode);
                    record.setRegisterkey(person.getRegisterkey());
                    record.setReplacekey(person.getReplacekey());

                     if(person.getName()!=null && !person.getName().equals(""))
                    record.setApplicant_name(person.getName());
                    //record.setReplacekey(person.getReplacekey());
                    record.setRainbowscore(rainbow_credit);
                    record.setDescmemo(reason);


                    applicationDAOService.insertSelective(record);


                    //int idxst = applicationDAOService.maxByExample(records);
                    // int idxs=applicationDAOService.maxByExample(records);;
                    int idxs = record.getnextIdx();

                    logger.info("kcb index : " + idxs);

                     if(YesNo.size() > 0 )
                     {
                         disqualifiedReasons      rowin = new disqualifiedReasons();

                         for(i=0 ; i< YesNo.size(); i++) {
                             rowin.setRefIdx(idxs);
                             rowin.setCode(YesNo.get(i).toString());
                             disqualifedDAOService.insertSelective(rowin);
                         }
                     }

                    if (label != null) {
                        int  j, idx = 0, k;
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

                                logger.info("application_data");

                                for (j = 0; j < index.getCount(); j++) {
                                    String[] label_re = report_label.get(idx);
                                    String[] temp = report.get(idx++);
                                    int month = 12;

                                    for (k = 1; k < temp.length; k++) {
                                        record2.setRefIdx(idxs);
                                        record2.setSegIdx(temp[0]);
                                        record2.setSeriesIdx(String.valueOf(j + 1));
                                        record2.setValue(temp[k]);
                                        record2.setDate(new Date());
                                        record2.setSegName(label_re[0]);
                                        if (temp[0].equals("103"))
                                            record2.setSeriesName(label_re[1]);
                                        else
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
                            logger.info("application_data_series");

                        }

                        SendSms sms = new SendSms();
                        StringBuffer content = new StringBuffer("");

                        if(reason.equals("통과")) {

                            content.append("안녕하세요 FUNDA 입니다.                          \n");
                            content.append("심사 통과 되었습니다.                             \n");
                            content.append("추후 안내 전화 드리겠습니다 .                     \n");
                            content.append("관심 가져주셔서 감사드립니다.                     \n");
                            content.append("www.funda.kr                                      \n");
                        }
                        else
                        {
                            content.append("안녕하세요 FUNDA 입니다.                                                               \n");
                            content.append("심사 결과 ").append(reason).append("항목 때문에 진행이 어렵다는 내용을 전달 받았습니다. \n");
                            content.append("빠른 성장으로 조만간 더 넓은 지역, 다양한 업권으로 서비스를 확대하도록 하겠습니다. \n");
                            content.append("관심 가져주셔서 감사드립니다. \n");
                            content.append("www.funda.kr \n");
                        }


                  //      sms.apiSendSms(person.getPhone(),"14.32.55.87",  reason);
                   //     txManager.commit(txStatus);

                    }
                     ArrayList<KCBOptions> list = algo.getOptions(person.getAmount(), idxs);

                    getList.setApproved(isApproved);
                    getList.setRank(rainbow_credit);
                    getList.setOptions(list);
                    getList.setReasons(YesNo);
                    getList.setReport(null);
                    getList.setReport_label(null);
                    getList.setReportIdx(null);
                    getList.setLabel(null);
                 }


                return getList;
            }
        }catch(Exception e)
        {

            //txManager.rollback(txStatus);
            e.printStackTrace();
        }

        return getList;
    }
*/


    @RequestMapping(value = "/kcbsendlist", method = RequestMethod.POST)
    @ResponseBody
    public KCBPerson kcbsendlist(@ModelAttribute KCBPerson person) throws IOException {


        /*DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus txStatus= txManager.getTransaction(def);
*/
        //CBPerson person = new KCBPerson();
        KCBClient newText = new KCBClient();


        //   person.setRegisterkey(person.getRegisterkey());

        System.out.println("register_key : "      + person.getRegisterkey());
        System.out.println("before 361//phone : " + person.getPhone());
        System.out.println("replcae_key : "       + person.getReplacekey());


        KCBPerson getList = new KCBPerson();
        try {

            if(person.getRegisterkey()!=null && !person.getRegisterkey().equals("")) {

                System.out.println("replcae_key1 : " + person.getReplacekey());


               // if(person.getReplacekey()!=null && !person.getReplacekey().equals("")) {


                    System.out.println("replcae_key2 : " + person.getReplacekey());


                    applicationExample listyn = new applicationExample();

                    listyn.createCriteria().andRegisterkeyEqualTo(person.getRegisterkey()).andReplacekeyIsNotNull();
                    //listyn.createCriteria().andReplacekeyEqualTo(person.getReplacekey());
                    //listyn.createCriteria().andReplacekeyEqualTo(person.getReplacekey());
                    listyn.setOrderByClause(" datetime desc limit 1");

                    //else
                    //    listyn.createCriteria().andRegisterkeyEqualTo(person.getRegisterkey());

                    //listyn.createCriteria().andRegisterkeyEqualTo(person.getRegisterkey());

                    List<application> listYn     = applicationDAOService.selectByExample(listyn);


                    System.out.println("replcae_key4 : " + person.getReplacekey());

               if (listYn!=null && listYn.size() > 0 ) {

                        getList = new KCBPerson();

                        int i, seg = 2;
                        boolean isApproved = true;
                        //System.out.println("replcae_key46 : " + person.getReplacekey());

                        int IIndex = (listYn.get(0).getIindex() ==null ? 1 : listYn.get(0).getIindex());
                        int Mirae  = (listYn.get(0).getMiraeindex()==null ? 1 : listYn.get(0).getMiraeindex());
                        int period = Integer.parseInt(person.getPeriod()==null ? "12": person.getPeriod());
                        int idx    = listYn.get(0).getIdx();
                        int rainbow_credit =(listYn.get(0).getRainbowscore()==null ? 1 : listYn.get(0).getRainbowscore());
                        ArrayList<KCBOptions> optionsList = new ArrayList<>();

                        logger.info("mirae : "          +  String.valueOf(Mirae));
                        logger.info("period : "         + String.valueOf(idx));
                        logger.info("idx : "            +  String.valueOf(period));
                        logger.info("rainbow_credit : " + String.valueOf(rainbow_credit));

                        getList.setRank(rainbow_credit);
                        getList.setAmount(person.getAmount());
                        getList.setSales(person.getSales());
                        getList.setExpense(person.getExpense());
                        getList.setRegisterkey(person.getRegisterkey());
                        getList.setReplaceKey(person.getReplacekey());
                        getList.setResponseCode("0000");
                        getList.setIdx(idx);

                        //System.out.println("replcae_key5 : " + person.getReplacekey());

                        suggestedPolicy recordt = new suggestedPolicy();
                        suggestedPolicyExample suggest = new suggestedPolicyExample();
                        disqualifiedReasonsExample discontent = new disqualifiedReasonsExample();
                        discontent.createCriteria().andRefIdxEqualTo(listYn.get(0).getIdx());
                        List<disqualifiedReasons> disqualified_data = disqualifedDAOService.selectByExample(discontent);

                        ArrayList<String> reasons = new ArrayList<>();

                        for (i = 0; i < disqualified_data.size(); i++) {
                            reasons.add(disqualified_data.get(i).getCode());
                        }

                        ArrayList<KCBOptions> list = new ArrayList<>();

                        suggest.createCriteria().andRefIdxEqualTo(listYn.get(0).getIdx());



                        List<suggestedPolicy> suggest_list = suggestedPolicyDAOService.selectByExample(suggest);

                        if (suggest_list.size() > 0) seg = suggest_list.get(0).getSeq();
                        logger.info("suggestedPolicyDAOService : " + suggest_list.size() + " " + seg);

                        credit_policyExample credit = new credit_policyExample();
                        credit.createCriteria().andPeriodEqualTo(period).andIindexEqualTo(String.valueOf(IIndex)).andRepayFutureEqualTo(String.valueOf(Mirae)).andSegEqualTo(String.valueOf(seg));

                        logger.info("creditPolicyDAOService" +  period + " " + IIndex + " "  + Mirae  + " " + seg);
                        logger.info("creditPolicyDAOService : " + String.valueOf(rainbow_credit));

                        List<credit_policy> listPolicy = creditPolicyDAOService.selectByExample(credit);

                        System.out.println("replcae_key6 : " + person.getReplacekey());

                        double rate = 0.1;
                        double limit = 1;
                        String qualified = "y";
                        for (i = 0; i < listPolicy.size(); i++) {
                            if (listPolicy.get(i).getPolicy().equals("이자율")) {
                                rate = Double.parseDouble(listPolicy.get(i).getValue());
                                qualified = listPolicy.get(i).getQualifiedYn();
                            }
                            if (listPolicy.get(i).getPolicy().equals("한도")) {
                                limit = Double.parseDouble(listPolicy.get(i).getValue());
                            }
                        }

                        logger.info("list size" + list.size());
                        logger.info("qualified: Insert" + qualified);
                        logger.info("rate: Insert"      + rate);

                        getList.setLimit(limit);

                       if (qualified.equals("n")) {
                           isApproved = false;
                           period = 12;
                       }



                        double amount = person.getAmount();
                        double origin_amount = person.getAmount();

                        double debtAmount = amount * limit;
                        double monthlyRepay = debtAmount / period;
                        double debtrate = rate;

                       if (debtrate < 0.085) debtrate = 0.085;
                       if (debtrate > 0.150) debtrate = 0.150;

                   logger.info("Amount" +  person.getAmount() + " " +  person.getSales()  + " "  + person.getExpense()  + " " );
                    // 결합등급 여부
                    boolean hapYn = ((rainbow_credit < 7 && (seg==21 || seg==2)) || (seg==1 || seg==3));

                        if (person.getSales() != 0 && person.getExpense() != 0) {
                            amount = person.getSales() - person.getExpense();
                            debtAmount = amount * period * limit;
                            //monthlyRepay = debtAmount / period;
                            //monthlyRepay = debtAmount * Math.pow((1+debtrate), period) / ( Math.pow((1+debtrate), period) - 1);
                            //monthlyRepay = debtAmount * (debtrate/period) *Math.pow((1+debtrate), period) / ( Math.pow((1+debtrate), period) - 1);
                            monthlyRepay = debtAmount * (debtrate/period) *Math.pow((1+debtrate/period), period) / ( Math.pow((1+debtrate/period), period) - 1);
                        }

                        debtAmount = (long) ((debtAmount + 999999) / 1000000) * 1000000;

                        if (debtAmount >= origin_amount) {
                            debtAmount = origin_amount;
                            //monthlyRepay = debtAmount / period;
                            //monthlyRepay =     debtAmount * Math.pow((1+debtrate), period) / ( Math.pow((1+debtrate), period) - 1);
                            //monthlyRepay = debtAmount * (debtrate/period) *Math.pow((1+debtrate), period) / ( Math.pow((1+debtrate), period) - 1);
                            monthlyRepay = debtAmount * (debtrate/period) *Math.pow((1+debtrate/period), period) / ( Math.pow((1+debtrate/period), period) - 1);
                            isApproved = true;
                        }
                        else {
                            qualified ="n";
                            isApproved = false;
                        }


                        monthlyRepay = (long) ((monthlyRepay + 9) / 10) * 10;


                        System.out.println("총 대출액수 : " + debtAmount);
                        System.out.println("월 상환액수 : " + monthlyRepay);

                        System.out.println("대출이자율 : " + debtrate);


                        /*if (qualified.equals("y")) {
                            if (disqualified_data.size() == 0 && rainbow_credit == 7) {

                                debtAmount = 3000000;
                                monthlyRepay = 3000000 / period;
                                debtrate = 0.08;
                                //period = 3;
                            }

                        }*/

                        if (origin_amount <= 3000000 && disqualified_data.size() == 0 && hapYn) {
                            debtAmount = origin_amount;
                            debtrate = 0.08;
                         //   monthlyRepay = origin_amount * Math.pow((1+debtrate), period) / ( Math.pow((1+debtrate), period) - 1);
                            //monthlyRepay = debtAmount * (debtrate/period) *Math.pow((1+debtrate), period) / ( Math.pow((1+debtrate), period) - 1);
                            monthlyRepay = debtAmount * (debtrate/period) *Math.pow((1+debtrate/period), period) / ( Math.pow((1+debtrate/period), period) - 1);
                            isApproved = true;
                        }

                        if(debtAmount < 0 ) debtAmount=0;
                        if(monthlyRepay < 0 ) monthlyRepay = 0;

                        KCBOptions options = new KCBOptions();
                        options.setAmount(debtAmount);
                        options.setMonthlyRepay(monthlyRepay);
                        options.setPeriod(period);
                        options.setRate(debtrate);

                       if (disqualified_data.size() == 0 &&  isApproved) {
                           // judgeCode = "심사완료";
                           //isApproved = true;
                           optionsList.add(options);
                       } else    isApproved = false;


                   //optionsList.add(options);

                        recordt.setRefIdx(idx);
                        recordt.setAmount(debtAmount);
                        recordt.setMonthlyrepay(monthlyRepay);
                        recordt.setRate(debtrate);
                        recordt.setPeriod(period);
                        recordt.setSeq(seg);

                  /*     recordt.setApprovedYn(String.valueOf(isApproved));
                    //   recordt.setDebtcode(judgeCode);
                       recordt.setQualityYn(qualified);
                       recordt.setLimit(limit);

                       long time = System.currentTimeMillis();
                       SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                       String str = dayTime.format(new Date(time));

                       recordt.setDatetime(str);*/
                        suggestedPolicyDAOService.insertSelective(recordt);
                        /**
                         *
                         */

                        logger.info("suggestedPolicyDAOService: Insert");
                        //person.setAmount(debtAmount);

                        getList.setApproved(isApproved);
                        getList.setRank(rainbow_credit);
                        getList.setOptions(optionsList);
                        getList.setReasons(reasons);

                        boolean ExceededMaximumCreditLine = false;
                        boolean HasTooLowScore            = false;

                        if(qualified.equals("n")) ExceededMaximumCreditLine = true;
                        else                      ExceededMaximumCreditLine = false;

                        if(rainbow_credit==7)   HasTooLowScore = true;
                        else                    HasTooLowScore = false;

                        getList.setHasTooLowLimit(ExceededMaximumCreditLine);
                        getList.setHasTooLowScore(HasTooLowScore);

                       getList.setiIndex(IIndex);
                       getList.setFrci(Mirae);

                        logger.info("return getList");

                        return getList;
                }
                else
                {


                    getList = newText.getKCBClient361(person);

                    if(getList==null) getList= new KCBPerson();

                    System.out.println("361//phone : " + person.getRegisterkey());

                    if (!person.getReplacekey().equals("") && person.getReplacekey() != null && person.getReplacekey().length() <=11) {


                        System.out.println("371//phone : " + person.getRegisterkey());

                        getList = newText.getKCBClient371(getList);

                        if(getList==null) getList= new KCBPerson();

                        ArrayList<String[]> report = getList.getReport();
                        ArrayList<KCB371> label = getList.getLabel();
                        ArrayList<String[]> report_label = getList.getReport_label();

                        /**
                         *  KCB 가심사 알고리즘 적용 10-11
                         */

                        System.out.println("=======================================CPS가심사=======================================");
                        ArrayList<String[]> CPS = new ArrayList<String[]>();
                        int i, sum = 0;

                        ArrayList<String[]> dummy = new ArrayList<String[]>();

                        for (i = report.size() - getList.getCPScount(); i < report.size(); i++) {
                            if (report.get(i)[2].trim().equals("C") || report.get(i)[2].trim().equals("E")) {
                                String[] tmp = new String[3];
                                tmp[2] = "123456789";
                                dummy.add(tmp);
                                CPS.add(dummy.get(0));
                            } else CPS.add(report.get(i));
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
                        boolean isApproved = true;

                        String judgeCode = "심사대기";
                        String reason = "";


                        if (YesNo.size() == 0) {
                            judgeCode = "심사완료";
                            isApproved = true;
                        } else {
                            judgeCode = "심사탈락";
                            isApproved = false;
                        }




                        person.setRainbowscore(rainbow_credit);

                        /**
                         * 가심사 끝
                         */

                        if (getList.getResponseCode().equals("0000")) {

                            System.out.println("PrevIndex : " + person.getRegisterkey()+ "=");

                            applicationExample getNextId = new applicationExample();
                            getNextId.createCriteria().andRegisterkeyEqualTo(person.getRegisterkey().trim());

                            List<application> nextIndex = applicationDAOService.selectByExample(getNextId);

                            System.out.println("NextIndex : " + person.getRegisterkey() + "=");
                            System.out.println("Size      : " + nextIndex.size()  + "=");


                        //    if( nextIndex.size() > 0 ) {

                                int idxs = nextIndex.get(0).getIdx();


                                //int idxs = person.getIdx();

                                String IINDEX = CPS.get(28)[2].trim();
                                String MiraeSnag = CPS.get(43)[2].trim();

                                int period = 12;
                                int IINDEXs = Integer.parseInt(IINDEX);
                                int mirae = Integer.parseInt(MiraeSnag);

                                applicationExample records = new applicationExample();
                                applicationWithBLOBs record = new applicationWithBLOBs();
                                application_data record1 = new application_data();
                                application_data_series record2 = new application_data_series();

                                int seg = algo.getSeg();

                                if (rainbow_credit >= 1 && rainbow_credit <= 4 && seg == 2) seg = 21;

                                boolean hapYn = ((rainbow_credit < 7 && (seg == 21 || seg == 2)) || (seg == 1 || seg == 3));
                            /*if ((seg==2 || seg==21) && rainbow_credit >= 7) {
                                judgeCode = "심사탈락";
                                isApproved = false;
                                reason = "";
                            }*/
                                //  record.setStoreName("어드민화면신청");
                                //   record.setAmount(100000);
                                //record.setPhone(phone);
                                //if(person.getPhone()==null || person.getPhone().equals("")  ) record.setPhone("01050400258");

                                records.createCriteria().andIdxEqualTo(idxs);
                                //records.createCriteria().andRegisterkeyEqualTo(person.getRegisterkey().trim());
                                //record.setUserNote("테스트");
                                //record.setStoreIdx(1);
                                record.setDebtCode(judgeCode);
                                record.setMiraeindex(mirae);
                                record.setIindex(IINDEXs);

                                //record.setRegisterkey(person.getRegisterkey());
                                record.setReplacekey(person.getReplacekey());
                                record.setRainbowscore(rainbow_credit);
                                record.setDescmemo(reason);


                                applicationDAOService.updateByExampleSelective(record, records);

                                //int idxst = applicationDAOService.maxByExample(records);
                                // int idxs=applicationDAOService.maxByExample(records);;
                                //int idxs = record.getnextIdx();


                                logger.info("kcb index : " + idxs);

                                /**
                                 *  탈락 이유 추가
                                 */
                                if (YesNo.size() > 0) {
                                    disqualifiedReasons rowin = new disqualifiedReasons();

                                    for (i = 0; i < YesNo.size(); i++) {
                                        rowin.setRefIdx(idxs);
                                        rowin.setCode(YesNo.get(i).toString());
                                        disqualifedDAOService.insertSelective(rowin);
                                    }
                                }

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

                                            logger.info("application_data");

                                            for (j = 0; j < index.getCount(); j++) {
                                                String[] label_re = report_label.get(idx);
                                                String[] temp = report.get(idx++);
                                                int month = 12;

                                                for (k = 1; k < temp.length; k++) {
                                                    record2.setRefIdx(idxs);
                                                    record2.setSegIdx(temp[0]);
                                                    record2.setSeriesIdx(String.valueOf(j + 1));
                                                    record2.setValue(temp[k]);
                                                    record2.setDate(new Date());
                                                    record2.setSegName(label_re[0]);
                                                    if (temp[0].equals("103"))
                                                        record2.setSeriesName(label_re[1]);
                                                    else
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
                                        logger.info("application_data_series");

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


                                    //      sms.apiSendSms(person.getPhone(),"14.32.55.87",  reason);
                                    //     txManager.commit(txStatus);


                                }

                                ArrayList<KCBOptions> optionsList = algo.getOptions(person.getAmount(), idxs);


                                /**
                                 *  option
                                 */


                                if (person.getPeriod() != null && !person.getPeriod().equals(""))
                                    period = Integer.parseInt(person.getPeriod());


                                credit_policyExample credit = new credit_policyExample();
                                credit.createCriteria().andPeriodEqualTo(period).andIindexEqualTo(String.valueOf(IINDEXs)).andRepayFutureEqualTo(String.valueOf(mirae)).andSegEqualTo(String.valueOf(seg));

                                List<credit_policy> list = creditPolicyDAOService.selectByExample(credit);
                                suggestedPolicy recordt = new suggestedPolicy();

                                double rate = 0.1;
                                double limit = 1;
                                String qualified = "y";
                                for (i = 0; i < list.size(); i++) {
                                    if (list.get(i).getPolicy().equals("이자율")) {
                                        rate = Double.parseDouble(list.get(i).getValue());
                                        qualified = list.get(i).getQualifiedYn();
                                    }
                                    if (list.get(i).getPolicy().equals("한도")) {
                                        limit = Double.parseDouble(list.get(i).getValue());
                                    }
                                }

                                person.setLimit(limit);

                               if(qualified.equals("n")) {
                                    isApproved = false;
                                    period = 12;
                                }


                                double amount = person.getAmount();
                                double origin_amount = person.getAmount();

                                double debtAmount = amount * limit;
                                double monthlyRepay = debtAmount / period;
                                double debtrate = rate;

                                if (debtrate < 0.085) debtrate = 0.085;
                                if (debtrate > 0.150) debtrate = 0.150;


                                if (person.getSales() != 0 && person.getExpense() != 0) {
                                    amount = person.getSales() - person.getExpense();
                                    debtAmount = amount * period * limit;
                                    //monthlyRepay = debtAmount/period;
                                    //monthlyRepay = debtAmount * Math.pow((1+debtrate), period) / ( Math.pow((1+debtrate), period) - 1);
                                    monthlyRepay = debtAmount * (debtrate / period) * Math.pow((1 + debtrate / period), period) / (Math.pow((1 + debtrate / period), period) - 1);
                                }

                                debtAmount = (long) ((debtAmount + 999999) / 1000000) * 1000000;

                                if (debtAmount >= origin_amount && judgeCode.equals("심사완료")) {
                                    debtAmount = origin_amount;
                                    // monthlyRepay = debtAmount/period;
                                    //  monthlyRepay = debtAmount * (debtrate/period) *Math.pow((1+debtrate), period) / ( Math.pow((1+debtrate), period) - 1);
                                    monthlyRepay = debtAmount * (debtrate / period) * Math.pow((1 + debtrate / period), period) / (Math.pow((1 + debtrate / period), period) - 1);
                                    isApproved = true;
                                } else {
                                    qualified = "n";
                                    isApproved = false;
                                }

                                //debtAmount   = (int)((debtAmount   + 99 ) / 100) * 100;

                                monthlyRepay = (long) ((monthlyRepay + 9) / 10) * 10;


                                System.out.println("총 대출액수 : " + debtAmount);
                                System.out.println("월 상환액수 : " + monthlyRepay);

                                System.out.println("대출이자율 : " + debtrate);
                                System.out.println("기간          : " + period);


                            /*
                            if(qualified.equals("y")) {
                                if (YesNo.size() == 0 && rainbow_credit == 7) {

                                    debtAmount = 3000000;
                                    monthlyRepay = 3000000 / period;
                                    debtrate = 0.08;
                                    //period = 3;
                                }

                            }*/

                                if (origin_amount <= 3000000 && judgeCode.equals("심사완료") && hapYn) {
                                    debtAmount = origin_amount;
                                    //monthlyRepay = origin_amount / period;
                                    debtrate = 0.08;
                                    //monthlyRepay = debtAmount * (debtrate/period) *Math.pow((1+debtrate/period), period) / ( Math.pow((1+debtrate/period), period) - 1);
                                    monthlyRepay = debtAmount * (debtrate / period) * Math.pow((1 + debtrate / period), period) / (Math.pow((1 + debtrate / period), period) - 1);

                                    isApproved = true;
                                }
                                /**
                                 *
                                 */

                                if (debtAmount < 0) debtAmount = 0;
                                if (monthlyRepay < 0) monthlyRepay = 0;


                                KCBOptions options = new KCBOptions();
                                options.setAmount(debtAmount);
                                options.setMonthlyRepay(monthlyRepay);
                                options.setPeriod(period);
                                options.setRate(debtrate);

                                //optionsList.add(options);

                                if (judgeCode.equals("심사완료")) {
                                    // judgeCode = "심사완료";
                                    //isApproved = true;
                                    optionsList.add(options);
                                    //isApproved = true;
                                } else isApproved = false;


                                recordt.setRefIdx(idxs);
                                recordt.setAmount(debtAmount);
                                recordt.setMonthlyrepay(monthlyRepay);
                                recordt.setRate(debtrate);
                                recordt.setPeriod(period);
                                recordt.setSeq(seg);

                       /*     recordt.setApprovedYn(String.valueOf(isApproved));
                            recordt.setDebtcode(judgeCode);
                            recordt.setQualityYn(qualified);
                            recordt.setLimit(limit);

                            long time = System.currentTimeMillis();
                            SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                            String str = dayTime.format(new Date(time));

                            recordt.setDatetime(str);
*/
                                suggestedPolicyDAOService.insertSelective(recordt);


                                boolean ExceededMaximumCreditLine = false;
                                boolean HasTooLowScore = false;

                                if (qualified.equals("n")) ExceededMaximumCreditLine = true;
                                else ExceededMaximumCreditLine = false;

                                if (rainbow_credit == 7) HasTooLowScore = true;
                                else HasTooLowScore = false;

                                getList.setiIndex(IINDEXs);
                                getList.setFrci(mirae);
                                getList.setHasTooLowLimit(ExceededMaximumCreditLine);
                                getList.setHasTooLowScore(HasTooLowScore);
                                getList.setApproved(isApproved);
                                getList.setRank(rainbow_credit);
                                getList.setOptions(optionsList);
                                getList.setReasons(YesNo);
                            }
                   //   }
                    }
                    getList.setReport(null);
                    getList.setReport_label(null);
                    getList.setReportIdx(null);
                    getList.setLabel(null);
                }


                return getList;
            }
        }catch(Exception e)
        {
            e.printStackTrace();

            if(getList==null) getList = new KCBPerson();
            getList.setReport(null);
            getList.setReport_label(null);
            getList.setReportIdx(null);
            getList.setLabel(null);
            getList.setResponseCode("000X");
            //txManager.rollback(txStatus);

        }

        return getList;
    }


    @RequestMapping(value = "/kcbdata/{ref_idx}/segid/{seg_idx}", method = RequestMethod.GET)
    @ResponseBody
    public List<application_data_series> getSeriesData(@PathVariable int ref_idx, @PathVariable String seg_idx) {

        application_data_seriesExample content = new application_data_seriesExample();
        content.createCriteria().andRefIdxEqualTo(ref_idx).andSegIdxEqualTo(seg_idx);
        List<application_data_series> application_data_serieses =  applicationDataSeriesDAOService.selectByExample(content);

//        logger.info("getUrl: "+ person.getBirthdate() + ", " + person.getName());

        return application_data_serieses;
    }


    @RequestMapping(value = "/kcbdata/{ref_idx}/segid/{seg_idx}/detail_idx/{detail_idx}", method = RequestMethod.GET)
    @ResponseBody
    public List<application_data_series> getSeriesDataSecond(@PathVariable int ref_idx, @PathVariable String seg_idx, @PathVariable String detail_idx) {

        application_data_seriesExample content = new application_data_seriesExample();
        content.createCriteria().andRefIdxEqualTo(ref_idx).andSegIdxEqualTo(seg_idx).andDetailIdxEqualTo(detail_idx);
        content.setOrderByClause("series_name desc");
        List<application_data_series> application_data_serieses =  applicationDataSeriesDAOService.selectByExample(content);

//        logger.info("getUrl: "+ person.getBirthdate() + ", " + person.getName());

        return application_data_serieses;
    }



}
