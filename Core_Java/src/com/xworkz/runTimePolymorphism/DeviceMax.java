package com.xworkz.runTimePolymorphism;

public class DeviceMax extends Device {
    public DeviceMax() {
        System.out.println("Constructor of DeviceMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Device feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in DeviceMax");
    }
}
