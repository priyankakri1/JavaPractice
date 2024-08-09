package org.jsp;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

//    ===================================Constructor========================

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

//    ===================================Getters and Setters===================

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//====================================All Methods================================
    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }

        // Method to check the current balance of the account
        public void checkBalance() {
            System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
        }
        // Method to deposit money into the account
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited " + amount + ". New balance: " + balance);
            } else {
                System.out.println("Deposit amount must be greater than zero.");
            }
        }
        // Method to withdraw money from the account
        public void withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + ". New balance: " + balance);
            } else {
                System.out.println("Insufficient funds or invalid amount.");
            }
        }

    }


