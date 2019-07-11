package com.hs.test; /**
 * @Author: hs
 * @Date: 2019/4/23 0:42
 */
import java.util.regex.*;

public class RegexDemo {
    public static void main(String[] args) {
        String content="I am a noob"+"from runoob.com.";
        String pattern=".*runoob.*";
        String content1="\\"+"\n";
        String pattern1="\\\\+\\..";
        boolean isMatch=Pattern.matches(pattern,content); /**用Pattern中的matches*/
        System.out.println("字符串中是否包含了 'runoob' 子字符串? "+isMatch);
        boolean isMatch1=content1.matches(pattern1); /**用String中的matches方法来来比较*/
        System.out.println("字符串中是否包含了 'runoob' 子字符串? "+isMatch1);
    }
}