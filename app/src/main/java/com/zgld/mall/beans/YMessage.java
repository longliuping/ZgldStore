package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YMessage entity. @author MyEclipse Persistence Tools
 */
public class YMessage extends AbstractYMessage implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YMessage() {
	}

	/** minimal constructor */
	public YMessage(String msgReTime) {
		super(msgReTime);
	}

	/** full constructor */
	public YMessage(Integer msgClassSetId, Integer accountId, Integer unitSetId, Integer accountActId, Integer msgState, Integer msgAdminState, Integer msgIsOpen, Integer msgIsNoName, String msgTitle, String msgContent, Integer msgReplyState, Integer msgScanState, String msgTime, String msgReContent, Integer msgOrder, Integer msgTopOrder, Integer isDelete, String msgReTime) {
		super(msgClassSetId, accountId, unitSetId, accountActId, msgState, msgAdminState, msgIsOpen, msgIsNoName, msgTitle, msgContent, msgReplyState, msgScanState, msgTime, msgReContent, msgOrder, msgTopOrder, isDelete, msgReTime);
	}

}
