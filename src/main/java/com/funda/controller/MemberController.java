package com.funda.controller;

import com.funda.mybatis.model.Member;
import com.funda.mybatis.service.MemberDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("api/v1")
public class MemberController {


    @Autowired
    MemberDAOService accountService;

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);



    // this method responses to GET request http://localhost:8080/api/vi/person/{id}
    // return Person object as json
    @RequestMapping(value = "/account/{id}", method = RequestMethod.GET)
    @ResponseBody
    public  ArrayList<Member> getById(@PathVariable Integer id) {

        ArrayList<Member> account = this.accountService.getMembers();

        if(account!=null){

        }
        return account;
    }

}
