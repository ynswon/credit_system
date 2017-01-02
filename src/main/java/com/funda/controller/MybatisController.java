package com.funda.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.funda.kcb.KCB371;
import com.funda.kcb.KCBClient;
import com.funda.kcb.KCBPerson;
import com.funda.mybatis.model.*;
import com.funda.mybatis.service.*;
import com.funda.util.FileUpload;
import com.funda.util.KCBAlgorithm;
import com.funda.util.SendSms;
import com.funda.util.URLShortener;
import com.funda.util.pdfviewer.Book;
import org.omg.CORBA.INV_IDENT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MybatisController {

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



    private static final Logger logger = LoggerFactory.getLogger(MybatisController.class);

    @RequestMapping(value = "/excel", method = RequestMethod.GET)
    public String viewHome() {
        return "excel";
    }

    @RequestMapping(value = "/downloadPDF", method = RequestMethod.GET)
    public ModelAndView downloadExcel(HttpServletRequest request) {
        // create some sample data
        int search		= Integer.parseInt(request.getParameter("search")==null ? "103" : request.getParameter("search"));

        applicationExample        record = new applicationExample();

        application_dataExample        record1 = new application_dataExample();
        application_data_seriesExample record2 = new application_data_seriesExample();

        record.createCriteria().andIdxEqualTo(search);
        record1.createCriteria().andRefIdxEqualTo(search);
        record1.setDistinct(true);
        record2.createCriteria().andRefIdxEqualTo(search);
        record2.setDistinct(true);

        List<application>        List       =  applicationDAOService.selectByExample(record);
        List<application_data>        dataList   =  applicationDataDAOService.selectByExample(record1);
        List<application_data_series> seriesList =  applicationDataSeriesDAOService.selectByExample(record2);
        List<application_data_series> seriesListCount =  applicationDataSeriesDAOService.selectByCount(search);

        // return a view which will be resolved by an excel view resolver
        return new ModelAndView("pdfView", "dataList", dataList).addObject("seriesList", seriesList).addObject("seriesListCount", seriesListCount).addObject("appList", List);
    }


    @RequestMapping(value = "/viewPDF", method = RequestMethod.GET)
    public ModelAndView viewExcel(HttpServletRequest request) {
        // create some sample data
        String search		= request.getParameter("search");

        applicationExample        record = new applicationExample();

        application_dataExample        record1 = new application_dataExample();
        application_data_seriesExample record2 = new application_data_seriesExample();

        record.createCriteria().andRegisterkeyEqualTo(search);
        List<application>        List       =  applicationDAOService.selectByExample(record);

        int index = 0;
        if(List.size() > 0) index = List.get(0).getIdx();

        record1.createCriteria().andRefIdxEqualTo(index);
        record1.setDistinct(true);
        record2.createCriteria().andRefIdxEqualTo(index);
        record2.setDistinct(true);


        List<application_data>        dataList   =  applicationDataDAOService.selectByExample(record1);
        List<application_data_series> seriesList =  applicationDataSeriesDAOService.selectByExample(record2);
        List<application_data_series> seriesListCount =  applicationDataSeriesDAOService.selectByCount(index);

        // return a view which will be resolved by an excel view resolver
        return new ModelAndView("pdfView", "dataList", dataList).addObject("seriesList", seriesList).addObject("seriesListCount", seriesListCount).addObject("appList", List);
    }

    @RequestMapping("/tables-basic-tab")
    public ModelAndView table_basic_tab(HttpServletRequest request) {
        //logger.info("Welcome main.", locale);

        ModelAndView result = new ModelAndView();

        String index = request.getParameter("search")==null ? "102" : request.getParameter("search");
        int search = 102;
        if(index.length() >= 9)
        {
            applicationExample content_con = new applicationExample();
            content_con.createCriteria().andRegisterkeyEqualTo(index);
            List<application> application_list =  applicationDAOService.selectByExample(content_con);
            search = application_list.get(0).getIdx();
            // request.setAttribute("search", search);
        }
        else
            search =   Integer.parseInt(request.getParameter("search")==null ? "102" : request.getParameter("search"));

        //int search		= Integer.parseInt(request.getParameter("search")==null ? "102" : request.getParameter("search"));
        //List<Member> memberList = memberDAOService.getMembers();

        application_data_seriesExample content = new application_data_seriesExample();
        content.createCriteria().andRefIdxEqualTo(search).andSegIdxEqualTo("018").andDetailIdxEqualTo("1");
        content.setOrderByClause("detail_idx desc ");
        List<application_data_series> application_data_serieses =  applicationDataSeriesDAOService.selectByExample(content);

        application_data_seriesExample content1 = new application_data_seriesExample();
        content1.createCriteria().andRefIdxEqualTo(search).andSegIdxEqualTo("020").andDetailIdxEqualTo("1");
        content1.setOrderByClause("detail_idx desc ");
        List<application_data_series> application_data_serieses1 =  applicationDataSeriesDAOService.selectByExample(content1);

        application_data_seriesExample content2 = new application_data_seriesExample();
        content2.createCriteria().andRefIdxEqualTo(search).andSegIdxEqualTo("023").andDetailIdxEqualTo("1");
        content2.setOrderByClause("detail_idx desc ");
        List<application_data_series> application_data_serieses2 =  applicationDataSeriesDAOService.selectByExample(content2);

        application_data_seriesExample content3 = new application_data_seriesExample();
        content3.createCriteria().andRefIdxEqualTo(search).andSegIdxEqualTo("024").andDetailIdxEqualTo("1");
        content3.setOrderByClause("detail_idx desc ");
        List<application_data_series> application_data_serieses3 =  applicationDataSeriesDAOService.selectByExample(content3);

        application_data_seriesExample content4 = new application_data_seriesExample();
        content4.createCriteria().andRefIdxEqualTo(search).andSegIdxEqualTo("036").andDetailIdxEqualTo("1");
        content4.setOrderByClause("detail_idx desc ");
        List<application_data_series> application_data_serieses4 =  applicationDataSeriesDAOService.selectByExample(content4);


        application_data_seriesExample content5 = new application_data_seriesExample();
        content5.createCriteria().andRefIdxEqualTo(search).andSegIdxEqualTo("017").andDetailIdxEqualTo("1");
        content5.setOrderByClause("detail_idx desc ");
        List<application_data_series> application_data_serieses5 =  applicationDataSeriesDAOService.selectByExample(content5);


        result.addObject("result_017",   application_data_serieses5);
        result.addObject("result_018",   application_data_serieses);
        result.addObject("result_020",   application_data_serieses1);
        result.addObject("result_023",   application_data_serieses2);
        result.addObject("result_024",   application_data_serieses3);
        result.addObject("result_036",   application_data_serieses4);

        result.setViewName("tables-basic-tab");
        return result;
    }


    @RequestMapping("/table_basic")
    public ModelAndView table(HttpServletRequest request) {
        //logger.info("Welcome main.", locale);

        ModelAndView result = new ModelAndView();

        int search		= Integer.parseInt(request.getParameter("search")==null ? "102" : request.getParameter("search"));
        //List<Member> memberList = memberDAOService.getMembers();

        application_data_seriesExample content = new application_data_seriesExample();
        content.createCriteria().andRefIdxEqualTo(search).andSegIdxEqualTo("018").andDetailIdxEqualTo("1");
        content.setOrderByClause("detail_idx desc ");
        List<application_data_series> application_data_serieses =  applicationDataSeriesDAOService.selectByExample(content);

        application_data_seriesExample content1 = new application_data_seriesExample();
        content1.createCriteria().andRefIdxEqualTo(search).andSegIdxEqualTo("020").andDetailIdxEqualTo("1");
        content1.setOrderByClause("detail_idx desc ");
        List<application_data_series> application_data_serieses1 =  applicationDataSeriesDAOService.selectByExample(content1);

        application_data_seriesExample content2 = new application_data_seriesExample();
        content2.createCriteria().andRefIdxEqualTo(search).andSegIdxEqualTo("023").andDetailIdxEqualTo("1");
        content2.setOrderByClause("detail_idx desc ");
        List<application_data_series> application_data_serieses2 =  applicationDataSeriesDAOService.selectByExample(content2);

        application_data_seriesExample content3 = new application_data_seriesExample();
        content3.createCriteria().andRefIdxEqualTo(search).andSegIdxEqualTo("024").andDetailIdxEqualTo("1");
        content3.setOrderByClause("detail_idx desc ");
        List<application_data_series> application_data_serieses3 =  applicationDataSeriesDAOService.selectByExample(content3);

        application_data_seriesExample content4 = new application_data_seriesExample();
        content4.createCriteria().andRefIdxEqualTo(search).andSegIdxEqualTo("036").andDetailIdxEqualTo("1");
        content4.setOrderByClause("detail_idx desc ");
        List<application_data_series> application_data_serieses4 =  applicationDataSeriesDAOService.selectByExample(content4);

        result.addObject("result_018",   application_data_serieses);
        result.addObject("result_020",   application_data_serieses1);
        result.addObject("result_023",   application_data_serieses2);
        result.addObject("result_024",   application_data_serieses3);
        result.addObject("result_036",   application_data_serieses4);

        result.setViewName("tables-basic");
        return result;
    }

    @RequestMapping(value = "/fileupload", method = RequestMethod.POST)
    public ModelAndView process(HttpSession session, ItemBean itemBean,
                                @RequestParam("file")MultipartFile file, @RequestParam(value="debtCode") String debtCode) throws IOException {

        ModelAndView result = new ModelAndView();
        FileUpload files =new FileUpload();
        files.writeFile(file, "/home/funda/sales", file.getName());
        //result.setViewName("forward:/tables-editable");
        result.setViewName("forward:/tables-editable?debt_code="+debtCode);
        return result;
    }


    @RequestMapping(value = "/updateDebtList", method = RequestMethod.POST)
    public ModelAndView updateDebtList(@RequestParam(value="chkList") String[] chkList ,@RequestParam(value="phone") String[] phone, @RequestParam(value="memo") String[] descmemo, @RequestParam(value="debtCodeSel") String debtCode) throws Exception {

        ModelAndView result = new ModelAndView();
        SendSms sms = new SendSms();
        int i;
        for(i=0; i<chkList.length;i++){

          applicationExample content = new applicationExample();
          applicationWithBLOBs item = new applicationWithBLOBs();
          item.setDebtCode(debtCode);
          item.setDescmemo(descmemo[i]);
          item.setPhone(phone[i]);
          sms.apiSendSms(phone[i],"14.32.55.87", debtCode);
          //item.setIdx(Integer.parseInt(chkList[i]));
          logger.debug(chkList[i] + " - " + debtCode + "-" + descmemo[i]+ "-" + phone[i]);
          content.createCriteria().andIdxEqualTo(Integer.parseInt(chkList[i]));
          applicationDAOService.updateByExampleSelective(item , content);
       }
        result.setViewName("forward:/tables-editable?debt_code="+debtCode);

        return result;
    }

    @RequestMapping("/tables-editable")
    public ModelAndView tables_editable(HttpServletRequest request) {

        ModelAndView result = new ModelAndView();

        int search	  = Integer.parseInt(request.getParameter("search")==null ? "102" : request.getParameter("search"));
        String debt_code = request.getParameter("debt_code");
        String phone = request.getParameter("phone");

        applicationExample content1 = new applicationExample();
        if(debt_code!=null)
        content1.createCriteria().andDebtcodeEqualTo(debt_code);

       // String menu_debt = request.getParameter("menu_debt1");

        applicationExample content = new applicationExample();

        if(debt_code!=null)
        content.createCriteria().andDebtcodeEqualTo(debt_code);
        if(phone!=null)
        content.createCriteria().andPhoneLike(phone);

        content.setOrderByClause("datetime desc limit 40");


        int debt_count1 =  applicationDAOService.countByExample(content1);
        List<application> application_data_serieses =  applicationDAOService.selectByExample(content);
        List<application> application_group         =  applicationDAOService.selectByGroup(content1);


        result.addObject("application_result", application_data_serieses);
        result.addObject("application_group"   , application_group);
        result.addObject("menu_debt"         , debt_count1);
        result.addObject("debt_code"         , debt_code);


        result.setViewName("tables-editable");
        return result;
    }

    @RequestMapping("/tables-datatable")
    public ModelAndView data_table(Locale locale, Model model) {
        logger.info("Welcome main.", locale);

        // view ȭ���� main.jsp�� DB�κ��� �о�� �����͸� �����ش�.
        ModelAndView result = new ModelAndView();
        //addObject view�� �Ѿ�� ������
        //  List<Member> memberList = memberDAOService.getMembers();
        // result.addObject("result", memberList);
        result.setViewName("tables-datatable");
        return result;
    }

    @RequestMapping("/chart-morris-tab")
    public ModelAndView chart_morris_tab(Locale locale, Model model) {
        logger.info("Welcome main.", locale);

        // view ȭ���� main.jsp�� DB�κ��� �о�� �����͸� �����ش�.
        ModelAndView result = new ModelAndView();
        //addObject view�� �Ѿ�� ������
        //  List<Member> memberList = memberDAOService.getMembers();
        // result.addObject("result", memberList);
        result.setViewName("chart-morris-tab");
        return result;
    }

    @RequestMapping("/file-manager")
    public ModelAndView file_manager(Locale locale, Model model) {
        logger.info("Welcome main.", locale);

        // view ȭ���� main.jsp�� DB�κ��� �о�� �����͸� �����ش�.
        ModelAndView result = new ModelAndView();
        //addObject view�� �Ѿ�� ������
        //  List<Member> memberList = memberDAOService.getMembers();
        // result.addObject("result", memberList);
        result.setViewName("file-manager");
        return result;
    }

    @RequestMapping("/menu")
    public ModelAndView menu(Locale locale, Model model) {
        logger.info("Welcome main.", locale);

        ModelAndView result = new ModelAndView();

        applicationExample content1 = new applicationExample();
        content1.createCriteria().andDebtcodeEqualTo("심사대기");
        applicationExample content2 = new applicationExample();
        content2.createCriteria().andDebtcodeEqualTo("심사진행");
        applicationExample content3 = new applicationExample();
        content3.createCriteria().andDebtcodeEqualTo("심사완료");
        applicationExample content4 = new applicationExample();
        content4.createCriteria().andDebtcodeEqualTo("심사탈락");


        int debt_count1 =  applicationDAOService.countByExample(content1);
        int debt_count2 =  applicationDAOService.countByExample(content2);
        int debt_count3 =  applicationDAOService.countByExample(content3);
        int debt_count4 =  applicationDAOService.countByExample(content4);

        result.addObject("menu_debt1"  , debt_count1);
        result.addObject("menu_debt2"  , debt_count2);
        result.addObject("menu_debt3"  , debt_count3);
        result.addObject("menu_debt4"  , debt_count4);

        result.setViewName("menu");
        return result;
    }

    @RequestMapping("/test-page")
    public ModelAndView test_page(Locale locale, Model model) {
        logger.info("Welcome main.", locale);

        // view ȭ���� main.jsp�� DB�κ��� �о�� �����͸� �����ش�.
        ModelAndView result = new ModelAndView();
        //addObject view�� �Ѿ�� ������
        //  List<Member> memberList = memberDAOService.getMembers();
        // result.addObject("result", memberList);
        result.setViewName("test-page");
        return result;
    }

    @RequestMapping(value = "/kcbsend")
    public ModelAndView kcbsend(HttpServletRequest request)  throws  IOException{

       ModelAndView result = new ModelAndView();

        String registerkey = request.getParameter("registerkey");
        logger.info("reigserkey" + registerkey);

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus txStatus= txManager.getTransaction(def);

        KCBPerson person = new KCBPerson();
        KCBPerson getList = new KCBPerson();
        KCBClient newText = new KCBClient();

        String phone = request.getParameter("phone");
        person.setRegisterkey(registerkey);
        person.setPhone(phone);

        try {


            KCBPerson newperson = newText.getKCBClient361(person);
            logger.info("replace_key " + newperson.getReplacekey());
            newperson.setReplaceKey(newperson.getReplacekey().trim());

            //newText.getKCBClient371withNIO(newperson);

            getList = newText.getKCBClient371(newperson);


            ArrayList<String[]>      report      = getList.getReport();
            ArrayList<KCB371>         label      = getList.getLabel();
            ArrayList<String[]>     report_label = getList.getReport_label();

            /**
             *  KCB 가심사 알고리즘 적용 10-11
             */


            System.out.println("=======================================CPS가심사=======================================");
            ArrayList<String[]> CPS = new ArrayList<String[]>();
            int i, sum=0;
            for(i=0; i<label.size()-2;i++) {
                sum += label.get(i).getCount();
                System.out.println(sum);
            }

            ArrayList<String[]> dummy =  new ArrayList<String[]>();

            for(i=report.size()-100; i<report.size(); i++)
            {
                if(report.get(i)[2].equals("C") || report.get(i)[2].equals("E"))
                {
                    String[] tmp = new String[1];
                    tmp[0] = "123456789";
                    dummy.add(tmp);
                    CPS.add(dummy.get(0));
                }
                else CPS.add(report.get(i));
                System.out.println(report.get(i)[2]);
            }

            System.out.println("=======================================CPS가심사(끝)=======================================");


            KCBAlgorithm algo      = new KCBAlgorithm(CPS);

            /**
             *   0 : 관보
             *   1 : 신용
             *   2 : 카드
             *   3 : 연체
             *   4 : 보증
             *   5 : 대출
             *   6 : 통과
             */
            ArrayList<String>     YesNo          = algo.getPreJudgeYN();
            int     rainbow_credit = algo.getCreditValue();

            String judgeCode = "심사대기";

            if(YesNo.size()==0)  {  judgeCode="심사완료"; }
            else       {            judgeCode="심사탈락"; }


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

            if(rainbow_credit >=7 )         {
                judgeCode = "심사탈락";
                reason    = "";
            }

            person.setRainbowscore(rainbow_credit);

            /**
             * 가심사 끝
             */


            applicationExample       records = new applicationExample();
            applicationWithBLOBs     record  = new applicationWithBLOBs();
            application_data         record1 = new application_data();
            application_data_series  record2 = new application_data_series();

            record.setStoreName("어드민화면신청");
            record.setAmount(100000);
            record.setPhone(phone);
            if(person.getPhone()==null || person.getPhone().equals("")  ) record.setPhone("01050400258");

            record.setFundaMemo("어드민");
            record.setStoreIdx(1);
            record.setDebtCode(judgeCode);

            record.setRegisterkey(person.getRegisterkey());
            record.setReplacekey(person.getReplacekey());
            record.setRainbowscore(rainbow_credit);
            record.setDescmemo(reason);

            applicationDAOService.insertSelective(record);


            int idxs = record.getnextIdx();
            logger.info("kcb index : " + idxs);

            if(label != null ) {
                int  j, idx = 0, k;
                for (i = 0; i < label.size(); i++) {
                    KCB371 index = label.get(i);

                    if(!index.getSeg().isEmpty())
                    {
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
                            int month =12;

                        //    System.out.println(idx + "LABEL : " +label_re[1]);

                            for (k = 1; k < temp.length; k++) {
                                record2.setRefIdx(idxs);
                                record2.setSegIdx(temp[0]);
                                record2.setSeriesIdx(String.valueOf(j + 1));
                                record2.setValue(temp[k]);
                                record2.setDate(new Date());
                                record2.setSegName(label_re[0]);
                                record2.setSeriesName(label_re[k]);


                                if(temp[0].equals("025") || temp[0].equals("028") || temp[0].equals("019"))
                                {
                                    record2.setDetailIdx(String.valueOf((int)(k-1)/12+1));
                                    record2.setSeriesDetailIdx(String.valueOf(month--));
                                    if(month<=0) month=12;
                                }
                                else{
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
               // sms.apiSendSms(person.getPhone(),"14.32.55.87",  reason);

                txManager.commit(txStatus);

            }

//             return getList;
        }catch(Exception e)
        {
            txManager.rollback(txStatus);
            e.printStackTrace();
        }

        result.addObject("result", getList.getResponseCode());
        result.addObject("result_report" , getList.getReport());
        result.setViewName("test-page");
        return result;
    }


    /** 2016-10-13 나원준
     * KCB인증을 리스트로 할 수 있게 변경
     * @param request
     * @return
     * @throws IOException
     */

    @RequestMapping(value = "/kcbsendlist")
    public ModelAndView kcbsendlist(HttpServletRequest request)  throws  IOException{

        ModelAndView result = new ModelAndView();

        String registerkey  = request.getParameter("registerkey");
        int   idxs          = Integer.parseInt(request.getParameter("idx").trim().toString());


        logger.info("reigserkey" + registerkey);
        logger.info("idx"        + idxs);

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus txStatus= txManager.getTransaction(def);

        KCBPerson person = new KCBPerson();
        KCBPerson getList = new KCBPerson();
        KCBClient newText = new KCBClient();

        String phone = request.getParameter("phone");
        person.setRegisterkey(registerkey);
        person.setPhone(phone);

        try {


            KCBPerson newperson = newText.getKCBClient361(person);
            logger.info("replace_key " + newperson.getReplacekey());

            if(newperson.getResponseCode().equals("0000")) {

                newperson.setReplaceKey(newperson.getReplacekey().trim());

                //newText.getKCBClient371withNIO(newperson);

                getList = newText.getKCBClient371(newperson);


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

                for(i=report.size()- getList.getCPScount(); i<report.size(); i++)
                {
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
                int seg            = algo.getSeg();

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

                if (seg==2 && rainbow_credit >= 7) {
                    judgeCode = "심사탈락";
                    reason = "";
                }

                person.setRainbowscore(rainbow_credit);

                String IINDEX    = CPS.get(28)[2].trim();
                String MiraeSnag = CPS.get(43)[2].trim();

                int IINDEXs = Integer.parseInt((IINDEX==null ? "1" : IINDEX));
                int mirae = Integer.parseInt((MiraeSnag==null ? "1" : MiraeSnag ));
                /**
                 * 가심사 끝
                 */


                applicationExample records = new applicationExample();
                applicationWithBLOBs record = new applicationWithBLOBs();
                application_data record1 = new application_data();
                application_data_series record2 = new application_data_series();

                //  record.setStoreName("어드민화면신청");
                record.setAmount(100000);
                //record.setPhone(phone);
                //if(person.getPhone()==null || person.getPhone().equals("")  ) record.setPhone("01050400258");

                records.createCriteria().andIdxEqualTo(idxs);
                //record.setUserNote("테스트");
                //record.setStoreIdx(1);
                record.setDebtCode(judgeCode);
                record.setMiraeindex(mirae);
                record.setIindex(IINDEXs);
                //record.setRegisterkey(person.getRegisterkey());
                record.setReplacekey(person.getReplacekey());
                record.setRainbowscore(rainbow_credit);
                record.setDescmemo(reason);

//            applicationDAOService.insertSelective(record);
                applicationDAOService.updateByExampleSelective(record, records);


                logger.info("kcb index : " + idxs);

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

                    txManager.commit(txStatus);

                }
            }



//             return getList;
        }catch(Exception e)
        {
            txManager.rollback(txStatus);
            e.printStackTrace();

        }


        result.addObject("result", getList.getResponseCode());
        result.addObject("result_report" , getList.getReport());
        result.setViewName("test-page");
        return result;
    }




    @RequestMapping("/popup")
    public ModelAndView popup(HttpServletRequest request) throws  IOException{

        SendSms sms = new SendSms();

        KCBPerson newPerson = new KCBPerson();
        KCBClient client = new KCBClient();

        //String waitYn = request.getParameter("waitYn");

        newPerson.setName(request.getParameter("name"));
        newPerson.setPhone(request.getParameter("phone"));
        newPerson.setBirthdate(request.getParameter("birthdate"));
        newPerson.setSex(request.getParameter("sex"));




        logger.info("popup" + request.getParameter("phone")  + " - " + request.getParameter("birthdate") + " - " + request.getParameter("sex") + " - " + request.getParameter("name"));

        newPerson = client.getKCBClient360(newPerson);


        if(newPerson.getRegisterkey()!=null && !newPerson.getRegisterkey().equals("")) {

            applicationWithBLOBs     record  = new applicationWithBLOBs();

            record.setStoreName("문자전송신청");
            record.setAmount(100000);
            record.setPhone(newPerson.getPhone());
            if (newPerson.getPhone() == null || newPerson.getPhone().equals(""))
                record.setPhone("01050400258");

            record.setUserNote("테스트");
            record.setStoreIdx(1);
            record.setUrl(newPerson.getUrl());
            record.setDebtCode("심사대기");
            record.setApplicantBirthdate(newPerson.getBirthdate());
            record.setApplicant_name(request.getParameter("name"));
            record.setRegisterkey(newPerson.getRegisterkey());

            applicationDAOService.insertSelective(record);



            try {

                sms.apiSendSms(newPerson.getPhone(),"14.32.55.87", URLShortener.getShortenUrl(newPerson.getUrl()));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        ModelAndView result = new ModelAndView();
        result.addObject("url", newPerson.getUrl());
        result.addObject("registerkey", newPerson.getRegisterkey());
        result.setViewName("test-page");
        return result;
    }

    @RequestMapping("/chart-morris")
    public ModelAndView chart_morris(Locale locale, Model model) {
        logger.info("Welcome main.", locale);

        // view ȭ���� main.jsp�� DB�κ��� �о�� �����͸� �����ش�.
        ModelAndView result = new ModelAndView();
        //addObject view�� �Ѿ�� ������
        //  List<Member> memberList = memberDAOService.getMembers();
        // result.addObject("result", memberList);
        result.setViewName("chart-morris");
        return result;
    }

    @RequestMapping("/debt-detail")
    public ModelAndView debt_detail(HttpServletRequest request) {


        ModelAndView result = new ModelAndView();

        int search		= 102;
        String index = request.getParameter("search")==null ? "102" : request.getParameter("search");
        logger.info("Welcome main. " +  index);


        if(index.length() >= 9)
        {
            applicationExample content_con = new applicationExample();
            content_con.createCriteria().andRegisterkeyEqualTo(index);
            List<application> application_list =  applicationDAOService.selectByExample(content_con);
            search = application_list.get(0).getIdx();
           // request.setAttribute("search", search);
        }
        else
            search =   Integer.parseInt(request.getParameter("search")==null ? "102" : request.getParameter("search"));

        disqualifiedReasonsExample discontent = new disqualifiedReasonsExample();
        discontent.createCriteria().andRefIdxEqualTo(search);
        List<disqualifiedReasons> disqualified_data=  disqualifedDAOService.selectByExample(discontent);


        application_dataExample content11 = new application_dataExample();
        content11.createCriteria().andRefIdxEqualTo(search);
        List<application_data> application_data=  applicationDataDAOService.selectByExample(content11);


        application_data_seriesExample content5 = new application_data_seriesExample();
        content5.createCriteria().andRefIdxEqualTo(search).andSegIdxEqualTo("017").andDetailIdxEqualTo("1");
        content5.setOrderByClause("detail_idx desc ");
        List<application_data_series> application_data_serieses5 =  applicationDataSeriesDAOService.selectByExample(content5);


        result.addObject("result_017",   application_data_serieses5);

        result.addObject("search", search);
        result.addObject("application_data", application_data);
        result.addObject("disqualified_data", disqualified_data);

        result.setViewName("debt-detail");
        return result;
    }

    @RequestMapping("/register")
    public ModelAndView register(Locale locale, Model model) {
        logger.info("Welcome main.", locale);

        // view ȭ���� main.jsp�� DB�κ��� �о�� �����͸� �����ش�.
        ModelAndView result = new ModelAndView();
        //addObject view�� �Ѿ�� ������
      //  List<Member> memberList = memberDAOService.getMembers();
       // result.addObject("result", memberList);
        result.setViewName("page-register");
        return result;
    }

    @RequestMapping("/number_seoul")
    public ModelAndView number_seoul(Locale locale, Model model) {
        logger.info("Welcome main.", locale);

        // view ȭ���� main.jsp�� DB�κ��� �о�� �����͸� �����ش�.
        ModelAndView result = new ModelAndView();
        //addObject view�� �Ѿ�� ������
        //    List<Member> memberList = memberDAOService.getMembers();
        //    result.addObject("result", memberList);
        result.setViewName("number_seoul");
        return result;
    }

    @RequestMapping("/number")
    public ModelAndView number(Locale locale, Model model) {
        logger.info("Welcome main.", locale);

        // view ȭ���� main.jsp�� DB�κ��� �о�� �����͸� �����ش�.
        ModelAndView result = new ModelAndView();
        //addObject view�� �Ѿ�� ������
    //    List<Member> memberList = memberDAOService.getMembers();
    //    result.addObject("result", memberList);
        result.setViewName("number");
        return result;
    }

    @Secured("ROLE_USER")
    @RequestMapping("/index")
    public ModelAndView index(HttpSession session) throws ParseException {

        Date date =new Date();
        SimpleDateFormat sdfformat_start = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        SimpleDateFormat sdfformat_end   = new SimpleDateFormat("yyyy-MM-dd 23:59:59");

        Date start_date = sdfformat_start.parse(sdfformat_start.format(date));
        Date end_date   = sdfformat_end.parse(sdfformat_end.format(date));

        logger.info(start_date + "fuck" + end_date + " ::" + sdfformat_start.format(date) + "//"+ sdfformat_end.format(date) + "// " + start_date + " : "+end_date );

        ModelAndView result = new ModelAndView();
        applicationExample content      = new applicationExample();
        applicationExample content_debt = new applicationExample();


        //content_debt.createCriteria().andDatetimeBetween((sdfformat_start.format(date), end_date);
        int total_debt = applicationDAOService.countByExample(content);
        int today_debt = applicationDAOService.countByExample(content_debt);

        //logger.info(total_debt + "fuck");
        //logger.info(today_debt + "");

        result.addObject("total_debt", total_debt);
        result.addObject("today_debt", today_debt);
        result.setViewName("index");
        return result;
    }

/*
    @RequestMapping("/login")
    public ModelAndView login(Locale locale, Model model) {
        logger.info("Welcome main.", locale);

        // view ȭ���� main.jsp�� DB�κ��� �о�� �����͸� �����ش�.
        ModelAndView result = new ModelAndView();
        //addObject view�� �Ѿ�� ������
    //    List<Member> memberList = memberDAOService.getMembers();
    //    result.addObject("result", memberList);
        result.setViewName("login");
        return result;
    }
*/
	//���� ����ȭ��.
	@RequestMapping("/main")
	public ModelAndView main(Locale locale, Model model) {
		logger.info("Welcome main.", locale);

		// view ȭ���� main.jsp�� DB�κ��� �о�� �����͸� �����ش�.
		ModelAndView result = new ModelAndView();
		//addObject view�� �Ѿ�� ������
		List<Member> memberList = memberDAOService.getMembers();
		result.addObject("result", memberList);
		result.setViewName("main");
		return result;
	}
	
	//insert ��ư Ŭ���� ���� �����ͼ� result.jsp�� ȭ����ȯ ���ش�.
	@RequestMapping(value ="/insert", method = RequestMethod.POST)
	public ModelAndView insert(HttpServletRequest request){
		
		// HttpServletRequest�� �̿��Ͽ� main.jsp�κ��� 
		Member member = new Member();
		member.set_name((String) request.getParameter("name"));
		member.set_email((String) request.getParameter("email"));
		member.set_phone((String) request.getParameter("phone"));
		
		memberDAOService.insertMember(member);
		System.out.println("insert complet");
		
		//�Ʒ��κ��� select���� result.jsp���Ͽ� �����ֱ� ���� �ǻ��.
		ModelAndView result = new ModelAndView();
		List<Member> memberList = memberDAOService.getMembers();
		result.addObject("result", memberList);
		result.setViewName("result");
		return result;
	}
}
