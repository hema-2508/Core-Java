package com.xworkz.runTimePolymorphism;

public class GameMax extends Game {
    public GameMax() {
        System.out.println("Constructor of GameMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Game feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in GameMax");
    }
}
