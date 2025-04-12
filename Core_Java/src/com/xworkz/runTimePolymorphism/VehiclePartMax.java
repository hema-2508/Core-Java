package com.xworkz.runTimePolymorphism;

public class VehiclePartMax extends VehiclePart {
    public VehiclePartMax() {
        System.out.println("Constructor of VehiclePartMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced VehiclePart feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in VehiclePartMax");
    }
}
