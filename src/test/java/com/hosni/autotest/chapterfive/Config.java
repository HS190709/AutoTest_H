package com.hosni.autotest.chapterfive;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author hosni
 * @date 2019/07/12 19:53:33
 **/
public class Config {
    @BeforeSuite
    public static void BeforeSuite() {
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public static void AfterSuite() {
        System.out.println("AfterSuite");
    }

}
