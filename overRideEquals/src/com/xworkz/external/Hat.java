package com.xworkz.external;

import java.util.Objects;

public class Hat {
    String brand;
    String type;
    String size;
    String color;

    public void setHat(String brand, String type, String size, String color) {
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
        if (obj != null && obj instanceof Hat) {
            Hat hat = (Hat) obj;
            if (Objects.equals(this.brand, hat.brand) && Objects.equals(this.type, hat.type) && Objects.equals(this.size, hat.size) && Objects.equals(this.color, hat.color)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
