package com.xworkz.runTimePolymorphism;

public class VacuumMax extends Vacuum {
    public VacuumMax() {
        System.out.println("Constructor of VacuumMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Vacuum feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in VacuumMax");
    }
}
