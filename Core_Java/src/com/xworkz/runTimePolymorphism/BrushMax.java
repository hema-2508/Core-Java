package com.xworkz.runTimePolymorphism;

public class BrushMax extends Brush {
    public BrushMax() {
        System.out.println("Constructor of BrushMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Brush feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BrushMax");
    }
}
