/*
 * @(#)GascardDstatus.java        1.0 2015-8-14
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

package com.handpay.obm.gascard.enums;

/**
 * 商户支付模式
 * 
 * @version 1.0 2015-8-14
 * @author "lmbao"
 * @history
 * 
 */
public enum GascardMerchPayMode {

	PRE_PAY(1, "预支付"), AFT_PAY(2, "后支付");

	private int code;
	private String desc;

	private GascardMerchPayMode(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static GascardMerchPayMode valueOfCode(int code) {
		for (GascardMerchPayMode status : values()) {
			if (status.getCode() == code) {
				return status;
			}
		}
		return null;
	}
}
