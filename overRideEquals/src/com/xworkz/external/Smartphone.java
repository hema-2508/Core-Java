package com.xworkz.external;

import java.util.Objects;

public class Smartphone {
    String brand;
    String model;
    int storageGB;
    boolean has5G;

    public void setSmartphone(String brand, String model, int storageGB, boolean has5G) {
        this.brand = brand;
        this.model = model;
        this.storageGB = storageGB;
        this.has5G = has5G;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Model = " + model + ", StorageGB = " + storageGB + ", Has5G = " + has5G;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) obj;
            if (Objects.equals(this.brand, smartphone.brand) && Objects.equals(this.model, smartphone.model) && Objects.equals(this.storageGB, smartphone.storageGB) && Objects.equals(this.has5G, smartphone.has5G)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
