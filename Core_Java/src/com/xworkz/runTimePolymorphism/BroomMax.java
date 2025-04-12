package com.xworkz.runTimePolymorphism;

public class BroomMax extends Broom {
    public BroomMax() {
        System.out.println("Constructor of BroomMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Broom feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BroomMax");
    }
}
