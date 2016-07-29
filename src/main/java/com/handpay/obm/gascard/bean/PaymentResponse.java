/*
 * @(#)PaymentResponse.java        1.0 2015-11-26
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

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Class description goes here.
 * 
 * @version 1.0 2015-11-26
 * @author "lmbao"
 * @history
 * 
 */
public class PaymentResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8309955798472710857L;

	private String merchantCode;
	private String orderID;
	private String orderTime;
	private String payOrderID;
	private String payOrderTime;
	private String orderAmount;
	private String currency;
	private String merOrderParams;
	private String status;
	private String errorDes;
	private String memo;
	private String hpPayOrderId;
	private String hpPayOrderTime;

	private Integer appOrderId;
	private String appOrderDate;

	private String gasCard;
	private String backendId;
	
	private String businessChannel;

	public String getBusinessChannel() {
		return businessChannel;
	}

	public void setBusinessChannel(String businessChannel) {
		this.businessChannel = businessChannel;
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

	public String getPayOrderID() {
		return payOrderID;
	}

	public void setPayOrderID(String payOrderID) {
		this.payOrderID = payOrderID;
	}

	public String getPayOrderTime() {
		return payOrderTime;
	}

	public void setPayOrderTime(String payOrderTime) {
		this.payOrderTime = payOrderTime;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getMerOrderParams() {
		return merOrderParams;
	}

	public void setMerOrderParams(String merOrderParams) {
		this.merOrderParams = merOrderParams;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorDes() {
		return errorDes;
	}

	public void setErrorDes(String errorDes) {
		this.errorDes = errorDes;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getHpPayOrderId() {
		return hpPayOrderId;
	}

	public void setHpPayOrderId(String hpPayOrderId) {
		this.hpPayOrderId = hpPayOrderId;
	}

	public String getHpPayOrderTime() {
		return hpPayOrderTime;
	}

	public void setHpPayOrderTime(String hpPayOrderTime) {
		this.hpPayOrderTime = hpPayOrderTime;
	}

	public Integer getAppOrderId() {
		return appOrderId;
	}

	public void setAppOrderId(Integer appOrderId) {
		this.appOrderId = appOrderId;
	}

	public String getAppOrderDate() {
		return appOrderDate;
	}

	public void setAppOrderDate(String appOrderDate) {
		this.appOrderDate = appOrderDate;
	}

	public String getGasCard() {
		return gasCard;
	}

	public void setGasCard(String gasCard) {
		this.gasCard = gasCard;
	}

	public String getBackendId() {
		return backendId;
	}

	public void setBackendId(String backendId) {
		this.backendId = backendId;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
