package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YOrderSend entity. @author MyEclipse Persistence Tools
 */
public class YOrderSend extends AbstractYOrderSend implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YOrderSend() {
	}

	/** minimal constructor */
	public YOrderSend(String sendTime) {
		super(sendTime);
	}

	/** full constructor */
	public YOrderSend(Integer shipId, String shipNumber, Integer orderId, Integer accountActId, String sendInfo, String sendTime) {
		super(shipId, shipNumber, orderId, accountActId, sendInfo, sendTime);
	}

}
