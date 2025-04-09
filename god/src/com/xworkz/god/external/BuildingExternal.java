package com.xworkz.god.external;

import com.xworkz.god.internal.Apartment;

public class BuildingExternal {
    public void run(){
        Apartment apartment= new Apartment();
        apartment.GetLift();
        apartment.GetFurnitures();
        apartment.GetGarden();
        apartment.GetGym();
        apartment.GetParking();
    }
}
