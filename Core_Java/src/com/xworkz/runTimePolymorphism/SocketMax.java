package com.xworkz.runTimePolymorphism;

public class SocketMax extends Socket {
    public SocketMax() {
        System.out.println("Constructor of SocketMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Socket feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in SocketMax");
    }
}
