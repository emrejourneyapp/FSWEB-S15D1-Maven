package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Grocery g = new Grocery();
       //g.startGrocery();
        List<Contact> myContactlistem = new ArrayList<>();
        MobilePhone phone = new MobilePhone("0532",myContactlistem);
        phone.addNewContact(new Contact("Bob","31415926"));
        phone.addNewContact(new Contact("Alice","161"));
       phone.printContact();
        System.out.println(phone.queryContact("Bob"));
    }
}

