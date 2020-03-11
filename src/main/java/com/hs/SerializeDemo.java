package com.hs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author HS
 * @date 2020/03/12 01:21:08
 **/
public class SerializeDemo {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.name = "Reyan Ali";
        employee.address = "Phokka Kuan, Ambehta Peer";
        employee.SSN = 11122333;
        employee.number = 101;
        try {
            FileOutputStream fop=new FileOutputStream("d:/learning/HsTestNG/Employee.ser");
            ObjectOutputStream op=new ObjectOutputStream(fop);
            op.writeObject(employee);
            op.close();
            fop.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.printf("Serialized data is saved in d:/learning/HsTestNG/Employee.ser");
    }
}
