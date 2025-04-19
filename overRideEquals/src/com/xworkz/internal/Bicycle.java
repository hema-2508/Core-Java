package com.xworkz.internal;

import java.util.Objects;

public class Bicycle {
    String brand;
    String type;
    int gears;
    String frameMaterial;

    public Bicycle(String brand, String type, int gears, String frameMaterial) {
        this.brand = brand;
        this.type = type;
        this.gears = gears;
        this.frameMaterial = frameMaterial;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Gears = " + gears + ", Frame Material = " + frameMaterial;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) obj;
            if (Objects.equals(this.brand, bicycle.brand) && Objects.equals(this.type, bicycle.type) && Objects.equals(this.gears, bicycle.gears) && Objects.equals(this.frameMaterial, bicycle.frameMaterial)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
