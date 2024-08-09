package org.jsp.serviceimpl;

import org.jsp.entity.Car;
import org.jsp.service.CarRentalService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CarRentalServiceImpln implements CarRentalService {
    private ArrayList<Car> l1 = new ArrayList<>();
    private Scanner ip = new Scanner(System.in);

    @Override
    public void addCar() {
        System.out.println("===Please Enter the below Car details===");
        System.out.println("Enter the car id:");
        int cid = ip.nextInt();
        System.out.println("Enter the brand:");
        String bname = ip.next();
        System.out.println("Enter the price:");
        double price = ip.nextDouble();
        System.out.println("Enter the model:");
        String mdl = ip.next();
        System.out.println("Enter the color:");
        String color = ip.next();
        System.out.println("Enter the fuel type:");
        String ft = ip.next();
        System.out.println("Enter the mileage:");
        int mileage = ip.nextInt();
        l1.add(new Car(cid, bname, price, mdl, color, ft, mileage));
        System.out.println("Car details added successfully.");
    }

    @Override
    public void allDetails() {
        System.out.println("=== Car Details ===");
        if (l1.isEmpty()) {
            System.out.println("No cars found.");
        } else {
            for (Car car : l1) {
                System.out.println(car);
            }
        }
    }

    @Override
    public void findCarById() {
        System.out.println("Enter the car id to search:");
        int id = ip.nextInt();
        boolean found = false;
        for (Car car : l1) {
            if (car.getCid() == id) {
                System.out.println("Car found:");
                System.out.println(car);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Car with id " + id + " not found.");
        }
    }

    @Override
    public void sortCarByCid() {
        if (l1.isEmpty()) {
            System.out.println("No cars found to sort.");
        } else {
            Collections.sort(l1);
            System.out.println("=== Cars Sorted by Car ID ===");
            for (Car car : l1) {
                System.out.println(car);
            }
        }
    }

    @Override
    public void sortCarByPrice() {
        if (l1.isEmpty()) {
            System.out.println("No cars found to sort.");
        } else {
            Collections.sort(l1, new CarServicesSorting());
            System.out.println("=== Cars Sorted by Price ===");
            for (Car car : l1) {
                System.out.println(car);
            }
        }
    }

    @Override
    public void sortCarByFuelType() {
        if (l1.isEmpty()) {
            System.out.println("No cars found to sort.");
        } else {
            Collections.sort(l1, new CarServicesSortingFuelType());
            System.out.println("=== Cars Sorted by Fuel Type ===");
            for (Car car : l1) {
                System.out.println(car);
            }
        }
    }
}
