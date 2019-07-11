package com.hs.testcase;

import com.hs.UtilsFunc;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.hs.test.ToolsFunc;
import com.hs.test.TestUtils.UtilsFunc;

public class PerfectNumber {
    @Test
    public void testcase1(){
        System.out.println("I'm in assert false");
        Assert.assertFalse(false);
    }
    @Test
    public void testcase2(){
        System.out.println("I'm in assert true");
        Assert.assertTrue(true);
    }
    //调用测试包内的工具类进行测试
    @Test
    public void testcase3(){
        double a = ToolsFunc.area(20);
        System.out.println("res is :"+a);
        Assert.assertEquals(1256.6000000000001,a);
        System.out.println(a);
    }

    //调用测试包内的业务类进行测试
    @Test
    public void testcase4(){
        double a = UtilsFunc.area(20);
        System.out.println("res is :"+a);
        Assert.assertEquals(1256.6000000000001,a);
        System.out.println(a);
    }
    //调用开发目录的业务类进行测试
    @Test
    public void testcase5(){
        //对于重名的类，可以用全路径引用
        double a = UtilsFunc.area(20);
        System.out.println("res is :"+a);
        Assert.assertEquals(1256.6000000000001,a);
        System.out.println(a);
    }
}
/**处理文本*/

