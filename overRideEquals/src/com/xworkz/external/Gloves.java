package com.xworkz.external;

import java.util.Objects;

public class Gloves {
    String brand;
    String material;
    String size;
    boolean touchscreenCompatible;

    public void setGloves(String brand, String material, String size, boolean touchscreenCompatible) {
        this.brand = brand;
        this.material = material;
        this.size = size;
        this.touchscreenCompatible = touchscreenCompatible;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Material = " + material + ", Size = " + size + ", TouchscreenCompatible = " + touchscreenCompatible;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Gloves) {
            Gloves gloves = (Gloves) obj;
            if (Objects.equals(this.brand, gloves.brand) && Objects.equals(this.material, gloves.material) && Objects.equals(this.size, gloves.size) && Objects.equals(this.touchscreenCompatible, gloves.touchscreenCompatible)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
