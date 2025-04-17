package com.xworkz.internal;

public class Laptop {
    private String device;
    private String brand;
    public void setLaptop(String device, String brand) {
        this.brand=brand;
        this.device=device;
    }
    @Override public String toString() {
        return "Laptop [device=" + device + ", brand=" + brand + "]";
    }
}
