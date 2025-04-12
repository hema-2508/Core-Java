package com.xworkz.runTimePolymorphism;

public class RoadMax extends Road {
    public RoadMax() {
        System.out.println("Constructor of RoadMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Road feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in RoadMax");
    }
}
