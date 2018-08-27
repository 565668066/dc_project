package com.dc_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShopController {

    //跳转到美联福超市界面
    @RequestMapping(value = "/shop_index",method = RequestMethod.GET)
    public String shop_index(){
        return "shop_index";
    }

    //跳转到用户个人购物清单页面
    @RequestMapping(value = "/user_items",method = RequestMethod.GET)
    public String user_items(){
        return "user_items";
    }

    @RequestMapping(value = "/shop_items1",method = RequestMethod.GET)
    public String shop_items1(){
        return "shop_items1";
    }

    @RequestMapping(value = "/shop_items2",method = RequestMethod.GET)
    public String shop_items2(){
        return "shop_items2";
    }

    @RequestMapping(value = "/shop_items3",method = RequestMethod.GET)
    public String shop_items3(){
        return "shop_items3";
    }

    @RequestMapping(value = "/shop_items4",method = RequestMethod.GET)
    public String shop_items4(){
        return "shop_items4";
    }

    //跳转到items_content
    @RequestMapping(value = "shop_items_content",method = RequestMethod.GET)
    public String shop_items_content(){
        return "shop_items_content";
    }
}
