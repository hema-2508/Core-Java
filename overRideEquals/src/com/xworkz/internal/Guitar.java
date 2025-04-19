package com.xworkz.internal;

import java.util.Objects;

public class Guitar {
    String brand;
    String type;
    int strings;
    boolean isElectric;

    public Guitar(String brand, String type, int strings, boolean isElectric) {
        this.brand = brand;
        this.type = type;
        this.strings = strings;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Strings = " + strings + ", Is Electric = " + isElectric;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Guitar) {
            Guitar guitar = (Guitar) obj;
            if (Objects.equals(this.brand, guitar.brand) && Objects.equals(this.type, guitar.type) && Objects.equals(this.strings, guitar.strings) && Objects.equals(this.isElectric, guitar.isElectric)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}