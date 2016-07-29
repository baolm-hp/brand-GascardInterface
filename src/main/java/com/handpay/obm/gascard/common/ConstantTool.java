/*
 * @(#)ConstantHelper.java        1.0 2013-12-10
 *
 * Copyright (c) 2007-2013 Shanghai Handpay IT, Co., Ltd.
 * 16/F, 889 YanAn Road. W., Shanghai, China
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of 
 * Shanghai Handpay IT Co., Ltd. ("Confidential Information").  
 * You shall not disclose such Confidential Information and shall use 
 * it only in accordance with the terms of the license agreement you 
 * entered into with Handpay.
 */

package com.handpay.obm.gascard.common;

import static com.handpay.obm.gascard.common.AppConstant.APP_CHANNEL;
import static com.handpay.obm.gascard.common.AppConstant.APP_CODE;
import static com.handpay.obm.gascard.common.AppConstant.BBC_BUSINESS_CHANNEL;
import static com.handpay.obm.gascard.common.AppConstant.BBC_CHANNEL;
import static com.handpay.obm.gascard.common.AppConstant.BUSINESS_CHANNEL_KEY;
import static com.handpay.obm.gascard.common.AppConstant.CHANNEL_KEY;
import static com.handpay.obm.gascard.common.AppConstant.DOMAIN_KEY;
import static com.handpay.obm.gascard.common.AppConstant.MERCHANT_CODE;
import static com.handpay.obm.gascard.common.AppConstant.PLATFORM_KEY;
import static com.handpay.obm.gascard.common.AppConstant.PROJECT_IMAGE_URL;
import static com.handpay.obm.gascard.common.AppConstant.STATIC_COMMON;
import static com.handpay.obm.gascard.common.AppConstant.STATIC_PROJECT;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.handpay.obm.common.utils.struts.Struts2Utils;
import com.handpay.obm.gascard.bean.GascardChannelBean;

/**
 * Class description goes here.
 * 
 * @version 1.0 2013-12-10
 * @author "lmbao"
 * @history
 * 
 */
public class ConstantTool {

	public ConstantTool() {

	}

	/**
	 * 获取应用代码
	 */
	public static String getAppCode() {
		return System.getProperty(APP_CODE);
	}

	// public static String getSupplierCode() {
	// return System.getProperty(SUPPLIER_CODE);
	// }

	/**
	 * 获取商户号
	 */
	public static String getMerchantCode() {
		return System.getProperty(MERCHANT_CODE);
	}

	public static String getPlatForm() {
		return (String) Struts2Utils.getSessionAttribute(PLATFORM_KEY);
	}

	public static String getChannel() {
		return (String) Struts2Utils.getSessionAttribute(CHANNEL_KEY);
	}

	public static String getBusinessChannel() {
		return (String) Struts2Utils.getSessionAttribute(BUSINESS_CHANNEL_KEY);
	}

	public static String getBBCChannel() {
		return System.getProperty(BBC_CHANNEL);
	}

	public static String getBBCBusinessChannel() {
		return System.getProperty(BBC_BUSINESS_CHANNEL);
	}

	public static String getDomain() {
		String domain = (String) Struts2Utils.getSessionAttribute(DOMAIN_KEY);
		if (StringUtils.isBlank(domain)) {
			return "";
		}
		return domain.contains("http://") ? domain : "http://" + domain;
	}

	public static String getImageDomain() {
		String domain = System.getProperty(AppConstant.IMAGE_DOMAIN);
		if (StringUtils.isBlank(domain)) {
			return "";
		}
		return domain.contains("http://") ? domain : "http://" + domain;
	}

	public static String getProjectStaticUrl() {
		return Struts2Utils.getRequest().getAttribute(PROJECT_IMAGE_URL) + System.getProperty(STATIC_PROJECT);
	}

	public static String getCommonStaticUrl() {
		return Struts2Utils.getRequest().getAttribute(PROJECT_IMAGE_URL) + System.getProperty(STATIC_COMMON);
	}
	
    public static GascardChannelBean getVoucherChannelBean(){
    	return (GascardChannelBean) Struts2Utils.getSessionAttribute(APP_CHANNEL);
    }
    
    @SuppressWarnings("rawtypes")
	public static Boolean listIsEmpty(Object object){
    	if(object instanceof List){
    		List list = (List) object;
    		Integer size = list.size();
    		if (size == null){
    			return true;
    		}
    		return Boolean.valueOf(size.intValue() == 0);
    	}else{
    		return true;
    	}
    }

}
