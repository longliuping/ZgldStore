package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.List;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */
public class Orders extends AbstractOrders implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Orders() {
	}
	List<OrderItems> listOrderItems;
	public List<OrderItems> getListOrderItems() {
		return listOrderItems;
	}

	public void setListOrderItems(List<OrderItems> listOrderItems) {
		this.listOrderItems = listOrderItems;
	}
}
