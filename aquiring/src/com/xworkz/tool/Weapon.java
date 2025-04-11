package com.xworkz.tool;

public class Weapon extends Tool{
    public Weapon() {
        System.out.println("no-arg constructor of Weapon");
    }

    public void wield() {
        System.out.println("Running wield in Weapon");

        Tool tool1 = new Tool();
        Tool tool2 = new Weapon();

        Weapon weapon1 = new Weapon();
}

}
