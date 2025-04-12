package com.xworkz.runTimePolymorphism;

public class FurnitureMax extends Furniture {
    public FurnitureMax() {
        System.out.println("Constructor of FurnitureMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Furniture feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in FurnitureMax");
    }
}
