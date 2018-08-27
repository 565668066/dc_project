/*
package com.dc_project.service;

import com.dc_project.dao.ShopGoodsDao;
import com.dc_project.entity.ShopGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShopGoodsService {

    @Autowired
    private ShopGoodsDao shopGoodsDao;

    public ShopGoodsService() {

    }
    public ShopGoodsDao getShopGoodsDao(){
        return shopGoodsDao;
    }
    public void setShopGoodsDao(ShopGoodsDao shopGoodsDao){
        this.shopGoodsDao = shopGoodsDao;
    }

    */
/**
     *     ********业务层：*******
     *      * 增加商品
     *      * 删除商品
     *      * 查询所有商品
     *      * 查询商品（依据：编号、名称、类别）,可以模糊查询，在业务处理层添加了“%”
     *
     *//*

    */
/**
     * 添加商品
     * @param ShopGoods
     * *//*


    public String addCommodity(ShopGoods ShopGoods) {
        try {
            System.out.println(ShopGoods.getId()+ ShopGoods.getCommodityName()+" 返回成功---这在commodityService里面");
            shopGoodsDao.addCommodity(ShopGoods);
            return "success";
        }
        catch (Exception e) {
            System.out.println(ShopGoods.getId()+ ShopGoods.getCommodityName()+" 返回失败，估计语句错误---这在commodityService里面");
            return "error";
        }
    }

*/
/**
     * 删除商品
     * @param id
*//*


    public void deleteCommodity(String id) {
        shopGoodsDao.deleteCommodity(id);
    }

*/
/**
     * 查询所有商品
*//*


    public List<ShopGoods> selectAllCommodity() {
        return shopGoodsDao.selectAllCommodity();
    }

*/
/**
     * 通过商品名称
     * @param commodityName
*//*


    public List<ShopGoods> selectByCommodityName(String commodityName) {
        commodityName = "%"+commodityName+"%";
        System.out.println(commodityName+"根据商品名称模糊查找, CommodityService");
        return shopGoodsDao.selectByCommodityName(commodityName);
    }
*/
/**
     * 通过商品编号
     * @param id
*//*


    public List<ShopGoods> selectById(String id) {
        id = "%"+id+"%";
        System.out.println(id+"根据商品编号查找, CommodityService");
        return shopGoodsDao.selectById(id);
    }
*/
/**
     * 通过类别
     * @param category
*//*


    public List<ShopGoods> selectByCategory(String category) {
        category = "%"+category+"%";
        System.out.println(category+"根据标题模糊查找, CommodityService");
        return shopGoodsDao.selectByCategory(category);
    }

*/
/**
     * 查询得到该活动信息
     * @param id
*//*


    public ShopGoods selectCommodity(String id) {
        ShopGoods ShopGoods = shopGoodsDao.selectCommodity(id);
        return ShopGoods;
    }

*/
/**
     * 修改活动
     * @param ShopGoods
*//*


    public String reviseCommodity(ShopGoods ShopGoods) {
        try {
            System.out.println(ShopGoods.getId()+ ShopGoods.getCommodityName()+" 返回成功---这在commodityService里面");
            shopGoodsDao.reviseCommodity(ShopGoods);
            return "success";
        }
        catch (Exception e) {
            System.out.println(ShopGoods.getId()+ ShopGoods.getCommodityName()+" 返回失败，估计语句错误---这在commodityService里面");
            return "error";
        }
    }
}
*/
