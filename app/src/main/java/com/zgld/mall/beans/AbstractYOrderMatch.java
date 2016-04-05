package com.zgld.mall.beans;

/**
 * AbstractYOrderMatch entity provides the base persistence definition of the
 * YOrderMatch entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYOrderMatch implements java.io.Serializable {

	// Fields

	private Integer matchId;
	private Integer orderId;
	private Integer accountActId;
	private Integer goId;
	private Integer combineValueId;

	// Constructors

	/** default constructor */
	public AbstractYOrderMatch() {
	}

	/** full constructor */
	public AbstractYOrderMatch(Integer orderId, Integer accountActId, Integer goId, Integer combineValueId) {
		this.orderId = orderId;
		this.accountActId = accountActId;
		this.goId = goId;
		this.combineValueId = combineValueId;
	}

	// Property accessors

	public Integer getMatchId() {
		return this.matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getGoId() {
		return this.goId;
	}

	public void setGoId(Integer goId) {
		this.goId = goId;
	}

	public Integer getCombineValueId() {
		return this.combineValueId;
	}

	public void setCombineValueId(Integer combineValueId) {
		this.combineValueId = combineValueId;
	}

}