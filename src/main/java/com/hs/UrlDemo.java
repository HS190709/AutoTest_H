package com.hs;


import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author HS
 * @date 2019/12/29 23:55:50
 **/
public class UrlDemo {
    public static void main(String[] args)throws MalformedURLException {
//        URL url=new URL("http://www.runoob.com/index.html?language=cn#j2se");
        URL url=new URL("http","www.runoob.com","/index.html");
        //System.out.println(TypeToolsGenerics.getType(url.getPort()));

    }
}
