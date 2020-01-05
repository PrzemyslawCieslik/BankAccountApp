package com.company.bankaccountapp;

public class Checking extends Account {
    //List properties specific to checking account
    int debitCardNumber;
    int debitCardPin;

    //Constructor to initialize checking account properties
    public Checking(String name, String securityNumber, double deposit){
        super(name, securityNumber, deposit);
        accountNumber = "2" + accountNumber;
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("New checking account");
    }

    //List any methods specific to the checking account
}
