package com.xworkz.external;

import java.util.Objects;

public class TShirt {
    String brand;
    String size;
    String color;
    String neckType;

    public void setTShirt(String brand, String size, String color, String neckType) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.neckType = neckType;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Size = " + size + ", Color = " + color + ", NeckType = " + neckType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof TShirt) {
            TShirt tShirt = (TShirt) obj;
            if (Objects.equals(this.brand, tShirt.brand) && Objects.equals(this.size, tShirt.size) && Objects.equals(this.color, tShirt.color) && Objects.equals(this.neckType, tShirt.neckType)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
