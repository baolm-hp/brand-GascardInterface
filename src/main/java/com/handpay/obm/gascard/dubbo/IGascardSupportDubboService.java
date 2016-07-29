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
 * �Ϳ�ֱ��֧��Զ�̽ӿ�
 * 
 * @version 1.0 2015-8-14
 * @author "lmbao"
 * @history
 * 
 */
public interface IGascardSupportDubboService {
	/**
	 * ��ѯ�ۼ�
	 * 
	 * @param businessChannel
	 *            ҵ������
	 * @param brandCode
	 *            Ʒ��
	 */
	List<GascardMerchPriceBean> getMerchSellPriceList(String merchCode, String brandCode);
	
	/**
	 * ��ȡȫ����Ʒ
	 */
	List<GascardMdseBean> getAllGascardMdse();

	/**
	 * �����ۼ�
	 * 
	 * @param gascardPriceList
	 *            �۸�����б�ֻ������ID�ͼ۸�����
	 */
	void updateMerchSellPrice(List<GascardMerchPriceBean> gascardPriceList);

	/**
	 * ����չʾ������ȡ��������
	 * 
	 * @param channel
	 *            չʾ����
	 */
	GascardChannelBean getChannel(String channel);

	/**
	 * ��ȡ���е�ҵ������
	 */
	List<GascardChannelBean> getAllBusinessChannels();

	/**
	 * ��ȡ���е�ҵ������
	 */
	List<GascardChannelBean> getAllChannels();

	/**
	 * ������ҳ��̬�ļ���������ʱͬ�����ؽ��������֧��ʹ�õ�����ˢ��
	 * 
	 * @param channel
	 *            չʾ���� <br>
	 *            ��������ȫ������
	 */
	void generateIndex(String channel);

	/**
	 * ��ѯ�ۼ�
	 * 
	 * @param businessChannel
	 *            ҵ������
	 * @param brandCode
	 *            Ʒ��
	 */
	List<GascardPriceBean> getSellPriceList(String businessChannel, String brandCode);

	/**
	 * �����ۼ�
	 * 
	 * @param gascardPriceList
	 *            �۸�����б�ֻ������ID�ͼ۸�����
	 */
	void updateSellPrice(List<GascardPriceBean> gascardPriceList);

	/**
	 * ����������ҳ��ȡ����
	 * 
	 * @param queryBean
	 *            ��ѯBean
	 * @param page
	 * @param pagesize
	 */
	List<GascardOrderBean> getOrderPage(GascardOrderQueryBean queryBean, int page, int pagesize);

	/**
	 * ����������ȡ��������
	 * 
	 * @param queryBean
	 *            ��ѯBean
	 */
	Integer getOrderSize(GascardOrderQueryBean queryBean);

	/**
	 * ��ȡ��������
	 * 
	 * @param orderId
	 *            Ӧ�õ���
	 */
	GascardOrderBean getOrder(Integer orderId);

	/**
	 * Ӧ�õ�ʧЧ
	 */
	void orderInvalid();

	/**
	 * �˿�����
	 */
	void refundApply();

	/**
	 * ��ѯ�����˿���
	 */
	void syncRefundResult();

	/**
	 * B2B֪ͨurl
	 */
	void notifyUrlB2B();

	/**
	 * ������û���
	 */
	void clearBaseCache();

	void buildCheckingFileBeforeAndEqualDay(String day, String merchCode);

	void buildCheckingFileBeforeAndEqualDay(String day);

	void uploadCheckingFile(String day, String merchCode);

	PageResultBean<GascardCheckingInfoBean> queryCheckingInfo(GascardCheckingQuery con, int page, int size);

	String queryCheckingFilePath(Integer id);

	List<GascardMerchBean> queryAllValidateMerchs();

	/**
	 * ����ʧ�ܶ�������
	 */
	void deliveryFailHandle();

	void doUnpayTask();

	PageResultBean<GascardOrderDeliveryResultBean> queryGascardDeliverys(GascardDeliveryQueryBean query, int page,
			int size);

	/**
	 * �˹���ѯ�˵�
	 */
	void queryOrderFromSupplierByPerson(Integer orderId, String userId) throws Exception;

	/**
	 * �˹���ֵ�ɹ�
	 * 
	 * @param orderId
	 * @return
	 */
	void deliverySuccessfullyByPerson(Integer orderId, String userId) throws Exception;

	/**
	 * �˹���ֵʧ��
	 * 
	 * @param orderId
	 * @return
	 */
	void deliveryFailByPerson(Integer orderId, String userId) throws Exception;

	/**
	 * CDNˢ��
	 * 
	 * @param url
	 */
	boolean refreshUrl(String url);

	/**
	 * ��ѯ����
	 */
	void queryOrderFromSupplier();

	/**
	 * ���»��ʼʱ��
	 */
	void updateActivityTime(String actCode, String startTime);

	/**
	 * �����ļ���URL
	 * @param day YYYYMMDD
	 * @param mercherCode ����������
	 * @return
	 */
	String getCheckingURL(String day,String mercherCode);
	
	/**
	 * �����������룬����ѯ���й�Ӧ����Ʒ��Ϣ
	 * @param channelCode
	 * @param status
	 * @return
	 */
	List<GascardSupplierMdseBean> queryChannelSupplierMdse(String channelCode);
}
