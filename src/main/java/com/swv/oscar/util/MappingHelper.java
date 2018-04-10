package com.swv.oscar.util;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MappingHelper {

   private static final String DATABASE = "Oracle";
   private static final String DATE_FORMAT_ORCL = "YYMMDD";
   private static final String DATE_FORMAT_DB2 = "yyyy-MM-dd";
   private static String dateTimeFormatOrcl = "yyyyMMddHHmmsssssss";
   private static String dateTimeFormatDB2 = "yyyy-MM-dd HH:mm:ss";

   private static final OscarLogger LOGGER = OscarLogger.create(MappingHelper.class);
   private MappingHelper() {
   }

   public static String subString(String mapString, String startPos, String length) {
      if (mapString != null) {
         int startInd = Integer.parseInt(startPos);
         int len = Integer.parseInt(length);
         return mapString.substring(startInd, startInd + len);
      }
      return mapString;
   }

   public static String subString(String mapString, int startInd, int length) {
      if (mapString != null) {
         String targetString = null;
         if (mapString.length() > startInd + length) {
            targetString = mapString.substring(startInd, startInd + length);
         } else if (mapString.length() > startInd) {
            targetString = mapString.substring(startInd);
         } else {
            targetString = "";
         }
         return targetString;
      }
      return mapString;
   }

   public static String subString(String mapString, int startInd) {
      String targetString = null;
      if (mapString != null) {
         if (mapString.length() > startInd) {
            targetString = mapString.substring(startInd);
         } else {
            targetString = "";
         }
      }
      return targetString;
   }

   public static String getRtrim(String mapString) {
      String mapString1 = null;
      if (mapString != null) {
         mapString1 = mapString.trim();
      }
      return mapString1;
   }

   public static String getFormattedDate(Date date, String format) {
      SimpleDateFormat sdf = new SimpleDateFormat(format);
      return sdf.format(date);
   }

   public static String getFormattedDate(String date, String fromFormat, String toFormat) {
      try {
         Date dateV = new SimpleDateFormat(fromFormat).parse(date);

         SimpleDateFormat sdf = new SimpleDateFormat(toFormat);
         return sdf.format(dateV);
      } catch (ParseException e) {
    	  LOGGER.error(e.getMessage());
      }
      return "";
   }

   public static String getFormattedDate(Date date) {
      String defaultFormat = "EEEE, d MMM yyyy";
      return getFormattedDate(date, defaultFormat);
   }

   public static Timestamp getTimeStamp() {
	   long timeInMillis = System.currentTimeMillis();
	   long timeInNanos = System.nanoTime();
	   Timestamp timestamp = new Timestamp(timeInMillis);
	   timestamp.setNanos((int)(timeInNanos%1000000000));
      return timestamp;
   }

   public static Date appendTimeToDate(Date date, String time) {
      DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      String dateString = dateFormat.format(date);
      SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      Date dateWithTime = null;
      try {
         dateWithTime = dateTimeFormat.parse(dateString + " " + time);
      } catch (ParseException e) {
    	  LOGGER.error(e.getMessage());
      }
      return dateWithTime;

   }

   public static Date getTime(Date variable) {
      return variable;
   }

   public static Date getTime() {
      return new Date();
   }

   public static Date getTime(String mapTime, String timePattern) {
      Date date = new Date();
      String timeFormat = timePattern;
      if (mapTime != null && !mapTime.isEmpty()) {
         if (timeFormat != null
               && (("%0t.%0m.%0s").equalsIgnoreCase(timePattern) || ("%0t:%0m:%0s").equalsIgnoreCase(timePattern)
                     || ("%0t,%0m,%0s").equalsIgnoreCase(timePattern))) {
            timeFormat = "hh:mm:ss";
         }
         DateFormat format = new SimpleDateFormat(timeFormat);
         try {
            date = format.parse(mapTime);
         } catch (ParseException e) {
        	 LOGGER.error(e.getMessage());
         }
      }
      return date;
   }

   public static Date getDate(Date variable) {
      return variable;
   }

   public static Date getDate(String mapDate, String datePattern) {

      String datePattern1 = null;

      if (datePattern != null && ("%Y-%0m-%0d").equalsIgnoreCase(datePattern)) {
         datePattern1 = "yyyy-MM-dd";
      } else if (datePattern != null && ("%0d.%0m.%Y").equalsIgnoreCase(datePattern)) {
         datePattern1 = "dd-MM-yyyy";
      } else if (datePattern != null && ("%0d-%0m-%Y").equalsIgnoreCase(datePattern)) {
         datePattern1 = "dd-MM-yyyy";
      } else if (datePattern != null && ("%0d%0m%Y").equalsIgnoreCase(datePattern)) {
         datePattern1 = "dd-MM-yyyy";
      } else if (datePattern != null && ("%0Y.%0M.%d").equalsIgnoreCase(datePattern)) {
          datePattern1 = "YYYY.MM.dd";
      } else {
         datePattern1 = datePattern;
      }

      if (mapDate != null && !("").equalsIgnoreCase(mapDate) && !("").equalsIgnoreCase(datePattern1)) {

         Date date = null;
         try {
            date = new SimpleDateFormat(datePattern1).parse(mapDate);
            return date;
         } catch (ParseException e) {
        		LOGGER.error(e.getMessage());
         }
         return date;
      }

      return null;

   }

   public static Date getDate() {
      return new Date();
   }

   public static String getChar(Date sourceVariable, String pattern) {
      String pattern1 = null;
      if (pattern != null && ("%Y%0m%0d").equalsIgnoreCase(pattern)) {
         pattern1 = "yyyyMMdd";
      } else if (pattern != null && ("%0t:%0m").equalsIgnoreCase(pattern)) {
         pattern1 = "hh:ms";
      } else if (pattern != null && ("%Y-%0m-%0d").equalsIgnoreCase(pattern)) {
         pattern1 = "yyyy-MM-dd";
      } else if (pattern != null && ("%0d.%0m.%Y").equalsIgnoreCase(pattern)) {
         pattern1 = "dd.MM.yyyy";
      } else if (pattern != null && ("%0d.%0m.%0Y").equalsIgnoreCase(pattern)) {
         pattern1 = "dd.MM.yyyy";
      } else if (pattern != null && ("%0d-%0m-%Y").equalsIgnoreCase(pattern)) {
         pattern1 = "dd-MM-yyyy";
      } else {
         pattern1 = pattern;
      }

      DateFormat formatter = new SimpleDateFormat(pattern1);
      String formattedDate = null;
      if (sourceVariable != null) {
         formattedDate = formatter.format(sourceVariable);
      }
      return formattedDate;
   }

   public static String getUpperCase(String source) {
      String formattedSource = null;
      if (source != null) {
         formattedSource = source.toUpperCase(Locale.ENGLISH);
      }
      return formattedSource;
   }

   public static int getStringLength(String source) {
      int length = 0;
      if (source != null) {
         length = source.length();
      }
      return length;
   }

   public static int getSize(String source) {
      return source.length();
   }

   public static int getDay(String source) {
      if (source != null && !("").equalsIgnoreCase(source)) {
         try {
            Date date = new SimpleDateFormat("dd.MM.yyyy").parse(source);
            Calendar calDate = Calendar.getInstance();
            DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            format.format(date);
            calDate = format.getCalendar();
            return calDate.get(Calendar.DAY_OF_MONTH);
         } catch (ParseException e) {
        		LOGGER.error(e.getMessage());
         }
      }
	return 0;
   }

   public static int getDay(Date date) {
	   if (date != null) {
		   DateFormat format = new SimpleDateFormat("yyyy/mm/dd");
		   format.format(date);
		   Calendar calDate = format.getCalendar();
		   return calDate.get(Calendar.DAY_OF_MONTH);
	   }
	   return 0;
   }

   public static int getMonth(String source) {
      if (source != null && !("").equalsIgnoreCase(source)) {
         try {
            Date date = new SimpleDateFormat("dd.MM.yyyy").parse(source);
            DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            format.format(date);
            Calendar calDate = format.getCalendar();
            return calDate.get(Calendar.MONTH);
         } catch (ParseException e) {
        	 	LOGGER.error(e.getMessage());
         }
         return 0;
      }
      return 0;
   }

   public static int getMonth(Date date) {
	   if (date != null) {
		   DateFormat format = new SimpleDateFormat("yyyy/mm/dd");
		   format.format(date);
		   Calendar calDate = format.getCalendar();
		   return calDate.get(Calendar.MONTH) + 1; // month index starting
	   }
	   return 0;
   }

   public static int getYear(String source) {
      if (source != null && !("").equalsIgnoreCase(source)) {
         try {
            Date date = new SimpleDateFormat("dd.MM.YYYY").parse(source);
            Calendar calDate = Calendar.getInstance();
            DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            format.format(date);
            calDate = format.getCalendar();
            return calDate.get(Calendar.YEAR);
         } catch (ParseException e) {
        		LOGGER.error(e.getMessage());
         }
         return 0;
      }
      return 0;
   }

   public static int getYear(Date date) {
	   if (date != null) {
		   DateFormat format = new SimpleDateFormat("yyyy/mm/dd");
		   format.format(date);
		   Calendar calDate = format.getCalendar();
		   return calDate.get(Calendar.YEAR);
	   }
	   return 0;
   }

   public static int getDayofWeek(String source) {
      if (source != null && !("").equalsIgnoreCase(source)) {
         try {
            Date date = new SimpleDateFormat("dd.MM.YYYY").parse(source);
            Calendar calDate = Calendar.getInstance();
            DateFormat format = new SimpleDateFormat("yyyy/mm/dd");
            format.format(date);
            calDate = format.getCalendar();
            return calDate.get(Calendar.DAY_OF_WEEK);
         } catch (ParseException e) {
        		LOGGER.error(e.getMessage());
         }
         return 0;
      }
      return 0;
   }

   public static int getDayofWeek(Date date) {

      if (date != null) {
            DateFormat format = new SimpleDateFormat("yyyy/mm/dd");
            format.format(date);
            Calendar calDate = format.getCalendar();
            return calDate.get(Calendar.DAY_OF_WEEK);
      }
      return 0;
   }

   public static int getStrPositon(String source, String subString) {
      if (source != null && !("").equalsIgnoreCase(source)) {
         return source.indexOf(subString);
      }
      return 0;
   }

   public static boolean getStrPositonForNumeric(String source, String subString) {
      if (source != null && !("").equalsIgnoreCase(source)) {
         return source.contains(subString);
      }
      return false;
   }

   public static double changeToDouble(String inputString) {
      double doubleValue = 0.0;
      if (inputString != null && !(("").equals(inputString.trim()))) {
         try {
            doubleValue = Double.valueOf(inputString);
         } catch (NumberFormatException e) {
        		LOGGER.error(e.getMessage());
         }
      }
      return doubleValue;
   }

   public static String getGetterMethodName(String fieldName) {
      return "get" + fieldName.substring(0, 1).toUpperCase(Locale.ENGLISH) + fieldName.substring(1);
   }

   public static String getSetterMethodName(String fieldName) {
      return "set" + fieldName.substring(0, 1).toUpperCase(Locale.ENGLISH) + fieldName.substring(1);
   }

   public static String getFormattedDatePerDB(Date date) {
      if (date == null) {
         return null;
      }
      String formatedDate;
      if (("Oracle").equalsIgnoreCase(DATABASE)) {
         formatedDate = getFormattedDate(date, DATE_FORMAT_ORCL);
      } else {
         formatedDate = getFormattedDate(date, DATE_FORMAT_DB2);
      }
      return formatedDate;
   }

   public static String getFormattedDateTimePerDB(Date date) {
      if (date == null) {
         return null;
      }
      String formatedDate;
      if (("Oracle").equalsIgnoreCase(DATABASE)) {
         formatedDate = getFormattedDate(date, dateTimeFormatOrcl);
      } else {
         formatedDate = getFormattedDate(date, dateTimeFormatDB2);
      }
      return formatedDate;
   }

   public static java.sql.Date toSQLDate(Date date) {
      if (date == null) {
         return null;
      }
      return new java.sql.Date(date.getTime());
   }

   public static java.sql.Timestamp toSQLTimeStamp(Date date) {
      if (date == null) {
         return null;
      }
      return new java.sql.Timestamp(date.getTime());
   }

 

   public static String getCurrencyFormmatted(Double input, boolean replcMinus) {
      String output = null;
      Locale dkLocale = new Locale("da", "DK");
      NumberFormat danishFormat = NumberFormat.getCurrencyInstance(dkLocale);
      if (input != null) {
         String formattedInput = danishFormat.format(input).replace("kr", "");
         if (replcMinus) {
            int minusIndex = formattedInput.indexOf('-');
            if (minusIndex >= 0) {
               output = formattedInput.replace("-", "");
            } else {
               output = formattedInput;
            }
         } else {
            output = formattedInput;
         }

      } else {
         output = danishFormat.format(0).replace("kr ", "");
      }

      return output;
   }

   public static String getCurrencyFormmattedWihtoutFractions(Double input) {
      String output = null;
      Locale dkLocale = new Locale("da", "DK");
      NumberFormat danishFormat = NumberFormat.getCurrencyInstance(dkLocale);
      if (input != null) {
         String formattedInput = danishFormat.format(input.longValue()).replace("kr", "");
         formattedInput = formattedInput.substring(0, formattedInput.indexOf(','));
         int minusIndex = formattedInput.indexOf('-');
         if (minusIndex >= 0) {
            output = formattedInput.replace("-", "");
         } else {
            output = formattedInput;
         }
      } else {
         output = danishFormat.format(0).replace("kr ", "");
      }
      return output;
   }

   public static String getCurrencyFormmatted(Double input) {
      return getCurrencyFormmatted(input, true);
   }

   public static String getFormatRegnr(double pfrLoenKontonrLocal) {
      StringBuilder tempLongeRegNumber = new StringBuilder();
      String logneRengr = String.valueOf(BigDecimal.valueOf(pfrLoenKontonrLocal).intValue());
      int longRengerLength = logneRengr.length();
      if (longRengerLength < 4) {
         for (int i = longRengerLength; i < 4; i++) {
            tempLongeRegNumber.append("0");
         }
      }
      tempLongeRegNumber.append(logneRengr);
      return tempLongeRegNumber.toString();
   }

   public static String getFormatKtonr(double pfrLoenKontonrLocal) {
      StringBuilder tempLongeRegNumber = new StringBuilder();
      String logneRengr = BigDecimal.valueOf(pfrLoenKontonrLocal).toPlainString();
      int longRengerLength = logneRengr.length();
      if (longRengerLength < 10) {
         for (int i = longRengerLength; i < 10; i++) {
            tempLongeRegNumber.append("0");
         }
      }
      tempLongeRegNumber.append(logneRengr);
      return tempLongeRegNumber.toString();
   }

   public static String formatCurrency(Double input) {
      StringBuilder formattedCurrency = new StringBuilder();
      Locale dkLocale = new Locale("da", "DK");
      NumberFormat danishFormat = NumberFormat.getCurrencyInstance(dkLocale);
      if (input != null) {
         String formattedOutput = danishFormat.format(input);
         formattedCurrency.append(addCurrencyType(formattedOutput));

      } else {
         String formattedOutput = danishFormat.format(0);
         formattedCurrency.append(addCurrencyType(formattedOutput));
      }
      return formattedCurrency.toString();
   }

   public static String addCurrencyType(String currency) {
      String withCurrencyType = null;
      if (currency != null && !currency.isEmpty()) {
         withCurrencyType = currency.replace("kr", "");
         withCurrencyType += " kr.";
      }
      return withCurrencyType;

   }

   public static String customFormat(String pattern, double value) {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      return myFormatter.format(value);
   }
   public static String getFormattedText(String inputvalue,int length,String prefixStr){
		String outputStrg = null;
		if(inputvalue != null && !inputvalue.trim().isEmpty()){
			outputStrg = MappingHelper.getFormattedText(length - inputvalue.trim().length(), prefixStr) + inputvalue;
		}
		else{
			outputStrg = MappingHelper.getFormattedText(length, prefixStr);
		}
		
		return outputStrg;
	}

   public static String getFormattedText(int numberOfTimes, String formatText) {
      StringBuilder output = new StringBuilder();
      for (int i = 0; i < numberOfTimes; i++) {
         output.append(formatText);
      }
      return output.toString();
   }

   public static String getCurrentTimestamp(){
      final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
      Timestamp currenttimestmap = new Timestamp(System.currentTimeMillis());
      return sdf.format(currenttimestmap);
   }

   public static String getTimestampValue(Timestamp oldvalue) {
      SimpleDateFormat sdfIn = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.sss");
      return sdfIn.format(oldvalue);
   }

   public static String getFormattedDateValue(Date date) {
      String defaultFormat = "YYDDD";
      return getFormattedDate(date, defaultFormat);
   }

   public static Timestamp getFormatTimestamp(String input) {
	   if(input != null && !input.isEmpty()){
		   return Timestamp.valueOf(input);
	   }
	   else{
		   return null;
	   }
   }
   
   public static boolean isValidTimestamp(String input) {
	   try{
		   Timestamp.valueOf(input);
	   }catch(Exception e){
		   LOGGER.error(e);
		   return false;
	   }
	   return true;
   }

   public static String getPreviousDate() {
      final Calendar cal = Calendar.getInstance();
      cal.add(Calendar.DATE, -1);
      Date currentDate = cal.getTime();
      return getFormattedDateValue(currentDate);
   }

   public static Date getDatefromString(String input, String dataFormat) {
      SimpleDateFormat sdf = new SimpleDateFormat(dataFormat);
      Date date1;
      try {
         date1 = sdf.parse(input.trim());
         return date1;
      } catch (ParseException e) {
         LOGGER.error(e);
         return getDatefromString(input, "yyyyMMdd");
      }
   }
   
   public static String getPostFormmmatedText(String inputvalue,int length,String prefixStr){
 		String outputStrg = null;
 		if(inputvalue != null && !inputvalue.trim().isEmpty()){
 			outputStrg = inputvalue + MappingHelper.getFormattedText(length - inputvalue.trim().length(), prefixStr) ;
 		}
 		else{
 			outputStrg = MappingHelper.getFormattedText(length, prefixStr);
 		}
 		
 		return outputStrg;
 	}
}
