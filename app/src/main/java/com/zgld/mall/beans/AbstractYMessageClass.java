package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYMessageClass entity provides the base persistence definition of the
 * YMessageClass entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYMessageClass implements java.io.Serializable {

	// Fields

	private Integer msgClassId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer msgClassSetId;
	private Integer msgParentClassId;
	private String msgClassName;
	private Integer msgClassTotal;
	private Integer msgClassOrder;
	private Integer msgClassTopOrder;
	private String msgClassDefaultImg;
	private String msgClassHoverImg;
	private String msgClassVisitedImg;
	private String msgClassIntro;
	private Integer isDelete;
	private String msgClassTime;

	// Constructors

	/** default constructor */
	public AbstractYMessageClass() {
	}

	/** minimal constructor */
	public AbstractYMessageClass(String msgClassTime) {
		this.msgClassTime = msgClassTime;
	}

	/** full constructor */
	public AbstractYMessageClass(Integer unitSetId, Integer accountActId, Integer msgClassSetId, Integer msgParentClassId, String msgClassName, Integer msgClassTotal, Integer msgClassOrder, Integer msgClassTopOrder, String msgClassDefaultImg, String msgClassHoverImg, String msgClassVisitedImg, String msgClassIntro, Integer isDelete, String msgClassTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.msgClassSetId = msgClassSetId;
		this.msgParentClassId = msgParentClassId;
		this.msgClassName = msgClassName;
		this.msgClassTotal = msgClassTotal;
		this.msgClassOrder = msgClassOrder;
		this.msgClassTopOrder = msgClassTopOrder;
		this.msgClassDefaultImg = msgClassDefaultImg;
		this.msgClassHoverImg = msgClassHoverImg;
		this.msgClassVisitedImg = msgClassVisitedImg;
		this.msgClassIntro = msgClassIntro;
		this.isDelete = isDelete;
		this.msgClassTime = msgClassTime;
	}

	// Property accessors

	public Integer getMsgClassId() {
		return this.msgClassId;
	}

	public void setMsgClassId(Integer msgClassId) {
		this.msgClassId = msgClassId;
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

	public Integer getMsgClassSetId() {
		return this.msgClassSetId;
	}

	public void setMsgClassSetId(Integer msgClassSetId) {
		this.msgClassSetId = msgClassSetId;
	}

	public Integer getMsgParentClassId() {
		return this.msgParentClassId;
	}

	public void setMsgParentClassId(Integer msgParentClassId) {
		this.msgParentClassId = msgParentClassId;
	}

	public String getMsgClassName() {
		return this.msgClassName;
	}

	public void setMsgClassName(String msgClassName) {
		this.msgClassName = msgClassName;
	}

	public Integer getMsgClassTotal() {
		return this.msgClassTotal;
	}

	public void setMsgClassTotal(Integer msgClassTotal) {
		this.msgClassTotal = msgClassTotal;
	}

	public Integer getMsgClassOrder() {
		return this.msgClassOrder;
	}

	public void setMsgClassOrder(Integer msgClassOrder) {
		this.msgClassOrder = msgClassOrder;
	}

	public Integer getMsgClassTopOrder() {
		return this.msgClassTopOrder;
	}

	public void setMsgClassTopOrder(Integer msgClassTopOrder) {
		this.msgClassTopOrder = msgClassTopOrder;
	}

	public String getMsgClassDefaultImg() {
		return this.msgClassDefaultImg;
	}

	public void setMsgClassDefaultImg(String msgClassDefaultImg) {
		this.msgClassDefaultImg = msgClassDefaultImg;
	}

	public String getMsgClassHoverImg() {
		return this.msgClassHoverImg;
	}

	public void setMsgClassHoverImg(String msgClassHoverImg) {
		this.msgClassHoverImg = msgClassHoverImg;
	}

	public String getMsgClassVisitedImg() {
		return this.msgClassVisitedImg;
	}

	public void setMsgClassVisitedImg(String msgClassVisitedImg) {
		this.msgClassVisitedImg = msgClassVisitedImg;
	}

	public String getMsgClassIntro() {
		return this.msgClassIntro;
	}

	public void setMsgClassIntro(String msgClassIntro) {
		this.msgClassIntro = msgClassIntro;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getMsgClassTime() {
		return this.msgClassTime;
	}

	public void setMsgClassTime(String msgClassTime) {
		this.msgClassTime = msgClassTime;
	}

}