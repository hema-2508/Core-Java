package com.xworkz.runTimePolymorphism;

public class MicrowaveMax extends Microwave {
    public MicrowaveMax() {
        System.out.println("Constructor of MicrowaveMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Microwave feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in MicrowaveMax");
    }
}
