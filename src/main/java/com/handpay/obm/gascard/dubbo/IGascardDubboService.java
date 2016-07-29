/*
 * @(#)IGascardDubboService.java        1.0 2015-8-12
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

import java.util.List;

import com.handpay.core.base.AppInfo;
import com.handpay.core.logistics.bean.AbstractAddress;
import com.handpay.core.logistics.bean.LogisticsOrderIdentity;
import com.handpay.core.logistics.bean.MdseDeliveryInfo;
import com.handpay.obm.gascard.bean.GascardCardNoInfo;
import com.handpay.obm.gascard.bean.GascardChannelBean;
import com.handpay.obm.gascard.bean.GascardInfoBean;
import com.handpay.obm.gascard.bean.GascardOrderBean;
import com.handpay.obm.gascard.bean.OfcardInfo;
import com.handpay.obm.gascard.bean.PaymentResponse;

/**
 * 油卡直充远程接口
 * 
 * @version 1.0 2015-8-12
 * @author "lmbao"
 * @history
 * 
 */
@SuppressWarnings("deprecation")
public interface IGascardDubboService extends IActivityRemoteService{

	/**
	 * 根据展示渠道获取渠道配置
	 * 
	 * @param channel
	 *            展示渠道
	 */
	GascardChannelBean getChannel(String channel);

	/**
	 * 获取商品明细
	 */
	GascardInfoBean getGascardInfo(String businessChannel, String mdseCode);

	/**
	 * 下单
	 * 
	 * @param orderBean
	 *            下单对象
	 */
	GascardOrderBean confirmOrder(GascardOrderBean orderBean);

	/**
	 * 支付结果通知
	 * 
	 * @param payNotifyBean
	 *            支付结果对象
	 */
	void payNotify(PaymentResponse payResp);

	/**
	 * 获取用户订单列表(非游客)
	 * 
	 * @param userId
	 *            用户ID
	 */
	List<GascardOrderBean> getUserOrders(Integer userId);

	/**
	 * 获取用户订单列表(游客)
	 * 
	 * @param iphone
	 *            手机号
	 */
	List<GascardOrderBean> getUserOrders(String iphone, String channel);

	/**
	 * 获取订单详情(非游客)
	 * 
	 * @param orderId
	 *            订单号
	 * @param userId
	 *            用户ID
	 */
	GascardOrderBean getOrder(Integer orderId, Integer userId);

	/**
	 * 获取订单详情(游客)
	 * 
	 * @param orderId
	 *            订单号
	 * @param iphone
	 *            手机号
	 */
	GascardOrderBean getOrder(Integer orderId, String iphone);

	/**
	 * 获取订单详情
	 * 
	 * @param orderId
	 *            订单号
	 */
	GascardOrderBean getOrder(Integer orderId);

	/**
	 * 退款结果通知
	 * 
	 * @param resultXml
	 *            退款结果
	 */
	void notifyRefundResult(String resultXml);

	/**
	 * 主动推送充值订单信息
	 */
	void updateOrderByOfcardInfo(OfcardInfo info);

	/**
	 * 执行充值
	 */
	void deliverHandler(LogisticsOrderIdentity orderIdentity, MdseDeliveryInfo mdseInfo, AppInfo app,
			AbstractAddress abstractAddress);

	/**
	 * 加油卡卡号信息查询
	 */
	GascardCardNoInfo queryCardInfo(String game_userid, String... chargeType);

	void buildCheckingFileBeforeAndEqualDay();

	void updateInvalidDate(Integer orderid);
	
	
}
