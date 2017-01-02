package com.funda.controller;


import com.funda.mybatis.model.account_contentsExample;
import com.funda.mybatis.model.account_contentsList;
import com.funda.mybatis.model.account_contentsWithBLOBs;
import com.funda.mybatis.service.AcountContentsDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1")
public class AccountController {

	@Autowired
	AcountContentsDAOService accountService;
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	// this method responses to GET request http://localhost:8080/api/vi/person
	// return Person object as json
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	@ResponseBody
	public account_contentsList getAccounts() {

		account_contentsExample list = new account_contentsExample();
        account_contentsList pubs = new account_contentsList();
        pubs.setAccounts(this.accountService.selectByExampleWithBLOBs(list));
      //  logger.info("Select all call: "+ this.accountService.getAccounts());
        return pubs;
	}

    @RequestMapping(value = "/account.xml", method = RequestMethod.GET,   produces={"application/xml" , "text/plain;charset=UTF-8"})
    @ResponseBody
    public account_contentsList getAccountsXML() {

		account_contentsExample list = new account_contentsExample();
		account_contentsList pubs = new account_contentsList();
		pubs.setAccounts(this.accountService.selectByExampleWithBLOBs(list));
		//  logger.info("Select all call: "+ this.accountService.getAccounts());
		return pubs;
    }
	
	// this method responses to GET request http://localhost:8080/api/vi/person/{id}
	// return Person object as json
	@RequestMapping(value = "/account/{id}", method = RequestMethod.GET)
	@ResponseBody
	public account_contentsWithBLOBs getById(@PathVariable Integer id) {

		account_contentsWithBLOBs account = this.accountService.selectByPrimaryKey(id);

		if(account!=null){
		logger.info(account.getName());
		logger.info("Select one call: "+ account.getSummary() + ", " + account.getName());
		
		}
		return account;
	}

	// this method response to POST request http://localhost:8080/api/v1/person
	// receives json data sent by client --> map it to Person object
	// return Person object as json
	@RequestMapping(value = "/account", method = RequestMethod.POST)
	@ResponseBody
	public int saveAccount(@RequestBody account_contentsWithBLOBs person) {


		logger.info("Save call: "+ person.getIdx() + ", " + person.getName());
		return this.accountService.insert(person);
	}


	
	@RequestMapping(value = "/account", method = RequestMethod.PUT)
	@ResponseBody
	public int updateAccount(@RequestBody account_contentsWithBLOBs person) {
		logger.info("Update call: "+ person.getIdx() + ", " + person.getName());
		return this.accountService.insertSelective(person);
	}
	
	@RequestMapping(value = "/account/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAccount(@PathVariable Integer id) {
		logger.info("Delete call: "+ id);
		this.accountService.deleteByPrimaryKey(id);
	}
}