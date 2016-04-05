package com.zgld.mall.beans;

/**
 * AbstractUserRanks entity provides the base persistence definition of the
 * UserRanks entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUserRanks implements java.io.Serializable {

	// Fields

	private Integer rankId;
	private Integer userId;
	private String name;
	private String description;
	private Integer point;
	private Integer numberOfMemberRanks;

	// Constructors

	/** default constructor */
	public AbstractUserRanks() {
	}

	/** full constructor */
	public AbstractUserRanks(Integer userId, String name, String description, Integer point, Integer numberOfMemberRanks) {
		this.userId = userId;
		this.name = name;
		this.description = description;
		this.point = point;
		this.numberOfMemberRanks = numberOfMemberRanks;
	}

	// Property accessors

	public Integer getRankId() {
		return this.rankId;
	}

	public void setRankId(Integer rankId) {
		this.rankId = rankId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPoint() {
		return this.point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public Integer getNumberOfMemberRanks() {
		return this.numberOfMemberRanks;
	}

	public void setNumberOfMemberRanks(Integer numberOfMemberRanks) {
		this.numberOfMemberRanks = numberOfMemberRanks;
	}

}