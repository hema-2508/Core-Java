package com.xworkz.food;

public class Snack extends Food {
    public Snack() {
        System.out.println("no-arg constructor of Snack");
    }

    public void munch() {
        System.out.println("Running munch in Snack");

        Food food1 = new Food();
        Food food2 = new Snack();

        Snack snack1 = new Snack();
    }
}
