package com.xworkz.runTimePolymorphism;

public class ScreenMax extends Screen {
    public ScreenMax() {
        System.out.println("Constructor of ScreenMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Screen feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ScreenMax");
    }
}
