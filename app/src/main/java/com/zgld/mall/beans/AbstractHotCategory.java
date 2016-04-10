package com.zgld.mall.beans;

/**
 * AbstractHotCategory entity provides the base persistence definition of the
 * HotCategory entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHotCategory implements java.io.Serializable {

	// Fields

	private Integer hotid;
	private String hotname;
	private String hotimg;

	// Constructors

	/** default constructor */
	public AbstractHotCategory() {
	}

	/** full constructor */
	public AbstractHotCategory(String hotname, String hotimg) {
		this.hotname = hotname;
		this.hotimg = hotimg;
	}

	// Property accessors

	public Integer getHotid() {
		return this.hotid;
	}

	public void setHotid(Integer hotid) {
		this.hotid = hotid;
	}

	public String getHotname() {
		return this.hotname;
	}

	public void setHotname(String hotname) {
		this.hotname = hotname;
	}

	public String getHotimg() {
		return this.hotimg;
	}

	public void setHotimg(String hotimg) {
		this.hotimg = hotimg;
	}

}