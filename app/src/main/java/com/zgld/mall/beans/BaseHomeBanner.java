package com.zgld.mall.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/3/28.
 */
public class BaseHomeBanner implements Serializable{
    List<HomeBanner> items;

    public List<HomeBanner> getItems() {
        return items;
    }

    public void setItems(List<HomeBanner> items) {
        this.items = items;
    }
}
