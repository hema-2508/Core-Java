package com.xworkz.runTimePolymorphism;

public class SpeakerMax extends Speaker {
    public SpeakerMax() {
        System.out.println("Constructor of SpeakerMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Speaker feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in SpeakerMax");
    }
}
