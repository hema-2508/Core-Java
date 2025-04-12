package com.xworkz.runTimePolymorphism;

public class ClockMax extends Clock {
    public ClockMax() {
        System.out.println("Constructor of ClockMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Clock feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ClockMax");
    }
}
