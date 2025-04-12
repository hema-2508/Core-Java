package com.xworkz.runTimePolymorphism;

public class EngineMax extends Engine {
    public EngineMax() {
        System.out.println("Constructor of EngineMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Engine feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in EngineMax");
    }
}
