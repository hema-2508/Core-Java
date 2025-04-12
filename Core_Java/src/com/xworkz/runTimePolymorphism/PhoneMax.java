package com.xworkz.runTimePolymorphism;

public class PhoneMax extends Phone {
    public PhoneMax() {
        System.out.println("Constructor of PhoneMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Phone feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in PhoneMax");
    }
}
