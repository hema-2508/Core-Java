package com.xworkz.runTimePolymorphism;

public class TeacherMax extends Teacher {
    public TeacherMax() {
        System.out.println("Constructor of TeacherMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Teacher feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in TeacherMax");
    }
}
