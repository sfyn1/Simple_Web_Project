package com.kuliah.latihanspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping
@Slf4j
public class TestController {

    @GetMapping(value = "/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping(value = "/register")
    public String getRegisterPage(){
        return "register";
    }

    @GetMapping(value = "/dashboard")
    public String getDashboardPage(){
        return "dashboard";
    }
}
