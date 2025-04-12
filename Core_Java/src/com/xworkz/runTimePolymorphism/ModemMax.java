package com.xworkz.runTimePolymorphism;

public class ModemMax extends Modem {
    public ModemMax() {
        System.out.println("Constructor of ModemMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Modem feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in ModemMax");
    }
}
