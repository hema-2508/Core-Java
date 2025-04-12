package com.xworkz.runTimePolymorphism;

public class ChairMax extends Chair {
    public ChairMax() {
        System.out.println("Constructor of ChairMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Chair feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ChairMax");
    }
}
