package com.xworkz.light;

public class LEDRunner {
    public static void main(String[] args) {

        System.out.println("\n Light datatype");
        Light light = new Light();
        light.glow();

        System.out.println("\n LED datatype");
        LED led = new LED();
        led.saveEnergy();
        led.glow();
    }

}
