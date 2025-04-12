package com.xworkz.runTimePolymorphism;

public class TreeMax extends Tree {
    public TreeMax() {
        System.out.println("Constructor of TreeMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Tree feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in TreeMax");
    }
}
