package com.zgld.mall.beans;

/**
 * YOrderMatch entity. @author MyEclipse Persistence Tools
 */
public class YOrderMatch extends AbstractYOrderMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YOrderMatch() {
	}

	/** full constructor */
	public YOrderMatch(Integer orderId, Integer accountActId, Integer goId, Integer combineValueId) {
		super(orderId, accountActId, goId, combineValueId);
	}

}
