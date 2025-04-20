package com.xworkz.internal;

import java.util.Objects;

public class Smartwatch {
    String brand;
    String os;
    double screenSize;
    boolean heartRateMonitor;

    public Smartwatch(String brand, String os, double screenSize, boolean heartRateMonitor) {
        this.brand = brand;
        this.os = os;
        this.screenSize = screenSize;
        this.heartRateMonitor = heartRateMonitor;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", OS = " + os + ", Screen Size = " + screenSize + ", Heart Rate Monitor = " + heartRateMonitor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Smartwatch) {
            Smartwatch smartwatch = (Smartwatch) obj;
            if (Objects.equals(this.brand, smartwatch.brand) && Objects.equals(this.os, smartwatch.os) && Objects.equals(this.screenSize, smartwatch.screenSize) && Objects.equals(this.heartRateMonitor, smartwatch.heartRateMonitor)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
