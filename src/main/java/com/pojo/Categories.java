package com.pojo;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 10:40
 */

/**
 *
 * @author songy
 * @ClassName 物料分类
 * @Date
 * @Version 1.0
 */

public class Categories {
    /** 物料分类 ID*/
    private String id;
    /** 物料分类名字*/
    private String name;

    public String getId() {
        return id;
    }

    public Categories setId(String id) {
        this.id = id;
        return this;
    }

    public Categories() {
    }

    /**
     *
     * @param id
     * @param name 物料分类名字
     */
    public Categories(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Categories setName(String name) {
        this.name = name;
        return this;
    }
}
