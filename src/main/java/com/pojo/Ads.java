package com.pojo;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 9:34
 */

import java.util.Date;
import java.util.List;

/**
 *
 * @author songy
 * @ClassName 物料信息
 * @Date
 * @Version 1.0
 */

public class Ads {
    /** 推广物料 ID*/
    private String id;
    /** 推广物料平台：可选 taobao jd pinduoduo*/
    private String platform;
    /** 推广物料文字描述*/
    private String name;
    /** 推广物料原始的链接地址*/
    private String url;
    /** 推广物料销量*/
    private Integer sales;
    /** 推广物料价格，单位为 分*/
    private Integer price;
    /** 推广返利金额，单位为 分*/
    private Integer commission_amount;
    /** 推广返利比例，此数值 除以 100 即为返利百分比*/
    private Integer commission_rates;
    /** 推广折扣，单位为 分*/
    private Integer discount;
    /** 推广满减价格，单位为 分*/
    private Integer use_price;
    /** 优惠券总数*/
    private Integer total;
    /** 优惠券余量*/
    private Integer remain;
    /** 推广商品的 SKU*/
    private String sku;
    /** 推广物料适合的性别*/
    private String gender;
    /** 推广商品的商家*/
    private String seller;
    /** 优惠券*/
    private Coupon coupon;
    /** 分类*/
    private List<Categories> categories;
    /** 图片*/
    private List<Images> images;
    /***/
    private String created_at;
    /***/
    private String updated_at;

    public Ads() {
    }

    /**
     *
     * @param id
     * @param platform 推广物料平台：可选 taobao jd pinduoduo
     * @param name 推广物料文字描述
     * @param url 推广物料原始的链接地址
     * @param sales 推广物料销量
     * @param price 推广物料价格，单位为 分
     * @param commission_amount 推广返利金额，单位为 分
     * @param commission_rates 推广返利比例，此数值 除以 100 即为返利百分比
     * @param discount 推广折扣，单位为 分
     * @param use_price 推广满减价格，单位为 分
     * @param total  优惠券总数
     * @param remain 优惠券余量
     * @param sku 推广商品的 SKU
     * @param gender 推广物料适合的性别
     * @param seller 推广商品的商家
     * @param coupon 优惠券
     * @param categories 分类
     * @param images 图片
     * @param created_at 創建時間
     * @param updated_at 更新時間
     */
    public Ads(String id, String platform, String name, String url, Integer sales, Integer price, Integer commission_amount, Integer commission_rates, Integer discount, Integer use_price, Integer total, Integer remain, String sku, String gender, String seller, Coupon coupon, List<Categories> categories, List<Images> images, String created_at, String updated_at) {
        this.id = id;
        this.platform = platform;
        this.name = name;
        this.url = url;
        this.sales = sales;
        this.price = price;
        this.commission_amount = commission_amount;
        this.commission_rates = commission_rates;
        this.discount = discount;
        this.use_price = use_price;
        this.total = total;
        this.remain = remain;
        this.sku = sku;
        this.gender = gender;
        this.seller = seller;
        this.coupon = coupon;
        this.categories = categories;
        this.images = images;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public Ads setId(String id) {
        this.id = id;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public Ads setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getName() {
        return name;
    }

    public Ads setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Ads setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getSales() {
        return sales;
    }

    public Ads setSales(Integer sales) {
        this.sales = sales;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public Ads setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Integer getCommission_amount() {
        return commission_amount;
    }

    public Ads setCommission_amount(Integer commission_amount) {
        this.commission_amount = commission_amount;
        return this;
    }

    public Integer getCommission_rates() {
        return commission_rates;
    }

    public Ads setCommission_rates(Integer commission_rates) {
        this.commission_rates = commission_rates;
        return this;
    }

    public Integer getDiscount() {
        return discount;
    }

    public Ads setDiscount(Integer discount) {
        this.discount = discount;
        return this;
    }

    public Integer getUse_price() {
        return use_price;
    }

    public Ads setUse_price(Integer use_price) {
        this.use_price = use_price;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public Ads setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getRemain() {
        return remain;
    }

    public Ads setRemain(Integer remain) {
        this.remain = remain;
        return this;
    }

    public String getSku() {
        return sku;
    }

    public Ads setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Ads setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getSeller() {
        return seller;
    }

    public Ads setSeller(String seller) {
        this.seller = seller;
        return this;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public Ads setCoupon(Coupon coupon) {
        this.coupon = coupon;
        return this;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public Ads setCategories(List<Categories> categories) {
        this.categories = categories;
        return this;
    }

    public List<Images> getImages() {
        return images;
    }

    public Ads setImages(List<Images> images) {
        this.images = images;
        return this;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Ads setCreated_at(String created_at) {
        this.created_at = created_at;
        return this;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public Ads setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
        return this;
    }
}
