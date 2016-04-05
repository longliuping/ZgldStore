package com.zgld.mall.beans;

/**
 * AbstractYSystemConfig entity provides the base persistence definition of the
 * YSystemConfig entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYSystemConfig implements java.io.Serializable {

	// Fields

	private Integer sysConId;
	private Integer sysConState;
	private String sysConName;
	private String sysConImgWater;
	private String sysConTextWater;
	private String sysConWebUrl;
	private String sysConKeyWords;
	private String sysConWebDescription;
	private String sysConWebCopyRight;
	private Integer sysConLogLevel;
	private Integer sysConIsRegister;
	private Integer sysConIsLogin;
	private Integer sysConIsComment;
	private Integer sysConIsAnonymityComment;
	private Integer sysConIsMsg;
	private Integer sysConIsAnonymityMsg;
	private Integer sysIsLocked;

	// Constructors

	/** default constructor */
	public AbstractYSystemConfig() {
	}

	/** full constructor */
	public AbstractYSystemConfig(Integer sysConState, String sysConName, String sysConImgWater, String sysConTextWater, String sysConWebUrl, String sysConKeyWords, String sysConWebDescription, String sysConWebCopyRight, Integer sysConLogLevel, Integer sysConIsRegister, Integer sysConIsLogin, Integer sysConIsComment, Integer sysConIsAnonymityComment, Integer sysConIsMsg, Integer sysConIsAnonymityMsg, Integer sysIsLocked) {
		this.sysConState = sysConState;
		this.sysConName = sysConName;
		this.sysConImgWater = sysConImgWater;
		this.sysConTextWater = sysConTextWater;
		this.sysConWebUrl = sysConWebUrl;
		this.sysConKeyWords = sysConKeyWords;
		this.sysConWebDescription = sysConWebDescription;
		this.sysConWebCopyRight = sysConWebCopyRight;
		this.sysConLogLevel = sysConLogLevel;
		this.sysConIsRegister = sysConIsRegister;
		this.sysConIsLogin = sysConIsLogin;
		this.sysConIsComment = sysConIsComment;
		this.sysConIsAnonymityComment = sysConIsAnonymityComment;
		this.sysConIsMsg = sysConIsMsg;
		this.sysConIsAnonymityMsg = sysConIsAnonymityMsg;
		this.sysIsLocked = sysIsLocked;
	}

	// Property accessors

	public Integer getSysConId() {
		return this.sysConId;
	}

	public void setSysConId(Integer sysConId) {
		this.sysConId = sysConId;
	}

	public Integer getSysConState() {
		return this.sysConState;
	}

	public void setSysConState(Integer sysConState) {
		this.sysConState = sysConState;
	}

	public String getSysConName() {
		return this.sysConName;
	}

	public void setSysConName(String sysConName) {
		this.sysConName = sysConName;
	}

	public String getSysConImgWater() {
		return this.sysConImgWater;
	}

	public void setSysConImgWater(String sysConImgWater) {
		this.sysConImgWater = sysConImgWater;
	}

	public String getSysConTextWater() {
		return this.sysConTextWater;
	}

	public void setSysConTextWater(String sysConTextWater) {
		this.sysConTextWater = sysConTextWater;
	}

	public String getSysConWebUrl() {
		return this.sysConWebUrl;
	}

	public void setSysConWebUrl(String sysConWebUrl) {
		this.sysConWebUrl = sysConWebUrl;
	}

	public String getSysConKeyWords() {
		return this.sysConKeyWords;
	}

	public void setSysConKeyWords(String sysConKeyWords) {
		this.sysConKeyWords = sysConKeyWords;
	}

	public String getSysConWebDescription() {
		return this.sysConWebDescription;
	}

	public void setSysConWebDescription(String sysConWebDescription) {
		this.sysConWebDescription = sysConWebDescription;
	}

	public String getSysConWebCopyRight() {
		return this.sysConWebCopyRight;
	}

	public void setSysConWebCopyRight(String sysConWebCopyRight) {
		this.sysConWebCopyRight = sysConWebCopyRight;
	}

	public Integer getSysConLogLevel() {
		return this.sysConLogLevel;
	}

	public void setSysConLogLevel(Integer sysConLogLevel) {
		this.sysConLogLevel = sysConLogLevel;
	}

	public Integer getSysConIsRegister() {
		return this.sysConIsRegister;
	}

	public void setSysConIsRegister(Integer sysConIsRegister) {
		this.sysConIsRegister = sysConIsRegister;
	}

	public Integer getSysConIsLogin() {
		return this.sysConIsLogin;
	}

	public void setSysConIsLogin(Integer sysConIsLogin) {
		this.sysConIsLogin = sysConIsLogin;
	}

	public Integer getSysConIsComment() {
		return this.sysConIsComment;
	}

	public void setSysConIsComment(Integer sysConIsComment) {
		this.sysConIsComment = sysConIsComment;
	}

	public Integer getSysConIsAnonymityComment() {
		return this.sysConIsAnonymityComment;
	}

	public void setSysConIsAnonymityComment(Integer sysConIsAnonymityComment) {
		this.sysConIsAnonymityComment = sysConIsAnonymityComment;
	}

	public Integer getSysConIsMsg() {
		return this.sysConIsMsg;
	}

	public void setSysConIsMsg(Integer sysConIsMsg) {
		this.sysConIsMsg = sysConIsMsg;
	}

	public Integer getSysConIsAnonymityMsg() {
		return this.sysConIsAnonymityMsg;
	}

	public void setSysConIsAnonymityMsg(Integer sysConIsAnonymityMsg) {
		this.sysConIsAnonymityMsg = sysConIsAnonymityMsg;
	}

	public Integer getSysIsLocked() {
		return this.sysIsLocked;
	}

	public void setSysIsLocked(Integer sysIsLocked) {
		this.sysIsLocked = sysIsLocked;
	}

}