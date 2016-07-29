/*
 * @(#)GascardErrorCodes.java        1.0 2015-8-17
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

/**
 * Class description goes here.
 * 
 * @version 1.0 2015-8-17
 * @author "lmbao"
 * @history
 * 
 */
public class GascardErrorCodes {

	/**
	 * 系统异常
	 */
	public static final String E_SYS_0001 = "SYS_0001";
	
	/**
	 * 网关退款申请异常
	 */
	public static final String E_REFUND_0001 = "REFUND_0001";

	/**
	 * 查询网关退款结果异常
	 */
	public static final String E_REFUND_0002 = "REFUND_0002";

	/**
	 * 支付成功
	 */
	public static final String E_PAY_SUCCESS = "PAY_0001";

	/**
	 * 支付失败
	 */
	public static final String E_PAY_ERROR = "PAY_0002";

	/**
	 * 无效的订单
	 */
	public static final String E_ORDER_0001 = "ORDER_0001";

	/**
	 * 订单已过期
	 */
	public static final String E_ORDER_0002 = "ORDER_0002";

	/**
	 * 订单状态不对
	 */
	public static final String E_ORDER_0003 = "ORDER_0003";

	/**
	 * 订单支付金额不对
	 */
	public static final String E_ORDER_0004 = "ORDER_0004";

	/**
	 * 首页生成异常
	 */
	public static final String E_INDEX_0001 = "INDEX_0004";

	// ///////////////// 以下为接口专用 //////////////////////
	/**
	 * 正常
	 */
	public static final String B2B_1000 = "1000";
	// /**
	// * 接口版本错
	// */
	// public static final String E_B2B_1001 = "1001";
	// /**
	// * 商户不可用
	// */
	// public static final String E_B2B_1010 = "1010";
	// /**
	// * 商户不存在或密码错误
	// */
	// public static final String E_B2B_1011 = "1011";
	// /**
	// * 商户校验错
	// */
	// public static final String E_B2B_1012 = "1012";
	/**
	 * 此商品暂不可用
	 */
	public static final String E_B2B_1021 = "1021";
	/**
	 * 购买数量超出系统要求
	 */
	public static final String E_B2B_1022 = "1022";
	/**
	 * 库存不足
	 */
	public static final String E_B2B_1023 = "1023";
	// /**
	// * 缺少必需参数
	// */
	// public static final String E_B2B_1031 = "1031";
	// /**
	// * 参数格式错误
	// */
	// public static final String E_B2B_1032 = "1032";
	/**
	 * 加油卡号不合法
	 */
	public static final String E_B2B_1033 = "1033";
	/**
	 * 卡号类型错误
	 */
	public static final String E_B2B_1034 = "1034";
	// /**
	// * 签名错误
	// */
	// public static final String E_B2B_1041 = "1041";
	/**
	 * 订单生成失败
	 */
	public static final String E_B2B_1051 = "1051";
	// /**
	// * 商户请求的订单号已存在
	// */
	// public static final String E_B2B_1052 = "1052";
	/**
	 * 账户金额不足
	 */
	public static final String E_B2B_1061 = "1061";
	/**
	 * 支付失败
	 */
	public static final String E_B2B_1062 = "1062";
	// /**
	// * 充值异常
	// */
	// public static final String E_B2B_1071 = "1071";
	/**
	 * 运营商地区维护，暂不能充值
	 */
	public static final String E_B2B_1081 = "1081";
	// /**
	// * 系统维护
	// */
	// public static final String E_B2B_1082 = "1082";
	/**
	 * 未查到订单
	 */
	public static final String E_B2B_2001 = "2001";
	// /**
	// * 订单过期
	// */
	// public static final String E_B2B_2002 = "2002";
	/**
	 * 订单状态错误
	 */
	public static final String E_B2B_2003 = "2003";
	/**
	 * 订单支付状态错误
	 */
	public static final String E_B2B_2004 = "2004";
	// /**
	// * 支付失败
	// */
	// public static final String E_B2B_2005 = "2005";
	// /**
	// * 下订单超时
	// */
	// public static final String E_B2B_2006 = "2006";
	// /**
	// * 订单其它错误
	// */
	// public static final String E_B2B_2010 = "2010";
	/**
	 * 此加油卡不存在
	 */
	public static final String E_B2B_3001 = "3001";
	/**
	 * 此加油卡发票类型为增值税发票
	 */
	public static final String E_B2B_3002 = "3002";
	/**
	 * 卡片已过有效期
	 */
	public static final String E_B2B_3003 = "3003";
	/**
	 * 您只能给个人卡充值
	 */
	public static final String E_B2B_3004 = "3004";
	/**
	 * 查询卡号异常
	 */
	public static final String E_B2B_3005 = "3005";
	/**
	 * 副卡不能进行充值
	 */
	public static final String E_B2B_3006 = "3006";
	/**
	 * 您不能给不记名卡充值
	 */
	public static final String E_B2B_3007 = "3007";
	/**
	 * 司机卡不能网上充值
	 */
	public static final String E_B2B_3008 = "3008";
	/**
	 * 卡号其它错误
	 */
	public static final String E_B2B_3099 = "3099";
	/**
	 * 接口版本错
	 */
	public static final String E_B2B_9001 = "9001";
	/**
	 * 商户不存在或密码错误
	 */
	public static final String E_B2B_9011 = "9011";
	/**
	 * 缺少必需参数
	 */
	public static final String E_B2B_9031 = "9031";
	/**
	 * 参数格式错误
	 */
	public static final String E_B2B_9032 = "9032";
	/**
	 * 签名错误
	 */
	public static final String E_B2B_9041 = "9041";
	/**
	 * 系统维护
	 */
	public static final String E_B2B_9082 = "9082";
	/**
	 * 系统繁忙
	 */
	public static final String E_B2B_9998 = "9998";
	/**
	 * 未知错误
	 */
	public static final String E_B2B_9999 = "9999";
	/**
	 * 活动渠道异常
	 */
	public static final String E_ACTIVITY_0001 = "ACTIVITY_0001";

