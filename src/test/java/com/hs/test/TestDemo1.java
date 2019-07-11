package com.hs.test;

/**
 * @Author: hs
 * @Date: 2019/4/29 0:06
 */
public class TestDemo1 {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 7};
        int[] b = {1, 2, 3, 4, 5};
        if (a.length == 0 && b.length == 0) {
            System.out.println("加入教室时间缺失，离开教室时间缺失");
        } else if (a.length == 0) {
            System.out.println("加入教室时间缺失");
        } else if (b.length == 0) {
            System.out.println("离开教室时间缺失");
        } else {
            if (a[0] > b[b.length - 1]) {
                System.out.println("加入教室时间不完整");
            }
            for (int i = 0; i < b.length; i++) {
                if (a[a.length - 1] <= b[i]) {
                    System.out.println(a[a.length - 1] + " " + b[i]);
                    break;
                }
                for (int j = 0; j < a.length - 1; j++) {
                    if (i == 0) {
                        if (a[j] < b[i] && a[j + 1] == b[b.length - 1]) {
                            System.out.println(a[j + 1] + " " + b[i]);
                            break;
                        }else if (a[j] <= b[i] && b[i] < a[j + 1]) {
                            System.out.println(a[j] + " " + b[i]);
                            break;
                        }
                    } else if (a[j] < b[i] && a[j + 1] == b[b.length - 1] && b[i - 1] != a[j]) {
                        System.out.println(a[j + 1] + " " + b[i]);
                        break;
                    } else if (a[j] < b[i] && b[i] == a[j + 1]) {
                        System.out.println(a[j + 1] + " " + b[i]);
                        break;
                    } else if (a[j] <= b[i] && b[i] < a[j + 1] && b[i - 1] != a[j]) {
                        System.out.println(a[j] + " " + b[i]);
                        break;
                    }
                }
            }
        }
    }
}
