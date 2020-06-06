package com.files.util;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TimeUtil {

	private static Long second = 1000L;
	private static Long minute = 60 * second;
	private static Long hour = 60 * minute;
	private static Long day = 24 * hour;
	private static Long year = 365 * day;

	public static String numDaysAgo(Timestamp timestamp) {
		Long diffMills = System.currentTimeMillis() - timestamp.getTime();
		if (year > diffMills && diffMills > day) {
			int daysDiff = (int) (diffMills / day);
			return daysDiff + " Days ago";
		} else if (day > diffMills && diffMills > hour) {
			int hoursDiff = (int) (diffMills / hour);
			return hoursDiff + " An hour ago";
		} else if (hour > diffMills && diffMills > minute) {
			int minutesDiff = (int) (diffMills / minute);
			return minutesDiff + " minutes ago";
		} else if (minute > diffMills && diffMills > second) {
			int secondsDiff = (int) (diffMills / second);
			return secondsDiff + " Seconds ago";
		} else if (second > diffMills) {
			return "Just now";
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date(timestamp.getTime());
		return simpleDateFormat.format(date);
	}

	public static String dateFormat(Timestamp timestamp) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date(timestamp.getTime());
		return simpleDateFormat.format(date);
	}

}
