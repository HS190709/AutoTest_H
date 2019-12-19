package com.hs;

import java.util.*;

/**
 * @author HS
 * @date 2019/09/07 04:46:18
 **/
public class StackDemo {
    public static void main(String[] args) {
        StackDemo sd=new StackDemo();
        Stack<Integer> st=new Stack<>();
        System.out.println("stack"+st);
        sd.showPush(st,32);
        sd.showPush(st,64);
        sd.showPush(st,128);
        /*sd.showPop(st);
        sd.showPop(st);
        sd.showPop(st);*/
        try {
            for (int i = 0; i <4 ; i++) {
                sd.showPop(st);
            }
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
    public void showPush(Stack<Integer>st,int a){
        st.push(a);
        System.out.println("push:("+a+")");
        System.out.println("stack:"+st);
    }
    public void showPop(Stack<Integer>st){
        Integer a=st.pop();
        System.out.println("pop-->"+a);
        System.out.println("stack:"+st);
    }
}
