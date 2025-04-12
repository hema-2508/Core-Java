package com.xworkz.runTimePolymorphism;

public class SofaMax extends Sofa {
    public SofaMax() {
        System.out.println("Constructor of SofaMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Sofa feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in SofaMax");
    }
}
