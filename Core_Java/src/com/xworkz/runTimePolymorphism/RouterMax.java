package com.xworkz.runTimePolymorphism;

public class RouterMax extends Router {
    public RouterMax() {
        System.out.println("Constructor of RouterMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Router feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in RouterMax");
    }
}
