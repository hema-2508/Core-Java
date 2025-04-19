package com.xworkz.internal;

import java.util.Objects;

public class Headphones {
    String brand;
    String type;
    boolean wireless;
    double price;

    public Headphones(String brand, String type, boolean wireless, double price) {
        this.brand = brand;
        this.type = type;
        this.wireless = wireless;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Wireless = " + wireless + ", Price = " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Headphones) {
            Headphones headphones = (Headphones) obj;
            if (Objects.equals(this.brand, headphones.brand) && Objects.equals(this.type, headphones.type) && Objects.equals(this.wireless, headphones.wireless) && Objects.equals(this.price, headphones.price)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}