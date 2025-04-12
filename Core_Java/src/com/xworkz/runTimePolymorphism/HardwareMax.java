package com.xworkz.runTimePolymorphism;

public class HardwareMax extends Hardware {
    public HardwareMax() {
        System.out.println("Constructor of HardwareMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Hardware feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in HardwareMax");
    }
}
