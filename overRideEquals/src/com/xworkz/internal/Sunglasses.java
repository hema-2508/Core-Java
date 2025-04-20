package com.xworkz.internal;

import java.util.Objects;

public class Sunglasses {
    String brand;
    String lensColor;
    String frameMaterial;
    boolean polarized;

    public Sunglasses(String brand, String lensColor, String frameMaterial, boolean polarized) {
        this.brand = brand;
        this.lensColor = lensColor;
        this.frameMaterial = frameMaterial;
        this.polarized = polarized;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Lens Color = " + lensColor + ", Frame Material = " + frameMaterial + ", Polarized = " + polarized;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sunglasses) {
            Sunglasses sunglasses = (Sunglasses) obj;
            if (Objects.equals(this.brand, sunglasses.brand) && Objects.equals(this.lensColor, sunglasses.lensColor) && Objects.equals(this.frameMaterial, sunglasses.frameMaterial) && Objects.equals(this.polarized, sunglasses.polarized)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}