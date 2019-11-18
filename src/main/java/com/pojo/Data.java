package com.pojo;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 10:56
 */

import java.util.List;

/**
 * @ClassName
 * @author songy
 * @Date
 * @Version 1.0
 */

public class Data {
    private List<Ads> data;
    private String code;
    private String status;
    private Links links;
    private Meta meta;

    public Data() {
    }

    /**
     *
     * @param data 物料列表
     * @param code
     * @param status
     * @param links
     * @param meta
     */
    public Data(List<Ads> data, String code, String status, Links links, Meta meta) {
        this.data = data;
        this.code = code;
        this.status = status;
        this.links = links;
        this.meta = meta;
    }

    public List<Ads> getData() {
        return data;
    }

    public Data setData(List<Ads> data) {
        this.data = data;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Data setCode(String code) {
        this.code = code;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Data setStatus(String status) {
        this.status = status;
        return this;
    }

    public Links getLinks() {
        return links;
    }

    public Data setLinks(Links links) {
        this.links = links;
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public Data setMeta(Meta meta) {
        this.meta = meta;
        return this;
    }
}
