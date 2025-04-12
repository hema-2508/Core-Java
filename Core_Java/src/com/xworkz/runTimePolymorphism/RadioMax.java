package com.xworkz.runTimePolymorphism;

public class RadioMax extends Radio {
    public RadioMax() {
        System.out.println("Constructor of RadioMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Radio feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in RadioMax");
    }
}
