/*
 * @(#)GascardDeliveryException.java        1.0 2016-3-18
 *
 * Copyright (c) 2007-2016 Shanghai Handpay IT, Co., Ltd.
 * 16/F, 889 YanAn Road. W., Shanghai, China
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of 
 * Shanghai Handpay IT Co., Ltd. ("Confidential Information").  
 * You shall not disclose such Confidential Information and shall use 
 * it only in accordance with the terms of the license agreement you 
 * entered into with Handpay.
 */

package com.handpay.obm.gascard.exception;

import com.handpay.obm.common.exception.ObmBaseException;

/**
 * Class description goes here.
 * 
 * @version 1.0 2016-3-18
 * @author "lmbao"
 * @history
 * 
 */
public class GascardDeliveryException extends ObmBaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6363359239340515909L;

	public GascardDeliveryException(String errorCode, String errorMsg) {
		super(errorCode, errorMsg);
	}

	public GascardDeliveryException(String errorCode, String errorMsg, Throwable e) {
		super(errorCode, errorMsg, e);
	}
}
