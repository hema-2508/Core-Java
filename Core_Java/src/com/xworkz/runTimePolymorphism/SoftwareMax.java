package com.xworkz.runTimePolymorphism;

public class SoftwareMax extends Software {
    public SoftwareMax() {
        System.out.println("Constructor of SoftwareMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Software feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in SoftwareMax");
    }
}
