package com.xworkz.runTimePolymorphism;

public class WireMax extends Wire {
    public WireMax() {
        System.out.println("Constructor of WireMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Wire feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in WireMax");
    }
}
