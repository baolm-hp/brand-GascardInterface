package com.handpay.obm.gascard.bean;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class GascardActivityBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7035765985368187245L;
	
	private Integer id;
	private String actCode;
	private String name;
	/** 业务渠道 */
//	private String businessChannel;
//	private String startTime;
//	private String endTime;
//	private String status;
	/** 商品目录 */
//	private String mdseCode;
//	private Integer totalNum;
//	private String rule;
//	private Integer buyLimitNum;
//	private Integer expireSeconds;
	
	private Integer userRule;
	private BigDecimal promotionPrice;
	private BigDecimal reductionPrice;
	private Integer phoneVerify;
	private String activityUrl;
	
	private Integer stockNum;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActCode() {
		return actCode;
	}

	public void setActCode(String actCode) {
		this.actCode = actCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(BigDecimal promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public BigDecimal getReductionPrice() {
		return reductionPrice;
	}

	public void setReductionPrice(BigDecimal reductionPrice) {
		this.reductionPrice = reductionPrice;
	}

	public Integer getPhoneVerify() {
		return phoneVerify;
	}

	public void setPhoneVerify(Integer phoneVerify) {
		this.phoneVerify = phoneVerify;
	}

	public String getActivityUrl() {
		return activityUrl;
	}

	public void setActivityUrl(String activityUrl) {
		this.activityUrl = activityUrl;
	}

	public Integer getStockNum() {
		return stockNum;
	}

	public void setStockNum(Integer stockNum) {
		this.stockNum = stockNum;
	}

	public Integer getUserRule() {
		return userRule;
	}

	public void setUserRule(Integer userRule) {
		this.userRule = userRule;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
