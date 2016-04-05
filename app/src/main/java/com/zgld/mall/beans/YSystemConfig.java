package com.zgld.mall.beans;

/**
 * YSystemConfig entity. @author MyEclipse Persistence Tools
 */
public class YSystemConfig extends AbstractYSystemConfig implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YSystemConfig() {
	}

	/** full constructor */
	public YSystemConfig(Integer sysConState, String sysConName, String sysConImgWater, String sysConTextWater, String sysConWebUrl, String sysConKeyWords, String sysConWebDescription, String sysConWebCopyRight, Integer sysConLogLevel, Integer sysConIsRegister, Integer sysConIsLogin, Integer sysConIsComment, Integer sysConIsAnonymityComment, Integer sysConIsMsg, Integer sysConIsAnonymityMsg, Integer sysIsLocked) {
		super(sysConState, sysConName, sysConImgWater, sysConTextWater, sysConWebUrl, sysConKeyWords, sysConWebDescription, sysConWebCopyRight, sysConLogLevel, sysConIsRegister, sysConIsLogin, sysConIsComment, sysConIsAnonymityComment, sysConIsMsg, sysConIsAnonymityMsg, sysIsLocked);
	}

}
