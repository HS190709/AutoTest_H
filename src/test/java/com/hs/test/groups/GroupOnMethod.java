package com.hs.test.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author HS
 * @date 2019/07/18 01:52:46
 **/
public class GroupOnMethod {
    @Test(groups = "service")
    public static void stu1(){
        System.out.println("这是service的stu1");
    }
    @Test(groups = "service")
    public static void stu2(){
        System.out.println("这是service的stu2");
    }
    @Test(groups = "client")
    public static void stu3(){
        System.out.println("这是client的stu3");
    }
    @BeforeGroups("service")
    public static void stu4(){
        System.out.println("这是service的BeforeGroups的stu4");
    }
    @AfterGroups("service")
    public static void stu5(){
        System.out.println("这是service的AfterGroups的stu5");
    }

}
