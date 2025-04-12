package com.xworkz.runTimePolymorphism;

public class StoveMax extends Stove {
    public StoveMax() {
        System.out.println("Constructor of StoveMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Stove feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in StoveMax");
    }
}
