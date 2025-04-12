package com.xworkz.runTimePolymorphism;

public class LaptopMax extends Laptop {
    public LaptopMax() {
        System.out.println("Constructor of LaptopMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Laptop feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in LaptopMax");
    }
}
