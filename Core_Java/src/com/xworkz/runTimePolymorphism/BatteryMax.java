package com.xworkz.runTimePolymorphism;
public class BatteryMax extends Battery {
    public BatteryMax() {
        System.out.println("Constructor of BatteryMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Battery feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BatteryMax");
    }
}
