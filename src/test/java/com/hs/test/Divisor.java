package com.hs.test;

/**
 * @Author: hs
 * @Date: 2019/2/1 23:38
 */
public class Divisor {
    public static void main (String args[]) {
        int i,j;
        for (i=2;i<10;++i){
            System.out.print(i+"除了本身正约数有：");
            for (j=1;j<i;++j){
                if (i%j==0){
                    System.out.print(j+" ");
                }
            }
            if (j>=i){
                System.out.println("\n");
            }
        }
    }
}
