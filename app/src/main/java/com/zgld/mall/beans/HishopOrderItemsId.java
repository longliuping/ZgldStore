package com.zgld.mall.beans;

/**
 * HishopOrderItemsId entity. @author MyEclipse Persistence Tools
 */
public class HishopOrderItemsId extends AbstractHishopOrderItemsId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopOrderItemsId() {
	}

	/** full constructor */
	public HishopOrderItemsId(HishopOrders hishopOrders, String skuId) {
		super(hishopOrders, skuId);
	}

}
