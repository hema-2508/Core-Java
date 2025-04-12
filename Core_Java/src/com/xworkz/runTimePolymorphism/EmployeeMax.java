package com.xworkz.runTimePolymorphism;

public class EmployeeMax extends Employee {
    public EmployeeMax() {
        System.out.println("Constructor of EmployeeMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Employee feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in EmployeeMax");
    }
}
