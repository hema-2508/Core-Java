package com.xworkz.internal;

import java.util.Objects;

public class Laptop {
    String brand;
    String processor;
    int ram;
    double screenSize;

    public Laptop(String brand, String processor, int ram, double screenSize) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Processor = " + processor + ", RAM = " + ram + ", Screen Size = " + screenSize;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Laptop) {
            Laptop laptop = (Laptop) obj;
            if (Objects.equals(this.brand, laptop.brand) && Objects.equals(this.processor, laptop.processor) && Objects.equals(this.ram, laptop.ram) && Objects.equals(this.screenSize, laptop.screenSize)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}