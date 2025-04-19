package com.xworkz.internal;

import java.util.Objects;

public class Phone {
    String manufacturer;
    String model;
    int storage;
    boolean has5G;

    public Phone(String manufacturer, String model, int storage, boolean has5G) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.storage = storage;
        this.has5G = has5G;
    }

    @Override
    public String toString() {
        return "Manufacturer = " + manufacturer + ", Model = " + model + ", Storage = " + storage + ", Has 5G = " + has5G;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Phone) {
            Phone phone = (Phone) obj;
            if (Objects.equals(this.manufacturer, phone.manufacturer) && Objects.equals(this.model, phone.model) && Objects.equals(this.storage, phone.storage) && Objects.equals(this.has5G, phone.has5G)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}