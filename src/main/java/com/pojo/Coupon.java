package com.pojo;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 10:23
 */

/**
 * @author songy
 * @ClassName 优惠券
 * @Date
 * @Version 1.0
 */

public class Coupon {
    /** 优惠券 ID*/
    private String id;
    /** 优惠券链接*/
    private String link;
    /** 优惠券领取开始时间*/
    private String available_at;
    /** 优惠券领取截至时间*/
    private String available_end;
    /** 优惠券使用开始时间*/
    private String use_at;
    /** 优惠券使用截至时间*/
    private String use_end;

    public Coupon() {
    }

    /**
     *
     * @param id
     * @param link 优惠券链接
     * @param available_at 优惠券领取开始时间
     * @param available_end 优惠券领取截至时间
     * @param use_at 优惠券使用开始时间
     * @param use_end 优惠券使用截至时间
     */
    public Coupon(String id, String link, String available_at, String available_end, String use_at, String use_end) {
        this.id = id;
        this.link = link;
        this.available_at = available_at;
        this.available_end = available_end;
        this.use_at = use_at;
        this.use_end = use_end;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setAvailable_at(String available_at) {
        this.available_at = available_at;
    }

    public String getAvailable_at() {
        return available_at;
    }

    public void setAvailable_end(String available_end) {
        this.available_end = available_end;
    }

    public String getAvailable_end() {
        return available_end;
    }

    public void setUse_at(String use_at) {
        this.use_at = use_at;
    }

    public String getUse_at() {
        return use_at;
    }

    public void setUse_end(String use_end) {
        this.use_end = use_end;
    }

    public String getUse_end() {
        return use_end;
    }
}
