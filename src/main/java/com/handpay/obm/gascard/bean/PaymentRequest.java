/*
 * @(#)PaymentRequest.java        1.0 2015-11-26
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

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Class description goes here.
 * 
 * @version 1.0 2015-11-26
 * @author "lmbao"
 * @history
 * 
 */
public class PaymentRequest {

	private String interfaceVersion;
	private String merchantCode;
	private String orderID;
	private String orderTime;
	private String currency;
	private String orderAmount;
	private String merchOrderParams;
	private String backendId;
	private String orderNote;
	private String payMerchantCode;
	private String goodsURL;
	private String mobile;
	private String signData;
	private String mdseName;
	private String mdsePrice;
	private String mdseNum;
	private String channel;
	private String mdseCode;
	private String mdseType;
	private String appName;
	private String userId;
	private String passWord;

	public String getInterfaceVersion() {
		return interfaceVersion;
	}

	public void setInterfaceVersion(String interfaceVersion) {
		this.interfaceVersion = interfaceVersion;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getMerchOrderParams() {
		return merchOrderParams;
	}

	public void setMerchOrderParams(String merchOrderParams) {
		this.merchOrderParams = merchOrderParams;
	}

	public String getBackendId() {
		return backendId;
	}

	public void setBackendId(String backendId) {
		this.backendId = backendId;
	}

	public String getOrderNote() {
		return orderNote;
	}

	public void setOrderNote(String orderNote) {
		this.orderNote = orderNote;
	}

	public String getPayMerchantCode() {
		return payMerchantCode;
	}

	public void setPayMerchantCode(String payMerchantCode) {
		this.payMerchantCode = payMerchantCode;
	}

	public String getGoodsURL() {
		return goodsURL;
	}

	public void setGoodsURL(String goodsURL) {
		this.goodsURL = goodsURL;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSignData() {
		return signData;
	}

	public void setSignData(String signData) {
		this.signData = signData;
	}

	public String getMdseName() {
		return mdseName;
	}

	public void setMdseName(String mdseName) {
		this.mdseName = mdseName;
	}

	public String getMdsePrice() {
		return mdsePrice;
	}

	public void setMdsePrice(String mdsePrice) {
		this.mdsePrice = mdsePrice;
	}

	public String getMdseNum() {
		return mdseNum;
	}

	public void setMdseNum(String mdseNum) {
		this.mdseNum = mdseNum;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getMdseCode() {
		return mdseCode;
	}

	public void setMdseCode(String mdseCode) {
		this.mdseCode = mdseCode;
	}

	public String getMdseType() {
		return mdseType;
	}

	public void setMdseType(String mdseType) {
		this.mdseType = mdseType;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
