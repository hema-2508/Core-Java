package com.xworkz.runTimePolymorphism;

public class DoctorMax extends Doctor {
    public DoctorMax() {
        System.out.println("Constructor of DoctorMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Doctor feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in DoctorMax");
    }
}
