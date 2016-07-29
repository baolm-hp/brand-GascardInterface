/*
 * @(#)IGascardSupportDubboService.java        1.0 2015-8-14
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

import com.handpay.obm.gascard.bean.GascardChannelBean;
import com.handpay.obm.gascard.bean.GascardCheckingInfoBean;
import com.handpay.obm.gascard.bean.GascardCheckingQuery;
import com.handpay.obm.gascard.bean.GascardDeliveryQueryBean;
import com.handpay.obm.gascard.bean.GascardMdseBean;
import com.handpay.obm.gascard.bean.GascardMerchBean;
import com.handpay.obm.gascard.bean.GascardMerchPriceBean;
import com.handpay.obm.gascard.bean.GascardOrderBean;
import com.handpay.obm.gascard.bean.GascardOrderDeliveryResultBean;
import com.handpay.obm.gascard.bean.GascardOrderQueryBean;
import com.handpay.obm.gascard.bean.GascardPriceBean;
import com.handpay.obm.gascard.bean.GascardSupplierMdseBean;
import com.handpay.obm.gascard.bean.PageResultBean;

/**
 * 油卡直充支撑远程接口
 * 
 * @version 1.0 2015-8-14
 * @author "lmbao"
 * @history
 * 
 */
public interface IGascardSupportDubboService {
	/**
	 * 查询售价
	 * 
	 * @param businessChannel
	 *            业务渠道
	 * @param brandCode
	 *            品牌
	 */
	List<GascardMerchPriceBean> getMerchSellPriceList(String merchCode, String brandCode);
	
	/**
	 * 获取全部商品
	 */
	List<GascardMdseBean> getAllGascardMdse();

	/**
	 * 更新售价
	 * 
	 * @param gascardPriceList
	 *            价格对象列表，只需设置ID和价格属性
	 */
	void updateMerchSellPrice(List<GascardMerchPriceBean> gascardPriceList);

	/**
	 * 根据展示渠道获取渠道配置
	 * 
	 * @param channel
	 *            展示渠道
	 */
	GascardChannelBean getChannel(String channel);

	/**
	 * 获取所有的业务渠道
	 */
	List<GascardChannelBean> getAllBusinessChannels();

	/**
	 * 获取所有的业务渠道
	 */
	List<GascardChannelBean> getAllChannels();

	/**
	 * 生成首页静态文件，单渠道时同步返回结果，建议支撑使用单渠道刷新
	 * 
	 * @param channel
	 *            展示渠道 <br>
	 *            空则生成全部渠道
	 */
	void generateIndex(String channel);

	/**
	 * 查询售价
	 * 
	 * @param businessChannel
	 *            业务渠道
	 * @param brandCode
	 *            品牌
	 */
	List<GascardPriceBean> getSellPriceList(String businessChannel, String brandCode);

	/**
	 * 更新售价
	 * 
	 * @param gascardPriceList
	 *            价格对象列表，只需设置ID和价格属性
	 */
	void updateSellPrice(List<GascardPriceBean> gascardPriceList);

	/**
	 * 根据条件分页获取订单
	 * 
	 * @param queryBean
	 *            查询Bean
	 * @param page
	 * @param pagesize
	 */
	List<GascardOrderBean> getOrderPage(GascardOrderQueryBean queryBean, int page, int pagesize);

	/**
	 * 根据条件获取订单数量
	 * 
	 * @param queryBean
	 *            查询Bean
	 */
	Integer getOrderSize(GascardOrderQueryBean queryBean);

	/**
	 * 获取订单详情
	 * 
	 * @param orderId
	 *            应用单号
	 */
	GascardOrderBean getOrder(Integer orderId);

	/**
	 * 应用单失效
	 */
	void orderInvalid();

	/**
	 * 退款申请
	 */
	void refundApply();

	/**
	 * 查询网关退款结果
	 */
	void syncRefundResult();

	/**
	 * B2B通知url
	 */
	void notifyUrlB2B();

	/**
	 * 清除常用缓存
	 */
	void clearBaseCache();

	void buildCheckingFileBeforeAndEqualDay(String day, String merchCode);

	void buildCheckingFileBeforeAndEqualDay(String day);

	void uploadCheckingFile(String day, String merchCode);

	PageResultBean<GascardCheckingInfoBean> queryCheckingInfo(GascardCheckingQuery con, int page, int size);

	String queryCheckingFilePath(Integer id);

	List<GascardMerchBean> queryAllValidateMerchs();

	/**
	 * 发货失败订单处理
	 */
	void deliveryFailHandle();

	void doUnpayTask();

	PageResultBean<GascardOrderDeliveryResultBean> queryGascardDeliverys(GascardDeliveryQueryBean query, int page,
			int size);

	/**
	 * 人工查询核单
	 */
	void queryOrderFromSupplierByPerson(Integer orderId, String userId) throws Exception;

	/**
	 * 人工充值成功
	 * 
	 * @param orderId
	 * @return
	 */
	void deliverySuccessfullyByPerson(Integer orderId, String userId) throws Exception;

	/**
	 * 人工充值失败
	 * 
	 * @param orderId
	 * @return
	 */
	void deliveryFailByPerson(Integer orderId, String userId) throws Exception;

	/**
	 * CDN刷新
	 * 
	 * @param url
	 */
	boolean refreshUrl(String url);

	/**
	 * 查询订单
	 */
	void queryOrderFromSupplier();

	/**
	 * 更新活动开始时间
	 */
	void updateActivityTime(String actCode, String startTime);

	/**
	 * 对账文件的URL
	 * @param day YYYYMMDD
	 * @param mercherCode 合作方代码
	 * @return
	 */
	String getCheckingURL(String day,String mercherCode);
	
	/**
	 * 根据渠道代码，来查询所有供应商商品信息
	 * @param channelCode
	 * @param status
	 * @return
	 */
	List<GascardSupplierMdseBean> queryChannelSupplierMdse(String channelCode);
}
