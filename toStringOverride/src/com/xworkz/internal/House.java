package com.xworkz.internal;

public class House {
    private String structure;
    private String location;
    public void setHouse(String structure, String location) {
        this.location=location;
        this.structure=structure;
    }
    @Override public String toString() {
        return "House [structure=" + structure + ", location=" + location + "]";
    }
}
