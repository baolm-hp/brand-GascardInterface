/*
 * @(#)GagewayRefundOrder.java        1.0 2015-8-17
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
 * @version 1.0 2015-8-17
 * @author "lmbao"
 * @history
 * 
 */
public class GagewayRefundOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4729266097938935510L;
	
	private String orderId;
	private String orderTime;
	private String linkOrderId;
	private String linkOrderTime;
	private String amount;
	private String resultCode;
	private String errMsg;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getLinkOrderId() {
		return linkOrderId;
	}

	public void setLinkOrderId(String linkOrderId) {
		this.linkOrderId = linkOrderId;
	}

	public String getLinkOrderTime() {
		return linkOrderTime;
	}

	public void setLinkOrderTime(String linkOrderTime) {
		this.linkOrderTime = linkOrderTime;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
