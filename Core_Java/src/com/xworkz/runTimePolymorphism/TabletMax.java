package com.xworkz.runTimePolymorphism;

public class TabletMax extends Tablet {
    public TabletMax() {
        System.out.println("Constructor of TabletMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Tablet feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in TabletMax");
    }
}
