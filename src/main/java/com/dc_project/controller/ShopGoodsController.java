/*
package com.dc_project.controller;

import com.dc_project.entity.ShopGoods;
import com.dc_project.service.ShopGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ShopGoodsController {

    @Autowired
    private ShopGoodsService shopGoodsService;

    //查询所有商品
    @RequestMapping(value = "/admin_commodity_query", method = RequestMethod.GET)
    public String admin_commodity_query(Model model) {
        List<ShopGoods> list = shopGoodsService.selectAllCommodity();
        model.addAttribute("list",list);
        return "admin_commodity_query";
    }

    //根据商品名称查
    @RequestMapping(value = "/admin_commodity_query_by_commodityName", method = RequestMethod.GET)
    public String admin_commodity_query_by_commodityName(String commodityName, Model model) {
        List<ShopGoods> list = shopGoodsService.selectByCommodityName(commodityName);
        model.addAttribute("list", list);
        return "admin_commodity_query";
    }

    //根据商品编号查
    @RequestMapping(value = "/admin_commodity_query_by_id", method = RequestMethod.GET)
    public String admin_commodity_query_by_id(String id, Model model) {
        List<ShopGoods> list = shopGoodsService.selectById(id);
        model.addAttribute("list", list);
        return "admin_commodity_query";
    }

    //根据类别查
    @RequestMapping(value = "/admin_commodity_query_by_category", method = RequestMethod.GET)
    public String admin_commodity_query_by_category(String category, Model model) {
        List<ShopGoods> list = shopGoodsService.selectByCategory(category);
        model.addAttribute("list", list);
        return "admin_commodity_query";
    }

    //删除该商品
    @RequestMapping(value = "/admin_commodity_delete", method = RequestMethod.GET)
    public String admin_commodity_delete(@RequestParam("id") String id, Model model) {
        shopGoodsService.deleteCommodity(id);
        List<ShopGoods> list = shopGoodsService.selectAllCommodity();
        model.addAttribute("list", list);
        return "admin_commodity_query";
    }

    //添加商品
    @RequestMapping(value = "/admin_commodity_add", method = RequestMethod.GET)
    public String admin_commodity_add() {
        return "admin_commodity_add";
    }
    @RequestMapping(value = "/admin_commodity_add", method = RequestMethod.POST)
    public String admin_commodity_add(
            @RequestParam("id") String id,
            @RequestParam("commodityName") String commodityName,
            @RequestParam("category") String category,
            @RequestParam("stock") int stock,
            @RequestParam("price") float price,
            Model model
    ) {
        String s_price = price + "";
        String s_stock = stock + "";
        ShopGoods ShopGoods = new ShopGoods(id,commodityName,category,stock,price);
        System.out.println("start_"+id+commodityName+category+stock+price+"_end");
        if (id.equals("")||commodityName.equals("")||category.equals("")||s_stock.equals("")||s_price.equals("")
                ||id==null||commodityName==null||category==null||s_stock==null||s_price==null) {
            model.addAttribute("commodity", ShopGoods);
            model.addAttribute("error", "输入不完整，请重新输入");
            return "admin_commodity_add";
        }
        else if (price==0) {
            model.addAttribute("id",id);
            model.addAttribute("commodity", ShopGoods);
            model.addAttribute("error", "单价不能为0，请重新输入");
            return "admin_commodity_revise";
        }
        else{
            System.out.println(ShopGoods.getId()+ ShopGoods.getCommodityName()+" 返回成功---这在CommodityController里面");
            shopGoodsService.addCommodity(ShopGoods);
            List<ShopGoods> list = shopGoodsService.selectAllCommodity();
            model.addAttribute("list", list);
            return "admin_commodity_query";
        }
    }

    //修改商品
    @RequestMapping(value = "admin_commodity_revise", method = RequestMethod.GET)
    public String admin_commodity_revise(@RequestParam("id") String id, HttpSession session, Model model) {
        ShopGoods ShopGoods = shopGoodsService.selectCommodity(id);
        model.addAttribute("commodity", ShopGoods);
        model.addAttribute("id",id);
        System.out.println(ShopGoods.getCommodityName()+"——Controller");
        return "admin_commodity_revise";
    }

    @RequestMapping(value = "admin_commodity_revise", method = RequestMethod.POST)
    public String admin_commodity_revise(
            @RequestParam("id") String id,
            @RequestParam("commodityName") String commodityName,
            @RequestParam("category") String category,
            @RequestParam("stock") int stock,
            @RequestParam("price") float price,
            Model model
    ) {
        String s_price = price + "";
        String s_stock = stock + "";
        ShopGoods ShopGoods = new ShopGoods(id,commodityName,category,stock,price);
        System.out.println("start_"+id+commodityName+category+stock+price+"_end");
        if (id.equals("")||commodityName.equals("")||category.equals("")||s_stock.equals("")||s_price.equals("")
                ||id==null||commodityName==null||category==null||s_stock==null||s_price==null) {
            model.addAttribute("commodity", ShopGoods);
            model.addAttribute("error", "输入不完整，请重新输入");
            return "admin_commodity_revise";
        }
        else if (price==0) {
            model.addAttribute("commodity", ShopGoods);
            model.addAttribute("error", "单价不能为0，请重新输入");
            return "admin_commodity_revise";
        }
        else{
            System.out.println(id+" "+ ShopGoods.getId()+" 返回成功---这在commodityController里面");
            shopGoodsService.reviseCommodity(ShopGoods);
            List<ShopGoods> list = shopGoodsService.selectAllCommodity();
            model.addAttribute("list", list);
            return "admin_commodity_query";
        }

    }
}*/