	/**
	 * 活动时间异常
	 */
	public static final String E_ACTIVITY_0002 = "ACTIVITY_0002";

	/**
	 * 每人每天只能享受一次优惠
	 */
	public static final String E_ACTIVITY_0003 = "ACTIVITY_0003";

	/**
	 * 活动商品已售罄
	 */
	public static final String E_ACTIVITY_0004 = "ACTIVITY_0004";

	/**
	 * 活动其他异常
	 */
	public static final String E_ACTIVITY_0005 = "ACTIVITY_0005";
	
	/**
	 * VIP活动商品已售罄，请下月再来购买
	 */
	public static final String E_ACTIVITY_0006 = "ACTIVITY_0006";
	
	/**
	 * VIP油卡一个用户一个手机号一个月只能购买一张
	 */
	public static final String E_ACTIVITY_0007 = "ACTIVITY_0007";
	
	/**
	 * VIP油卡只有白金以上用户才能购买
	 */
	public static final String E_ACTIVITY_0008 = "ACTIVITY_0008";
	
	/**
	 * 活动渠道异常
	 */
	public static final String E_ACTIVITY_0101 = "ACTIVITY_0101";
	
	/**
	 * 活动未开始
	 */
	public static final String E_ACTIVITY_0102 = "ACTIVITY_0102";
	
	/**
	 * 活动已结束
	 */
	public static final String E_ACTIVITY_0103 = "ACTIVITY_0103";

	/**
	 * 非活动商品
	 */
	public static final String E_ACTIVITY_0104 = "ACTIVITY_0104";

	/**
	 * 活动商品已售罄
	 */
	public static final String E_ACTIVITY_0105 = "ACTIVITY_0105";

	/**
	 * 用户已享受优惠
	 */
	public static final String E_ACTIVITY_0106 = "ACTIVITY_0106";
	
	/**
	 * 不在活动区间内
	 */
	public static final String E_ACTIVITY_0107 = "ACTIVITY_0107";
	
	/**
	 * 计算优惠金额异常
	 */
	public static final String E_COUPON_0100 = "COUPON_0100";
	/**
	 * 优惠券注册失败
	 */
	public static final String E_COUPON_0101 = "COUPON_0101";
	
	/**
	 * 优惠券使用失败
	 */
	public static final String E_COUPON_0102 = "COUPON_0102";
	
	/**
	 * 优惠券确认使用失败
	 */
	public static final String  E_COUPON_0103 = "COUPON_0103";
	
	/**
	 * 退回已使用的优惠券失败
	 */
	public static final String E_COUPON_0104 = "COUPON_0104";
	
}
