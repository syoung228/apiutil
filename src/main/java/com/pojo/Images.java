package com.pojo;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 10:42
 */

/**
 * @author songy
 * @ClassName 物料图片
 * @Date
 * @Version 1.0
 */

public class Images {

    private String url;
    private String size;
    public Images(){}
    /**
     *
     * @param url 物料的图片地址
     * @param size 物料的图片的大小，large 或 small
     */
    public Images(String url, String size) {
        this.url = url;
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public Images setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getSize() {
        return size;
    }

    public Images setSize(String size) {
        this.size = size;
        return this;
    }
}
