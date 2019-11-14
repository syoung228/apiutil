package com.pojo;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 9:34
 */

import java.util.List;

/**
 * @author songy
 * @ClassName
 * @Date
 * @Version 1.0
 */

public class Ads {
    private String id;
    private String platform;
    private String name;
    private String url;
    private long sales;
    private int price;
    private int commission_amount;
    private int commission_rates;
    private int discount;
    private int use_price;
    private long total;
    private long remain;
    private long sku;
    private String gender;
    private Seller seller;
    private Coupon coupon;
    private List<Categories> categories;
    private List<Images> images;
    private String created_at;
    private String updated_at;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public long getSales() {
        return sales;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setCommission_amount(int commission_amount) {
        this.commission_amount = commission_amount;
    }

    public int getCommission_amount() {
        return commission_amount;
    }

    public void setCommission_rates(int commission_rates) {
        this.commission_rates = commission_rates;
    }

    public int getCommission_rates() {
        return commission_rates;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setUse_price(int use_price) {
        this.use_price = use_price;
    }

    public int getUse_price() {
        return use_price;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getTotal() {
        return total;
    }

    public void setRemain(long remain) {
        this.remain = remain;
    }

    public long getRemain() {
        return remain;
    }

    public void setSku(long sku) {
        this.sku = sku;
    }

    public long getSku() {
        return sku;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }


    @Override
    public String toString() {
        return "Ads{" +
                "id='" + id + '\'' +
                ", platform='" + platform + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", sales=" + sales +
                ", price=" + price +
                ", commission_amount=" + commission_amount +
                ", commission_rates=" + commission_rates +
                ", discount=" + discount +
                ", use_price=" + use_price +
                ", total=" + total +
                ", remain=" + remain +
                ", sku=" + sku +
                ", gender='" + gender + '\'' +
                ", seller=" + seller +
                ", coupon=" + coupon +
                ", categories=" + categories +
                ", images=" + images +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }
}
