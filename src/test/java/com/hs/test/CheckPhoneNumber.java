package com.hs.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: hs
 * @Date: 2019/4/25 2:58
 */
public class CheckPhoneNumber {
    private static final String INPUT="28553151147";
    private static final String REGEX="^1[0-9]{10}";

    public static void main(String[] args) {
        Pattern pattern=Pattern.compile(REGEX);
        Matcher matcher=pattern.matcher(INPUT);
        if (matcher.matches()){
            System.out.println("合法手机号");
        }else {
            System.out.println("非法手机号");
        }
    }
}
