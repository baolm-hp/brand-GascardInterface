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
 * �Ϳ�ֱ��Զ�̽ӿ�
 * 
 * @version 1.0 2015-8-12
 * @author "lmbao"
 * @history
 * 
 */
@SuppressWarnings("deprecation")
public interface IGascardDubboService extends IActivityRemoteService{

	/**
	 * ����չʾ������ȡ��������
	 * 
	 * @param channel
	 *            չʾ����
	 */
	GascardChannelBean getChannel(String channel);

	/**
	 * ��ȡ��Ʒ��ϸ
	 */
	GascardInfoBean getGascardInfo(String businessChannel, String mdseCode);

	/**
	 * �µ�
	 * 
	 * @param orderBean
	 *            �µ�����
	 */
	GascardOrderBean confirmOrder(GascardOrderBean orderBean);

	/**
	 * ֧�����֪ͨ
	 * 
	 * @param payNotifyBean
	 *            ֧���������
	 */
	void payNotify(PaymentResponse payResp);

	/**
	 * ��ȡ�û������б�(���ο�)
	 * 
	 * @param userId
	 *            �û�ID
	 */
	List<GascardOrderBean> getUserOrders(Integer userId);

	/**
	 * ��ȡ�û������б�(�ο�)
	 * 
	 * @param iphone
	 *            �ֻ���
	 */
	List<GascardOrderBean> getUserOrders(String iphone, String channel);

	/**
	 * ��ȡ��������(���ο�)
	 * 
	 * @param orderId
	 *            ������
	 * @param userId
	 *            �û�ID
	 */
	GascardOrderBean getOrder(Integer orderId, Integer userId);

	/**
	 * ��ȡ��������(�ο�)
	 * 
	 * @param orderId
	 *            ������
	 * @param iphone
	 *            �ֻ���
	 */
	GascardOrderBean getOrder(Integer orderId, String iphone);

	/**
	 * ��ȡ��������
	 * 
	 * @param orderId
	 *            ������
	 */
	GascardOrderBean getOrder(Integer orderId);

	/**
	 * �˿���֪ͨ
	 * 
	 * @param resultXml
	 *            �˿���
	 */
	void notifyRefundResult(String resultXml);

	/**
	 * �������ͳ�ֵ������Ϣ
	 */
	void updateOrderByOfcardInfo(OfcardInfo info);

	/**
	 * ִ�г�ֵ
	 */
	void deliverHandler(LogisticsOrderIdentity orderIdentity, MdseDeliveryInfo mdseInfo, AppInfo app,
			AbstractAddress abstractAddress);

	/**
	 * ���Ϳ�������Ϣ��ѯ
	 */
	GascardCardNoInfo queryCardInfo(String game_userid, String... chargeType);

	void buildCheckingFileBeforeAndEqualDay();

	void updateInvalidDate(Integer orderid);
	
	
}
