/*
 * @(#)ActivityApply.java        1.0 2015-6-13
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
 * @version 1.0 2015-6-13
 * @author "lmbao"
 * 
 */
public class GascardSupplierMdseBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4345094459865434516L;
	
	private Integer mdseId;

	private Integer id;
	/** 业务渠道 */
	private String businessChannel;
	/** 商品名称 */
	private String mdseName;
	/** 核心商品 */
	private String coreMdse;
	/** 供应商Code*/
	private String supplier;
	/** 供应商的商品code */
	private String suppliserMdse;
	/** 供应商商品描述 */
	private String suppliserMdseDesc;
	/** 供应商商品数量   一个coreMdse商品=suppliserMdseNum个供应商商品 */
	private Integer suppliserMdseNum;
	

	public Integer getSuppliserMdseNum() {
		return suppliserMdseNum;
	}

	public void setSuppliserMdseNum(Integer suppliserMdseNum) {
		this.suppliserMdseNum = suppliserMdseNum;
	}

	public Integer getMdseId() {
		return mdseId;
	}

	public void setMdseId(Integer mdseId) {
		this.mdseId = mdseId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBusinessChannel() {
		return businessChannel;
	}

	public void setBusinessChannel(String businessChannel) {
		this.businessChannel = businessChannel;
	}

	public String getMdseName() {
		return mdseName;
	}

	public void setMdseName(String mdseName) {
		this.mdseName = mdseName;
	}

	public String getCoreMdse() {
		return coreMdse;
	}

	public void setCoreMdse(String coreMdse) {
		this.coreMdse = coreMdse;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getSuppliserMdse() {
		return suppliserMdse;
	}

	public void setSuppliserMdse(String suppliserMdse) {
		this.suppliserMdse = suppliserMdse;
	}

	public String getSuppliserMdseDesc() {
		return suppliserMdseDesc;
	}

	public void setSuppliserMdseDesc(String suppliserMdseDesc) {
		this.suppliserMdseDesc = suppliserMdseDesc;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
