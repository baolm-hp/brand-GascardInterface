/*
 * @(#)IGascardB2BDubboService.java        1.0 2015-12-6
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

package com.handpay.obm.gascard.dubbo;

import com.handpay.obm.gascard.bean.GascardCardNoInfo;
import com.handpay.obm.gascard.bean.GascardMerchBean;
import com.handpay.obm.gascard.bean.GascardMerchOrderApply;
import com.handpay.obm.gascard.bean.GascardOrderResultBean;
import com.handpay.obm.gascard.bean.GascardPriceBean;

/**
 * Class description goes here.
 * 
 * @version 1.0 2015-12-6
 * @author "lmbao"
 * 
 */
public interface IGascardB2BDubboService {

	String ping(String msg);

	/**
	 * B2B下单并支付
	 * 
	 * @param orderBean
	 *            下单对象
	 * 
	 * @return b2b应用单号
	 */
	GascardOrderResultBean confirmB2BOrderAndPay(GascardMerchOrderApply orderApply);

	/**
	 * 查询B2B商户信息
	 */
	GascardMerchBean queryMerch(String merchCode);

	/**
	 * 查询B2B订单信息
	 */
	GascardOrderResultBean queryB2BOrder(Integer orderId, String merchCode);

	/**
	 * 查询B2B订单信息
	 */
	GascardOrderResultBean queryB2BOrder(String merchOrderId, String merchCode);

	/**
	 * 加油卡卡号信息查询
	 */
	GascardCardNoInfo queryCardInfo(String game_userid, String... chargeType);

	/**
	 * 查询商品，库存和面值
	 */
	GascardPriceBean query2BMdse(String merchCode, String mdseCode);
}
