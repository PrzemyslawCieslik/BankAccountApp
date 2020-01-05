package com.company.bankaccountapp;

public class Savings extends Account {
    //List properties to the Savings account
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;

    //Constructor to initialize setting for the Savings properties
    public Savings(String name, String securityNumber, double deposit){
        super(name, securityNumber, deposit);
        accountNumber = "1" + accountNumber;
        System.out.println("Account number: " + this.accountNumber);
        System.out.print("New savings account: ");
    }

    //List any methods specific to savings account
}
