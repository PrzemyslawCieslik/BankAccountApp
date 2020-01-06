package com.company.bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args) {

        Checking checking1 = new Checking("Tom Wilson", "231239421", 1500);

        Savings savings1 = new Savings("Richard Williams", "12345678912", 1700);

        checking1.showInfo();
        System.out.println("*****************");
        savings1.showInfo();

        // Read a CSV File then create new accounts based on that data
    }
}
