package com.xworkz.external;

import java.util.Objects;

public class Laptop {
    String manufacturer;
    String processor;
    int ramGB;
    double screenSize;

    public void setLaptop(String manufacturer, String processor, int ramGB, double screenSize) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramGB = ramGB;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Manufacturer = " + manufacturer + ", Processor = " + processor + ", RAMGB = " + ramGB + ", ScreenSize = " + screenSize;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Laptop) {
            Laptop laptop = (Laptop) obj;
            if (Objects.equals(this.manufacturer, laptop.manufacturer) && Objects.equals(this.processor, laptop.processor) && Objects.equals(this.ramGB, laptop.ramGB) && Objects.equals(this.screenSize, laptop.screenSize)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}