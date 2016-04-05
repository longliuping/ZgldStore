package com.zgld.mall.beans;

/**
 * AbstractYInfoConfig entity provides the base persistence definition of the
 * YInfoConfig entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYInfoConfig implements java.io.Serializable {

	// Fields

	private Integer sysInfoId;
	private String sysInfoWelMsg;
	private String sysInfoLogoImg;
	private String sysInfoIcoImg;
	private String sysInfoCellPhone;
	private String sysInfoMobilePhone;
	private String sysInfoEmail;
	private String sysInfoAddress;
	private String sysInfoQq;
	private String sysInfoQqGroup;
	private String sysInfoWeChat;
	private String sysInfoWeChatImg;
	private String sysInfoSinaWeibo;
	private String sysInfoSinaWeiboImg;
	private String sysInfoQqWeibo;
	private String sysInfoQqWeiboImg;
	private String sysInfoRenRen;
	private String sysInfoRenRenImg;
	private String sysInfoName;
	private String sysInfoAim;
	private String sysInfoIdea;
	private String sysInfoWebQrCode;

	// Constructors

	/** default constructor */
	public AbstractYInfoConfig() {
	}

	/** minimal constructor */
	public AbstractYInfoConfig(String sysInfoWebQrCode) {
		this.sysInfoWebQrCode = sysInfoWebQrCode;
	}

	/** full constructor */
	public AbstractYInfoConfig(String sysInfoWelMsg, String sysInfoLogoImg, String sysInfoIcoImg, String sysInfoCellPhone, String sysInfoMobilePhone, String sysInfoEmail, String sysInfoAddress, String sysInfoQq, String sysInfoQqGroup, String sysInfoWeChat, String sysInfoWeChatImg, String sysInfoSinaWeibo, String sysInfoSinaWeiboImg, String sysInfoQqWeibo, String sysInfoQqWeiboImg, String sysInfoRenRen, String sysInfoRenRenImg, String sysInfoName, String sysInfoAim, String sysInfoIdea, String sysInfoWebQrCode) {
		this.sysInfoWelMsg = sysInfoWelMsg;
		this.sysInfoLogoImg = sysInfoLogoImg;
		this.sysInfoIcoImg = sysInfoIcoImg;
		this.sysInfoCellPhone = sysInfoCellPhone;
		this.sysInfoMobilePhone = sysInfoMobilePhone;
		this.sysInfoEmail = sysInfoEmail;
		this.sysInfoAddress = sysInfoAddress;
		this.sysInfoQq = sysInfoQq;
		this.sysInfoQqGroup = sysInfoQqGroup;
		this.sysInfoWeChat = sysInfoWeChat;
		this.sysInfoWeChatImg = sysInfoWeChatImg;
		this.sysInfoSinaWeibo = sysInfoSinaWeibo;
		this.sysInfoSinaWeiboImg = sysInfoSinaWeiboImg;
		this.sysInfoQqWeibo = sysInfoQqWeibo;
		this.sysInfoQqWeiboImg = sysInfoQqWeiboImg;
		this.sysInfoRenRen = sysInfoRenRen;
		this.sysInfoRenRenImg = sysInfoRenRenImg;
		this.sysInfoName = sysInfoName;
		this.sysInfoAim = sysInfoAim;
		this.sysInfoIdea = sysInfoIdea;
		this.sysInfoWebQrCode = sysInfoWebQrCode;
	}

	// Property accessors

	public Integer getSysInfoId() {
		return this.sysInfoId;
	}

	public void setSysInfoId(Integer sysInfoId) {
		this.sysInfoId = sysInfoId;
	}

	public String getSysInfoWelMsg() {
		return this.sysInfoWelMsg;
	}

	public void setSysInfoWelMsg(String sysInfoWelMsg) {
		this.sysInfoWelMsg = sysInfoWelMsg;
	}

	public String getSysInfoLogoImg() {
		return this.sysInfoLogoImg;
	}

	public void setSysInfoLogoImg(String sysInfoLogoImg) {
		this.sysInfoLogoImg = sysInfoLogoImg;
	}

	public String getSysInfoIcoImg() {
		return this.sysInfoIcoImg;
	}

	public void setSysInfoIcoImg(String sysInfoIcoImg) {
		this.sysInfoIcoImg = sysInfoIcoImg;
	}

	public String getSysInfoCellPhone() {
		return this.sysInfoCellPhone;
	}

	public void setSysInfoCellPhone(String sysInfoCellPhone) {
		this.sysInfoCellPhone = sysInfoCellPhone;
	}

	public String getSysInfoMobilePhone() {
		return this.sysInfoMobilePhone;
	}

	public void setSysInfoMobilePhone(String sysInfoMobilePhone) {
		this.sysInfoMobilePhone = sysInfoMobilePhone;
	}

	public String getSysInfoEmail() {
		return this.sysInfoEmail;
	}

	public void setSysInfoEmail(String sysInfoEmail) {
		this.sysInfoEmail = sysInfoEmail;
	}

	public String getSysInfoAddress() {
		return this.sysInfoAddress;
	}

	public void setSysInfoAddress(String sysInfoAddress) {
		this.sysInfoAddress = sysInfoAddress;
	}

	public String getSysInfoQq() {
		return this.sysInfoQq;
	}

	public void setSysInfoQq(String sysInfoQq) {
		this.sysInfoQq = sysInfoQq;
	}

	public String getSysInfoQqGroup() {
		return this.sysInfoQqGroup;
	}

	public void setSysInfoQqGroup(String sysInfoQqGroup) {
		this.sysInfoQqGroup = sysInfoQqGroup;
	}

	public String getSysInfoWeChat() {
		return this.sysInfoWeChat;
	}

	public void setSysInfoWeChat(String sysInfoWeChat) {
		this.sysInfoWeChat = sysInfoWeChat;
	}

	public String getSysInfoWeChatImg() {
		return this.sysInfoWeChatImg;
	}

	public void setSysInfoWeChatImg(String sysInfoWeChatImg) {
		this.sysInfoWeChatImg = sysInfoWeChatImg;
	}

	public String getSysInfoSinaWeibo() {
		return this.sysInfoSinaWeibo;
	}

	public void setSysInfoSinaWeibo(String sysInfoSinaWeibo) {
		this.sysInfoSinaWeibo = sysInfoSinaWeibo;
	}

	public String getSysInfoSinaWeiboImg() {
		return this.sysInfoSinaWeiboImg;
	}

	public void setSysInfoSinaWeiboImg(String sysInfoSinaWeiboImg) {
		this.sysInfoSinaWeiboImg = sysInfoSinaWeiboImg;
	}

	public String getSysInfoQqWeibo() {
		return this.sysInfoQqWeibo;
	}

	public void setSysInfoQqWeibo(String sysInfoQqWeibo) {
		this.sysInfoQqWeibo = sysInfoQqWeibo;
	}

	public String getSysInfoQqWeiboImg() {
		return this.sysInfoQqWeiboImg;
	}

	public void setSysInfoQqWeiboImg(String sysInfoQqWeiboImg) {
		this.sysInfoQqWeiboImg = sysInfoQqWeiboImg;
	}

	public String getSysInfoRenRen() {
		return this.sysInfoRenRen;
	}

	public void setSysInfoRenRen(String sysInfoRenRen) {
		this.sysInfoRenRen = sysInfoRenRen;
	}

	public String getSysInfoRenRenImg() {
		return this.sysInfoRenRenImg;
	}

	public void setSysInfoRenRenImg(String sysInfoRenRenImg) {
		this.sysInfoRenRenImg = sysInfoRenRenImg;
	}

	public String getSysInfoName() {
		return this.sysInfoName;
	}

	public void setSysInfoName(String sysInfoName) {
		this.sysInfoName = sysInfoName;
	}

	public String getSysInfoAim() {
		return this.sysInfoAim;
	}

	public void setSysInfoAim(String sysInfoAim) {
		this.sysInfoAim = sysInfoAim;
	}

	public String getSysInfoIdea() {
		return this.sysInfoIdea;
	}

	public void setSysInfoIdea(String sysInfoIdea) {
		this.sysInfoIdea = sysInfoIdea;
	}

	public String getSysInfoWebQrCode() {
		return this.sysInfoWebQrCode;
	}

	public void setSysInfoWebQrCode(String sysInfoWebQrCode) {
		this.sysInfoWebQrCode = sysInfoWebQrCode;
	}

}