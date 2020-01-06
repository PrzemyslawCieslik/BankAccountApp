package com.company.bankaccountapp;

public class Checking extends Account {
    //List properties specific to checking account
    int debitCardNumber;
    int debitCardPin;

    //Constructor to initialize checking account properties
    public Checking(String name, String securityNumber, double deposit){
        super(name, securityNumber, deposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    //List any methods specific to the checking account

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Your checking account features: ");
        System.out.println("Card Number: " + this.debitCardNumber);
        System.out.println("Pin: " + this.debitCardPin);


    }
}
