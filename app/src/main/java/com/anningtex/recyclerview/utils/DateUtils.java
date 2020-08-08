package com.anningtex.recyclerview.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author Song
 */
public class DateUtils {
    public static void showDatePickerDialog(Activity activity, int themeResId, final TextView et, Calendar calendar) {
        String time = getDate(et.getText().toString());
        if (time.length() == 4) {
            int a = Integer.parseInt("20" + time.substring(0, 2));
            int b = Integer.parseInt(time.substring(2, 4));
            new DatePickerDialog(activity, themeResId, (datePicker, i, monthOfYear, dayOfMonth) -> {
                if (i < 2000) {
                    i = 2000;
                }

                if (i > 2099) {
                    i = 2099;
                }

                String year = (i + "").substring(2, 4);
                monthOfYear++;
                String m = monthOfYear + "";
                if (monthOfYear < 10) {
                    m = "0" + m;
                }
                et.setText("YD-AN" + year + m);
            }
                    , a
                    , b - 1
                    , 1).show();
        }
    }

    public static void showDateCommonPickerDialog(Activity activity, int themeResId, final TextView et, Calendar calendar) {
        String time = et.getText().toString();
        String[] split = time.split("-");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);
        new DatePickerDialog(activity, themeResId
                , (view, year, monthOfYear, dayOfMonth) -> et.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth)
                , a
                , b - 1
                , c).show();
    }

    public static String getDate(String date) {
        StringBuffer sb = new StringBuffer();
        if (!date.isEmpty()) {
            String[] split = date.split("");
            if (split != null) {

                for (String s : split) {
                    if (s.matches("^-?[0-9]\\d*$")) {
                        sb.append(s);
                    }
                }
            }
        }
        return sb.toString();
    }

    /**
     * 获取当天的日期
     */
    public static String today() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    /**
     * 获取当前时间
     */
    public static String now() {
        return new SimpleDateFormat("yyyyMM").format(new Date());
    }

    /**
     * 获取时间戳的毫秒数
     */
    public static long getTimeMillis(String strTime) {
        long returnMillis = 0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            returnMillis = simpleDateFormat.parse(strTime).getTime();
        } catch (Exception ParseException) {

        }
        return returnMillis;
    }

    /**
     * 获取当前月第一天
     */
    public static String getFirstDayOfThisMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return new SimpleDateFormat("yyyy-M-d").format(cal.getTime());
    }

    /**
     * 获取当前月总天数
     */
    public static int getCurrentMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        //指定年份
        calendar.set(Calendar.YEAR, year);
        //指定月份 Java月份从0开始算
        calendar.set(Calendar.MONTH, month);
        //获取指定年份中指定月份有几天
        int daysOfMonth = calendar.getActualMaximum(Calendar.DATE);
        return daysOfMonth;
    }

    /**
     * 获取当前月信息
     */
    public static int[] getCurrentMonthStart_End() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        //月份 Java月份从0开始算
        int month = calendar.get(Calendar.MONTH) + 1;
        //本月最小天数
        int firstDay = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        //int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);//本月最大天数
        //当前日期
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        return new int[]{year, month, firstDay, currentDay};
    }

    /**
     * 获取上一个月
     */
    public static int[] getLastMonthStart_End() {
        Calendar calendar = Calendar.getInstance();
        //当前月-1
        calendar.add(Calendar.MONTH, -1);
        int year = calendar.get(Calendar.YEAR);
        //月份 Java月份从0开始算
        int month = calendar.get(Calendar.MONTH) + 1;
        //本月最小天数
        int firstDay = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        //本月最大天数
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return new int[]{year, month, firstDay, lastDay};
    }

    /**
     * 获取到当前日期
     */
    public static int[] getCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        //月份
        int month = calendar.get(Calendar.MONTH) + 1;
        //日期
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        return new int[]{year, month, currentDay};
    }

    /**
     * 获取昨天日期
     */
    public static String getFirstDayOfThisToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        //得到前一天
        Date date = calendar.getTime();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(date);
    }

    /**
     * 获取前天 也就是昨天的前一天
     */
    public static String getFirstFirstDayOfThisToday(String dates) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        String format = "";
        try {
            Date date = sdf.parse(dates);
            Calendar rightNow = Calendar.getInstance();
            rightNow.setTime(date);
            rightNow.add(Calendar.DAY_OF_YEAR, -1);
            Date time = rightNow.getTime();
            format = sdf.format(time);
            //2019-06-10减1天为：2019-06-09
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return format;
    }

    /**
     * 2020-05-25格式化为2005
     */
    @SuppressLint("SimpleDateFormat")
    public static String getCurrentDateString() {
        SimpleDateFormat format = new SimpleDateFormat("yyMM");
        return format.format(Calendar.getInstance().getTime());
    }

    /**
     * 计算两个日期之间的天数
     */
    public static long dayDiff(Date date1, Date date2) {
        return (date2.getTime() - date1.getTime()) / 86400000;
    }

    /**
     * 将时间转换为时间戳
     */
    public static String dateToStamp(String s) throws ParseException {
        String res;
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }

    /**
     * 将时间戳转换为时间
     */
    public static String stampToDate(String s) {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
}
