package com.company.bankaccountapp;

public abstract class Account implements IBaseRate{
    //List common properties for savings and checking accounts
    String name;
    String securityNumber;
    String accountNumber;
    double balance;
    double rate;
    static int index = 10000;


    //Constructor to set base properties and initialize the account
    public Account(String name, String securityNumber, double deposit){
        this.name = name;
        this.securityNumber = securityNumber;
        balance = deposit;

        //set account number
        index++;
        this.accountNumber = setAccountNumber();
    }

    // List common methods
    private String setAccountNumber(){
        String lastTwoSecurityNumber = securityNumber.substring(securityNumber.length()-2, securityNumber.length());
        int uniqueId = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSecurityNumber + uniqueId + randomNumber;
    }

    public void showInfo(){
        System.out.println(
                "Name: " + name +
                "\nAccount number: " + accountNumber +
                "\nBalance: " + balance
        );
    }
}
