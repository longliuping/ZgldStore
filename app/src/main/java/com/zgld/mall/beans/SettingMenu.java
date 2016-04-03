package com.zgld.mall.beans;

import java.io.Serializable;

/**
 * Created by LongLiuPing on 2016/3/21.
 */
public class SettingMenu implements Serializable{
    int type;//1 需要跳转的 2当前页处理
    Class className;
    String name;
    String value;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

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
}
