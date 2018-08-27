package com.dc_project.controller;

import com.dc_project.entity.ClubMessage;
import com.dc_project.service.ClubMessageService;
import com.dc_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private ClubMessageService clubMessageService;
    private UserService userService;

    //访问主页
    @RequestMapping(value = "/admin_index", method = RequestMethod.GET)
    public String admin_index(){
        return "admin_index";
    }

    //未完页面
    @RequestMapping(value = "/to_be_continue", method = RequestMethod.GET)
    public String to_be_continue(){
        return "to_be_continue";
    }
}
