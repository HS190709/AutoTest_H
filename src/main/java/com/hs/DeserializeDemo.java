package com.hs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author HS
 * @date 2020/03/12 01:43:36
 **/
public class DeserializeDemo {
    public static void main(String[] args) {
        Employee employee=null;
        try {
            FileInputStream fip=new FileInputStream("d:/learning/HsTestNG/Employee.ser");
            ObjectInputStream oip=new ObjectInputStream(fip);
            employee=(Employee) oip.readObject();
            oip.close();
            fip.close();
        }catch (IOException e){
            e.printStackTrace();
            return;
        }catch (ClassNotFoundException e){
            System.out.println("Employee class not found");
            e.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee..."+"\n");
        employee.mailCheck();

    }
}
