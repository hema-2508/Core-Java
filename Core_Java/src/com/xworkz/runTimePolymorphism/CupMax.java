package com.xworkz.runTimePolymorphism;

public class CupMax extends Cup {
    public CupMax() {
        System.out.println("Constructor of CupMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Cup feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in CupMax");
    }
}
