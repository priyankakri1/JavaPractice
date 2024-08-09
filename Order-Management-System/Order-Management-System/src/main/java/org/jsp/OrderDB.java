package org.jsp;

public class OrderDB {
    private Order[] orderArr;
    private int index = 0;
    private int orderCount = 0;

    public OrderDB(int size) {
        orderArr = new Order[size];
    }

    public boolean addOrder(Order o) {
        if (index < orderArr.length) {
            orderArr[index++] = o;
            System.out.println("Order added successfully");
            orderCount++;
            return true;
        } else {
            System.out.println("Database is full");
            return false;
        }
    }

    public Order searchOrder(int orderId) {
        Order order = null;

        for (Order ord : orderArr) {
            if (ord != null && ord.getOrderId() == orderId) {
                System.out.println("Order found in the database");
                order = ord;
                break;  // Exit the loop once the order is found
            }
        }

        if (order == null) {
            System.out.println("Order is not found in the database");
        }

        return order;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void viewFullDatabase() {
        System.out.println("---------------------------------");
        System.out.println("orderId\tname\tproductName\tprice\tdate");
        System.out.println("---------------------------------");

        for (Order ord : orderArr) {
            if (ord != null) {
                System.out.println(ord.getOrderId() + "\t" + ord.getName() + "\t" + ord.getProductName() + "\t" + ord.getPrice() + "\t" + ord.getDate());
            }
        }
    }

    public boolean updatePrice(int orderId, double amount) {
        Order order = searchOrder(orderId);
        if (order != null) {
            order.setPrice(order.getPrice() + amount);
            System.out.println("Price updated");
            return true;
        } else {
            System.out.println("Unable to update, check your order ID");
            return false;
        }
    }
}
