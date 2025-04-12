package com.xworkz.runTimePolymorphism;

public class HeaterMax extends Heater {
    public HeaterMax() {
        System.out.println("Constructor of HeaterMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Heater feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in HeaterMax");
    }
}
