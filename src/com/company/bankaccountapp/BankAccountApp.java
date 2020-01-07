package com.company.bankaccountapp;

import com.company.utillities.Csv;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) throws FileNotFoundException {
        String file = "E:\\NewBankAccounts.csv";

        List<Account> accounts = new LinkedList<>();

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
        for (String[] customer : newCustomers ) {
            String name = customer[0];
            String securityNumber = customer[1];
            String accountType = customer[2];
            double initDeposit = Double.parseDouble(customer[3]);
            System.out.println(name + " " + securityNumber + " " + accountType + " " + initDeposit);
            if (accountType.equals("Savings")) {
                System.out.println("Open a savings account");
            } else if (accountType.equals("Checking")) {
                System.out.println("Open checking account");
                accounts.add(new Savings(name, securityNumber, initDeposit));
            } else {
                System.out.println("Error reading account type");
                accounts.add(new Checking(name, securityNumber, initDeposit));
            }
        }
        for (Account acc : accounts){
            System.out.println("******************");
            acc.showInfo();
        }
    }
}
