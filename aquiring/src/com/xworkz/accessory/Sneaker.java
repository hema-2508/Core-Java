package com.xworkz.accessory;

public class Sneaker extends Shoe{
    public Sneaker() {
        System.out.println("no-arg constructor of Sneaker");
    }

    public void runFast() {
        System.out.println("Running runFast in Sneaker");

        Accessory accessory1 = new Accessory();
        Accessory accessory2 = new Shoe();
        Accessory accessory3 = new Sneaker();

        Shoe shoe1 = new Shoe();
        Shoe shoe2 = new Sneaker();

        Sneaker sneaker1 = new Sneaker();
    }

}
