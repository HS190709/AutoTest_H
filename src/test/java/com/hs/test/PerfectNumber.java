package com.hs.test;

/**
 * @Author: hs
 * @Date: 2019/2/1 23:26
 */
/**不换行输出*/
/*public class PerfectNumber {
    public static void main(String args[]){
        System.out.print("1000以内的完美数有:");
        int i,j;
        for (i=1;i<1000;++i){
            int sum=0;
            for (j=1;j<=i/2;++j){
                if (i%j==0){
                    sum+=j;
                }
            }
            if (i==sum){
                System.out.print(i+" ");
            }
        }

    }
}*/
/**换行输出*/
public class PerfectNumber {
    public static void main(String args[]){
        int i,j;
        for (i=1;i<1000;++i){
            int sum=0;
            for (j=1;j<=i/2;++j){
                if (i%j==0){
                    sum+=j;
                }
            }
            if (i==sum){
                System.out.println("1000以内的完美数有:"+i);
            }
        }

    }
}
