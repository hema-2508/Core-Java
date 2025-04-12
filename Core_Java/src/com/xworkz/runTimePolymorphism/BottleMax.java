package com.xworkz.runTimePolymorphism;

public class BottleMax extends Bottle {
    public BottleMax() {
        System.out.println("Constructor of BottleMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Bottle feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BottleMax");
    }
}
