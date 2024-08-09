package org.jsp.serviceimpl;

import org.jsp.entity.Car;

import java.util.Comparator;

public class CarServicesSorting implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        // Compare based on price
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

class CarServicesSortingFuelType implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        // Compare based on fuel type
        return o1.getFuelType().compareTo(o2.getFuelType());
    }
}
