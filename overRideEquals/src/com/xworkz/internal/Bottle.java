package com.xworkz.internal;

import java.util.Objects;

public class Bottle {

    String brand;
    String color;
    int capacity;
    int cost;


    public Bottle(String brand, String color, int capacity, int cost) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Color = " + color + ", size = " + capacity + ", cost = " + cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bottle) {
            Bottle bottle = (Bottle) obj;
            if (Objects.equals(this.brand, bottle.brand) && Objects.equals(this.color, bottle.color) && Objects.equals(this.capacity, bottle.capacity) && Objects.equals(this.cost, bottle.cost)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
