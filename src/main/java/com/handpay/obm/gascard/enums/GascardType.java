/*
 * @(#)GascardType.java        1.0 2015-8-21
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
 * @version 1.0 2015-8-21
 * @author "lmbao"
 * @history
 * 
 */
public enum GascardType {

	ZSH("1", "中石化"), ZSY("2", "中石油");

	private String code;
	private String desc;

	private GascardType(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static GascardType valueOfCode(String code) {
		for (GascardType status : values()) {
			if (StringUtils.equals(code, status.getCode())) {
				return status;
			}
		}
		return null;
	}
}
