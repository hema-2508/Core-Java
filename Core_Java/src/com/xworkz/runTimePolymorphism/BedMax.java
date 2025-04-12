package com.xworkz.runTimePolymorphism;
public class BedMax extends Bed {
    public BedMax() {
        System.out.println("Constructor of BedMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Bed feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BedMax");
    }
}
