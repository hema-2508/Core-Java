package com.xworkz.internal;

public class Salmon{
    private String type;
    private String water;
    public void setSalmon(String type, String water) {
        this.type=type;
        this.water=water;
    }
    @Override public String toString() {
        return "Salmon [type=" + type + ", water=" + water + "]";
    }
}
