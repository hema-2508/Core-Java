package com.xworkz.external;

import java.util.Objects;

public class Refrigerator {
    String brand;
    double capacity;
    int doors;
    boolean frostFree;

    public void setRefrigerator(String brand, double capacity, int doors, boolean frostFree) {
        this.brand = brand;
        this.capacity = capacity;
        this.doors = doors;
        this.frostFree = frostFree;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Capacity = " + capacity + ", Doors = " + doors + ", FrostFree = " + frostFree;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Refrigerator) {
            Refrigerator refrigerator = (Refrigerator) obj;
            if (Objects.equals(this.brand, refrigerator.brand) && Objects.equals(this.capacity, refrigerator.capacity) && Objects.equals(this.doors, refrigerator.doors) && Objects.equals(this.frostFree, refrigerator.frostFree)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

