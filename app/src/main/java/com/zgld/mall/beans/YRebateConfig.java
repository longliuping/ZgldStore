package com.zgld.mall.beans;

/**
 * YRebateConfig entity. @author MyEclipse Persistence Tools
 */
public class YRebateConfig extends AbstractYRebateConfig implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YRebateConfig() {
	}

	/** full constructor */
	public YRebateConfig(Double rebateOrderPercent, Double rebatePlatPercent) {
		super(rebateOrderPercent, rebatePlatPercent);
	}

}
