package com.xworkz.runTimePolymorphism;

public class DeskMax extends Desk {
    public DeskMax() {
        System.out.println("Constructor of DeskMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Desk feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in DeskMax");
    }
}
