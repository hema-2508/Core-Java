package com.xworkz.runTimePolymorphism;

public class CableMax extends Cable {
    public CableMax() {
        System.out.println("Constructor of CableMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Cable feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in CableMax");
    }
}
