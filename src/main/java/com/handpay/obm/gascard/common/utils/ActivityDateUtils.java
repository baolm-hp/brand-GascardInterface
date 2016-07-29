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
 * 通用活动日期工具类
 * @author xllv
 *
 */
public class ActivityDateUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(ActivityDateUtils.class);
	
	public static final Date NOW_DATE = null;
	
	/*
	 * 数组角标:年0, 月1, 周2, 日3, 时4, 分5, 秒6
	 */
	public static final int[] CALENDAR_FIELD = { Calendar.YEAR, Calendar.MONTH,
												Calendar.WEEK_OF_MONTH, Calendar.DAY_OF_MONTH,
												Calendar.HOUR_OF_DAY, Calendar.MINUTE, Calendar.SECOND };
	
	/** 一周的秒数 60*60*24*7 */
	public static final int SECOND_WEEK = 604800;
	
	/** 一天的秒数 60*60*24 */
	public static final int SECOND_DAY = 86400;
	
	/** 一小时的秒数 60*60 */
	public static final int SECOND_HOUR = 3600;
	
	/** 一分钟的秒数 60 */
	public static final int SECOND_MINUTE = 60;
	
	/** 每1年 */
	public static final int CYCLE_YEARLY = -1;
	
	/** 每1月 */
	public static final int CYCLE_MONTHLY = -2;
	
	/** 每1周 */
	public static final int CYCLE_WEEKLY = -3;
	
	/** 每1天 */
	public static final int CYCLE_DAILY = -4;
	
	/** 每1小时 */
	public static final int CYCLE_HOURLY = -5;
	
	/** 每1分钟 */
	public static final int CYCLE_MINUTELY = -6;
	
	/** 每1秒 */
	public static final int CYCLE_SECONDLY = -7;
	
	/** 每1年 */
	public static final int DURATION_YEARLY = -1;
	
	/** 每1月 */
	public static final int DURATION_MONTHLY = -2;
	
	/** 每1周 */
	public static final int DURATION_WEEKLY = -3;
	
	/** 每1天 */
	public static final int DURATION_DAILY = -4;
	
	/** 每1小时 */
	public static final int DURATION_HOURLY = -5;
	
	/** 每1分钟 */
	public static final int DURATION_MINUTELY = -6;
	
	/** 每1秒 */
	public static final int DURATION_SECONDLY = -7;
	
	/** 持续时间至月底，周及周以下请传入秒数或规则周期变量 */
	public static final int DURATION_END_OF_MONTH = -8;
	
	/** 持续时间至年底，周及周以下请传入秒数或规则周期变量 */
	public static final int DURATION_END_OF_YEAR = -9;
	
	/**
	 * 
	 * @param referDate		参照时间
	 * @param cycleTime		单位周期，非规则时间请传入秒数，若以每日(24H)，每周，每月,每年为一周，请传入本类的常量
	 * @param addDateCount	增加或减少时间周期
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
			//每日...等规则时间
			referCal.add(CALENDAR_FIELD[transCycleTime(cycleTime)], addDateCount);
		}else{
			//非规则时间
			referCal.add(Calendar.SECOND, cycleTime * addDateCount);
		}
		return referCal.getTime();
	}
	
	/**
	 * 获取活动周期时间对象
	 * @param startTime	活动第一次开始时间
	 * @param endTime	活动最后一次结束时间
	 * @param referDate	参照时间是否在活动期间，传ActivityDateUtils.NOW_DATE或null为当前时间
	 * @param cycleTime 单位周期，非规则时间请传入秒数，若以每日(24H)，每周，每月,每年为一周，请传入本类的常量
	 * @param cycleCount 实际周期数，主要针对规则时间，例如：cycleTime为CYCLE_WEEKLY(每周)，实际需要每1周，请传入1；每2周，请传入2，默认为1
	 * @param durationTime 活动持续时间，同cycleTime，若非规则时间，请传入整数时间，方法内部将减去1秒以计算最后活动时间
	 * @param durationCount 实际持续数，主要针对规则时间，同cycleCount
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
		
		if(logger.isDebugEnabled()) logger.debug("活动第一次开始时间："+DateUtil.parseFormatDate("yyyy-MM-dd HH:mm:ss", startCal.getTime()));
		
		if(cycleTime < 0){
			//每日...等规则时间
			int cycleNum = getCycleNumByNormal(firstDate, referDate, cycleTime, cycleCount);
			startCal.add(CALENDAR_FIELD[transCycleTime(cycleTime)], (cycleNum-1) * cycleCount);
		}else{
			//非规则时间
			int cycleNum = getCycleNumByAbnormal(firstDate, referDate, cycleTime, cycleCount);
			startCal.add(Calendar.SECOND, (cycleNum-1) * cycleTime);
		}
		
		if(logger.isDebugEnabled()) logger.debug("本次活动开始时间："+DateUtil.parseFormatDate("yyyy-MM-dd HH:mm:ss", startCal.getTime()));
		
		endCal.setTime(startCal.getTime());
		if(durationTime < 0 && durationTime > DURATION_END_OF_MONTH){
			//每日...等规则时间
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
			//非规则时间
			endCal.add(Calendar.SECOND, durationTime);
		}
		//减1秒
		endCal.add(Calendar.SECOND, -1);
		
		if(logger.isDebugEnabled()) logger.debug("本次活动结束时间："+DateUtil.parseFormatDate("yyyy-MM-dd HH:mm:ss", endCal.getTime()));
		
		result = new ActivityDurationTime();
		result.setStartDate(date_format.format(startCal.getTime()));
		//判断结束时间，如晚于活动结束时间则使用活动结束时间
		if(endCal.getTime().getTime() > date_format.parse(endTime).getTime()){
			result.setEndDate(endTime);
		}else{
			result.setEndDate(date_format.format(endCal.getTime()));
		}
		return result;
	}
	/**
	 * 获取下次活动时间对象
	 * @param startTime	活动第一次开始时间
	 * @param endTime	活动最后一次结束时间
	 * @param referDate	参照时间是否在活动期间，传ActivityDateUtils.NOW_DATE或null为当前时间
	 * @param cycleTime 单位周期，非规则时间请传入秒数，若以每日(24H)，每周，每月,每年为一周，请传入本类的常量
	 * @param cycleCount 实际周期数，主要针对规则时间，例如：cycleTime为CYCLE_WEEKLY(每周)，实际需要每1周，请传入1；每2周，请传入2，默认为1
	 * @param durationTime 活动持续时间，同cycleTime，若非规则时间，请传入整数时间，方法内部将减去1秒以计算最后活动时间
	 * @param durationCount 实际持续数，主要针对规则时间，同cycleCount
	 * @throws ParseException 
	 */
	public static ActivityNextDuration nextActTimeCommon(String startTime, String endTime,
			Date referDate, int cycleTime, int cycleCount, int durationTime, int durationCount) 
					throws ParseException {
		vaildParams(startTime, endTime, referDate, cycleTime, cycleCount, durationTime, durationCount);
		//持续时间<活动时间
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
			//每日...等规则时间
			startCal.add(CALENDAR_FIELD[transCycleTime(cycleTime)], cycleCount);
		}else{
			//非规则时间
			startCal.add(Calendar.SECOND, cycleTime);
		}
		result.setNextActTime(startCal.getTime());
		return result;
	}

	/**
	 * 校验参数
	 */
	private static void vaildParams(String startTime, String endTime, Date referDate, int cycleTime,
			int cycleCount, int durationTime, int durationCount) {
		if(StringUtils.isBlank(startTime) || StringUtils.isBlank(endTime) || cycleTime < CYCLE_SECONDLY || durationTime < DURATION_END_OF_YEAR || cycleCount <= 0 || durationCount <= 0){
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * 通过cycleTime获得CALENDAR_FIELD角标
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
	 * 周以下的规则时间转换成固定秒数
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
	 * 参照时间是否活动期间
	 * -1: 活动未开始
	 *  0: 活动期间
	 *  1: 活动结束
	 * @param referDate 参照时间，传null为当前时间
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
	 * 获得参照时间是第几期活动，周期为规则时间(每日(24H),每周...)
	 * @param firstDate	第一期活动开始时间
	 * @param referDate	参照时间是否在活动期间，传ActivityDateUtils.NOW_DATE或null为当前时间
	 * @param cycleTime 单位周期，本类的常量
	 * @param cycleCount 实际周期数，主要针对规则时间，例如：cycleTime为CYCLE_WEEKLY(每周)，实际需要每1周，请传入1；每2周，请传入2，默认为1
	 * @return -1:参数异常
	 */
	public static int getCycleNumByNormal(Date firstDate, Date referDate, int cycleTime, int cycleCount){
		if(cycleTime > CYCLE_YEARLY || cycleTime < CYCLE_SECONDLY){
			throw new IllegalArgumentException("cycleTime 非法");
		}
		if(null == referDate){
			referDate = new Date();
		}
		if(cycleCount <= 0){
			cycleCount = 1;
		}
		//周、日、时、分、秒都是固定秒数时间
		if(cycleTime <= CYCLE_WEEKLY){
			int second = transCalToSecond(cycleTime);
			return getCycleNumByAbnormal(firstDate, referDate, second, cycleCount);
		}
		//年、月，非固定秒数时间
		//日期类型
		Calendar firstCal = Calendar.getInstance();
		firstCal.setTime(firstDate);
		Calendar referCal = Calendar.getInstance();
		referCal.setTime(referDate);
		int calType = CALENDAR_FIELD[transCycleTime(cycleTime)];
		int cycleNum = 0;
		if(CYCLE_MONTHLY == calType){
			//月
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
			//年
			cycleNum = (referCal.get(calType) - firstCal.get(calType)) / cycleCount;
		}
		return cycleNum < 0 ? -1 : cycleNum + 1;
	}
	
	/**
	 * 获得参照时间是第几期活动，周期非规则时间
	 * @param firstDate	第一期活动开始时间
	 * @param referDate	参照时间
	 * @param cycleTimeInSecond 活动周期，单位秒
	 * @param cycleCount 实际周期数，主要针对规则时间，例如：cycleTime为CYCLE_WEEKLY(每周)，实际需要每1周，请传入1；每2周，请传入2，默认为1
	 * @return
	 */
	public static int getCycleNumByAbnormal(Date firstDate, Date referDate, int cycleTimeInSecond, int cycleCount){
		if(cycleCount <= 0){
			cycleCount = 1;
		}
		if(null == referDate){
			referDate = new Date();
		}
		//(参照时间-first时间)/周期
		//int类型支持68个周年
		int balance = (int)((referDate.getTime()-firstDate.getTime())/1000);
		//0>x<1第一期
		int cycleNum = balance / (cycleTimeInSecond * cycleCount);
		return cycleNum < 0 ? -1 : cycleNum + 1;
	}

}
