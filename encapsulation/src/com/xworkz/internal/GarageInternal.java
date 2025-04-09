package com.xworkz.internal;

public class GarageInternal {
    public void runInternal() {
        Garage garage = new Garage();
        System.out.println("-------- After updating Garage --------");
        garage.setTools("Hydraulic Jack");
        garage.setMechanic("John");
        garage.setCarLift("Electric Lift");
        garage.setOilStorage("Barrels");
        garage.setAirCompressor("Bosch Air Compressor");

        System.out.println(garage.getTools());
        System.out.println(garage.getMechanic());
        System.out.println(garage.getCarLift());
        System.out.println(garage.getOilStorage());
        System.out.println(garage.getAirCompressor());
    }
}
