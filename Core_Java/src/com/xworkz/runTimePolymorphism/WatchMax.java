package com.xworkz.runTimePolymorphism;

public class WatchMax extends Watch {
    public WatchMax() {
        System.out.println("Constructor of WatchMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Watch feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in WatchMax");
    }
}
