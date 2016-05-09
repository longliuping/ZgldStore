package com.zgld.mall.utils;

/**
 * Created by Am on 2016/5/9.
 */

import java.io.Serializable;

public class SubmitOrderParam implements Serializable{
    int shopId;
    int productId;
    int number;
    int valueId;
    public int getShopId() {
        return shopId;
    }
    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getValueId() {
        return valueId;
    }
    public void setValueId(int valueId) {
        this.valueId = valueId;
    }


}
