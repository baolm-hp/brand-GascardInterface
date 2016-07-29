/*
 * @(#)GascardRstatus.java        1.0 2015-8-14
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

import org.apache.commons.lang3.StringUtils;

/**
 * Class description goes here.
 * 
 * @version 1.0 2015-8-14
 * @author "lmbao"
 * @history
 * 
 */
public enum GascardRstatus {

	SUCCESS("00", "退款成功"), FAIL("01", "退款失败"), PROCESSING("02", "退款中");

	private String code;
	private String desc;

	private GascardRstatus(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static GascardRstatus valueOfCode(String code) {
		for (GascardRstatus status : values()) {
			if (StringUtils.equals(code, status.getCode())) {
				return status;
			}
		}
		return null;
	}
}
