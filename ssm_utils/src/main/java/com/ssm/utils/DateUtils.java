package com.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author harjas
 * @date 2021/5/28 15:49
 */
public class DateUtils {
    //日期转化成字符串
    public static String date2String(Date date,String patt){
        SimpleDateFormat sdf=new SimpleDateFormat(patt);
        String format = sdf.format(date);
        return format;
    }
    //字符串转换成日期
    public static Date string2Date(String str,String patt) throws ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat(patt);
        Date parse = sdf.parse(str);
        return parse;
    }
}
