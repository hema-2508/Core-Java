package com.xworkz.runTimePolymorphism;
public class BirdMax extends Bird {
    public BirdMax() {
        System.out.println("Constructor of BirdMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Bird feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BirdMax");
    }
}
