package com.robot.controller;

import com.robot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.Name;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：robot
 * @date ：Created in 2019/5/3 10:29
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {

    protected Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login.action")
    @ResponseBody
    private ModelAndView bannerList(String name,String pwd){
        ModelAndView modelAndView=new ModelAndView("login");
        logger.info("indexController login userName:{},userPwd:{}");
        if(userService.login(name,pwd)){
            modelAndView=new ModelAndView("index");
        }
        return modelAndView;
    }
}
