package org.serviceimplementation;

import org.entity.Address;
import org.entity.Customer;
import org.service.RentalService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class RentalServiceImplementation implements RentalService {
    private Scanner sc = new Scanner(System.in);
    private LinkedHashMap<Integer, Customer> nonAc = new LinkedHashMap<>();
    private LinkedHashMap<Integer, Customer> ac = new LinkedHashMap<>();
    private LinkedHashMap<Integer, Customer> deluxe = new LinkedHashMap<>();
    private ArrayList<Customer> l1= new ArrayList<>();

    {
        for (int i = 101; i <= 108; i++) {
            nonAc.put(i, null);
        }

        for (int i = 201; i <= 204; i++) {
            ac.put(i, null);
        }

        for (int i = 301; i <= 302; i++) {
            deluxe.put(i, null);
        }
    }

    @Override
    public void information() {
        System.out.println("===========Non Ac========");
        System.out.println("Fan");
        System.out.println("Tv");
        System.out.println("===================AC===========");
        System.out.println("AC");
        System.out.println("Tv");
        System.out.println("==============DELUXE===========");
        System.out.println("AC");
        System.out.println("Tv");
        System.out.println("3-4 members");
    }

    @Override
    public void roomsAvailable() {
        checkRooms(nonAc, "nonac");
        checkRooms(ac, "ac");
        checkRooms(deluxe, "deluxe");
    }

    private void checkRooms(LinkedHashMap<Integer, Customer> m, String type) {
        System.out.println("======" + type + " Rooms:========");
        int c = 0;
        for (Integer roomNo : m.keySet()) {
            if (m.get(roomNo) == null) {
                System.out.print(roomNo + " ");
                c++;
            }
        }
        System.out.println();
        if (c == 0) {
            System.out.println("Room not available");
        }
    }

    private void allocate(LinkedHashMap<Integer, Customer> m, String roomType, double roomPrice) {
        System.out.println("Enter the room number:");
        int roomNo = sc.nextInt();

        if (m.containsKey(roomNo) && m.get(roomNo) == null) {
            System.out.println("Enter Customer Name:");
            String cname = sc.next();
            System.out.println("Enter Customer Phone Number:");
            long phno = sc.nextLong();
            System.out.println("Enter Customer Age:");
            int age = sc.nextInt();
            System.out.println("Enter Customer House Number:");
            String hno = sc.next();
            System.out.println("Enter Customer State:");
            String state = sc.next();
            System.out.println("Enter Customer Pincode:");
            int pincode = sc.nextInt();

            Customer c = new Customer(cname, phno, age, new Address(hno, state, pincode), roomType, roomPrice, roomNo);
            m.put(roomNo, c);
            l1.add(c);
            System.out.println("Room allocated successfully.");
        } else {
            System.out.println("Room not available or invalid room number.");
        }
    }

    @Override
    public void checkIn() {
        System.out.println("====== Check In ====");
        System.out.println("1. Non AC\n2. AC\n3. Deluxe");
        System.out.println("Enter the option:");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                allocate(nonAc, "NonAc", 2000);
                break;
            case 2:
                allocate(ac, "AC", 2500);
                break;
            case 3:
                allocate(deluxe, "Deluxe", 3000);
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private void deallocate(LinkedHashMap<Integer, Customer> m) {
        System.out.println("Enter the room number:");
        int roomNo = sc.nextInt();
        if (m.containsKey(roomNo) && m.get(roomNo) != null) {
            Customer c = m.get(roomNo);
            System.out.println(c.getCname() + ", thanks for visiting our hotel. Room No: " + c.getRoomNo());
            m.put(roomNo, null);
        } else {
            System.out.println("Invalid room number or room is already vacant.");
        }
    }

    @Override
    public void checkOut() {
        System.out.println("======== Check Out ========");
        System.out.println("1. Non AC\n2. AC\n3. Deluxe");
        System.out.println("Enter the option:");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                deallocate(nonAc);
                break;
            case 2:
                deallocate(ac);
                break;
            case 3:
                deallocate(deluxe);
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    @Override
    public void customerDetails() {
        int c = 0;
        System.out.println("======= Customer Details ======");
        for (Customer ele : l1) {
            System.out.println(ele);
            c++;
        }
        if (c == 0) {
            System.out.println("No customer data found.");
        }
    }
}
