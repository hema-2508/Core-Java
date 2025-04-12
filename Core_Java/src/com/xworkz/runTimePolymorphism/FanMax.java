package com.xworkz.runTimePolymorphism;

public class FanMax extends Fan {
    public FanMax() {
        System.out.println("Constructor of FanMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Fan feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in FanMax");
    }
}
