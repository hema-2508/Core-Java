package com.xworkz.runTimePolymorphism;

public class CameraMax extends Camera {
    public CameraMax() {
        System.out.println("Constructor of CameraMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Camera feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in CameraMax");
    }
}
