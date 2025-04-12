package com.xworkz.runTimePolymorphism;

public class FreezerMax extends Freezer {
    public FreezerMax() {
        System.out.println("Constructor of FreezerMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Freezer feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in FreezerMax");
    }
}
