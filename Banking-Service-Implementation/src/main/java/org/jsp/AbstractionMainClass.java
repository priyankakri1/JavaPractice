package org.jsp;

import java.util.Scanner;

public class AbstractionMainClass {
    public static void main(String[] args) {
        Service ser = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================");
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Login with ATM pin 7754 (ATM)");
            System.out.println("2. Login with ATM pin 7755 (PhonePe)");
            System.out.println("3. Login with ATM pin 7756 (GooglePay)");
            System.out.println("4. Login with ATM pin 7757 (Paytm)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    BankUser bankUser1 = ser.login(7754);
                    if (bankUser1 != null) {
                        bankUser1.transaction();
                    } else {
                        System.out.println("Invalid ATM pin. Unable to log in.");
                    }
                    break;
                case 2:
                    BankUser bankUser2 = ser.login(7755);
                    if (bankUser2 != null) {
                        bankUser2.transaction();
                    } else {
                        System.out.println("Invalid ATM pin. Unable to log in.");
                    }
                    break;
                case 3:
                    BankUser bankUser3 = ser.login(7756);
                    if (bankUser3 != null) {
                        bankUser3.transaction();
                    } else {
                        System.out.println("Invalid ATM pin. Unable to log in.");
                    }
                    break;
                case 4:
                    BankUser bankUser4 = ser.login(7757);
                    if (bankUser4 != null) {
                        bankUser4.transaction();
                    } else {
                        System.out.println("Invalid ATM pin. Unable to log in.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
