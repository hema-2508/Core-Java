package com.xworkz.runTimePolymorphism;

public class FlowerMax extends Flower {
    public FlowerMax() {
        System.out.println("Constructor of FlowerMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Flower feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in FlowerMax");
    }
}
