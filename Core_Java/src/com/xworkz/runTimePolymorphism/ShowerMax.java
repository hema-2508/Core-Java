package com.xworkz.runTimePolymorphism;

public class ShowerMax extends Shower {
    public ShowerMax() {
        System.out.println("Constructor of ShowerMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Shower feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ShowerMax");
    }
}
