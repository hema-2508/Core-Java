package com.xworkz.runTimePolymorphism;

public class PenMax extends Pen {
    public PenMax() {
        System.out.println("Constructor of PenMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Pen feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in PenMax");
    }
}
