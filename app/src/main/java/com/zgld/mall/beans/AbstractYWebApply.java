package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYWebApply entity provides the base persistence definition of the
 * YWebApply entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYWebApply implements java.io.Serializable {

	// Fields

	private Integer webApplyId;
	private Integer unitSetId;
	private Integer accountActId;
	private String webDnsName;
	private String webApplyIdCard;
	private String webApplyIdCardImg;
	private String webApplyContent;
	private Integer webApplyState;
	private String webApplyStateNote;
	private Integer isDelete;
	private String webApplyTime;

	// Constructors

	/** default constructor */
	public AbstractYWebApply() {
	}

	/** minimal constructor */
	public AbstractYWebApply(String webApplyTime) {
		this.webApplyTime = webApplyTime;
	}

	/** full constructor */
	public AbstractYWebApply(Integer unitSetId, Integer accountActId, String webDnsName, String webApplyIdCard, String webApplyIdCardImg, String webApplyContent, Integer webApplyState, String webApplyStateNote, Integer isDelete, String webApplyTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.webDnsName = webDnsName;
		this.webApplyIdCard = webApplyIdCard;
		this.webApplyIdCardImg = webApplyIdCardImg;
		this.webApplyContent = webApplyContent;
		this.webApplyState = webApplyState;
		this.webApplyStateNote = webApplyStateNote;
		this.isDelete = isDelete;
		this.webApplyTime = webApplyTime;
	}

	// Property accessors

	public Integer getWebApplyId() {
		return this.webApplyId;
	}

	public void setWebApplyId(Integer webApplyId) {
		this.webApplyId = webApplyId;
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

	public String getWebDnsName() {
		return this.webDnsName;
	}

	public void setWebDnsName(String webDnsName) {
		this.webDnsName = webDnsName;
	}

	public String getWebApplyIdCard() {
		return this.webApplyIdCard;
	}

	public void setWebApplyIdCard(String webApplyIdCard) {
		this.webApplyIdCard = webApplyIdCard;
	}

	public String getWebApplyIdCardImg() {
		return this.webApplyIdCardImg;
	}

	public void setWebApplyIdCardImg(String webApplyIdCardImg) {
		this.webApplyIdCardImg = webApplyIdCardImg;
	}

	public String getWebApplyContent() {
		return this.webApplyContent;
	}

	public void setWebApplyContent(String webApplyContent) {
		this.webApplyContent = webApplyContent;
	}

	public Integer getWebApplyState() {
		return this.webApplyState;
	}

	public void setWebApplyState(Integer webApplyState) {
		this.webApplyState = webApplyState;
	}

	public String getWebApplyStateNote() {
		return this.webApplyStateNote;
	}

	public void setWebApplyStateNote(String webApplyStateNote) {
		this.webApplyStateNote = webApplyStateNote;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getWebApplyTime() {
		return this.webApplyTime;
	}

	public void setWebApplyTime(String webApplyTime) {
		this.webApplyTime = webApplyTime;
	}

}