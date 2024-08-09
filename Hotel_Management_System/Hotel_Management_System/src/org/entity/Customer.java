package org.entity;

public class Customer {
    private String cname;
    private long phone;
    private int age;
    private Address a;
    private String roomType;
    private double roomPrice;
    private int roomNo;

    public Customer(String cname, long phone, int age, Address a, String roomType, double roomPrice, int roomNo) {
        this.cname = cname;
        this.phone = phone;
        this.age = age;
        this.a = a;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomNo = roomNo;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getA() {
        return a;
    }

    public void setA(Address a) {
        this.a = a;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cname='" + cname + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                ", a=" + a +
                ", roomType='" + roomType + '\'' +
                ", roomPrice=" + roomPrice +
                ", roomNo=" + roomNo +
                '}';
    }
}
