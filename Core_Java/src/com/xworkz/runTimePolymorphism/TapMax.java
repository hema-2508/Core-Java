package com.xworkz.runTimePolymorphism;

public class TapMax extends Tap {
    public TapMax() {
        System.out.println("Constructor of TapMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Tap feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in TapMax");
    }
}
