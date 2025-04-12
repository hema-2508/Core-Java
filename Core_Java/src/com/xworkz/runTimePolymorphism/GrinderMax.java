package com.xworkz.runTimePolymorphism;

public class GrinderMax extends Grinder {
    public GrinderMax() {
        System.out.println("Constructor of GrinderMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Grinder feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in GrinderMax");
    }
}
