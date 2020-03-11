package com.hs;

/**
 * @author HS
 * @date 2020/03/12 01:19:17
 **/
public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address+" " + SSN+" " + number);
    }

}
