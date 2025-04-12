package com.xworkz.runTimePolymorphism;

public class ToolMax extends Tool {
    public ToolMax() {
        System.out.println("Constructor of ToolMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Tool feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ToolMax");
    }
}
