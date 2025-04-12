package com.xworkz.runTimePolymorphism;

public class SportMax extends Sport {
    public SportMax() {
        System.out.println("Constructor of SportMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Sport feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in SportMax");
    }
}
