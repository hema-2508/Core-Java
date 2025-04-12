package com.xworkz.runTimePolymorphism;

public class BagMax extends Bag {
    public BagMax() {
        System.out.println("Constructor of BagMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Bag feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BagMax");
    }
}
