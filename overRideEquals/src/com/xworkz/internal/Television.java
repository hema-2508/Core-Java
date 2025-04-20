package com.xworkz.internal;

import java.util.Objects;

public class Television {
    String brand;
    String model;
    int screenSize;
    boolean isSmart;

    public Television(String brand, String model, int screenSize, boolean isSmart) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Model = " + model + ", Screen Size = " + screenSize + ", Is Smart = " + isSmart;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Television) {
            Television television = (Television) obj;
            if (Objects.equals(this.brand, television.brand) && Objects.equals(this.model, television.model) && Objects.equals(this.screenSize, television.screenSize) && Objects.equals(this.isSmart, television.isSmart)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
