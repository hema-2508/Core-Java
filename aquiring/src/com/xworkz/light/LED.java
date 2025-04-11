package com.xworkz.light;

public class LED extends Light{
    public LED() {
        System.out.println("no-arg constructor of LED");
    }

    public void saveEnergy() {
        System.out.println("Running saveEnergy in LED");

        Light light1 = new Light();
        Light light2 = new LED();

        LED led1 = new LED();
    }

}
