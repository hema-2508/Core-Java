package com.xworkz.accessory;

public class SneakerRunner {
    public static void main(String[] args) {

        System.out.println("\n**** Accessory ******");
        Accessory accessory = new Accessory();
        accessory.wear();

        System.out.println("\n******** Shoe *****");
        Shoe shoe = new Shoe();
        shoe.walk();
        shoe.wear();

        System.out.println("\n Sneaker Runner ");
        Sneaker sneaker = new Sneaker();
        sneaker.runFast();
        sneaker.walk();
        sneaker.wear();
    }

}
