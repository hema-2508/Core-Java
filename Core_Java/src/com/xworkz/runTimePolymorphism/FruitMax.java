package com.xworkz.runTimePolymorphism;

public class FruitMax extends Fruit {
    public FruitMax() {
        System.out.println("Constructor of FruitMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Fruit feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in FruitMax");
    }
}
