package com.xworkz.runTimePolymorphism;

public class ComputerMax extends Computer {
    public ComputerMax() {
        System.out.println("Constructor of ComputerMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Computer feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ComputerMax");
    }
}
