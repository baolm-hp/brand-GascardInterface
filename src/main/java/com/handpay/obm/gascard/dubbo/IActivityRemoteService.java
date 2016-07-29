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
 * Ӫ���Զ�̽ӿ�
 * 
 * @version 1.0 2015-06-12
 * @author "lmbao"
 * 
 */
public interface IActivityRemoteService {

	/**
	 * ��ȡӪ���
	 * 
	 * @param actCode
	 *            �code
	 * @param businessChannel
	 *            ҵ������
	 * @param mdseCode
	 *            ��Ʒ����
	 * @param loadStock
	 *            �Ƿ���ص�ǰ����
	 * @return ����Ӫ�������<br>
	 *         ҵ��������ƥ���򷵻�null����Ʒ���벻ƥ���򷵻�null�����ڻ�ڼ��򷵻�null
	 */
	GascardActivityBean getActivity(String actCode, String businessChannel, String mdseCode, boolean loadStock);

	/**
	 * У����
	 * 
	 * @param actCode
	 *            �code
	 * @param businessChannel
	 *            ҵ������
	 * @param mdseCode
	 *            ��Ʒ����
	 * @param mdseNum
	 *            ��������
	 */
	void validActivityStock(String actCode, String businessChannel, String mdseCode, Integer mdseNum);

	/**
	 * У���û�
	 * 
	 * @param actCode
	 *            �code
	 * @param businessChannel
	 *            ҵ������
	 * @param mdseCode
	 *            ��Ʒ����
	 * @param userId
	 *            �û�Id
	 * @param phone
	 *            �ֻ���
	 */
	void validActivityUser(String actCode, String businessChannel, String mdseCode, Integer userId, String phone);
	
	/**
	 * У������
	 * @param apply У���������,����Ҫ��actCode,businessChannel,mdseCode,mdseNum,userId,phone
	 */
	void validActivityAll(ActivityApply apply);

	/**
	 * ��ȡ���ڻʱ��
	 * 
	 * @param actCode
	 *            �code
	 */
	ActivityNextDuration nextActivityTime(String actCode);

	/**
	 * �������û���
	 */
	void refreshActivityCache();
}
