package com.company.bankaccountapp;

public abstract class Account implements IBaseRate{
    //List common properties for savings and checking accounts
    private String name;
    private String securityNumber;
    protected String accountNumber;
    private double balance;
    protected double rate;
    private static int index = 10000;


    //Constructor to set base properties and initialize the account
    public Account(String name, String securityNumber, double deposit){
        this.name = name;
        this.securityNumber = securityNumber;
        balance = deposit;

        //set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    public void compound(){
        double accruedInterest = balance * (rate/100);
        System.out.println("Accrued interest: £" + accruedInterest);
        printBalance();
    }

    // List common methods
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing £"+amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing £" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transferring £" +amount + " to " + toWhere );
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your balance is now £: " + balance);
    }

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
