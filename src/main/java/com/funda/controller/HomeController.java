package com.funda.controller;


import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.funda.login.CustomUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.funda.mybatis.service.MemberDAOService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    @Autowired
    private MemberDAOService memberDAOService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */


    @Secured("ROLE_ADMIN")
	@RequestMapping(value = "/", method = RequestMethod.GET)
     public ModelAndView home(HttpServletRequest request) {
        //logger.info("Welcome home! The client locale is {}.", locale);

        ModelAndView result =new ModelAndView();
        Date date = new Date();
        request.getSession().setAttribute("logininfo", false);


        result.setViewName("login");
        return result;
    }

    /**
     * Simply selects the home view to render by returning its name.
     */

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(HttpServletRequest request) {
        ModelAndView result =new ModelAndView();



        //model.addAttribute("serverTime", formattedDate );

        request.getSession().setAttribute("logininfo", false);
        //  logger.info("Welcome login! {}", session.getId());
        result.setViewName("login");
        return result;
    }

    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public String loginProcess(HttpServletRequest request) {

        ModelAndView result =new ModelAndView();
        request.getSession().setAttribute("logininfo", true);



        String returnURL = "";
        //웹페이지에서받은 아이디,패스워드 일치시 admin 세션key 생성
        if(request.getParameter("id").equals("admin") && request.getParameter("pw").equals("1234")) {
            Map<String, Object> map = new HashMap<String,Object>();
            map.put("admin_id", "admin");
            map.put("admin_name", "관리자");
            request.getSession().setAttribute("admin", map);
            returnURL = "redirect:/index";
            //일치하지 않으면 로그인페이지 재이동
        }else {
            returnURL = "redirect:/";
        }
        return returnURL;

    }



    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public void logout(HttpSession session) {
        CustomUserDetails userDetails = (CustomUserDetails)session.getAttribute("userLoginInfo");

        logger.info("Welcome logout! {}, {}", session.getId(), userDetails.getUsername());


        session.invalidate();
    }



    @RequestMapping(value = "login_success", method = RequestMethod.GET)
    public void login_success(HttpSession session) {
        CustomUserDetails userDetails = (CustomUserDetails)SecurityContextHolder.getContext().getAuthentication().getDetails();

        logger.info("Welcome login_success! {}, {}", session.getId(), userDetails.getUsername() + "/" + userDetails.getPassword());
        session.setAttribute("userLoginInfo", userDetails);
    }

    @RequestMapping(value = "page1", method = RequestMethod.GET)
    public void page1() {
    }

    @RequestMapping(value = "login_duplicate", method = RequestMethod.GET)
    public void login_duplicate() {
        logger.info("Welcome login_duplicate!");
    }
}
