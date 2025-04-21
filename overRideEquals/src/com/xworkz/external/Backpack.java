package com.xworkz.external;

import java.util.Objects;

public class Backpack {
    String brand;
    int capacity;
    boolean waterproof;
    int compartments;

    public void setBackpack(String brand, int capacity, boolean waterproof, int compartments) {
        this.brand = brand;
        this.capacity = capacity;
        this.waterproof = waterproof;
        this.compartments = compartments;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Capacity = " + capacity + ", Waterproof = " + waterproof + ", Compartments = " + compartments;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Backpack) {
            Backpack backpack = (Backpack) obj;
            if (Objects.equals(this.brand, backpack.brand) && Objects.equals(this.capacity, backpack.capacity) && Objects.equals(this.waterproof, backpack.waterproof) && Objects.equals(this.compartments, backpack.compartments)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
