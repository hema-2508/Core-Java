package com.xworkz.external;

import java.util.Objects;

public class Shoes {
    String brand;
    String type;
    int size;
    String color;

    public void setShoes(String brand, String type, int size, String color) {
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
        if (obj != null && obj instanceof Shoes) {
            Shoes shoes = (Shoes) obj;
            if (Objects.equals(this.brand, shoes.brand) && Objects.equals(this.type, shoes.type) && Objects.equals(this.size, shoes.size) && Objects.equals(this.color, shoes.color)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

