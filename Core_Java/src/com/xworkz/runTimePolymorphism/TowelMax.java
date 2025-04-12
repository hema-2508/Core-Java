package com.xworkz.runTimePolymorphism;

public class TowelMax extends Towel {
    public TowelMax() {
        System.out.println("Constructor of TowelMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Towel feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in TowelMax");
    }
}
