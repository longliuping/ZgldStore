package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YWebApply entity. @author MyEclipse Persistence Tools
 */
public class YWebApply extends AbstractYWebApply implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YWebApply() {
	}

	/** minimal constructor */
	public YWebApply(String webApplyTime) {
		super(webApplyTime);
	}

	/** full constructor */
	public YWebApply(Integer unitSetId, Integer accountActId, String webDnsName, String webApplyIdCard, String webApplyIdCardImg, String webApplyContent, Integer webApplyState, String webApplyStateNote, Integer isDelete, String webApplyTime) {
		super(unitSetId, accountActId, webDnsName, webApplyIdCard, webApplyIdCardImg, webApplyContent, webApplyState, webApplyStateNote, isDelete, webApplyTime);
	}

}
