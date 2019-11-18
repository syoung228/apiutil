package com.pojo;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 10:58
 */

/**
 * @
 * @author songy
 * @ClassName 分页链接
 * @Date
 * @Version 1.0
 */

public class Links {
    /** 第一页链接*/
    private String first;
    /** 最后一页链接*/
    private String last;
    /** 前一页链接*/
    private String prev;
    /** 下一页链接*/
    private String next;

    public Links() {
    }

    /**
     *
     * @param first 第一页链接
     * @param last 最后一页链接
     * @param prev 前一页链接
     * @param next 下一页链接
     */
    public Links(String first, String last, String prev, String next) {
        this.first = first;
        this.last = last;
        this.prev = prev;
        this.next = next;
    }

    public String getFirst() {
        return first;
    }

    public Links setFirst(String first) {
        this.first = first;
        return this;
    }

    public String getLast() {
        return last;
    }

    public Links setLast(String last) {
        this.last = last;
        return this;
    }

    public String getPrev() {
        return prev;
    }

    public Links setPrev(String prev) {
        this.prev = prev;
        return this;
    }

    public String getNext() {
        return next;
    }

    public Links setNext(String next) {
        this.next = next;
        return this;
    }
}
