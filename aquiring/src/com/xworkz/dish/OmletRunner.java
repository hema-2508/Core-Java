package com.xworkz.dish;

public class OmletRunner {
    public static void main(String[] args) {

        System.out.println("\n Dish datatype");
        Dish dish = new Dish();
        dish.taste();

        System.out.println("\n SideDish datatype");
        SideDish sideDish = new SideDish();
        sideDish.serve();
        sideDish.taste();

        System.out.println("\n Omlet datatype");
        Omlet omlet = new Omlet();
        omlet.cook();
        omlet.serve();
        omlet.taste();
    }

}
