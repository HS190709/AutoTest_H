package com.hs.test.groups;

import org.testng.annotations.Test;

/**
 * @author HS
 * @date 2019/07/18 02:03:16
 **/
@Test(groups = "tea")
public class GroupOnClass1 {
    public static void tea1(){
        System.out.println("这是tea1");
    }
}
