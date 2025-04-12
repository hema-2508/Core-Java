package com.xworkz.runTimePolymorphism;

public class PlantMax extends Plant {
    public PlantMax() {
        System.out.println("Constructor of PlantMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Plant feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in PlantMax");
    }
}
