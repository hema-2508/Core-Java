package com.xworkz.runTimePolymorphism;

public class PillowMax extends Pillow {
    public PillowMax() {
        System.out.println("Constructor of PillowMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Pillow feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in PillowMax");
    }
}
