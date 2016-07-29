package com.handpay.obm.gascard.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.handpay.core.common.util.ObjectUtil;

public class DateUtil {
	
	public static final String format_yyyyMMddHHmmss="yyyyMMddHHmmss";
	public static final String format_yyyyMMdd="yyyyMMdd";
	public static final String format_three="yyyy/MM/dd HH:mm:ss";
	public static final String format_three2="yyyy-MM-dd HH:mm:ss";

	public static String getCurrTime(String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date());
	}
	
	public static String getCurrTimeAfterTime(int timeUnit,int num,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(timeUnit, num);
		String time=sdf.format(calendar.getTime());
		return time;
	}
	
	public static String offset(String format, int type, int offset){
		Calendar c = Calendar.getInstance();
		c.add(type, offset);
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(c.getTime());
	}
	public static String timeFormat(String time,String oldType,String newType)throws Exception{
		SimpleDateFormat fo = new SimpleDateFormat(oldType);
		SimpleDateFormat format = new SimpleDateFormat(newType);
		if(!StringUtils.isEmpty(time)){
			Date date1=null;
			try {
				date1 = fo.parse(time);
				time=format.format(date1);
			} catch (Exception e) {
				throw e;
			}
		}
		return time;
	}
	
	public static String add(String time,String oldType,int timeUnit,int num,String newType)throws Exception{
		SimpleDateFormat fo = new SimpleDateFormat(oldType);
		SimpleDateFormat format = new SimpleDateFormat(newType);
		if(!StringUtils.isEmpty(time)){
			Date date1=null;
			try {
				date1 = fo.parse(time);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(date1);
				calendar.add(timeUnit, num);
				time=format.format(calendar.getTime());
			} catch (Exception e) {
				throw e;
			}
		}
		return time;
	}
	
	public static void main(String[] args){
		try {
			System.out.println(DateUtil.getCurrTimeAfterTime(Calendar.SECOND,-60*60,DateUtil.format_yyyyMMddHHmmss));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			System.out.println(timeFormat("20151118","yyyyMMdd","yyyy-MM-dd"));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		long s=System.currentTimeMillis();
		try {
			System.out.println(add("20150630235959","yyyyMMddHHmmss",Calendar.SECOND,-1,"yyyyMMddHHmmss"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		long e=System.currentTimeMillis();
		System.out.println(e-s);
	}
	
	/**
	 * 获取当前时间一百年以后的时间
	 * @return
	 */
	public static String get100yearsLaterTime(){
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 100);
		Date date = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	    String dateStr = sdf.format(date);
	    try {
	    	dateStr = timeFormat(dateStr, "yyyyMMdd",DateUtil.format_yyyyMMddHHmmss);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateStr;
	}
	
	
	
	
	/**
	 * 返回两个日期相差的天数
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static long getDistDates(Date startDate, Date endDate) {
		long totalDate = 0;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);

		long timestart = calendar.getTimeInMillis();
		calendar.setTime(endDate);
		long timeend = calendar.getTimeInMillis();

		totalDate = (timeend - timestart) / (1000 * 60 * 60 * 24);
		return totalDate;
	}
	/**
	 * 给定指定模式，指定日期字符串
	 * 
	 * @param pattern
	 *            模式如(yyyyMMddHHmmss...)
	 * @param date
	 *            日期
	 * @return 解释后返回的日期对象
	 */
	public static Date parseDate(String pattern, String date) {
		if (ObjectUtil.isNull(pattern) || ObjectUtil.isNull(date))
			return null;
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		try {
			return format.parse(date);
		} catch (ParseException e) {
			Logger.getLogger("MyDateUtil").warn(e.getMessage(), e);
			return null;
		}
	}
	/**
	 * 根据基准时间加上天数,得到新的时间
	 * 
	 * @param baseDate
	 *            基准时间
	 * @param days
	 *            天数
	 * @return
	 */
	public static Date addDays(Date baseDate, int days) {
		Calendar expiration = Calendar.getInstance();
		expiration.setTime(baseDate);
		expiration.add(Calendar.DAY_OF_MONTH, days);

		return expiration.getTime();
	}
	
	/**
	 * 根据基准时间加上天数,得到新的时间
	 * 
	 * @param baseDate
	 *            基准时间
	 * @param days
	 *            天数
	 * @return
	 */
	public static String addDays(Date baseDate, int days,String pattern) {
		Calendar expiration = Calendar.getInstance();
		expiration.setTime(baseDate);
		expiration.add(Calendar.DAY_OF_MONTH, days);
		Date targetTime=expiration.getTime();
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(targetTime);
	}
	
	/**
	 * 给定指定模式，指定日期字符串
	 * 
	 * @param pattern
	 *            模式如(yyyyMMddHHmmss...)
	 * @param date
	 *            日期
	 * @return 解释后返回的日期对象
	 */
	public static String parseDate(String pattern, Date date) {
		/*if (null == date || ObjectUtil.isNull(pattern))
			return null;*/
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}
}
