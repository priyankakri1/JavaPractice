package org.jsp;

import java.util.Scanner;

public class OrderMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderCreation oc = new OrderCreation();
        OrderDB odb = new OrderDB(10);

        while (true) {
            System.out.println("\nOrder Management System:");
            System.out.println("1. Add Order");
            System.out.println("2. View Full Database");
            System.out.println("3. Count All Order Details");
            System.out.println("4. Search Order");
            System.out.println("5. Update Order Price");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of orders you want to add: ");
                    int numberOfOrders = sc.nextInt();
                    sc.nextLine();  // Consume the newline character

                    for (int i = 0; i < numberOfOrders; i++) {
                        // Taking input for each order
                        System.out.println("Enter details for order " + (i + 1) + ":");

                        System.out.print("Enter name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter product name: ");
                        String productName = sc.nextLine();

                        System.out.print("Enter price: ");
                        double price = sc.nextDouble();
                        sc.nextLine();  // Consume the newline character

                        System.out.print("Enter date (dd-MMM-yy): ");
                        String date = sc.nextLine();

                        Order order = oc.createOrder(name, productName, price, date);
                        odb.addOrder(order);
                    }
                    break;

                case 2:
                    odb.viewFullDatabase();
                    break;

                case 3:
                    System.out.println("Total number of orders: " + odb.getOrderCount());
                    break;

                case 4:
                    System.out.print("Enter the order ID to search: ");
                    int searchOrderId = sc.nextInt();
                    odb.searchOrder(searchOrderId);
                    break;

                case 5:
                    System.out.print("Enter the order ID to update the price: ");
                    int updateOrderId = sc.nextInt();

                    System.out.print("Enter the amount to update: ");
                    double updateAmount = sc.nextDouble();
                    odb.updatePrice(updateOrderId, updateAmount);
                    break;

                case 6:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
