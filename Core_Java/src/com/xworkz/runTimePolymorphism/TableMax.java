package com.xworkz.runTimePolymorphism;

public class TableMax extends Table {
    public TableMax() {
        System.out.println("Constructor of TableMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Table feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in TableMax");
    }
}
