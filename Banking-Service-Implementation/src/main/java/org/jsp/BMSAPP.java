package org.jsp;

import java.util.Scanner;

public class BMSAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        System.out.println("=========================================");
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create New Account");
            System.out.println("2. Display Account Information");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6.Transfer via UPI using PhonePe");
            System.out.println("7.Transfer via UPI using GooglePay");
            System.out.println("8.Transfer via UPI using Paytm");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Create new Account:");
                    System.out.print("Account Number: ");
                    int newAccountNumber = sc.nextInt();
                    sc.nextLine(); //  newline
                    System.out.print("Account Holder Name: ");
                    String newAccountHolderName = sc.nextLine();
                    System.out.print("Initial Balance: ");
                    double newBalance = sc.nextDouble();
                    sc.nextLine(); // =======newline character after nextDouble()
                    account = new BankAccount(newAccountNumber, newAccountHolderName, newBalance);
                    System.out.println("Account created successfully!");
                    break;
                case 2:
                    if (account != null) {
                        account.displayAccountInfo();
                    } else {
                        System.out.println("No account created yet. Please create an account first.");
                    }
                    break;
                case 3:
                    if (account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("No account created yet. Please create an account first.");
                    }
                    break;
                case 4:
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        sc.nextLine(); // Consume newline character after nextDouble()
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("No account created yet. Please create an account first.");
                    }
                    break;
                case 5:
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();
                        sc.nextLine(); // Consume newline character after nextDouble()
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No account created yet. Please create an account first.");
                    }
                    break;

                case 6:
                    if (account != null) {
                        System.out.print("Enter UPI ID: ");
                        String upiId = sc.nextLine();
                        System.out.print("Enter amount to transfer: ");
                        double amount = sc.nextDouble();
                        sc.nextLine(); // Consume newline character after nextDouble()
                        PhonePe phonePe = new PhonePe();
                        phonePe.transferUPI(upiId, amount);
                    } else {
                        System.out.println("No account created yet. Please create an account first.");
                    }
                    break;
                case 7:
                    if (account != null) {
                        System.out.print("Enter UPI ID: ");
                        String upiId = sc.nextLine();
                        System.out.print("Enter amount to transfer: ");
                        double amount = sc.nextDouble();
                        sc.nextLine(); // Consume newline character after nextDouble()
                        GooglePay googlePay = new GooglePay();
                        googlePay.transferUPI(upiId, amount);
                    } else {
                        System.out.println("No account created yet. Please create an account first.");
                    }
                    break;
                case 8:
                    if (account != null) {
                        System.out.print("Enter UPI ID for Paytm: ");
                        String upiId = sc.nextLine();
                        System.out.print("Enter amount to transfer: ");
                        double amount = sc.nextDouble();
                        sc.nextLine(); // Consume newline character after nextDouble()
                        Paytm paytm = new Paytm();
                        paytm.transferUPI(upiId, amount);
                    } else {
                        System.out.println("No account created yet. Please create an account first.");
                    }
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
            }
        }
    }
}
