package com.xworkz.food;

public class FoodRunner {
    public static void main(String[] args) {

        System.out.println("\n Food datatype");
        Food food = new Food();
        food.consume();

        System.out.println("\n Snack datatype");
        Snack snack = new Snack();
        snack.munch();
        snack.consume();

        System.out.println("\n Biscuit datatype");
        Biscuit biscuit = new Biscuit();
        biscuit.crunch();
        biscuit.munch();
        biscuit.consume();

        System.out.println("\n GoodDayBiscuit datatype");
        GoodDayBiscuit goodDay = new GoodDayBiscuit();
        goodDay.enjoy();
        goodDay.crunch();
        goodDay.munch();
        goodDay.consume();
    }

}
