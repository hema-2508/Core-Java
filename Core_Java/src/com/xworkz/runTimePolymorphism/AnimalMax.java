package com.xworkz.runTimePolymorphism;

public class AnimalMax extends Animal {
    public AnimalMax() {
        System.out.println("Constructor of AnimalMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Animal feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in AnimalMax");
    }
}
