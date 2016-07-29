/*
 * @(#)GascardMerchOrderApply.java        1.0 2015-11-18
 *
 * Copyright (c) 2007-2015 Shanghai Handpay IT, Co., Ltd.
 * 16/F, 889 YanAn Road. W., Shanghai, China
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of 
 * Shanghai Handpay IT Co., Ltd. ("Confidential Information").  
 * You shall not disclose such Confidential Information and shall use 
 * it only in accordance with the terms of the license agreement you 
 * entered into with Handpay.
 */

package com.handpay.obm.gascard.bean;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Class description goes here.
 * 
 * @version 1.0 2015-11-18
 * @author "lmbao"
 * @history
 * 
 */
public class GascardMerchOrderApply implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4867874149988792640L;

	private String merchantCode;
	private String businessChannel;
	private String channel;
	private String gasCard;
	private String iphone;
	private String notifyUrl;
	private String merchOrderId;
	private String merchOrderTime;
	private String mdseCode;
	private Integer mdseNum;
	private BigDecimal merchUserAmount;
	private Integer timeLimit;
	private String merchIp;

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getBusinessChannel() {
		return businessChannel;
	}

	public void setBusinessChannel(String businessChannel) {
		this.businessChannel = businessChannel;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getGasCard() {
		return gasCard;
	}

	public void setGasCard(String gasCard) {
		this.gasCard = gasCard;
	}

	public String getIphone() {
		return iphone;
	}

	public void setIphone(String iphone) {
		this.iphone = iphone;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getMerchOrderId() {
		return merchOrderId;
	}

	public void setMerchOrderId(String merchOrderId) {
		this.merchOrderId = merchOrderId;
	}

	public String getMerchOrderTime() {
		return merchOrderTime;
	}

	public void setMerchOrderTime(String merchOrderTime) {
		this.merchOrderTime = merchOrderTime;
	}

	public String getMdseCode() {
		return mdseCode;
	}

	public void setMdseCode(String mdseCode) {
		this.mdseCode = mdseCode;
	}

	public Integer getMdseNum() {
		return mdseNum;
	}

	public void setMdseNum(Integer mdseNum) {
		this.mdseNum = mdseNum;
	}

	public BigDecimal getMerchUserAmount() {
		return merchUserAmount;
	}

	public void setMerchUserAmount(BigDecimal merchUserAmount) {
		this.merchUserAmount = merchUserAmount;
	}

	public Integer getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(Integer timeLimit) {
		this.timeLimit = timeLimit;
	}

	public String getMerchIp() {
		return merchIp;
	}

	public void setMerchIp(String merchIp) {
		this.merchIp = merchIp;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
