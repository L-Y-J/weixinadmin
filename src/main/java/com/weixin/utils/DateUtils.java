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
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		try {
			timestamp = Timestamp.valueOf(dateString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return timestamp;
	}
}
