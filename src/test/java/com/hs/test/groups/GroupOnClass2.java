package com.hs.test.groups;

import org.testng.annotations.Test;

/**
 * @author HS
 * @date 2019/07/18 02:12:01
 **/
@Test(groups = "stu")
public class GroupOnClass2 {
    public static void stu1(){
        System.out.println("这是stu1");
    }
    public static void stu2(){
        System.out.println("这是stu2");
    }
}
