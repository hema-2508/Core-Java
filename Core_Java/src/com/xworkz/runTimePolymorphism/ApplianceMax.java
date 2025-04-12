package com.xworkz.runTimePolymorphism;

public class ApplianceMax extends Appliance {
    public ApplianceMax() {
        System.out.println("Constructor of ApplianceMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Appliance feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ApplianceMax");
    }
}
