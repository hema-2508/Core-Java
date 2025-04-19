package com.xworkz.internal;

import java.util.Objects;

public class Backpack {
    String material;
    String color;
    int capacity;
    boolean waterproof;

    public Backpack(String material, String color, int capacity, boolean waterproof) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "Material = " + material + ", Color = " + color + ", Capacity = " + capacity + ", Waterproof = " + waterproof;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Backpack) {
            Backpack backpack = (Backpack) obj;
            if (Objects.equals(this.material, backpack.material) && Objects.equals(this.color, backpack.color) && Objects.equals(this.capacity, backpack.capacity) && Objects.equals(this.waterproof, backpack.waterproof)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
