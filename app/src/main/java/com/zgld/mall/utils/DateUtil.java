package com.zgld.mall.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

import android.text.TextUtils;

/**
 * 日期操作工具类.
 * 
 * @author LongLiuPing
 * 
 */
public class DateUtil {
	private static final String dateFormat1 = "yyyy/MM/dd HH:mm:ss.SSS";
	private static final String dateFormat2 = "yyyy年MM月dd日";
	public static String getAddTime() {
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return sDateFormat.format(new Date());
	}
	public static String getDateFromString(String dateStr) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(dateFormat1);
		Date date = format.parse(dateStr);
		SimpleDateFormat format2 = new SimpleDateFormat(dateFormat2);
		return format2.format(date);
	}

	private static final String FORMAT = "yyyy-MM-dd HH:mm:ss";

	public static Date str2Date(String str) {
		return str2Date(str, null);
	}

	public static Date str2Date(String str, String format) {
		if (str == null || str.length() == 0) {
			return null;
		}
		if (format == null || format.length() == 0) {
			format = FORMAT;
		}
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			date = sdf.parse(str);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;

	}

	public static Calendar str2Calendar(String str) {
		return str2Calendar(str, null);

	}

	public static Calendar str2Calendar(String str, String format) {

		Date date = str2Date(str, format);
		if (date == null) {
			return null;
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);

		return c;

	}

	public static String date2Str(Calendar c) {// yyyy-MM-dd HH:mm:ss
		return date2Str(c, null);
	}

	public static String date2Str(Calendar c, String format) {
		if (c == null) {
			return null;
		}
		return date2Str(c.getTime(), format);
	}

	public static String date2Str(Date d) {// yyyy-MM-dd HH:mm:ss
		return date2Str(d, null);
	}

	public static String date2Str(Date d, String format) {// yyyy-MM-dd HH:mm:ss
		if (d == null) {
			return null;
		}
		if (format == null || format.length() == 0) {
			format = FORMAT;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String s = sdf.format(d);
		return s;
	}

	public static String getCurDateStr() {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		return c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH) + "-" + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND);
	}

	/**
	 * 获得当前日期的字符串格式
	 * 
	 * @param format
	 * @return
	 */
	public static String getCurDateStr(String format) {
		Calendar c = Calendar.getInstance();
		return date2Str(c, format);
	}

	// 格式到秒
	public static String getMillon(long time) {

		return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(time);

	}

	// 格式到天
	public static String getDay(long time) {

		return new SimpleDateFormat("yyyy-MM-dd").format(time);

	}

	// 格式到毫秒
	// public static String getSMillon(long time) {
	//
	// // return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS").format(time);
	// return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(time);
	// }

	public static String getSMillon(String time) {

		// return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS").format(time);
		if (TextUtils.isEmpty(time)) {
			return time;
		}
		time = time.replace("/Date(", "");// \/Date(1436343192147)\/
		time = time.replace(")/", "");
		time = time.replace(")", "");
		time = time.replace("/", "");
		time = time.replace("(", "");
		time = time.replace("Date", "");
		time = time.replace("\\", "");
		if (time.indexOf("-") > 0) {
			return time;
		}
		if (isNumeric2(time)) {
			return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Long.parseLong(time));
		} else {
			return time;
		}
	}

	// 1用JAVA自带的函数
	public static boolean isNumeric1(String str) {
		for (int i = str.length(); --i >= 0;) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	// 2用正则表达式
	public static boolean isNumeric2(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		return pattern.matcher(str).matches();
	}

	// 3用ascii码
	public static boolean isNumeric3(String str) {
		for (int i = str.length(); --i >= 0;) {
			int chr = str.charAt(i);
			if (chr < 48 || chr > 57)
				return false;
		}
		return true;
	}

	/**
	 * 2014年11月3日 AM11:39:22
	 * 
	 * @param strDate
	 * @return
	 */
	public static long convertChatDate(String strDate) {
		Date d = new Date();
		try {
			if (strDate != null) {
				strDate = strDate.replace("上午", "AM");
				strDate = strDate.replace("下午", "PM");
				strDate = strDate.replace("年", "-");
				strDate = strDate.replace("月", "-");
				strDate = strDate.replace("日", "");
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd ahh:mm:ss", Locale.ENGLISH);
			if (d != null) {
				d = sdf.parse(strDate);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return d.getTime();
	}

	public static long[] times(long endTime) {
		// 按照传入的格式生成一个simpledateformate对象
		SimpleDateFormat sd = new SimpleDateFormat("yyyy MM dd HH mm ss");
		long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数
		long nh = 1000 * 60 * 60;// 一小时的毫秒数
		long nm = 1000 * 60;// 一分钟的毫秒数
		long ns = 1000;// 一秒钟的毫秒数
		long diff;
		long day = 0;
		long hour = 0;
		long min = 0;
		long sec = 0;
		diff = endTime - new Date().getTime();
		day = diff / nd;// 计算差多少天
		hour = diff % nd / nh + day * 24;// 计算差多少小时
		min = diff % nd % nh / nm + day * 24 * 60;// 计算差多少分钟
		sec = diff % nd % nh % nm / ns;// 计算差多少秒
		// 输出结果
		// System.out.println("时间相差：" + day + "天" + (hour - day * 24) + "小时" +
		// (min - day * 24 * 60) + "分钟" + sec + "秒。");
		// System.out.println("hour=" + hour + ",min=" + min);
		long days = day;
		long mhs = (hour - day * 24);
		long nms = (min - day * 24 * 60);
		long nss = sec;
		return new long[] { days, mhs, nms, nss };
	}

	public static long trimDate(String d) {
		String date = d;
		if (date == null) {
			return 0;
		}
		date = date.replace("Date", "");
		date = date.replace("(", "");
		date = date.replace(")", "");
		date = date.replace("/", "");
		if (date == null) {
			return 0;
		}
		if (!PriceUtil.isLong(date)) {
			try {
				SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				return sd.parse(d).getTime();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 0;
			}
		} else {
			return Long.parseLong(date);
		}
	}

	public static long n24 = 1000 * 24 * 60 * 60;// 一天的毫秒数
	public static long n8 = 1000 * 8 * 60 * 60;// 8小时的毫秒数
	public static long n1 = 1000 * 60 * 60;// 一小时的毫秒数
	public static long nm = 1000 * 60;// 一分钟的毫秒数
	public static long ns = 1000;// 一秒钟的毫秒数
	public static long nd = 1000 * 24 * 60 * 60;// 24的毫秒数
	public static long nh = 1000 * 60 * 60;// 一小时的毫秒数

}
