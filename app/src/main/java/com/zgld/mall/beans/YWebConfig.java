package com.zgld.mall.beans;

/**
 * YWebConfig entity. @author MyEclipse Persistence Tools
 */
public class YWebConfig extends AbstractYWebConfig implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YWebConfig() {
	}

	/** minimal constructor */
	public YWebConfig(String webConDescription) {
		super(webConDescription);
	}

	/** full constructor */
	public YWebConfig(Integer unitSetId, Integer accountActId, Integer webConState, Integer webConAdminState, String webConName, String webConKeyWord, String webConDescription) {
		super(unitSetId, accountActId, webConState, webConAdminState, webConName, webConKeyWord, webConDescription);
	}

}
