package com.hs.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author: hs
 * @Date: 2019/4/22 7:18
 */
public class DiffDemo {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            System.out.println("开始时间为：" + new Date());
            //TimeUnit.SECONDS.sleep(3);
            Thread.sleep(3*1000);
            System.out.println("结束时间为：" + new Date());
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("休眠时间为：" + diff);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
