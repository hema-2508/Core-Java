package com.xworkz.tool;

public class Revolver extends Weapon{
    public Revolver() {
        System.out.println("no-arg constructor of Revolver");
    }

    public void fire() {
        System.out.println("Running fire in Revolver");

        Tool tool1 = new Tool();
        Tool tool2 = new Weapon();
        Tool tool3 = new Revolver();

        Weapon weapon1 = new Weapon();
        Weapon weapon2 = new Revolver();

        Revolver revolver1 = new Revolver();
}

}
