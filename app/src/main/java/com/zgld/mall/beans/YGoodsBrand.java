package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YGoodsBrand entity. @author MyEclipse Persistence Tools
 */
public class YGoodsBrand extends AbstractYGoodsBrand implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YGoodsBrand() {
	}

	/** minimal constructor */
	public YGoodsBrand(String goBrandTime) {
		super(goBrandTime);
	}

	/** full constructor */
	public YGoodsBrand(Integer goParentBrandId, Integer goBrandSetId, String goBrandName, String goBrandIntro, Integer goBrandTotal, Integer unitSetId, Integer accountActId, Integer goBrandOrder, Integer goBrandTopOrder, String goBrandDefaultImg, String goBrandHoverImg, String goBrandVisitedImg, Integer isDelete, String goBrandTime) {
		super(goParentBrandId, goBrandSetId, goBrandName, goBrandIntro, goBrandTotal, unitSetId, accountActId, goBrandOrder, goBrandTopOrder, goBrandDefaultImg, goBrandHoverImg, goBrandVisitedImg, isDelete, goBrandTime);
	}

}
