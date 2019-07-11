package com.hs.test;

/**
 * @Author: hs
 * @Date: 2019/4/26 21:39
 */
public class TestDemo {
    public static void main(String[] args) {
        String[] a={"4","6","8","10","12"};
        String[] b={"9"};
        Comparable c=new String();
        StringBuilder s=new StringBuilder();
        if (a.length>b.length){
            a:for (int i=0;i<b.length;i++){
                if ((b[i].compareTo(a[a.length-1]))>0){
                    s.append(a[a.length-1]).append(" ").append(b[i]).append("\n");
                }else {
                    b:for (int j=0;j<a.length-1;j++){
                        if(i==b.length){
                            break b;
                        }else {
                            if ((b[i].compareTo(a[j+1]))<0){
                                s.append(a[j]).append(" ").append(b[i]).append("\n");
                                i=i+1;
                            }
                        }
                    }
                }
            }
            System.out.print(s);
        }
        else {
            for (int i=0;i<a.length;i++){
                s.append(a[i]).append(" ").append(b[i]).append("\n");
            }
            System.out.print(s);
        }
    }
}
