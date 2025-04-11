package com.xworkz.dish;

public class Omlet extends SideDish{
    public Omlet() {
        System.out.println("no-arg constructor of Omlet");
    }

    public void cook() {
        System.out.println("Running cook in Omlet");

        Dish dish1 = new Dish();
        Dish dish2 = new SideDish();
        Dish dish3 = new Omlet();

        SideDish side1 = new SideDish();
        SideDish side2 = new Omlet();

        Omlet omlet1 = new Omlet();
}

}
