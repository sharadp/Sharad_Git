package com.swv.oscar.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NaturalUtil {

	public static String getSystemKey() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getCurrentDate(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getCurrentUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getCurrentProgram() {
		// TODO Auto-generated method stub
		return "WE#E166";
	}

	public static String getMaskValue(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean getContactphoneorFax(String contactPhone) {
		Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\d{3}-\\d{4}");
		Matcher matcher = pattern.matcher(contactPhone); 
		 if (matcher.matches()) {
			 return true;
		 }else{
			 return false;
		 }
	}

	public static Date adddays(Date date, Integer howmanydays) {
	        Calendar c = Calendar.getInstance();
	        c.setTime(date);

	        c.add(Calendar.DATE, howmanydays); 
	        Date currentDatePlusOne = c.getTime();
			return currentDatePlusOne;
	}
	
	public static boolean compareBetweenTimeStamp(String fromTimestamp,String toTimestamp) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
	    Date parsedfromTimestamp = dateFormat.parse(fromTimestamp);
	    Date parsedtoTimestamp = dateFormat.parse(toTimestamp);
	    return dateFormat.format(parsedfromTimestamp).equals(dateFormat.format(parsedtoTimestamp));
		
	}

	public static boolean isInteger(String string) {
		try
		{
			Integer.parseInt(string);
			return true;
		}
		catch (NumberFormatException ex)
		{
			return false;
		}
	}
}
