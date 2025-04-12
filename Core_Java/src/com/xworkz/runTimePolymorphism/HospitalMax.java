package com.xworkz.runTimePolymorphism;

public class HospitalMax extends Hospital {
    public HospitalMax() {
        System.out.println("Constructor of HospitalMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Hospital feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in HospitalMax");
    }
}
