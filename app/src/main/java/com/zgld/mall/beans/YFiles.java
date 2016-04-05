package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YFiles entity. @author MyEclipse Persistence Tools
 */
public class YFiles extends AbstractYFiles implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YFiles() {
	}

	/** minimal constructor */
	public YFiles(String fiTime) {
		super(fiTime);
	}

	/** full constructor */
	public YFiles(Integer unitSetId, Integer accountActId, String fiName, String fiExtension, String fiTotalBytes, String fiUrl, String fiActUrl, Integer isDelete, String fiTime) {
		super(unitSetId, accountActId, fiName, fiExtension, fiTotalBytes, fiUrl, fiActUrl, isDelete, fiTime);
	}

}
