package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYChatGroup entity provides the base persistence definition of the
 * YChatGroup entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYChatGroup implements java.io.Serializable {

	// Fields

	private Integer chatGroupId;
	private Integer accountActId;
	private String chatGroupName;
	private Integer chatGroupTotal;
	private Integer chatGroupOrder;
	private Integer chatGroupTopOrder;
	private String chatGroupDefaultImg;
	private String chatGroupHoverImg;
	private String chatGroupVisitedImg;
	private String chatGroupIntro;
	private Integer isDelete;
	private String chatGroupTime;

	// Constructors

	/** default constructor */
	public AbstractYChatGroup() {
	}

	/** minimal constructor */
	public AbstractYChatGroup(String chatGroupTime) {
		this.chatGroupTime = chatGroupTime;
	}

	/** full constructor */
	public AbstractYChatGroup(Integer accountActId, String chatGroupName, Integer chatGroupTotal, Integer chatGroupOrder, Integer chatGroupTopOrder, String chatGroupDefaultImg, String chatGroupHoverImg, String chatGroupVisitedImg, String chatGroupIntro, Integer isDelete, String chatGroupTime) {
		this.accountActId = accountActId;
		this.chatGroupName = chatGroupName;
		this.chatGroupTotal = chatGroupTotal;
		this.chatGroupOrder = chatGroupOrder;
		this.chatGroupTopOrder = chatGroupTopOrder;
		this.chatGroupDefaultImg = chatGroupDefaultImg;
		this.chatGroupHoverImg = chatGroupHoverImg;
		this.chatGroupVisitedImg = chatGroupVisitedImg;
		this.chatGroupIntro = chatGroupIntro;
		this.isDelete = isDelete;
		this.chatGroupTime = chatGroupTime;
	}

	// Property accessors

	public Integer getChatGroupId() {
		return this.chatGroupId;
	}

	public void setChatGroupId(Integer chatGroupId) {
		this.chatGroupId = chatGroupId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public String getChatGroupName() {
		return this.chatGroupName;
	}

	public void setChatGroupName(String chatGroupName) {
		this.chatGroupName = chatGroupName;
	}

	public Integer getChatGroupTotal() {
		return this.chatGroupTotal;
	}

	public void setChatGroupTotal(Integer chatGroupTotal) {
		this.chatGroupTotal = chatGroupTotal;
	}

	public Integer getChatGroupOrder() {
		return this.chatGroupOrder;
	}

	public void setChatGroupOrder(Integer chatGroupOrder) {
		this.chatGroupOrder = chatGroupOrder;
	}

	public Integer getChatGroupTopOrder() {
		return this.chatGroupTopOrder;
	}

	public void setChatGroupTopOrder(Integer chatGroupTopOrder) {
		this.chatGroupTopOrder = chatGroupTopOrder;
	}

	public String getChatGroupDefaultImg() {
		return this.chatGroupDefaultImg;
	}

	public void setChatGroupDefaultImg(String chatGroupDefaultImg) {
		this.chatGroupDefaultImg = chatGroupDefaultImg;
	}

	public String getChatGroupHoverImg() {
		return this.chatGroupHoverImg;
	}

	public void setChatGroupHoverImg(String chatGroupHoverImg) {
		this.chatGroupHoverImg = chatGroupHoverImg;
	}

	public String getChatGroupVisitedImg() {
		return this.chatGroupVisitedImg;
	}

	public void setChatGroupVisitedImg(String chatGroupVisitedImg) {
		this.chatGroupVisitedImg = chatGroupVisitedImg;
	}

	public String getChatGroupIntro() {
		return this.chatGroupIntro;
	}

	public void setChatGroupIntro(String chatGroupIntro) {
		this.chatGroupIntro = chatGroupIntro;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getChatGroupTime() {
		return this.chatGroupTime;
	}

	public void setChatGroupTime(String chatGroupTime) {
		this.chatGroupTime = chatGroupTime;
	}

}