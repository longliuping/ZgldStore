package com.zgld.mall.beans;

import java.io.Serializable;

/**
 * Created by LongLiuPing on 2016/3/14.
 */
public class GsonObject implements Serializable{
    boolean flag;
    String msg;
    int status;
    boolean timeout;
    ObjectData data;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isTimeout() {
        return timeout;
    }

    public void setTimeout(boolean timeout) {
        this.timeout = timeout;
    }

    public ObjectData getData() {
        return data;
    }

    public void setData(ObjectData data) {
        this.data = data;
    }

    private class ObjectData implements Serializable{

    }
}
