package com.xworkz.runTimePolymorphism;

public class WindowMax extends Window {
    public WindowMax() {
        System.out.println("Constructor of WindowMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Window feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in WindowMax");
    }
}
