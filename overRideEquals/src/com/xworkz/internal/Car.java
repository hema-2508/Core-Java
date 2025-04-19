package com.xworkz.internal;

import java.util.Objects;

public class Car {
    String make;
    String model;
    int year;
    double mileage;

    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Make = " + make + ", Model = " + model + ", Year = " + year + ", Mileage = " + mileage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Car) {
            Car car = (Car) obj;
            if (Objects.equals(this.make, car.make) && Objects.equals(this.model, car.model) && Objects.equals(this.year, car.year) && Objects.equals(this.mileage, car.mileage)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
