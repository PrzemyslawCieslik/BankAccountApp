package com.company.bankaccountapp;

import com.company.utillities.Csv;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) throws FileNotFoundException {
        String file = "E:\\Acc.csv";

        /*
        Checking checking1 = new Checking("Tom Wilson", "231239421", 1500);

        Savings savings1 = new Savings("Richard Williams", "12345678912", 1700);

        checking1.showInfo();
        System.out.println("*****************");
        savings1.showInfo();
        savings1.compound();
        */


        // Read a CSV File then create new accounts based on that data
        List<String[]> newCustomers = Csv.read(file);
        for (String[] customer : newCustomers ){
            System.out.println(customer[0]);
            System.out.println(customer[1]);
        }
    }
}
