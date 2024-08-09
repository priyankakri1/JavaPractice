package org.jsp;

import java.time.LocalDate;

public class Order {
    private final int orderId;
    private String name;
    private String productName;
    private double price;
    private String date;

    public Order(int orderId, String name, String productName, double price, String date) {
        this.orderId = orderId;
        this.name = name;
        this.productName = productName;
        this.price = price;
        this.date = date;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
