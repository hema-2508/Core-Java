package com.xworkz.runTimePolymorphism;public class BlanketMax extends Blanket {

    public BlanketMax() {
        System.out.println("Constructor of BlanketMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Blanket feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BlanketMax");
    }
}
