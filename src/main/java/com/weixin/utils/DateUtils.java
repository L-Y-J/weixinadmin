package com.weixin.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by yongjie on 14-10-10.
 */
public class DateUtils {

	public static String ConvertTimeStampToString(Timestamp timestamp){
		String tsStr = "";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			tsStr=dateFormat.format(timestamp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tsStr;
	}

	public static Timestamp ConvertStringToTimeStamp(String dateString){
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		format.setLenient(false);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		try {
			timestamp = new Timestamp(format.parse(dateString).getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return timestamp;
	}
}
