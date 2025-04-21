package com.xworkz.external;

import java.util.Objects;

public class Headphones {
    String brand;
    String type;
    boolean wireless;
    boolean noiseCancelling;

    public void setHeadphones(String brand, String type, boolean wireless, boolean noiseCancelling) {
        this.brand = brand;
        this.type = type;
        this.wireless = wireless;
        this.noiseCancelling = noiseCancelling;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Wireless = " + wireless + ", NoiseCancelling = " + noiseCancelling;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Headphones) {
            Headphones headphones = (Headphones) obj;
            if (Objects.equals(this.brand, headphones.brand) && Objects.equals(this.type, headphones.type) && Objects.equals(this.wireless, headphones.wireless) && Objects.equals(this.noiseCancelling, headphones.noiseCancelling)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
