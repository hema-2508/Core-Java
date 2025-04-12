package com.xworkz.runTimePolymorphism;

public class BridgeMax extends Bridge {
    public BridgeMax() {
        System.out.println("Constructor of BridgeMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Bridge feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BridgeMax");
    }
}
