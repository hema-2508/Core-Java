package com.xworkz.runTimePolymorphism;

public class PlugMax extends Plug {
    public PlugMax() {
        System.out.println("Constructor of PlugMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Plug feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in PlugMax");
    }
}
