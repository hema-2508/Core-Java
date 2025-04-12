package com.xworkz.runTimePolymorphism;

public class InsectMax extends Insect {
    public InsectMax() {
        System.out.println("Constructor of InsectMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Insect feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in InsectMax");
    }
}
