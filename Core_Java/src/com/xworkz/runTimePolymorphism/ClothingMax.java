package com.xworkz.runTimePolymorphism;

public class ClothingMax extends Clothing {
    public ClothingMax() {
        System.out.println("Constructor of ClothingMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Clothing feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ClothingMax");
    }
}
