package com.hs.test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TexPro {
    public static void main(String args[]) {
        RegexExample r=new RegexExample();
        System.out.println(r);
        String line="This order was placed for QT3000! OK?";
        String pattern="(\\D*)(\\d+)(.*)";
        Pattern r=Pattern.compile(pattern);
        Matcher m=r.matcher(line);
        if(m.find( )){

    }

}
    /**以下实例中使用了正则表达式 .*runoob.* 用于查找字符串中是否包了 runoob 子串：*/
    class RegexExample {
            String content = "I am a noob" + "from runoob.com.";
            String pattern = ".*runoob.*";
            boolean isMatch = Pattern.matches(pattern, content);
            public String toString(){
                return "字符串中中是否包含了'runoob'子字符串？" + isMatch;
            }
    }
    /**下面的例子说明如何从一个给定的字符串中找到数字串：*/
    class RegexMatches{
        String line="This order was placed for QT3000! OK?";
        String pattern="(\\D*)(\\d+)(.*)";
        Pattern r=Pattern.compile(pattern);
        Matcher m=r.matcher(line);
        }
    }
