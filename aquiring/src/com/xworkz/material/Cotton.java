package com.xworkz.material;

public class Cotton extends Material{
    public Cotton() {
        System.out.println("no-arg constructor of Cotton");
    }

    public void softness() {
        System.out.println("Running softness in Cotton");

        Material mat1 = new Material();
        Material mat2 = new Cotton();

        Cotton cotton1 = new Cotton();
    }

}
