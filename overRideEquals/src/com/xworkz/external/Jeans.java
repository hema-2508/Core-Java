package com.xworkz.external;

import java.util.Objects;

public class Jeans {
    String brand;
    String fit;
    int waistSize;
    String color;

    public void setJeans(String brand, String fit, int waistSize, String color) {
        this.brand = brand;
        this.fit = fit;
        this.waistSize = waistSize;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Fit = " + fit + ", WaistSize = " + waistSize + ", Color = " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Jeans) {
            Jeans jeans = (Jeans) obj;
            if (Objects.equals(this.brand, jeans.brand) && Objects.equals(this.fit, jeans.fit) && Objects.equals(this.waistSize, jeans.waistSize) && Objects.equals(this.color, jeans.color)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

