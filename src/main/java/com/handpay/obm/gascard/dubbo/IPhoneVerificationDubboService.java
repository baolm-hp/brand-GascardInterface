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
	 * ���Ͷ�����֤��
	 * 
	 * @param iphone
	 *            �ֻ���
	 * @param appCode
	 *            Ӧ��
	 * @param function
	 *            ����
	 * 
	 * @return <pre>
	 * "overtime": ��������
	 * "success":  �ɹ�
	 * "failed":   ʧ��
	 * </pre>
	 */
	String sendVerificationCode(String iphone, String appCode, String function);

	/**
	 * ���Ͷ�����֤��
	 * 
	 * @param iphone
	 *            �ֻ���
	 * @param appCode
	 *            Ӧ��
	 * @param function
	 *            ����
	 * @param totalCount
	 *            ��������
	 * 
	 * @return <pre>
	 * "overtime": ��������
	 * "success":  �ɹ�
	 * "failed":   ʧ��
	 * </pre>
	 */
	String sendVerificationCode(String iphone, String appCode, String function, Integer totalCount);

	/**
	 * ���Ͷ�����֤��
	 * 
	 * @param iphone
	 *            �ֻ���
	 * @param appCode
	 *            Ӧ��
	 * @param function
	 *            ����
	 * @param description
	 *            �����İ������磺���Ķ�����֤����DEFAULTCODE����Ǳ��˲���������Ըö��ţ�
	 *            ����Ҫ��"DEFAULTCODE"�����滻Ϊ��֤��
	 * 
	 * @return <pre>
	 * "overtime": ��������
	 * "success":  �ɹ�
	 * "failed":   ʧ��
	 * </pre>
	 */
	String sendVerificationCode(String iphone, String appCode, String function, String description);

	/**
	 * У�������֤��
	 * 
	 * @param iphone
	 *            �ֻ���
	 * @param appCode
	 *            Ӧ��
	 * @param function
	 *            ����
	 * @param verificationCode
	 *            ��֤��
	 * @param saveResult
	 *            �Ƿ񱣴�У����
	 * @param saveResultTime
	 *            ����У����ʱ������Ϊnull��saveResultΪtrue������1�죬��λ����
	 * 
	 * @return <pre>
	 * "success":  �ɹ�
	 * "failed":   ʧ��
	 * </pre>
	 */
	String checkVerificationCode(String iphone, String appCode, String function, String verificationCode,
			boolean saveResult, Integer saveResultTime);

	/**
	 * У�������֤��
	 * 
	 * @param iphone
	 *            �ֻ���
	 * @param appCode
	 *            Ӧ��
	 * @param function
	 *            ����
	 * @param verificationCode
	 *            ��֤��
	 * @param saveResult
	 *            �Ƿ񱣴�У����
	 * @param saveResultTime
	 *            ����У����ʱ������Ϊnull��saveResultΪtrue������1�죬��λ����
	 * @param checkCount
	 * 			      ������֤����Ч��֤���������磺�������3�Σ�������֤��ʧЧ������ֹ������֤
	 * 
	 * @return <pre>
	 * "success":  �ɹ�
	 * "failed":   ʧ��
	 * "outcount": ������֤�����3��
	 * </pre>
	 */
	String checkVerificationCode(String iphone, String appCode, String function, String verificationCode,
			boolean saveResult, Integer saveResultTime, Integer checkCount);

	/**
	 * ��ȡ��֤���
	 * 
	 * @param iphone
	 *            �ֻ���
	 * @param appCode
	 *            Ӧ��
	 * @param function
	 *            ����
	 * 
	 * @return
	 */
	String getVerificationResult(String iphone, String appCode, String function);
}
