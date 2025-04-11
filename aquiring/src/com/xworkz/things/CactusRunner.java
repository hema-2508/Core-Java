package com.xworkz.things;

public class CactusRunner {
    public static void main(String[] args) {

        System.out.println("\n**** Thing ******");
        Thing thing = new Thing();
        thing.exist();

        System.out.println("\n Plant datatype");
        Plant plant = new Plant();
        plant.grow();
        plant.exist();

        System.out.println("\n Cactus datatype");
        Cactus cactus = new Cactus();
        cactus.survive();
        cactus.grow();
        cactus.exist();
    }
}
