package com.hs.test;

/**
 * @Author: hs
 * @Date: 2019/1/31 0:43
 */
public class PolyMorphysm {
    public static void main(String args[]){
        Poly p=new Poly();
        Poly p2=new Poly2();
        p.method3();
        p2.method3();
    }
}
class Poly {
    void method1(){
        System.out.println("Poly啦啦啦");
    }
    void method2(){
        System.out.println("Poly嘿嘿嘿");
    }
    void method3(){
        System.out.println("Poly啪啪啪");
    }
}
class Poly2 extends Poly {
    void method1(){
        System.out.println("啦啦啦");
    }
    void method2(){
        System.out.println("嘿嘿嘿");
    }
    void method3(){
        System.out.println("啪啪啪");
    }
    void method4(){
        System.out.println("干干干");
    }
}