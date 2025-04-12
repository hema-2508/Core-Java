package com.xworkz.runTimePolymorphism;

public class BuildingMax extends Building {
    public BuildingMax() {
        System.out.println("Constructor of BuildingMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Building feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BuildingMax");
    }
}
