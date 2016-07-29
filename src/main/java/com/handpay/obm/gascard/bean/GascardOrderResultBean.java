/*
 * @(#)GascardOrderResultBean.java        1.0 2015-11-18
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

/**
 * Class description goes here.
 * 
 * @version 1.0 2015-11-18
 * @author "lmbao"
 * @history
 * 
 */
public class GascardOrderResultBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7315200437654237004L;

	/** 应用订单号 */
	private Integer orderId;
	/** 应用订单时间 */
	private String orderDate;
	/** 商户订单号 */
	private String merchOrderId;
	/** 商户订单时间 */
	private String merchOrderTime;
	/** 充值状态(00-充值成功; 02-充值中; 01-充值失败) */
	private String dstatus;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
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

	public String getDstatus() {
		return dstatus;
	}

	public void setDstatus(String dstatus) {
		this.dstatus = dstatus;
	}

}
