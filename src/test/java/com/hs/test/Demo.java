package com.hs.test;

import java.util.Arrays;

/**
 * @Author: hs
 * @Date: 2019/3/8 0:26
 */
public class Demo {
    public static void main(String[] args) {
        /*String d="111";
        StringBuffer b=new StringBuffer("abc");
        System.out.println(d+" "+b.delete(3,b.length()));*/
        //int[][] a=new int[1][2] ;
        //Array[] b=new Array[];
        /*int[] a=new int[3];
        int[] b = null;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        //Demo demo=new Demo();
        System.out.println(Arrays.fill(b,5));
        //printArray(new int[]{3, 1, 2, 6, 4, 2});*/
        /*int[] array ={1,2,3};
        // 填充数组
        Arrays.fill(array, 4);
        System.out.println("填充数组：Arrays.fill(array, 5)：");
        Demo.output(array);*/
        int[] array1 = { 7, 8, 3, 2, 12, 6, 3, 5, 4 };
        Demo.printArray(array1);
        // 对数组的第2个到第6个进行排序进行排序
        Arrays.sort(array1, 2, 7);
        System.out.println("对数组的第2个到第6个元素进行排序进行排序：Arrays.sort(array,2,7)：");
        Demo.output(array1);
    }
    public static void output(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
