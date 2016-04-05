package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YGoods entity. @author MyEclipse Persistence Tools
 */
public class YGoods extends AbstractYGoods implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YGoods() {
	}

	/** minimal constructor */
	public YGoods(Double goSalePrice, String goTime) {
		super(goSalePrice, goTime);
	}

	/** full constructor */
	public YGoods(Integer unitSetId, Integer accountActId, Integer shipId, Integer goClassSetId, Integer goBrandSetId, String goName, String goKeywords, String goIntro, String goDetail, String goMobileDetail, String goNumber, Integer goSellCount, Integer goCount, Integer goHits, Double goBidPrice, Double goSalePrice, String goThumb, Integer goFreeShipping, Integer goIsNew, Integer goIsHot, Integer goIsState, Integer goIsPromote, Integer goOrder, Integer goTopOrder, Integer isDelete, String goTime) {
		super(unitSetId, accountActId, shipId, goClassSetId, goBrandSetId, goName, goKeywords, goIntro, goDetail, goMobileDetail, goNumber, goSellCount, goCount, goHits, goBidPrice, goSalePrice, goThumb, goFreeShipping, goIsNew, goIsHot, goIsState, goIsPromote, goOrder, goTopOrder, isDelete, goTime);
	}

}
