package com.xworkz.runTimePolymorphism;

public class MachineMax extends Machine {
    public MachineMax() {
        System.out.println("Constructor of MachineMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Machine feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in MachineMax");
    }
}
