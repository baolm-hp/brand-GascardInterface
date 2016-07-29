/*
 * @(#)ActivityStatus.java        1.0 2015-6-10
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
 * @version 	1.0 2015-6-10
 * @author		"lmbao"
 *		
 */
public enum ActivityStatus {

	IN_DURATION	("01", "活动进行中"),
	OUT_PROCESS ("02", "不在活动期间"),
	SOLD_OUT	("03", "本期活动商品已售罄"),
	ACT_END		("04", "活动已结束");
	
	private String code;
    private String desc;
    
    private ActivityStatus (String code, String desc) {
    	this.code = code;
    	this.desc = desc;
    }

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
    public static ActivityStatus valueOfCode(String code) {
    	for(ActivityStatus status : values()){
    		if(StringUtils.equals(code, status.getCode())){
    			return status;
    		}
    	}
    	return null;
    }
}
