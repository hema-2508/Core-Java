package com.xworkz.runTimePolymorphism;

public class BowlMax extends Bowl {
    public BowlMax() {
        System.out.println("Constructor of BowlMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Bowl feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BowlMax");
    }
}
