package com.handpay.obm.gascard.common.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.handpay.obm.common.utils.date.DateUtil;
import com.handpay.obm.gascard.bean.ActivityDurationTime;
import com.handpay.obm.gascard.bean.ActivityNextDuration;

/**
 * ͨ�û���ڹ�����
 * @author xllv
 *
 */
public class ActivityDateUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(ActivityDateUtils.class);
	
	public static final Date NOW_DATE = null;
	
	/*
	 * ����Ǳ�:��0, ��1, ��2, ��3, ʱ4, ��5, ��6
	 */
	public static final int[] CALENDAR_FIELD = { Calendar.YEAR, Calendar.MONTH,
												Calendar.WEEK_OF_MONTH, Calendar.DAY_OF_MONTH,
												Calendar.HOUR_OF_DAY, Calendar.MINUTE, Calendar.SECOND };
	
	/** һ�ܵ����� 60*60*24*7 */
	public static final int SECOND_WEEK = 604800;
	
	/** һ������� 60*60*24 */
	public static final int SECOND_DAY = 86400;
	
	/** һСʱ������ 60*60 */
	public static final int SECOND_HOUR = 3600;
	
	/** һ���ӵ����� 60 */
	public static final int SECOND_MINUTE = 60;
	
	/** ÿ1�� */
	public static final int CYCLE_YEARLY = -1;
	
	/** ÿ1�� */
	public static final int CYCLE_MONTHLY = -2;
	
	/** ÿ1�� */
	public static final int CYCLE_WEEKLY = -3;
	
	/** ÿ1�� */
	public static final int CYCLE_DAILY = -4;
	
	/** ÿ1Сʱ */
	public static final int CYCLE_HOURLY = -5;
	
	/** ÿ1���� */
	public static final int CYCLE_MINUTELY = -6;
	
	/** ÿ1�� */
	public static final int CYCLE_SECONDLY = -7;
	
	/** ÿ1�� */
	public static final int DURATION_YEARLY = -1;
	
	/** ÿ1�� */
	public static final int DURATION_MONTHLY = -2;
	
	/** ÿ1�� */
	public static final int DURATION_WEEKLY = -3;
	
	/** ÿ1�� */
	public static final int DURATION_DAILY = -4;
	
	/** ÿ1Сʱ */
	public static final int DURATION_HOURLY = -5;
	
	/** ÿ1���� */
	public static final int DURATION_MINUTELY = -6;
	
	/** ÿ1�� */
	public static final int DURATION_SECONDLY = -7;
	
	/** ����ʱ�����µף��ܼ��������봫��������������ڱ��� */
	public static final int DURATION_END_OF_MONTH = -8;
	
	/** ����ʱ������ף��ܼ��������봫��������������ڱ��� */
	public static final int DURATION_END_OF_YEAR = -9;
	
	/**
	 * 
	 * @param referDate		����ʱ��
	 * @param cycleTime		��λ���ڣ��ǹ���ʱ���봫������������ÿ��(24H)��ÿ�ܣ�ÿ��,ÿ��Ϊһ�ܣ��봫�뱾��ĳ���
	 * @param addDateCount	���ӻ����ʱ������
	 * @return
	 */
	public static Date addDate(Date referDate, int cycleTime, int addDateCount){
		if(cycleTime < CYCLE_SECONDLY){
			throw new IllegalArgumentException();
		}
		if(null == referDate){
			referDate = new Date();
		}
		Calendar referCal = Calendar.getInstance();
		referCal.setTime(referDate);
		if(cycleTime < 0){
			//ÿ��...�ȹ���ʱ��
			referCal.add(CALENDAR_FIELD[transCycleTime(cycleTime)], addDateCount);
		}else{
			//�ǹ���ʱ��
			referCal.add(Calendar.SECOND, cycleTime * addDateCount);
		}
		return referCal.getTime();
	}
	
	/**
	 * ��ȡ�����ʱ�����
	 * @param startTime	���һ�ο�ʼʱ��
	 * @param endTime	����һ�ν���ʱ��
	 * @param referDate	����ʱ���Ƿ��ڻ�ڼ䣬��ActivityDateUtils.NOW_DATE��nullΪ��ǰʱ��
	 * @param cycleTime ��λ���ڣ��ǹ���ʱ���봫������������ÿ��(24H)��ÿ�ܣ�ÿ��,ÿ��Ϊһ�ܣ��봫�뱾��ĳ���
	 * @param cycleCount ʵ������������Ҫ��Թ���ʱ�䣬���磺cycleTimeΪCYCLE_WEEKLY(ÿ��)��ʵ����Ҫÿ1�ܣ��봫��1��ÿ2�ܣ��봫��2��Ĭ��Ϊ1
	 * @param durationTime �����ʱ�䣬ͬcycleTime�����ǹ���ʱ�䣬�봫������ʱ�䣬�����ڲ�����ȥ1���Լ������ʱ��
	 * @param durationCount ʵ�ʳ���������Ҫ��Թ���ʱ�䣬ͬcycleCount
	 * @throws ParseException 
	 */
	public static ActivityDurationTime durationTimeCommon(
			String startTime, String endTime, Date referDate, int cycleTime,
			int cycleCount, int durationTime, int durationCount) throws ParseException {
		vaildParams(startTime, endTime, referDate, cycleTime, cycleCount, durationTime, durationCount);
		ActivityDurationTime result = null;
		if(isActDuring(startTime, endTime, referDate)<0 || isActDuring(startTime, endTime, referDate)>0){
			result = new ActivityDurationTime();
			result.setStartDate(null);
			result.setEndDate(null);
			return result;
		}
		if(null == referDate){
			referDate = new Date();
		}
		DateFormat date_format = new SimpleDateFormat("yyyyMMddHHmmss");
		Date firstDate = date_format.parse(startTime);
		Calendar startCal = Calendar.getInstance();
		startCal.setTime(firstDate);
		Calendar firstCal = Calendar.getInstance();
		firstCal.setTime(firstDate);
		Calendar referCal = Calendar.getInstance();
		referCal.setTime(referDate);
		Calendar endCal = Calendar.getInstance();
		
		if(logger.isDebugEnabled()) logger.debug("���һ�ο�ʼʱ�䣺"+DateUtil.parseFormatDate("yyyy-MM-dd HH:mm:ss", startCal.getTime()));
		
		if(cycleTime < 0){
			//ÿ��...�ȹ���ʱ��
			int cycleNum = getCycleNumByNormal(firstDate, referDate, cycleTime, cycleCount);
			startCal.add(CALENDAR_FIELD[transCycleTime(cycleTime)], (cycleNum-1) * cycleCount);
		}else{
			//�ǹ���ʱ��
			int cycleNum = getCycleNumByAbnormal(firstDate, referDate, cycleTime, cycleCount);
			startCal.add(Calendar.SECOND, (cycleNum-1) * cycleTime);
		}
		
		if(logger.isDebugEnabled()) logger.debug("���λ��ʼʱ�䣺"+DateUtil.parseFormatDate("yyyy-MM-dd HH:mm:ss", startCal.getTime()));
		
		endCal.setTime(startCal.getTime());
		if(durationTime < 0 && durationTime > DURATION_END_OF_MONTH){
			//ÿ��...�ȹ���ʱ��
			endCal.add(CALENDAR_FIELD[transCycleTime(durationTime)], durationCount);
		}else if(DURATION_END_OF_MONTH == durationTime || DURATION_END_OF_YEAR == durationTime){
			if(DURATION_END_OF_MONTH == durationTime){
				endCal.add(Calendar.MONTH, durationCount);
			}else{
				endCal.add(Calendar.YEAR, durationCount);
				endCal.set(Calendar.MONTH, 1);
			}
			endCal.set(Calendar.DAY_OF_MONTH, 1);
			endCal.set(Calendar.HOUR_OF_DAY, 0);
			endCal.set(Calendar.MINUTE, 0);
			endCal.set(Calendar.SECOND, 0);
			endCal.set(Calendar.MILLISECOND, 0);
		}else{
			//�ǹ���ʱ��
			endCal.add(Calendar.SECOND, durationTime);
		}
		//��1��
		endCal.add(Calendar.SECOND, -1);
		
		if(logger.isDebugEnabled()) logger.debug("���λ����ʱ�䣺"+DateUtil.parseFormatDate("yyyy-MM-dd HH:mm:ss", endCal.getTime()));
		
		result = new ActivityDurationTime();
		result.setStartDate(date_format.format(startCal.getTime()));
		//�жϽ���ʱ�䣬�����ڻ����ʱ����ʹ�û����ʱ��
		if(endCal.getTime().getTime() > date_format.parse(endTime).getTime()){
			result.setEndDate(endTime);
		}else{
			result.setEndDate(date_format.format(endCal.getTime()));
		}
		return result;
	}
	/**
	 * ��ȡ�´λʱ�����
	 * @param startTime	���һ�ο�ʼʱ��
	 * @param endTime	����һ�ν���ʱ��
	 * @param referDate	����ʱ���Ƿ��ڻ�ڼ䣬��ActivityDateUtils.NOW_DATE��nullΪ��ǰʱ��
	 * @param cycleTime ��λ���ڣ��ǹ���ʱ���봫������������ÿ��(24H)��ÿ�ܣ�ÿ��,ÿ��Ϊһ�ܣ��봫�뱾��ĳ���
	 * @param cycleCount ʵ������������Ҫ��Թ���ʱ�䣬���磺cycleTimeΪCYCLE_WEEKLY(ÿ��)��ʵ����Ҫÿ1�ܣ��봫��1��ÿ2�ܣ��봫��2��Ĭ��Ϊ1
	 * @param durationTime �����ʱ�䣬ͬcycleTime�����ǹ���ʱ�䣬�봫������ʱ�䣬�����ڲ�����ȥ1���Լ������ʱ��
	 * @param durationCount ʵ�ʳ���������Ҫ��Թ���ʱ�䣬ͬcycleCount
	 * @throws ParseException 
	 */
	public static ActivityNextDuration nextActTimeCommon(String startTime, String endTime,
			Date referDate, int cycleTime, int cycleCount, int durationTime, int durationCount) 
					throws ParseException {
		vaildParams(startTime, endTime, referDate, cycleTime, cycleCount, durationTime, durationCount);
		//����ʱ��<�ʱ��
		DateFormat date_format = new SimpleDateFormat("yyyyMMddHHmmss");
		ActivityNextDuration result = null;
		Date firstDate = date_format.parse(startTime);
		if(isActDuring(startTime, endTime, referDate)<0){
			result = new ActivityNextDuration();
			result.setActDuration(false);
			result.setNextActTime(firstDate);
			return result;
		}else if(isActDuring(startTime, endTime, referDate)>0){
			result = new ActivityNextDuration();
			result.setActDuration(false);
			result.setNextActTime(null);
			return result;
		}
		if(null == referDate){
			referDate = new Date();
		}
		ActivityDurationTime activityDurationTime = durationTimeCommon(startTime, endTime, referDate, cycleTime, cycleCount, durationTime, durationCount);
		Calendar startCal = Calendar.getInstance();
		startCal.setTime(date_format.parse(activityDurationTime.getStartDate()));
		long startTimeInMillis = startCal.getTime().getTime();
		long referTimeInMillis = referDate.getTime();
		long endTimeInMillis = date_format.parse(activityDurationTime.getEndDate()).getTime();
		result = new ActivityNextDuration();
		if(referTimeInMillis >= startTimeInMillis && referTimeInMillis < endTimeInMillis){
			result.setActDuration(true);
		}else{
			result.setActDuration(false);
		}
		if(cycleTime < 0){
			//ÿ��...�ȹ���ʱ��
			startCal.add(CALENDAR_FIELD[transCycleTime(cycleTime)], cycleCount);
		}else{
			//�ǹ���ʱ��
			startCal.add(Calendar.SECOND, cycleTime);
		}
		result.setNextActTime(startCal.getTime());
		return result;
	}

	/**
	 * У�����
	 */
	private static void vaildParams(String startTime, String endTime, Date referDate, int cycleTime,
			int cycleCount, int durationTime, int durationCount) {
		if(StringUtils.isBlank(startTime) || StringUtils.isBlank(endTime) || cycleTime < CYCLE_SECONDLY || durationTime < DURATION_END_OF_YEAR || cycleCount <= 0 || durationCount <= 0){
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * ͨ��cycleTime���CALENDAR_FIELD�Ǳ�
	 */
	private static int transCycleTime(int cycleTime){
		switch (cycleTime) {
		case CYCLE_YEARLY:
			return 0;
		case CYCLE_MONTHLY:
			return 1;
		case CYCLE_WEEKLY:
			return 2;
		case CYCLE_DAILY:
			return 3;
		case CYCLE_HOURLY:
			return 4;
		case CYCLE_MINUTELY:
			return 5;
		case CYCLE_SECONDLY:
			return 6;
		default:
			return -1;
		}
	}
	
	/**
	 * �����µĹ���ʱ��ת���ɹ̶�����
	 */
	private static int transCalToSecond(int cycleTime) {
		switch (cycleTime) {
		case CYCLE_WEEKLY:
			return SECOND_WEEK;
		case CYCLE_DAILY:
			return SECOND_DAY;
		case CYCLE_HOURLY:
			return SECOND_HOUR;
		case CYCLE_MINUTELY:
			return SECOND_MINUTE;
		default:
			return 1;
		}
	}

	/**
	 * ����ʱ���Ƿ��ڼ�
	 * -1: �δ��ʼ
	 *  0: ��ڼ�
	 *  1: �����
	 * @param referDate ����ʱ�䣬��nullΪ��ǰʱ��
	 */
	public static byte isActDuring(String startTime, String endTime, Date referDate) throws ParseException{
		if(null == referDate){
			referDate = new Date();
		}
		DateFormat date_format = new SimpleDateFormat("yyyyMMddHHmmss");
		Date startDate = date_format.parse(startTime);
		if (referDate.getTime() < startDate.getTime()) {
			//logger.info("activity before: {}, {}", referDate.getTime(), startDate);
			return -1;
		}
		Date endDate = date_format.parse(endTime);
		if (referDate.getTime() > endDate.getTime()) {
			//logger.info("activity after: {}, {}", referDate.getTime(), endDate);
			return 1;
		}
		return 0;
	}
	
	/**
	 * ��ò���ʱ���ǵڼ��ڻ������Ϊ����ʱ��(ÿ��(24H),ÿ��...)
	 * @param firstDate	��һ�ڻ��ʼʱ��
	 * @param referDate	����ʱ���Ƿ��ڻ�ڼ䣬��ActivityDateUtils.NOW_DATE��nullΪ��ǰʱ��
	 * @param cycleTime ��λ���ڣ�����ĳ���
	 * @param cycleCount ʵ������������Ҫ��Թ���ʱ�䣬���磺cycleTimeΪCYCLE_WEEKLY(ÿ��)��ʵ����Ҫÿ1�ܣ��봫��1��ÿ2�ܣ��봫��2��Ĭ��Ϊ1
	 * @return -1:�����쳣
	 */
	public static int getCycleNumByNormal(Date firstDate, Date referDate, int cycleTime, int cycleCount){
		if(cycleTime > CYCLE_YEARLY || cycleTime < CYCLE_SECONDLY){
			throw new IllegalArgumentException("cycleTime �Ƿ�");
		}
		if(null == referDate){
			referDate = new Date();
		}
		if(cycleCount <= 0){
			cycleCount = 1;
		}
		//�ܡ��ա�ʱ���֡��붼�ǹ̶�����ʱ��
		if(cycleTime <= CYCLE_WEEKLY){
			int second = transCalToSecond(cycleTime);
			return getCycleNumByAbnormal(firstDate, referDate, second, cycleCount);
		}
		//�ꡢ�£��ǹ̶�����ʱ��
		//��������
		Calendar firstCal = Calendar.getInstance();
		firstCal.setTime(firstDate);
		Calendar referCal = Calendar.getInstance();
		referCal.setTime(referDate);
		int calType = CALENDAR_FIELD[transCycleTime(cycleTime)];
		int cycleNum = 0;
		if(CYCLE_MONTHLY == calType){
			//��
			int firstYear = firstCal.get(Calendar.YEAR);
			int firstMonth = firstCal.get(Calendar.YEAR);
			int referYear = referCal.get(Calendar.YEAR);
			int referMonth = referCal.get(Calendar.YEAR);
			if(firstYear == referYear){
				cycleNum = (referMonth - firstMonth) / cycleCount;
			}else{
				cycleNum = (12 * (referYear - firstYear + 1) + 12 - firstMonth + 1 + referMonth) / cycleCount;
			}
		}else{
			//��
			cycleNum = (referCal.get(calType) - firstCal.get(calType)) / cycleCount;
		}
		return cycleNum < 0 ? -1 : cycleNum + 1;
	}
	
	/**
	 * ��ò���ʱ���ǵڼ��ڻ�����ڷǹ���ʱ��
	 * @param firstDate	��һ�ڻ��ʼʱ��
	 * @param referDate	����ʱ��
	 * @param cycleTimeInSecond ����ڣ���λ��
	 * @param cycleCount ʵ������������Ҫ��Թ���ʱ�䣬���磺cycleTimeΪCYCLE_WEEKLY(ÿ��)��ʵ����Ҫÿ1�ܣ��봫��1��ÿ2�ܣ��봫��2��Ĭ��Ϊ1
	 * @return
	 */
	public static int getCycleNumByAbnormal(Date firstDate, Date referDate, int cycleTimeInSecond, int cycleCount){
		if(cycleCount <= 0){
			cycleCount = 1;
		}
		if(null == referDate){
			referDate = new Date();
		}
		//(����ʱ��-firstʱ��)/����
		//int����֧��68������
		int balance = (int)((referDate.getTime()-firstDate.getTime())/1000);
		//0>x<1��һ��
		int cycleNum = balance / (cycleTimeInSecond * cycleCount);
		return cycleNum < 0 ? -1 : cycleNum + 1;
	}

}
