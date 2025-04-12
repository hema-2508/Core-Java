package com.xworkz.runTimePolymorphism;

public class StudentMax extends Student {
    public StudentMax() {
        System.out.println("Constructor of StudentMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Student feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in StudentMax");
    }
}
