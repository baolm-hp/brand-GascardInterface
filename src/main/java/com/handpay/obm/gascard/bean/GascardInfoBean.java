/*
 * @(#)GascardInfoBean.java        1.0 2015-8-14
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
 * @version 1.0 2015-8-14
 * @author "lmbao"
 * @history
 * 
 */
public class GascardInfoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1636387394791567707L;

	private String mdseCode;
	private String mdseName;
	private String brandCode;
	private BigDecimal facePrice;
	private BigDecimal sellPrice;
	private Integer sort;
	private String defaultSelect;
	private String supplierCode;
	private String skuStockId;
	private String SupplierMdseCode;
	/** 状态（1-可售；0-不可售） */
	private Integer status;

	public String getMdseCode() {
		return mdseCode;
	}

	public void setMdseCode(String mdseCode) {
		this.mdseCode = mdseCode;
	}

	public String getMdseName() {
		return mdseName;
	}

	public void setMdseName(String mdseName) {
		this.mdseName = mdseName;
	}

	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public BigDecimal getFacePrice() {
		return facePrice;
	}

	public void setFacePrice(BigDecimal facePrice) {
		this.facePrice = facePrice;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getDefaultSelect() {
		return defaultSelect;
	}

	public void setDefaultSelect(String defaultSelect) {
		this.defaultSelect = defaultSelect;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSkuStockId() {
		return skuStockId;
	}

	public void setSkuStockId(String skuStockId) {
		this.skuStockId = skuStockId;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public String getSupplierMdseCode() {
		return SupplierMdseCode;
	}

	public void setSupplierMdseCode(String supplierMdseCode) {
		SupplierMdseCode = supplierMdseCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
