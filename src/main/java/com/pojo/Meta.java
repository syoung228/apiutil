package com.pojo;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 10:58
 */

/**
 * @ClassName
 * @author songy
 * @Date
 * @Version 1.0
 */

public class Meta {
    private String current_page;
    private String from;
    private String last_page;
    private String path;
    private String per_page;
    private String to;
    private String total;

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
