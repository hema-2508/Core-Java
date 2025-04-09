package com.xworkz.internal;

public class BuildingInternal {
    public void runInternal(){
        Apartment apartment= new Apartment();

        System.out.println("----------after updated---------");
        apartment.setFurnitures("Cupboard");
        apartment.setGym("CultFit");
        apartment.setGarden("Udupi Garden");
        apartment.setLift("Double decker lift");
        apartment.setParking("Two wheeler");
        System.out.println(apartment.GetLift());
        System.out.println(apartment.GetFurnitures());
        System.out.println(apartment.GetGarden());
        System.out.println(apartment.GetGym());
        System.out.println(apartment.GetParking());
    }
}
