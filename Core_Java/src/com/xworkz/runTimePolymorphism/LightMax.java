package com.xworkz.runTimePolymorphism;

public class LightMax extends Light {
    public LightMax() {
        System.out.println("Constructor of LightMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Light feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in LightMax");
    }
}
