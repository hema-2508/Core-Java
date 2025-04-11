package com.xworkz.accessory;

public class Shoe extends Accessory{
    public Shoe() {
        System.out.println("no-arg constructor of Shoe");
    }

    public void walk() {
        System.out.println("Running walk in Shoe");

        Accessory accessory1 = new Accessory();
        Accessory accessory2 = new Shoe();

        Shoe shoe1 = new Shoe();
    }

}
