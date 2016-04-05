package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YMenu entity. @author MyEclipse Persistence Tools
 */
public class YMenu extends AbstractYMenu implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YMenu() {
	}

	/** minimal constructor */
	public YMenu(String meTime) {
		super(meTime);
	}

	/** full constructor */
	public YMenu(Integer meParentId, Integer meClassSetId, Integer accountActId, String meName, String meEnName, String meUrl, Integer meTarget, Integer meOrder, String meDefaultCname, String meOverCname, String meDefaultImg, String meOverImg, String meVisitedImg, Integer isDelete, String meTime) {
		super(meParentId, meClassSetId, accountActId, meName, meEnName, meUrl, meTarget, meOrder, meDefaultCname, meOverCname, meDefaultImg, meOverImg, meVisitedImg, isDelete, meTime);
	}

}
