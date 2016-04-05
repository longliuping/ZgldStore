package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YUnitWebApply entity. @author MyEclipse Persistence Tools
 */
public class YUnitWebApply extends AbstractYUnitWebApply implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YUnitWebApply() {
	}

	/** minimal constructor */
	public YUnitWebApply(String unitWebApplyTime) {
		super(unitWebApplyTime);
	}

	/** full constructor */
	public YUnitWebApply(Integer unitSetId, Integer accountActId, String unitWebDnsName, String unitWebApplyIdCard, String unitWebApplyIdCardImg, String unitWebApplyContent, Integer unitWebApplyState, String unitWebApplyStateNote, Integer isDelete, String unitWebApplyTime) {
		super(unitSetId, accountActId, unitWebDnsName, unitWebApplyIdCard, unitWebApplyIdCardImg, unitWebApplyContent, unitWebApplyState, unitWebApplyStateNote, isDelete, unitWebApplyTime);
	}

}
