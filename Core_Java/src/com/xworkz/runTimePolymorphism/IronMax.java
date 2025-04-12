package com.xworkz.runTimePolymorphism;

public class IronMax extends Iron {
    public IronMax() {
        System.out.println("Constructor of IronMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Iron feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in IronMax");
    }
}
