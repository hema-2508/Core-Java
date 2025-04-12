package com.xworkz.runTimePolymorphism;

public class SinkMax extends Sink {
    public SinkMax() {
        System.out.println("Constructor of SinkMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Sink feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in SinkMax");
    }
}
