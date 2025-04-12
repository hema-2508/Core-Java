package com.xworkz.runTimePolymorphism;

public class FridgeMax extends Fridge {
    public FridgeMax() {
        System.out.println("Constructor of FridgeMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Fridge feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in FridgeMax");
    }
}
