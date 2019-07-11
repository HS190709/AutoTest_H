package com.hs.test;

import java.io.IOException;

/**
 * @author HS
 * @date 2019/05/09 02:31:37
 **/
public class TestIoDemo extends TestScannerDemo {
    public static void main(String[] args) {
        TestIoDemo t=new TestIoDemo();
        try {
            t.print();
            t.print(6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void print()throws IOException{
            super.print();

    }
    public void print(int b)throws IOException{
        System.out.println("Please enter content");
        while (!scan.hasNext("END")){
            if (scan.hasNextInt()){
                int d=scan.nextInt();
                System.out.println("输入的是数字"+b);
            }else {
                String c=scan.next();
            }
        }
    }
}
