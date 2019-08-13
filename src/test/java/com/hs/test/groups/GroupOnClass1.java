package com.hs.test.groups;

import org.testng.annotations.Test;

/**
 * @author HS
 * @date 2019/07/18 02:03:16
 **/
@Test(groups = "server")
public class ClassOnMethod {
    public static void stu1(){
        System.out.println("这是server的stu1");
    }
    public static void stu2(){
        System.out.println("这是server的stu2");
    }
    public static void stu3(){
        System.out.println("这是server的stu3");
    }
    public static void stu4(){
        System.out.println("这是server的BeforeGroups的stu4");
    }
    public static void stu5(){
        System.out.println("这是server的AfterGroups的stu5");
    }
}
