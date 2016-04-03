package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * HishopInpourRequest entity. @author MyEclipse Persistence Tools
 */
public class HishopInpourRequest extends AbstractHishopInpourRequest implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopInpourRequest() {
	}

	/** full constructor */
	public HishopInpourRequest(AspnetMembers aspnetMembers,
			Timestamp tradeDate, Double inpourBlance, Integer paymentId) {
		super(aspnetMembers, tradeDate, inpourBlance, paymentId);
	}

}
