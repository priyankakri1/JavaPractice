package org.jsp.app;

import org.jsp.service.CarRentalService;
import org.jsp.serviceimpl.CarRentalServiceImpln;

import java.util.Scanner;

public class CarRentalApp {
    public static void main(String[] args) {
        System.out.println("========Welcome to Car Rental System=======");
        Scanner ip=new Scanner(System.in);

        CarRentalService cs=new CarRentalServiceImpln();
        while(true) {
            System.out.println("=============Menu============");
            System.out.println("1.Add Car\n2.Car Details\n3.find carById\n4.Sort Details By Cid\n5.Sort  Details By price\n6.Sort  Details By fuelType\n7.Exit");
            int op=ip.nextInt();
            switch(op) {
                case 1:cs.addCar(); break;
                case 2:cs.allDetails();break;
                case 3:cs.findCarById(); break;
                case 4:cs.sortCarByCid();break;
                case 5:cs.sortCarByPrice();break;
                case 6:cs.sortCarByFuelType();break;
                case 7:System.out.println("====Thank You Visit Again===");
                    System.exit(0);   break;
                default: System.out.println("Invalid option....!");
            }
        }

    }

}


