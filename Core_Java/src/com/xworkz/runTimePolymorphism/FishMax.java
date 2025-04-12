package com.xworkz.runTimePolymorphism;

public class FishMax extends Fish {
    public FishMax() {
        System.out.println("Constructor of FishMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Fish feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in FishMax");
    }
}
