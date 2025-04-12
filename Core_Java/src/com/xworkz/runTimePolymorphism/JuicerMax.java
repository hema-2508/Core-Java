package com.xworkz.runTimePolymorphism;

public class JuicerMax extends Juicer {
    public JuicerMax() {
        System.out.println("Constructor of JuicerMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Juicer feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in JuicerMax");
    }
}
