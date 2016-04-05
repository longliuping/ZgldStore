package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractInpourRequest entity provides the base persistence definition of the
 * InpourRequest entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractInpourRequest implements java.io.Serializable {

	// Fields

	private Integer inpourId;
	private Integer userId;
	private String tradeDate;
	private Double inpourBlance;
	private String paymentGateway;

	// Constructors

	/** default constructor */
	public AbstractInpourRequest() {
	}

	/** full constructor */
	public AbstractInpourRequest(Integer userId, String tradeDate, Double inpourBlance, String paymentGateway) {
		this.userId = userId;
		this.tradeDate = tradeDate;
		this.inpourBlance = inpourBlance;
		this.paymentGateway = paymentGateway;
	}

	// Property accessors

	public Integer getInpourId() {
		return this.inpourId;
	}

	public void setInpourId(Integer inpourId) {
		this.inpourId = inpourId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTradeDate() {
		return this.tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Double getInpourBlance() {
		return this.inpourBlance;
	}

	public void setInpourBlance(Double inpourBlance) {
		this.inpourBlance = inpourBlance;
	}

	public String getPaymentGateway() {
		return this.paymentGateway;
	}

	public void setPaymentGateway(String paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

}