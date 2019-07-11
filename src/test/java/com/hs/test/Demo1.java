package com.hs.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: hs
 * @Date: 2019/3/15 1:50
 */
public class Demo1 {
    public static void main(String[] args) {
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss EEE");
        System.out.println(dateFormat.format(date));
        /*int sum=0;
        int a;
        a=(1+100)*50;
        for (int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println("100以内的和为："+sum+" "+a);*/
    }
}
