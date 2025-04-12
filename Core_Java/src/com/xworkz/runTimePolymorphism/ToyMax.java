package com.xworkz.runTimePolymorphism;

public class ToyMax extends Toy {
    public ToyMax() {
        System.out.println("Constructor of ToyMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Toy feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ToyMax");
    }
}
