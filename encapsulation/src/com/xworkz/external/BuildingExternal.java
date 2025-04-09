package com.xworkz.external;

import com.xworkz.internal.Apartment;

public class BuildingExternal {
    public void run(){
        Apartment apartment= new Apartment();
        System.out.println(apartment.GetLift());
        System.out.println(apartment.GetFurnitures());
        System.out.println(apartment.GetGarden());
        System.out.println(apartment.GetGym());
        System.out.println(apartment.GetParking());
    }
}
