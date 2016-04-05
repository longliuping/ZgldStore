package com.zgld.mall.beans;

/**
 * AbstractYCartMatch entity provides the base persistence definition of the
 * YCartMatch entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYCartMatch implements java.io.Serializable {

	// Fields

	private Integer matchId;
	private Integer cartId;
	private Integer goId;
	private Integer accountActId;
	private Integer combineValueId;
	private Integer goodsCount;
	private Double goodsPrice;

	// Constructors

	/** default constructor */
	public AbstractYCartMatch() {
	}

	/** full constructor */
	public AbstractYCartMatch(Integer cartId, Integer goId, Integer accountActId, Integer combineValueId, Integer goodsCount, Double goodsPrice) {
		this.cartId = cartId;
		this.goId = goId;
		this.accountActId = accountActId;
		this.combineValueId = combineValueId;
		this.goodsCount = goodsCount;
		this.goodsPrice = goodsPrice;
	}

	// Property accessors

	public Integer getMatchId() {
		return this.matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public Integer getCartId() {
		return this.cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getGoId() {
		return this.goId;
	}

	public void setGoId(Integer goId) {
		this.goId = goId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getCombineValueId() {
		return this.combineValueId;
	}

	public void setCombineValueId(Integer combineValueId) {
		this.combineValueId = combineValueId;
	}

	public Integer getGoodsCount() {
		return this.goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public Double getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

}