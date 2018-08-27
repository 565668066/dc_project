package com.dc_project.dao;
import com.dc_project.entity.ShopGoods;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ShopGoodsDao {


    /**
     * 添加商品
     * @param ShopGoods
     */
    public void addShopGoods(ShopGoods ShopGoods);

    /**
     * 删除商品
     * @param goodsId
     */
    public void deleteShopGoods(String goodsId);

    /**
     * 选择所有商品
     */
    public List<ShopGoods> selectAllShopGoods();

    /**
     * 通过商品编号
     * @param goodsId
     */
    public List<ShopGoods> selectByGoodsId(String goodsId);

    /**
     * 通过商品名称
     * @param goods
     */
    public List<ShopGoods> selectByGoods(String goods);

    /**
     * 通过大类
     * @param category
     */
    public List<ShopGoods> selectByCategory(String category);

    /**
     * 通过小类
     * @param classes
     */
    public List<ShopGoods> selectByClasses(String classes);

    /**
     * 通过goodsId选择指定商品
     * @param goodsId
     */
    public ShopGoods selectShopGoods(String goodsId);

    /**
     * 修改商品
     * @param ShopGoods
     */
    public void reviseShopGoods(ShopGoods ShopGoods);

}

