package com.hs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author HS
 * @date 2019/12/01 22:07:57
 **/
public class TraverseDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        /**用foreach遍历*/
        for (String str:list
             ) {
            System.out.println(str);
        }
        System.out.println("******");
        /**用Iterator遍历*/
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("******");
        /**用数组遍历*/
        String[] s=new String[list.size()];
        list.toArray(s);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
