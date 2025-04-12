package com.xworkz.runTimePolymorphism;

public class RazorMax extends Razor {
    public RazorMax() {
        System.out.println("Constructor of RazorMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Razor feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in RazorMax");
    }
}
