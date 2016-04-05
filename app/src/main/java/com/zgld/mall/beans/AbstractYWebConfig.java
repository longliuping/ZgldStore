package com.zgld.mall.beans;

/**
 * AbstractYWebConfig entity provides the base persistence definition of the
 * YWebConfig entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYWebConfig implements java.io.Serializable {

	// Fields

	private Integer webConId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer webConState;
	private Integer webConAdminState;
	private String webConName;
	private String webConKeyWord;
	private String webConDescription;

	// Constructors

	/** default constructor */
	public AbstractYWebConfig() {
	}

	/** minimal constructor */
	public AbstractYWebConfig(String webConDescription) {
		this.webConDescription = webConDescription;
	}

	/** full constructor */
	public AbstractYWebConfig(Integer unitSetId, Integer accountActId, Integer webConState, Integer webConAdminState, String webConName, String webConKeyWord, String webConDescription) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.webConState = webConState;
		this.webConAdminState = webConAdminState;
		this.webConName = webConName;
		this.webConKeyWord = webConKeyWord;
		this.webConDescription = webConDescription;
	}

	// Property accessors

	public Integer getWebConId() {
		return this.webConId;
	}

	public void setWebConId(Integer webConId) {
		this.webConId = webConId;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getWebConState() {
		return this.webConState;
	}

	public void setWebConState(Integer webConState) {
		this.webConState = webConState;
	}

	public Integer getWebConAdminState() {
		return this.webConAdminState;
	}

	public void setWebConAdminState(Integer webConAdminState) {
		this.webConAdminState = webConAdminState;
	}

	public String getWebConName() {
		return this.webConName;
	}

	public void setWebConName(String webConName) {
		this.webConName = webConName;
	}

	public String getWebConKeyWord() {
		return this.webConKeyWord;
	}

	public void setWebConKeyWord(String webConKeyWord) {
		this.webConKeyWord = webConKeyWord;
	}

	public String getWebConDescription() {
		return this.webConDescription;
	}

	public void setWebConDescription(String webConDescription) {
		this.webConDescription = webConDescription;
	}

}