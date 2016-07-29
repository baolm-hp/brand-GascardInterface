/*
 * @(#)GascardServiceException.java        1.0 2015-8-12
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

package com.handpay.obm.gascard.exception;

import com.handpay.obm.common.exception.ObmBaseException;

/**
 * Class description goes here.
 * 
 * @version 1.0 2015-8-12
 * @author "lmbao"
 * @history
 * 
 */
public class GascardServiceException extends ObmBaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8345242584141970745L;

	public GascardServiceException(String errorCode, String errorMsg) {
		super(errorCode, errorMsg);
	}

	public GascardServiceException(String errorCode, String errorMsg, Throwable e) {
		super(errorCode, errorMsg, e);
	}

	@Override
	public synchronized Throwable fillInStackTrace() {
		// return super.fillInStackTrace();
		return null; // FIXME ≤ªøΩ±¥’ª–≈œ¢
	}

}
