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

/**
     *     ********业务层：*******
     *      * 增加商品
     *      * 删除商品
     *      * 查询所有商品
     *      * 查询商品（依据：编号、名称、类别）,可以模糊查询，在业务处理层添加了“%”


*/
/**
     * 添加商品
     * @param ShopGoods
     */



    public String addGoods(ShopGoods ShopGoods) {
        try {
            System.out.println(ShopGoods.getGoodsId()+ ShopGoods.getGoods()+" 返回成功---这在ShopGoodsService里面");
            shopGoodsDao.addShopGoods(ShopGoods);
            return "success";
        }
        catch (Exception e) {
            System.out.println(ShopGoods.getGoodsId()+ ShopGoods.getGoods()+" 返回失败，估计语句错误---这在ShopGoodsService里面");
            return "error";
        }
    }


/**
     * 删除商品
     * @param goodsId

*/

    public void deleteGoods(String goodsId) {
        shopGoodsDao.deleteShopGoods(goodsId);
    }


/**
     * 查询所有商品

*/

    public List<ShopGoods> selectAllGoods() {
        return shopGoodsDao.selectAllShopGoods();
    }


/**
     * 通过商品名称
     * @param goods
*/



    public List<ShopGoods> selectByCommodityName(String goods) {
        goods = "%"+goods+"%";
        System.out.println(goods+"根据商品名称模糊查找, 这在ShopGoodsService里面");
        return shopGoodsDao.selectByGoods(goods);
    }

/**
     * 通过商品编号
     * @param goodsId
*/

    public List<ShopGoods> selectById(String goodsId) {
        goodsId = "%"+goodsId+"%";
        System.out.println(goodsId+"根据商品编号查找, 这在ShopGoodsService里面");
        return shopGoodsDao.selectByGoodsId(goodsId);
    }

/**
     * 通过大类
     * @param category

*/
    public List<ShopGoods> selectByCategory(String category) {
        category = "%"+category+"%";
        System.out.println(category+"根据大类模糊查找, 这在ShopGoodsService里面");
        return shopGoodsDao.selectByCategory(category);
    }


/**
     * 通过小类
     * @param classes

*/
    public List<ShopGoods> selectByClasses(String classes) {
        classes = "%"+classes+"%";
        System.out.println(classes+"根据小类模糊查找, 这在ShopGoodsService里面");
        return shopGoodsDao.selectByClasses(classes);
    }

/**
     * 利用Id精确查找
     * @param goodsId
*/


    public ShopGoods selectGood(String goodsId) {
        ShopGoods ShopGoods = shopGoodsDao.selectGoods(goodsId);
        return ShopGoods;
    }


/**
     * 修改活动
     * @param ShopGoods
*/



    public String reviseShopGoods(ShopGoods ShopGoods) {
        try {
            System.out.println(ShopGoods.getGoodsId()+ ShopGoods.getGoods()+" 返回成功---这在ShopGoodsService里面");
            shopGoodsDao.reviseShopGoods(ShopGoods);
            return "success";
        }
        catch (Exception e) {
            System.out.println(ShopGoods.getGoodsId()+ ShopGoods.getGoods()+" 返回失败，估计语句错误---这在ShopGoodsService里面");
            return "error";
        }
    }
}

