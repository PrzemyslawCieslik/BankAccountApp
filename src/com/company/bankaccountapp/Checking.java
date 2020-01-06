package com.company.bankaccountapp;

public class Checking extends Account {
    //List properties specific to checking account
    int debitCardNumber;
    int debitCardPin;

    //Constructor to initialize checking account properties
    public Checking(String name, String securityNumber, double deposit){
        super(name, securityNumber, deposit);
        accountNumber = "2" + accountNumber;
    }

    //List any methods specific to the checking account

    public void showInfo(){
        System.out.println("Account type: checking");
        super.showInfo();
    }
}
