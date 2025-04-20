package com.xworkz.internal;

import java.util.Objects;

public class Shoe {
    String brand;
    String type;
    int size;
    String color;

    public Shoe(String brand, String type, int size, String color) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Size = " + size + ", Color = " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Shoe) {
            Shoe shoe = (Shoe) obj;
            if (Objects.equals(this.brand, shoe.brand) && Objects.equals(this.type, shoe.type) && Objects.equals(this.size, shoe.size) && Objects.equals(this.color, shoe.color)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

