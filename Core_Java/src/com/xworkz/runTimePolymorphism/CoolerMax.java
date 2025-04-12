package com.xworkz.runTimePolymorphism;

public class CoolerMax extends Cooler {
    public CoolerMax() {
        System.out.println("Constructor of CoolerMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Cooler feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in CoolerMax");
    }
}
