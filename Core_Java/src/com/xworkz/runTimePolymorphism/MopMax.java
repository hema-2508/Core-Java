package com.xworkz.runTimePolymorphism;

public class MopMax extends Mop {
    public MopMax() {
        System.out.println("Constructor of MopMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Mop feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in MopMax");
    }
}
