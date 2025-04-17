package com.xworkz.internal;

public class Car {
    private String type;
    private String fuel;
    public void setString(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }
    @Override public String toString() {
        return "Car [type=" + type + ", fuel=" + fuel + "]";
    }
}