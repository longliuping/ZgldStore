package com.zgld.mall.beans;

/**
 * YArticleContent entity. @author MyEclipse Persistence Tools
 */
public class YArticleContent extends AbstractYArticleContent implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YArticleContent() {
	}

	/** minimal constructor */
	public YArticleContent(Integer arContentOrder) {
		super(arContentOrder);
	}

	/** full constructor */
	public YArticleContent(Integer arId, String arContent, Integer isDelete, Integer arContentOrder) {
		super(arId, arContent, isDelete, arContentOrder);
	}

}
