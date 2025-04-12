package com.xworkz.runTimePolymorphism;

public class ToiletMax extends Toilet {
    public ToiletMax() {
        System.out.println("Constructor of ToiletMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Toilet feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ToiletMax");
    }
}
