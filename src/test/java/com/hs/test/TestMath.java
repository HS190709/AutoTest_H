package com.hs.test;

/**
 * @Author: hs
 * @Date: 2019/1/25 3:39
 */
public class TestMath {
        public static void main(String[] args){
            double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };
            for(double k:nums){
                test(k);
            }
        }
        private static void test(double j){
            System.out.println("Math.floor(" + j + ")="+Math.floor(j) );
            System.out.println("Math.round(" + j + ")="+Math.round(j) );
            System.out.println("Math.ceil(" + j + ")="+Math.ceil(j) );
        }
}
