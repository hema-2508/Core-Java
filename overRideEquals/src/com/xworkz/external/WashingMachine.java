package com.xworkz.external;

import java.util.Objects;

public class WashingMachine {
    String brand;
    double capacity;
    String type;
    int rpm;

    public void setWashingMachine(String brand, double capacity, String type, int rpm) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Capacity = " + capacity + ", Type = " + type + ", RPM = " + rpm;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WashingMachine) {
            WashingMachine washingMachine = (WashingMachine) obj;
            if (Objects.equals(this.brand, washingMachine.brand) && Objects.equals(this.capacity, washingMachine.capacity) && Objects.equals(this.type, washingMachine.type) && Objects.equals(this.rpm, washingMachine.rpm)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

