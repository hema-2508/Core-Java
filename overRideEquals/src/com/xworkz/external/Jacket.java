package com.xworkz.external;

import java.util.Objects;

public class Jacket {
    String brand;
    String material;
    String size;
    boolean waterproof;

    public void setJacket(String brand, String material, String size, boolean waterproof) {
        this.brand = brand;
        this.material = material;
        this.size = size;
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Material = " + material + ", Size = " + size + ", Waterproof = " + waterproof;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Jacket) {
            Jacket jacket = (Jacket) obj;
            if (Objects.equals(this.brand, jacket.brand) && Objects.equals(this.material, jacket.material) && Objects.equals(this.size, jacket.size) && Objects.equals(this.waterproof, jacket.waterproof)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}