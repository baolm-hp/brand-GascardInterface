/*
 * @(#)GascardOrderDetailBean.java        1.0 2015-8-13
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
public class GascardOrderDetailBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2218741464961887069L;

	private Integer id;
	private Integer orderId;
	private String brandCode;
	private String mdseCode;
	private String mdseName;
	private BigDecimal facePrice;
	private BigDecimal sellPrice;
	private BigDecimal promotionAmount;
	private Integer mdseNum;
	private BigDecimal deliveryFacePrice;
	private String skuStockId;
	private String supplierCode;
	private String supplierMdseCode;
	private String supplierOrderId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

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

	public BigDecimal getPromotionAmount() {
		return promotionAmount;
	}

	public void setPromotionAmount(BigDecimal promotionAmount) {
		this.promotionAmount = promotionAmount;
	}

	public Integer getMdseNum() {
		return mdseNum;
	}

	public void setMdseNum(Integer mdseNum) {
		this.mdseNum = mdseNum;
	}

	public String getSkuStockId() {
		return skuStockId;
	}

	public void setSkuStockId(String skuStockId) {
		this.skuStockId = skuStockId;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierMdseCode() {
		return supplierMdseCode;
	}

	public void setSupplierMdseCode(String supplierMdseCode) {
		this.supplierMdseCode = supplierMdseCode;
	}

	public String getSupplierOrderId() {
		return supplierOrderId;
	}

	public void setSupplierOrderId(String supplierOrderId) {
		this.supplierOrderId = supplierOrderId;
	}

	public BigDecimal getDeliveryFacePrice() {
		return deliveryFacePrice;
	}

	public void setDeliveryFacePrice(BigDecimal deliveryFacePrice) {
		this.deliveryFacePrice = deliveryFacePrice;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
