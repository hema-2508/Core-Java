package com.xworkz.food;

public class GoodDayBiscuit extends Biscuit{
    public GoodDayBiscuit() {
        System.out.println("no-arg constructor of GoodDayBiscuit");
    }

    public void enjoy() {
        System.out.println("Running enjoy in GoodDayBiscuit");

        Food food1 = new Food();
        Food food2 = new Snack();
        Food food3 = new Biscuit();
        Food food4 = new GoodDayBiscuit();

        Snack snack1 = new Snack();
        Snack snack2 = new Biscuit();
        Snack snack3 = new GoodDayBiscuit();

        Biscuit biscuit1 = new Biscuit();
        Biscuit biscuit2 = new GoodDayBiscuit();

        GoodDayBiscuit goodDay = new GoodDayBiscuit();
    }

}
