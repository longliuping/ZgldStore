package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YGoodsCollect entity. @author MyEclipse Persistence Tools
 */
public class YGoodsCollect extends AbstractYGoodsCollect implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YGoodsCollect() {
	}

	/** minimal constructor */
	public YGoodsCollect(String goCollectTime) {
		super(goCollectTime);
	}

	/** full constructor */
	public YGoodsCollect(Integer accountActId, Integer goId, String goCollectTime) {
		super(accountActId, goId, goCollectTime);
	}

}
