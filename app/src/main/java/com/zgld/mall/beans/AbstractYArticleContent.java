package com.zgld.mall.beans;

/**
 * AbstractYArticleContent entity provides the base persistence definition of
 * the YArticleContent entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYArticleContent implements java.io.Serializable {

	// Fields

	private Integer arContentId;
	private Integer arId;
	private String arContent;
	private Integer isDelete;
	private Integer arContentOrder;

	// Constructors

	/** default constructor */
	public AbstractYArticleContent() {
	}

	/** minimal constructor */
	public AbstractYArticleContent(Integer arContentOrder) {
		this.arContentOrder = arContentOrder;
	}

	/** full constructor */
	public AbstractYArticleContent(Integer arId, String arContent, Integer isDelete, Integer arContentOrder) {
		this.arId = arId;
		this.arContent = arContent;
		this.isDelete = isDelete;
		this.arContentOrder = arContentOrder;
	}

	// Property accessors

	public Integer getArContentId() {
		return this.arContentId;
	}

	public void setArContentId(Integer arContentId) {
		this.arContentId = arContentId;
	}

	public Integer getArId() {
		return this.arId;
	}

	public void setArId(Integer arId) {
		this.arId = arId;
	}

	public String getArContent() {
		return this.arContent;
	}

	public void setArContent(String arContent) {
		this.arContent = arContent;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getArContentOrder() {
		return this.arContentOrder;
	}

	public void setArContentOrder(Integer arContentOrder) {
		this.arContentOrder = arContentOrder;
	}

}