package com.xworkz.runTimePolymorphism;

public class InstrumentMax extends Instrument {
    public InstrumentMax() {
        System.out.println("Constructor of InstrumentMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Instrument feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in InstrumentMax");
    }
}
