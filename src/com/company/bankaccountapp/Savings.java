package com.company.bankaccountapp;

public class Savings extends Account {
    //List properties to the Savings account
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;

    //Constructor to initialize setting for the Savings properties
    public Savings(String name, String securityNumber, double deposit){
        super(name, securityNumber, deposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    //List any methods specific to savings account
    public void showInfo(){
        System.out.println("Account type: savings");
        super.showInfo();
        System.out.println(
                "Your saving account features" +
                        "\nSafety Deposit Box ID: " + safetyDepositBoxId +
                        "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}
