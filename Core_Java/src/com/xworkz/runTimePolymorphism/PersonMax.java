package com.xworkz.runTimePolymorphism;

public class PersonMax extends Person {
    public PersonMax() {
        System.out.println("Constructor of PersonMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Person feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in PersonMax");
    }
}
