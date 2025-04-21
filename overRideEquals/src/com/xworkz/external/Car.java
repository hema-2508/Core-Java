package com.xworkz.external;

import java.util.Objects;

public class Car {
    String make;
    String model;
    int year;
    String fuelType;

    public void setCar(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Make = " + make + ", Model = " + model + ", Year = " + year + ", FuelType = " + fuelType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Car) {
            Car car = (Car) obj;
            if (Objects.equals(this.make, car.make) && Objects.equals(this.model, car.model) && Objects.equals(this.year, car.year) && Objects.equals(this.fuelType, car.fuelType)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
