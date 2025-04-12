package com.xworkz.runTimePolymorphism;
public class BookMax extends Book {
    public BookMax() {
        System.out.println("Constructor of BookMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Book feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BookMax");
    }
}
