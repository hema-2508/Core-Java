package com.xworkz.runTimePolymorphism;

public class ToasterMax extends Toaster {
    public ToasterMax() {
        System.out.println("Constructor of ToasterMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Toaster feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ToasterMax");
    }
}
