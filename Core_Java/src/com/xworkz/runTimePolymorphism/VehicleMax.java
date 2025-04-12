package com.xworkz.runTimePolymorphism;

public class VehicleMax extends Vehicle {
    public VehicleMax() {
        System.out.println("Constructor of VehicleMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Vehicle feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in VehicleMax");
    }
}
