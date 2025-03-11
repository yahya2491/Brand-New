package com.company;

import java.io.File;
import java.util.ArrayList;

public class Customer {
    String FirstName;
    String LastName;
    String Username;
    String FullAddress;
    String Email;
    String PhoneNumber;
    String PostalCode;
    String ID;

    static ArrayList<Customer> Customers = new ArrayList<Customer>();
    public void Customer_Database_Creator(){
        File Customer_File = new  File("E:\\BrandNew2\\src\\com\\company\\Customer_File.txt");
        System.out.println(Customer_File.exists());
    }


}
