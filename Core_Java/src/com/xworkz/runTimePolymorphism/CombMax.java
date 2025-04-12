package com.xworkz.runTimePolymorphism;

public class CombMax extends Comb {
    public CombMax() {
        System.out.println("Constructor of CombMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Comb feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in CombMax");
    }
}
