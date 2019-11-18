package com.pojo;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 10:58
 */

/**
 * @ClassName 分页信息
 * @author songy
 * @Date
 * @Version 1.0
 */

public class Meta {
    /** 当前页*/
    private String current_page;
    /** 来自哪一页*/
    private String from;
    /** 最大页*/
    private String last_page;
    /** 地址*/
    private String path;
    /** 每页条数*/
    private String per_page;
    /** 前往哪一页*/
    private String to;
    /** 总条数*/
    private String total;

    public Meta() {
    }

    /**
     *
     * @param current_page 当前页
     * @param from 来自哪一页
     * @param last_page 最大页
     * @param path 地址
     * @param per_page 每页条数
     * @param to 前往哪一页
     * @param total 总条数
     */
    public Meta(String current_page, String from, String last_page, String path, String per_page, String to, String total) {
        this.current_page = current_page;
        this.from = from;
        this.last_page = last_page;
        this.path = path;
        this.per_page = per_page;
        this.to = to;
        this.total = total;
    }

    public String getCurrent_page() {
        return current_page;
    }

    public Meta setCurrent_page(String current_page) {
        this.current_page = current_page;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public Meta setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getLast_page() {
        return last_page;
    }

    public Meta setLast_page(String last_page) {
        this.last_page = last_page;
        return this;
    }

    public String getPath() {
        return path;
    }

    public Meta setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPer_page() {
        return per_page;
    }

    public Meta setPer_page(String per_page) {
        this.per_page = per_page;
        return this;
    }

    public String getTo() {
        return to;
    }

    public Meta setTo(String to) {
        this.to = to;
        return this;
    }

    public String getTotal() {
        return total;
    }

    public Meta setTotal(String total) {
        this.total = total;
        return this;
    }
}
