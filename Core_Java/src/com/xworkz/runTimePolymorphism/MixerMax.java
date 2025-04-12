package com.xworkz.runTimePolymorphism;

public class MixerMax extends Mixer {
    public MixerMax() {
        System.out.println("Constructor of MixerMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Mixer feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in MixerMax");
    }
}
