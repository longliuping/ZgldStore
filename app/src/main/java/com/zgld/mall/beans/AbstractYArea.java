package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYArea entity provides the base persistence definition of the YArea
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYArea implements java.io.Serializable {

	// Fields

	private Integer areaId;
	private Integer areaParentId;
	private String areaName;
	private String areaCode;
	private Integer areaLevel;
	private Integer areaOrder;
	private String areaX;
	private String areaY;
	private Integer accountActId;
	private Integer isDelete;
	private String areaTime;

	// Constructors

	/** default constructor */
	public AbstractYArea() {
	}

	/** minimal constructor */
	public AbstractYArea(String areaTime) {
		this.areaTime = areaTime;
	}

	/** full constructor */
	public AbstractYArea(Integer areaParentId, String areaName, String areaCode, Integer areaLevel, Integer areaOrder, String areaX, String areaY, Integer accountActId, Integer isDelete, String areaTime) {
		this.areaParentId = areaParentId;
		this.areaName = areaName;
		this.areaCode = areaCode;
		this.areaLevel = areaLevel;
		this.areaOrder = areaOrder;
		this.areaX = areaX;
		this.areaY = areaY;
		this.accountActId = accountActId;
		this.isDelete = isDelete;
		this.areaTime = areaTime;
	}

	// Property accessors

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getAreaParentId() {
		return this.areaParentId;
	}

	public void setAreaParentId(Integer areaParentId) {
		this.areaParentId = areaParentId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public Integer getAreaLevel() {
		return this.areaLevel;
	}

	public void setAreaLevel(Integer areaLevel) {
		this.areaLevel = areaLevel;
	}

	public Integer getAreaOrder() {
		return this.areaOrder;
	}

	public void setAreaOrder(Integer areaOrder) {
		this.areaOrder = areaOrder;
	}

	public String getAreaX() {
		return this.areaX;
	}

	public void setAreaX(String areaX) {
		this.areaX = areaX;
	}

	public String getAreaY() {
		return this.areaY;
	}

	public void setAreaY(String areaY) {
		this.areaY = areaY;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getAreaTime() {
		return this.areaTime;
	}

	public void setAreaTime(String areaTime) {
		this.areaTime = areaTime;
	}

}