/*
 * @(#)IVoucherActivityDubboService.java        1.0 2014-10-23
 *
 * Copyright (c) 2007-2014 Shanghai Handpay IT, Co., Ltd.
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

import com.handpay.obm.gascard.bean.ActivityApply;
import com.handpay.obm.gascard.bean.ActivityNextDuration;
import com.handpay.obm.gascard.bean.GascardActivityBean;

/**
 * 营销活动远程接口
 * 
 * @version 1.0 2015-06-12
 * @author "lmbao"
 * 
 */
public interface IActivityRemoteService {

	/**
	 * 获取营销活动
	 * 
	 * @param actCode
	 *            活动code
	 * @param businessChannel
	 *            业务渠道
	 * @param mdseCode
	 *            商品代码
	 * @param loadStock
	 *            是否加载当前活动库存
	 * @return 返回营销活动对象<br>
	 *         业务渠道不匹配则返回null；商品代码不匹配则返回null；不在活动期间则返回null
	 */
	GascardActivityBean getActivity(String actCode, String businessChannel, String mdseCode, boolean loadStock);

	/**
	 * 校验库存
	 * 
	 * @param actCode
	 *            活动code
	 * @param businessChannel
	 *            业务渠道
	 * @param mdseCode
	 *            商品代码
	 * @param mdseNum
	 *            购买数量
	 */
	void validActivityStock(String actCode, String businessChannel, String mdseCode, Integer mdseNum);

	/**
	 * 校验用户
	 * 
	 * @param actCode
	 *            活动code
	 * @param businessChannel
	 *            业务渠道
	 * @param mdseCode
	 *            商品代码
	 * @param userId
	 *            用户Id
	 * @param phone
	 *            手机号
	 */
	void validActivityUser(String actCode, String businessChannel, String mdseCode, Integer userId, String phone);
	
	/**
	 * 校验活动规则
	 * @param apply 校验参数对象,必须要有actCode,businessChannel,mdseCode,mdseNum,userId,phone
	 */
	void validActivityAll(ActivityApply apply);

	/**
	 * 获取下期活动时间
	 * 
	 * @param actCode
	 *            活动code
	 */
	ActivityNextDuration nextActivityTime(String actCode);

	/**
	 * 清除活动配置缓存
	 */
	void refreshActivityCache();
}
