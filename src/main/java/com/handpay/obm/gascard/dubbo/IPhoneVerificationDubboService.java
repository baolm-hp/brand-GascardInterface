/*
 * @(#)IVerificationCodeDubboService.java        1.0 2014-12-18
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

/**
 * Class description goes here.
 * 
 * @version 1.0 2014-12-18
 * @author "lmbao"
 * @history
 * 
 */
public interface IPhoneVerificationDubboService {

	/**
	 * 发送短信验证码
	 * 
	 * @param iphone
	 *            手机号
	 * @param appCode
	 *            应用
	 * @param function
	 *            功能
	 * 
	 * @return <pre>
	 * "overtime": 次数受限
	 * "success":  成功
	 * "failed":   失败
	 * </pre>
	 */
	String sendVerificationCode(String iphone, String appCode, String function);

	/**
	 * 发送短信验证码
	 * 
	 * @param iphone
	 *            手机号
	 * @param appCode
	 *            应用
	 * @param function
	 *            功能
	 * @param totalCount
	 *            次数限制
	 * 
	 * @return <pre>
	 * "overtime": 次数受限
	 * "success":  成功
	 * "failed":   失败
	 * </pre>
	 */
	String sendVerificationCode(String iphone, String appCode, String function, Integer totalCount);

	/**
	 * 发送短信验证码
	 * 
	 * @param iphone
	 *            手机号
	 * @param appCode
	 *            应用
	 * @param function
	 *            功能
	 * @param description
	 *            短信文案，例如：您的短信验证码是DEFAULTCODE，如非本人操作，请忽略该短信！
	 *            必须要有"DEFAULTCODE"，以替换为验证码
	 * 
	 * @return <pre>
	 * "overtime": 次数受限
	 * "success":  成功
	 * "failed":   失败
	 * </pre>
	 */
	String sendVerificationCode(String iphone, String appCode, String function, String description);

	/**
	 * 校验短信验证码
	 * 
	 * @param iphone
	 *            手机号
	 * @param appCode
	 *            应用
	 * @param function
	 *            功能
	 * @param verificationCode
	 *            验证码
	 * @param saveResult
	 *            是否保存校验结果
	 * @param saveResultTime
	 *            保存校验结果时长，若为null且saveResult为true，保存1天，单位：秒
	 * 
	 * @return <pre>
	 * "success":  成功
	 * "failed":   失败
	 * </pre>
	 */
	String checkVerificationCode(String iphone, String appCode, String function, String verificationCode,
			boolean saveResult, Integer saveResultTime);

	/**
	 * 校验短信验证码
	 * 
	 * @param iphone
	 *            手机号
	 * @param appCode
	 *            应用
	 * @param function
	 *            功能
	 * @param verificationCode
	 *            验证码
	 * @param saveResult
	 *            是否保存校验结果
	 * @param saveResultTime
	 *            保存校验结果时长，若为null且saveResult为true，保存1天，单位：秒
	 * @param checkCount
	 * 			      单个验证码有效验证次数（例如：连续输错3次，本次验证码失效），防止暴力验证
	 * 
	 * @return <pre>
	 * "success":  成功
	 * "failed":   失败
	 * "outcount": 单个验证码输错3次
	 * </pre>
	 */
	String checkVerificationCode(String iphone, String appCode, String function, String verificationCode,
			boolean saveResult, Integer saveResultTime, Integer checkCount);

	/**
	 * 获取验证结果
	 * 
	 * @param iphone
	 *            手机号
	 * @param appCode
	 *            应用
	 * @param function
	 *            功能
	 * 
	 * @return
	 */
	String getVerificationResult(String iphone, String appCode, String function);
}
