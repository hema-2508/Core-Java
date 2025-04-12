package com.xworkz.runTimePolymorphism;

public class MotorMax extends Motor {
    public MotorMax() {
        System.out.println("Constructor of MotorMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Motor feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in MotorMax");
    }
}
