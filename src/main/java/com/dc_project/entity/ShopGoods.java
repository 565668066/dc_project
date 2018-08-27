package com.dc_project.entity;

public class ShopGoods {
    private String category;
    private String classes;
    private String goods;
    private String picture;
    private double price;
    private String brand;
    private String place;
    private String evaluation;
    private String remark;
    private String goodsId;
    private String origin;
    private String specification;
    private String color;
    private String material;
    private String pdctDate;
    private String shelfLife;

    public ShopGoods() {
    }

    public ShopGoods(String category, String classes, String goods, String picture,
                     double price, String brand, String place, String evaluation,
                     String remark, String goodsId, String origin, String specification,
                     String color, String material, String pdctDate, String shelfLife) {
        this.category = category;
        this.classes = classes;
        this.goods = goods;
        this.picture = picture;
        this.price = price;
        this.brand = brand;
        this.place = place;
        this.evaluation = evaluation;
        this.remark = remark;
        this.goodsId = goodsId;
        this.origin = origin;
        this.specification = specification;
        this.color = color;
        this.material = material;
        this.pdctDate = pdctDate;
        this.shelfLife = shelfLife;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPdctDate() {
        return pdctDate;
    }

    public void setPdctDate(String pdctDate) {
        this.pdctDate = pdctDate;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }
}
