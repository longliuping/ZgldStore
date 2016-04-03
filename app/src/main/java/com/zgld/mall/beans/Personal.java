package com.zgld.mall.beans;

import java.io.Serializable;

/**
 * Created by LongLiuPing on 2016/3/20.
 */
public class Personal implements Serializable{
    String name;
    String value;
    int type;//1文本 2图片
    Class className;

    public Class getClassName() {
        return className;
    }

    public void setClassName(Class className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
