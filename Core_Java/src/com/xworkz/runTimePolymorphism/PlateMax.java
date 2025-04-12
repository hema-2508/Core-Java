package com.xworkz.runTimePolymorphism;

public class PlateMax extends Plate {
    public PlateMax() {
        System.out.println("Constructor of PlateMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Plate feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in PlateMax");
    }
}
