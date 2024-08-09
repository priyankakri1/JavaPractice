package org.jsp;

import java.time.LocalDate;

public class OrderCreation {
    private static int RANDNUM = 100;

    public OrderCreation() {
        // Default constructor
    }

    public Order createOrder(String name, String productName, double price, String date) {
        Order order = new Order(RANDNUM++, name, productName, price, date);
        return order;
    }
}
