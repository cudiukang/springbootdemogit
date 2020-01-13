package com.example.entity;

import java.io.Serializable;

/**
 * 返回数据封装对象
 */
public class FeedBackObject {
    private boolean state;
    private String msg;
    private Object obj;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

}
