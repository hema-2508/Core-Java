package com.xworkz.external;

import java.util.Objects;

public class Television {
    String brand;
    int screenSize;
    String resolution;
    boolean smartTV;

    public void setTelevision(String brand, int screenSize, String resolution, boolean smartTV) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.smartTV = smartTV;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", ScreenSize = " + screenSize + ", Resolution = " + resolution + ", SmartTV = " + smartTV;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Television) {
            Television television = (Television) obj;
            if (Objects.equals(this.brand, television.brand) && Objects.equals(this.screenSize, television.screenSize) && Objects.equals(this.resolution, television.resolution) && Objects.equals(this.smartTV, television.smartTV)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
