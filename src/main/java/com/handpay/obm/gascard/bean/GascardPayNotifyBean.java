/*
 * @(#)GascardPayNotifyBean.java        1.0 2015-8-13
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
 * @version 1.0 2015-8-13
 * @author "lmbao"
 * @history
 * 
 */
public class GascardPayNotifyBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4270803266358206775L;

	private Integer orderID;
	private String orderTime;
	private String merchantTransSeq;
	private String merchantTransDate;
	private String payOrderID;
	private String payOrderTime;
	private String hpPayOrderID;
	private String hpPayOrderTime;
	private BigDecimal orderAmount;
	private String currency;
	private String status;

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getMerchantTransSeq() {
		return merchantTransSeq;
	}

	public void setMerchantTransSeq(String merchantTransSeq) {
		this.merchantTransSeq = merchantTransSeq;
	}

	public String getMerchantTransDate() {
		return merchantTransDate;
	}

	public void setMerchantTransDate(String merchantTransDate) {
		this.merchantTransDate = merchantTransDate;
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

	public String getHpPayOrderID() {
		return hpPayOrderID;
	}

	public void setHpPayOrderID(String hpPayOrderID) {
		this.hpPayOrderID = hpPayOrderID;
	}

	public String getHpPayOrderTime() {
		return hpPayOrderTime;
	}

	public void setHpPayOrderTime(String hpPayOrderTime) {
		this.hpPayOrderTime = hpPayOrderTime;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
