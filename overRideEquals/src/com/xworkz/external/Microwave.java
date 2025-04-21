package com.xworkz.external;

import java.util.Objects;

public class Microwave {
    String brand;
    double capacity;
    int powerWatt;
    boolean hasGrill;

    public void setMicrowave(String brand, double capacity, int powerWatt, boolean hasGrill) {
        this.brand = brand;
        this.capacity = capacity;
        this.powerWatt = powerWatt;
        this.hasGrill = hasGrill;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Capacity = " + capacity + ", PowerWatt = " + powerWatt + ", HasGrill = " + hasGrill;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Microwave) {
            Microwave microwave = (Microwave) obj;
            if (Objects.equals(this.brand, microwave.brand) && Objects.equals(this.capacity, microwave.capacity) && Objects.equals(this.powerWatt, microwave.powerWatt) && Objects.equals(this.hasGrill, microwave.hasGrill)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

