package com.funda.controller;

import com.funda.mybatis.model.funding_data;
import com.funda.mybatis.model.funding_dataExample;
import com.funda.mybatis.model.funding_dataWithBLOBs;
import com.funda.mybatis.model.fundingdataList;
import com.funda.mybatis.service.FundingDataDAOService;
import com.funda.util.Fund;
import com.funda.util.Schedule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1")
public class FundingController {
	
	@Autowired
    FundingDataDAOService funding_dataService;
	
	private static final Logger logger = LoggerFactory.getLogger(FundingController.class);



    @RequestMapping(value = "/funding_data",   method = RequestMethod.GET)
    @ResponseBody
    public fundingdataList getfunding_datas() {

        fundingdataList pubs = new fundingdataList();
        funding_dataExample list = new funding_dataExample();
        pubs.setFundings(this.funding_dataService.selectByExample(list));
       // logger.info("Select all call: "+ this.personService.getPersons());
        return pubs;
    }


	// this method responses to GET request http://localhost:8080/api/vi/person/{id}
	// return Person object as json
	@RequestMapping(value = "/funding_data/{id}", method = RequestMethod.GET, produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getById(@PathVariable Integer id ) {

        Fund fund = new Fund();
     /*  funding_data person = this.funding_dataService.getById(id);
		if(person!=null){
		logger.info(person.getName());
		logger.info("Select one call: "+ person.getId() + ", " + person.getName());
		
		}*/
        try {

            return fund.getFundingData(id, 100000);
        }catch(Exception e){ e.printStackTrace();}
        return "";
	}

    @RequestMapping(value = "/funding_data/{id}/amount/{amount}", method = RequestMethod.GET, produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String getByIdByAmount(@PathVariable Integer id , @PathVariable Integer amount  ) {

        Fund fund = new Fund();
     /*  funding_data person = this.funding_dataService.getById(id);
		if(person!=null){
		logger.info(person.getName());
		logger.info("Select one call: "+ person.getId() + ", " + person.getName());

		}*/
        try {

            return fund.getFundingData(id, amount);
        }catch(Exception e){ e.printStackTrace();}
        return "";
    }

	// this method response to POST request http://localhost:8080/api/v1/person
	// receives json data sent by client --> map it to Person object
	// return Person object as json
	@RequestMapping(value = "/funding_data/{id}/schedules", method = RequestMethod.PATCH)
	@ResponseBody
	public funding_data saveSchedulles(@PathVariable Integer id) {

        Schedule schedule = new Schedule();
        // 1~80 까지 스케쥴 생성
        try {


            schedule.schedule_creditor(id,id);      // creditor 생성(1~80)
            //schedule.schedule_debtor(id, id);       // debtor 생성(1~80)
            //schedule.update_schedule_creditor();   // 스케쥴 업데이트
            //schedule.make_funding_data_early_done(id);  //중도상환

        }catch(Exception e)
        {
            e.printStackTrace();
        }
		//logger.info("Save call: "+ person.getId() + ", " + person.getName());
		//return this.funding_dataService.save(fund);
        return null;
	}


    // this method response to POST request http://localhost:8080/api/v1/person
    // receives json data sent by client --> map it to Person object
    // return Person object as json
    @RequestMapping(value = "/funding_data", method = RequestMethod.POST)
    @ResponseBody
    public int savefunding_data(@RequestBody funding_dataWithBLOBs person) {


    //    logger.info("Save call: "+ person.getId() + ", " + person.getName());
        return this.funding_dataService.insert(person);
    }

	

	@RequestMapping(value = "/funding_data", method = RequestMethod.PUT)
	@ResponseBody
	public int updatefunding_data(@RequestBody funding_data person, @RequestBody funding_dataExample record ) {
	//logger.info("Update call: "+ person.getId() + ", " + person.getName());
		return this.funding_dataService.updateByExample(person,record);
	}
	
	@RequestMapping(value = "/funding_data/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletefunding_data(@PathVariable Integer id) {
		logger.info("Delete call: "+ id);
		this.funding_dataService.deleteByPrimaryKey(id);
	}
}