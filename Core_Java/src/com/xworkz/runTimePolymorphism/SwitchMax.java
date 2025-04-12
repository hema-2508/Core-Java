package com.xworkz.runTimePolymorphism;

public class SwitchMax extends Switch {
    public SwitchMax() {
        System.out.println("Constructor of SwitchMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Switch feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in SwitchMax");
    }
}
