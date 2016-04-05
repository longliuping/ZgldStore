package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYArticleSpecial entity provides the base persistence definition of
 * the YArticleSpecial entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYArticleSpecial implements java.io.Serializable {

	// Fields

	private Integer arSpecialId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer arSpecialSetId;
	private Integer arParentSpecialId;
	private String arSpecialName;
	private Integer arSpecialTotal;
	private Integer arSpecialOrder;
	private Integer arSpecialTopOrder;
	private Integer isDelete;
	private String arSpecialTime;

	// Constructors

	/** default constructor */
	public AbstractYArticleSpecial() {
	}

	/** minimal constructor */
	public AbstractYArticleSpecial(String arSpecialTime) {
		this.arSpecialTime = arSpecialTime;
	}

	/** full constructor */
	public AbstractYArticleSpecial(Integer unitSetId, Integer accountActId, Integer arSpecialSetId, Integer arParentSpecialId, String arSpecialName, Integer arSpecialTotal, Integer arSpecialOrder, Integer arSpecialTopOrder, Integer isDelete, String arSpecialTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.arSpecialSetId = arSpecialSetId;
		this.arParentSpecialId = arParentSpecialId;
		this.arSpecialName = arSpecialName;
		this.arSpecialTotal = arSpecialTotal;
		this.arSpecialOrder = arSpecialOrder;
		this.arSpecialTopOrder = arSpecialTopOrder;
		this.isDelete = isDelete;
		this.arSpecialTime = arSpecialTime;
	}

	// Property accessors

	public Integer getArSpecialId() {
		return this.arSpecialId;
	}

	public void setArSpecialId(Integer arSpecialId) {
		this.arSpecialId = arSpecialId;
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

	public Integer getArSpecialSetId() {
		return this.arSpecialSetId;
	}

	public void setArSpecialSetId(Integer arSpecialSetId) {
		this.arSpecialSetId = arSpecialSetId;
	}

	public Integer getArParentSpecialId() {
		return this.arParentSpecialId;
	}

	public void setArParentSpecialId(Integer arParentSpecialId) {
		this.arParentSpecialId = arParentSpecialId;
	}

	public String getArSpecialName() {
		return this.arSpecialName;
	}

	public void setArSpecialName(String arSpecialName) {
		this.arSpecialName = arSpecialName;
	}

	public Integer getArSpecialTotal() {
		return this.arSpecialTotal;
	}

	public void setArSpecialTotal(Integer arSpecialTotal) {
		this.arSpecialTotal = arSpecialTotal;
	}

	public Integer getArSpecialOrder() {
		return this.arSpecialOrder;
	}

	public void setArSpecialOrder(Integer arSpecialOrder) {
		this.arSpecialOrder = arSpecialOrder;
	}

	public Integer getArSpecialTopOrder() {
		return this.arSpecialTopOrder;
	}

	public void setArSpecialTopOrder(Integer arSpecialTopOrder) {
		this.arSpecialTopOrder = arSpecialTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getArSpecialTime() {
		return this.arSpecialTime;
	}

	public void setArSpecialTime(String arSpecialTime) {
		this.arSpecialTime = arSpecialTime;
	}

}