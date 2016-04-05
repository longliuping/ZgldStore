package com.zgld.mall.beans;

/**
 * AbstractYGoodsImgs entity provides the base persistence definition of the
 * YGoodsImgs entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYGoodsImgs implements java.io.Serializable {

	// Fields

	private Integer goImgsId;
	private Integer goId;
	private String goImgsUrl;

	// Constructors

	/** default constructor */
	public AbstractYGoodsImgs() {
	}

	/** full constructor */
	public AbstractYGoodsImgs(Integer goId, String goImgsUrl) {
		this.goId = goId;
		this.goImgsUrl = goImgsUrl;
	}

	// Property accessors

	public Integer getGoImgsId() {
		return this.goImgsId;
	}

	public void setGoImgsId(Integer goImgsId) {
		this.goImgsId = goImgsId;
	}

	public Integer getGoId() {
		return this.goId;
	}

	public void setGoId(Integer goId) {
		this.goId = goId;
	}

	public String getGoImgsUrl() {
		return this.goImgsUrl;
	}

	public void setGoImgsUrl(String goImgsUrl) {
		this.goImgsUrl = goImgsUrl;
	}

}