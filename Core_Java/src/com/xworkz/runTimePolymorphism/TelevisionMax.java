package com.xworkz.runTimePolymorphism;

public class TelevisionMax extends Television {
    public TelevisionMax() {
        System.out.println("Constructor of TelevisionMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Television feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in TelevisionMax");
    }
}
