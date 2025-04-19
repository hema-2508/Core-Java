package com.xworkz.internal;

import java.util.Objects;

public class Microwave {
    String brand;
    double capacity;
    int powerLevels;
    boolean hasTurntable;

    public Microwave(String brand, double capacity, int powerLevels, boolean hasTurntable) {
        this.brand = brand;
        this.capacity = capacity;
        this.powerLevels = powerLevels;
        this.hasTurntable = hasTurntable;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Capacity = " + capacity + ", Power Levels = " + powerLevels + ", Has Turntable = " + hasTurntable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Microwave) {
            Microwave microwave = (Microwave) obj;
            if (Objects.equals(this.brand, microwave.brand) && Objects.equals(this.capacity, microwave.capacity) && Objects.equals(this.powerLevels, microwave.powerLevels) && Objects.equals(this.hasTurntable, microwave.hasTurntable)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}