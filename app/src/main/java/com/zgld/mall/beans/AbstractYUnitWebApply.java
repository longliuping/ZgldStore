package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYUnitWebApply entity provides the base persistence definition of the
 * YUnitWebApply entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYUnitWebApply implements java.io.Serializable {

	// Fields

	private Integer unitWebApplyId;
	private Integer unitSetId;
	private Integer accountActId;
	private String unitWebDnsName;
	private String unitWebApplyIdCard;
	private String unitWebApplyIdCardImg;
	private String unitWebApplyContent;
	private Integer unitWebApplyState;
	private String unitWebApplyStateNote;
	private Integer isDelete;
	private String unitWebApplyTime;

	// Constructors

	/** default constructor */
	public AbstractYUnitWebApply() {
	}

	/** minimal constructor */
	public AbstractYUnitWebApply(String unitWebApplyTime) {
		this.unitWebApplyTime = unitWebApplyTime;
	}

	/** full constructor */
	public AbstractYUnitWebApply(Integer unitSetId, Integer accountActId, String unitWebDnsName, String unitWebApplyIdCard, String unitWebApplyIdCardImg, String unitWebApplyContent, Integer unitWebApplyState, String unitWebApplyStateNote, Integer isDelete, String unitWebApplyTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.unitWebDnsName = unitWebDnsName;
		this.unitWebApplyIdCard = unitWebApplyIdCard;
		this.unitWebApplyIdCardImg = unitWebApplyIdCardImg;
		this.unitWebApplyContent = unitWebApplyContent;
		this.unitWebApplyState = unitWebApplyState;
		this.unitWebApplyStateNote = unitWebApplyStateNote;
		this.isDelete = isDelete;
		this.unitWebApplyTime = unitWebApplyTime;
	}

	// Property accessors

	public Integer getUnitWebApplyId() {
		return this.unitWebApplyId;
	}

	public void setUnitWebApplyId(Integer unitWebApplyId) {
		this.unitWebApplyId = unitWebApplyId;
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

	public String getUnitWebDnsName() {
		return this.unitWebDnsName;
	}

	public void setUnitWebDnsName(String unitWebDnsName) {
		this.unitWebDnsName = unitWebDnsName;
	}

	public String getUnitWebApplyIdCard() {
		return this.unitWebApplyIdCard;
	}

	public void setUnitWebApplyIdCard(String unitWebApplyIdCard) {
		this.unitWebApplyIdCard = unitWebApplyIdCard;
	}

	public String getUnitWebApplyIdCardImg() {
		return this.unitWebApplyIdCardImg;
	}

	public void setUnitWebApplyIdCardImg(String unitWebApplyIdCardImg) {
		this.unitWebApplyIdCardImg = unitWebApplyIdCardImg;
	}

	public String getUnitWebApplyContent() {
		return this.unitWebApplyContent;
	}

	public void setUnitWebApplyContent(String unitWebApplyContent) {
		this.unitWebApplyContent = unitWebApplyContent;
	}

	public Integer getUnitWebApplyState() {
		return this.unitWebApplyState;
	}

	public void setUnitWebApplyState(Integer unitWebApplyState) {
		this.unitWebApplyState = unitWebApplyState;
	}

	public String getUnitWebApplyStateNote() {
		return this.unitWebApplyStateNote;
	}

	public void setUnitWebApplyStateNote(String unitWebApplyStateNote) {
		this.unitWebApplyStateNote = unitWebApplyStateNote;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getUnitWebApplyTime() {
		return this.unitWebApplyTime;
	}

	public void setUnitWebApplyTime(String unitWebApplyTime) {
		this.unitWebApplyTime = unitWebApplyTime;
	}

}