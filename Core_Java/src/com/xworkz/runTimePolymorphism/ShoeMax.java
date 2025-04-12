package com.xworkz.runTimePolymorphism;

public class ShoeMax extends Shoe {
    public ShoeMax() {
        System.out.println("Constructor of ShoeMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Shoe feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ShoeMax");
    }
}
