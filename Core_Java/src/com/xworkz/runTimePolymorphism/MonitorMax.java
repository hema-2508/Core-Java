package com.xworkz.runTimePolymorphism;

public class MonitorMax extends Monitor {
    public MonitorMax() {
        System.out.println("Constructor of MonitorMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Monitor feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in MonitorMax");
    }
}
