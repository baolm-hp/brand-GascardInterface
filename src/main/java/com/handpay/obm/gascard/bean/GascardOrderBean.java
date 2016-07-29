/*
 * @(#)GascardOrderBean.java        1.0 2015-8-13
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
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Class description goes here.
 * 
 * @version 1.0 2015-8-13
 * @author "lmbao"
 * @history
 * 
 */
public class GascardOrderBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4062837881217936230L;

	/** Ӧ�ö����� */
	private Integer orderId;
	/** Ӧ�ö���ʱ�� */
	private String orderDate;
	/** �û�Id */
	private Integer userId;
	/** �Ϳ� */
	private String gasCard;
	/** ���պ��� */
	private String iphone;
	/** ������� */
	private BigDecimal orderAmount;
	/** �Żݽ�� */
	private BigDecimal promotionAmount;
	/** ֧����� */
	private BigDecimal payAmount;
	/** ���� */
	private String currency;
	/** ҵ������ */
	private String businessChannel;
	/** չʾ���� */
	private String channel;
	/** ����״̬(00-�����ɹ�; 01-����ʧ��;04-����) */
	private String ostatus;
	/** ֧��״̬ */
	private String pstatus;
	/** ��ֵ״̬(00-��ֵ�ɹ�; 02-��ֵ��; 01-��ֵʧ��; 03-��Ӧ�̳�ֵ��; 04-��Ӧ�̳�ֵʧ��) */
	private String dstatus;
	/** �˿�״̬(00-�˿�ɹ�,01-�˿�ʧ��,02-�˿���) */
	private String rstatus;
	/** �̻��� */
	private String merchantCode;
	/** ���ĵ��� */
	private String merchantTransSeq;
	/** �����µ�ʱ�� */
	private String merchantTransDate;
	/** ֧����ʽ */
	private String backendId;
	/** ����֧������ */
	private String payOrderId;
	/** ����֧��ʱ�� */
	private String payOrderTime;
	/** ���֧������ */
	private String hpPayOrderId;
	/** ���֧��ʱ�� */
	private String hpPayOrderTime;
	/** ʧЧʱ�� */
	private String invalidDate;
	/** B2B�̻����� */
	// private String merchCode;
	/** ��ֵ�ɹ��󷵻ص�URL��ַ����Ϊ����ʹ��80�˿� */
	private String notifyUrl;
	/** ֪ͨ���� */
	private Integer notifyNum;
	/** �̻�����Ķ����ţ��̻������֮�ѵ�Ψһ�����ţ� */
	private String merchOrderId;
	/** ����ʱ�䣨yyyyMMddHHmmss �磺20150914150214�� */
	private String merchOrderTime;
	/** ��������, 2c��B2C, 2b:B2B */
	private String orderType;
	/** ����ʱ�� */
	private String deliveryDate;
	/** B2B�̻��û�������,�Ƹ�ͨҪ���¼ */
	private BigDecimal merchUserAmount;
	/** ����� */
	private String actCode;
	/** ���п��� */
	private String cardno;
	/** taobao �������ʱ�� */
	private Integer timeLimit;
	/** �̻��µ�IP */
	private String merchIp;

	private List<GascardOrderDetailBean> detailList;

	// private String[] couponCodeArr;
	private String couponCode;

	// public String[] getCouponCodeArr() {
	// return couponCodeArr;
	// }
	//
	// public void setCouponCodeArr(String[] couponCodeArr) {
	// this.couponCodeArr = couponCodeArr;
	// }

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public BigDecimal getPromotionAmount() {
		return promotionAmount;
	}

	public void setPromotionAmount(BigDecimal promotionAmount) {
		this.promotionAmount = promotionAmount;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public String getOstatus() {
		return ostatus;
	}

	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}

	public String getPstatus() {
		return pstatus;
	}

	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}

	public String getDstatus() {
		return dstatus;
	}

	public void setDstatus(String dstatus) {
		this.dstatus = dstatus;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
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

	public String getBackendId() {
		return backendId;
	}

	public void setBackendId(String backendId) {
		this.backendId = backendId;
	}

	public String getPayOrderId() {
		return payOrderId;
	}

	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}

	public String getPayOrderTime() {
		return payOrderTime;
	}

	public void setPayOrderTime(String payOrderTime) {
		this.payOrderTime = payOrderTime;
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

	public String getInvalidDate() {
		return invalidDate;
	}

	public void setInvalidDate(String invalidDate) {
		this.invalidDate = invalidDate;
	}

	public String getRstatus() {
		return rstatus;
	}

	public void setRstatus(String rstatus) {
		this.rstatus = rstatus;
	}

	public List<GascardOrderDetailBean> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<GascardOrderDetailBean> detailList) {
		this.detailList = detailList;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
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

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Integer getNotifyNum() {
		return notifyNum;
	}

	public void setNotifyNum(Integer notifyNum) {
		this.notifyNum = notifyNum;
	}

	public BigDecimal getMerchUserAmount() {
		return merchUserAmount;
	}

	public void setMerchUserAmount(BigDecimal merchUserAmount) {
		this.merchUserAmount = merchUserAmount;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getActCode() {
		return actCode;
	}

	public void setActCode(String actCode) {
		this.actCode = actCode;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
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
}
