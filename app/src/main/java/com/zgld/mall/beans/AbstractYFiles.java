package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYFiles entity provides the base persistence definition of the YFiles
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFiles implements java.io.Serializable {

	// Fields

	private Integer fiId;
	private Integer unitSetId;
	private Integer accountActId;
	private String fiName;
	private String fiExtension;
	private String fiTotalBytes;
	private String fiUrl;
	private String fiActUrl;
	private Integer isDelete;
	private String fiTime;

	// Constructors

	/** default constructor */
	public AbstractYFiles() {
	}

	/** minimal constructor */
	public AbstractYFiles(String fiTime) {
		this.fiTime = fiTime;
	}

	/** full constructor */
	public AbstractYFiles(Integer unitSetId, Integer accountActId, String fiName, String fiExtension, String fiTotalBytes, String fiUrl, String fiActUrl, Integer isDelete, String fiTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.fiName = fiName;
		this.fiExtension = fiExtension;
		this.fiTotalBytes = fiTotalBytes;
		this.fiUrl = fiUrl;
		this.fiActUrl = fiActUrl;
		this.isDelete = isDelete;
		this.fiTime = fiTime;
	}

	// Property accessors

	public Integer getFiId() {
		return this.fiId;
	}

	public void setFiId(Integer fiId) {
		this.fiId = fiId;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public String getFiName() {
		return this.fiName;
	}

	public void setFiName(String fiName) {
		this.fiName = fiName;
	}

	public String getFiExtension() {
		return this.fiExtension;
	}

	public void setFiExtension(String fiExtension) {
		this.fiExtension = fiExtension;
	}

	public String getFiTotalBytes() {
		return this.fiTotalBytes;
	}

	public void setFiTotalBytes(String fiTotalBytes) {
		this.fiTotalBytes = fiTotalBytes;
	}

	public String getFiUrl() {
		return this.fiUrl;
	}

	public void setFiUrl(String fiUrl) {
		this.fiUrl = fiUrl;
	}

	public String getFiActUrl() {
		return this.fiActUrl;
	}

	public void setFiActUrl(String fiActUrl) {
		this.fiActUrl = fiActUrl;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getFiTime() {
		return this.fiTime;
	}

	public void setFiTime(String fiTime) {
		this.fiTime = fiTime;
	}

}