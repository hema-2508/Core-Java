package com.xworkz.runTimePolymorphism;

public class AppleMax extends Apple {
    public AppleMax(){
        System.out.println("No-args const of subclass Apple");
    }

    @Override
    public void fruit() {
        System.out.println("Overidden method");
    }
    public void mainFruit(){
        System.out.println("Extra method in subclass");
    }
}
