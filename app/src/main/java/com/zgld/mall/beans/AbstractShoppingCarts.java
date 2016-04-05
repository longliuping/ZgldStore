package com.zgld.mall.beans;

/**
 * AbstractShoppingCarts entity provides the base persistence definition of the
 * ShoppingCarts entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShoppingCarts implements java.io.Serializable {

	// Fields

	private Integer lineItemId;
	private Integer shopId;
	private Integer userId;
	private Integer productId;
	private Integer sku;
	private Integer quantity;

	// Constructors

	/** default constructor */
	public AbstractShoppingCarts() {
	}

	/** full constructor */
	public AbstractShoppingCarts(Integer shopId, Integer userId, Integer productId, Integer sku, Integer quantity) {
		this.shopId = shopId;
		this.userId = userId;
		this.productId = productId;
		this.sku = sku;
		this.quantity = quantity;
	}

	// Property accessors

	public Integer getLineItemId() {
		return this.lineItemId;
	}

	public void setLineItemId(Integer lineItemId) {
		this.lineItemId = lineItemId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getSku() {
		return this.sku;
	}

	public void setSku(Integer sku) {
		this.sku = sku;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}