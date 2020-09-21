package com.anningtex.recyclerview.activity.nine.menu;

/**
 * @Author: Song
 */
public abstract class GroupEntity<T> {
    private boolean isExpand;
    private T t;
    private String header;

    public boolean isExpand() {
        return isExpand;
    }

    public void setExpand(boolean expand) {
        isExpand = expand;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
