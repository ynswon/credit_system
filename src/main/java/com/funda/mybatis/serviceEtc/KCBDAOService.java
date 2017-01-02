package com.funda.mybatis.serviceEtc;

import com.funda.kcb.KCB371;
import com.funda.kcb.KCBClient;
import com.funda.kcb.KCBPerson;
import com.funda.mybatis.dao.applicationMapper;
import com.funda.mybatis.model.*;
import com.funda.mybatis.sdao.KCBMapper;
import com.funda.mybatis.service.ApplicationDAOService;
import com.funda.mybatis.service.ApplicationDataDAOService;
import com.funda.mybatis.service.ApplicationDataSeriesDAOService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class KCBDAOService implements KCBMapper {

    @Resource(name = "transactionManager")
    protected DataSourceTransactionManager txManager;

	@Autowired
	private SqlSession sqlSession;

    @Autowired
    ApplicationDataSeriesDAOService applicationDataSeriesDAOService;

    @Autowired
    ApplicationDAOService applicationDAOService;

    @Autowired
    ApplicationDataDAOService applicationDataDAOService;



    @Override
    public void save(KCBPerson person) {

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus txStatus= txManager.getTransaction(def);
        KCBPerson getList=null;

        try{
        //applicationMapper application = sqlSession.getMapper(applicationMapper.class);
        KCBClient newText = new KCBClient();

        getList = newText.getKCBClient371(person);


        ArrayList<String[]> report = getList.getReport();
        ArrayList<KCB371>        label = getList.getLabel();
        ArrayList<String[]>     report_label = getList.getReport_label();


        applicationExample       records = new applicationExample();
        applicationWithBLOBs     record  = new applicationWithBLOBs();
        application_data record1 = new application_data();
        application_data_series record2 = new application_data_series();

        record.setStoreName("선호대출신청2");
        record.setAmount(100000);
        record.setPhone("01050540232");
        record.setUserNote("테스트");
        record.setStoreIdx(1);
        record.setDebtCode("심사대기");

        applicationDAOService.insertSelective(record);


        int idxs=record.getnextIdx();
        //logger.info("kcb index : " + idxs);

        if(label != null ) {
            int i, j, idx = 0, k;
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
            txManager.commit(txStatus);

        }

        //   return getList;
    }catch(Exception e)
    {
        txManager.rollback(txStatus);
        e.printStackTrace();
    }



    }


}
