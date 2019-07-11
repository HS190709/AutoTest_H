package com.hs.test;

/**
 * @Author: hs
 * @Date: 2019/4/25 3:10
 */
public class Regex {
    public static void main(String[] args) {
        checkQQ2("28553151147");
    }
    public static void checkQQ2(String qq) {
        String reg = "[1-9][0-9]{10}";
        System.out.println(qq.matches(reg)?"合法qq":"非法qq");
    }
}
