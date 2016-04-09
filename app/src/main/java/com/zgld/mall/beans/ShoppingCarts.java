package com.zgld.mall.beans;

import java.util.List;

/**
 * ShoppingCarts entity. @author MyEclipse Persistence Tools
 */
public class ShoppingCarts extends AbstractShoppingCarts implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShoppingCarts() {
	}

	/** full constructor */
	public ShoppingCarts(Integer shopId, Integer userId, Integer productId, Integer sku, Integer quantity) {
		super(shopId, userId, productId, sku, quantity);
	}
	List<Products> listProducts;
	YShop yShop;

	public YShop getyShop() {
		return yShop;
	}

	public void setyShop(YShop yShop) {
		this.yShop = yShop;
	}

	public List<Products> getListProducts() {
		return listProducts;
	}

	public void setListProducts(List<Products> listProducts) {
		this.listProducts = listProducts;
	}
	boolean checked;

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}
}
