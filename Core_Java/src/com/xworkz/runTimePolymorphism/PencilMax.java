package com.xworkz.runTimePolymorphism;

public class PencilMax extends Pencil {
    public PencilMax() {
        System.out.println("Constructor of PencilMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Pencil feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in PencilMax");
    }
}
