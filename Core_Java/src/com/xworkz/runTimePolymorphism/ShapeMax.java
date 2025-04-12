package com.xworkz.runTimePolymorphism;

public class ShapeMax extends Shape {
    public ShapeMax() {
        System.out.println("Constructor of ShapeMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Shape feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ShapeMax");
    }
}
