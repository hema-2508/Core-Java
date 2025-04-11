package com.xworkz.dish;

public class SideDish extends  Dish{
    public SideDish() {
        System.out.println("no-arg constructor of SideDish");
    }

    public void serve() {
        System.out.println("Running serve in SideDish");

        Dish dish1 = new Dish();
        Dish dish2 = new SideDish();

        SideDish side1 = new SideDish();
    }


}
