package com.hs.test;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: hs
 * @Date: 2019/4/25 1:22
 */
public class RegexDemo1 {
    private static final String INPUT = "fooooooooooooooooo";
    private static final String INPUT2 = "ooooofoooooooooooo";
    private static final String REGEX = "foo";
    private static Pattern pattern;
    private static Matcher matcher;
    private static Matcher matcher2;

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        Matcher matcher2 = pattern.matcher(INPUT2);
        System.out.println("Current INPUT is: " + INPUT);
        System.out.println("Current INPUT2 is: " + INPUT2);
        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("matcher.matches(): " + matcher.matches());
        System.out.println("matcher.lookingAt(): " + matcher.lookingAt());
        System.out.println("matcher2.matches(): " + matcher2.matches());
        System.out.println("matcher2.lookingAt(): " + matcher2.lookingAt());
    }

}