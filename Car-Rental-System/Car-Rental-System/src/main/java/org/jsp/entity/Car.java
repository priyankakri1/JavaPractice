package org.jsp.entity;

public class Car implements Comparable<Car> {
    private int cid;
    private String brand;
    private double price;
    private String model;
    private String color;
    private String fuelType;
    private int mileage;

    // ==================Constructor to initialize Car object with attributes=============
    public Car(int cid, String brand, double price, String model, String color, String fuelType, int mileage) {
        this.cid = cid;
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    //================ Getter and Setter methods for all attributes==============
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // =========toString method to provide a string representation of the Car object================
    @Override
    public String toString() {
        return "Car{" +
                "cid=" + cid +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    // compareTo method to implement Comparable interface for sorting by Car ID
    @Override
    public int compareTo(Car o) {
        // Compare based on Car ID (cid)
        return Integer.compare(this.cid, o.getCid());
    }
}
