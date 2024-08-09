package org.service;

import org.entity.Customer;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public interface RentalService {
    ArrayList<Customer> l1=new ArrayList<>();
    LinkedHashMap<Integer, Customer> nonAc=new LinkedHashMap<>();
    LinkedHashMap<Integer,Customer> ac=new LinkedHashMap<>();
    LinkedHashMap<Integer,Customer> deluxe=new LinkedHashMap<>();

    void information();
    void roomsAvailable();
    void checkIn();
    void checkOut();
    void customerDetails();
}
