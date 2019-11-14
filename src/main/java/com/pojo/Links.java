package com.pojo;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-14 10:58
 */

/**
 * @author songy
 * @ClassName
 * @Date
 * @Version 1.0
 */

public class Links {
    private String first;
    private String last;
    private String prev;
    private String next;

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
