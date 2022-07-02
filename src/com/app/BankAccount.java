package com.app;

public class BankAccount {
    private String firstName;
    private  String lastName;
    private Double balance;

    public BankAccount(String firstName, String lastName, Double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public double deposit(double amount, boolean branch)
    {
balance+=amount;
return balance;
    }

    public double withdrawal(double amount, boolean branch)
    {
        balance-=amount;
        return balance;
    }

    public Double getBalance() {
        return balance;
    }
}
