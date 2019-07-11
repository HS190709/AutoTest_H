package com.hs.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author: hs
 * @Date: 2019/4/22 8:26
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        calendar.set(2019, 4-1 , -10);
        System.out.println("当前时间为：" +calendar.getTime());
        System.out.println("当前时间为：" +simpleDateFormat.format(calendar.getTime()));
        System.out.println("当前时间为：" + calendar.get(calendar.YEAR)
                + "-" + (calendar.get(calendar.MONTH)+1)
                + "-" + calendar.get(calendar.DATE));
    }
}
