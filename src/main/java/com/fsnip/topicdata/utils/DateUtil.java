package com.fsnip.topicdata.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    /** 年月日时分秒(无下划线) yyyyMMddHHmmss */
    public static final String dtLong = "yyyyMMddHHmmss";

    /** 完整时间 yyyy-MM-dd HH:mm:ss */
    public static final String simple = "yyyy-MM-dd HH:mm:ss";
    public static final String simple_short = "yyyy-MM-dd";

    /** 年月日(无下划线) yyyyMMdd */
    public static final String dtShort = "yyyyMMdd";

    /**
     * @return 以yyyyMMddHHmmss为格式的当前系统时间
     */
    public static final String getDateTimeLong() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat(dtLong);
        return df.format(date);
    }

    /**
     * 获取系统当前日期(精确到毫秒)，格式：yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public static final String getDateTime() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat(simple);
        return df.format(date);
    }

    /**
     * 格式化日期(精确到毫秒)，格式：yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public static final String getDateTime(Date date) {
        DateFormat df = new SimpleDateFormat(simple);
        return df.format(date);
    }

    /**
     * 获取系统当期年月日(精确到天)，格式：yyyyMMdd
     *
     * @return
     */
    public static final String getDate() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat(dtShort);
        return df.format(date);
    }

    /**
     * 字符转时间 格式：yyyy-MM-dd HH:mm:ss
     * @param str
     * @return
     */
    public static final Date parseStringToDateTime(String str){

        DateFormat df = new SimpleDateFormat(simple);
        try {
            return df.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
    /**
     * 字符转时间 格式：yyyy-MM-dd
     * @param str
     * @return
     */
    public static final Date parseStringToDate(String str){

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
    public static final Date parseStringToDate(String str , String s){

        DateFormat df = new SimpleDateFormat(s);
        try {
            return df.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
    public static final Date getAfterTime(int  number){

        Calendar calendar=Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.MINUTE,calendar.get(Calendar.MINUTE)+number);
        try {
            return calendar.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Date();
    }
    public static final Date getBeforeTime(int  number){

        Calendar calendar=Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.MINUTE,calendar.get(Calendar.MINUTE)-number);
        try {
            return calendar.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Date();
    }

    public static  final String getEndTime(String str){
        Date  date = parseStringToDate(str,simple_short);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        /*calendar.set(Calendar.DATE,calendar.get(Calendar.DATE+1));
        calendar.add(Calendar.SECOND ,-1);*/
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        // 分
        calendar.set(Calendar.MINUTE, 59);
        // 秒
        calendar.set(Calendar.SECOND, 59);


        Date  newDate = calendar.getTime();
                return getDateTime(newDate);
    }


    public static String getSeqString() {

        SimpleDateFormat fm = new SimpleDateFormat("yyyyMMddHHmmsszzz"); // "yyyyMMdd G
        return fm.format(new Date());
    }

    public static void main(String[] args) {
        System.out.println("dtLong = " + getEndTime("1999-09-19 12:00:00"));
    }
}
