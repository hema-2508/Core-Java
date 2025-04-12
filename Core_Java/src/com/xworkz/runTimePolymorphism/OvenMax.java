package com.xworkz.runTimePolymorphism;

public class OvenMax extends Oven {
    public OvenMax() {
        System.out.println("Constructor of OvenMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Oven feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in OvenMax");
    }
}
