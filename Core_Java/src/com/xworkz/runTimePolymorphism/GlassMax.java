package com.xworkz.runTimePolymorphism;

public class GlassMax extends Glass {
    public GlassMax() {
        System.out.println("Constructor of GlassMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Glass feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in GlassMax");
    }
}
