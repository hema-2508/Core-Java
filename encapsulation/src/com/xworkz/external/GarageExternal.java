package com.xworkz.external;

import com.xworkz.internal.Garage;

public class GarageExternal {
            public void run() {
                Garage garage = new Garage();
                System.out.println(garage.getTools());
                System.out.println(garage.getMechanic());
                System.out.println(garage.getCarLift());
                System.out.println(garage.getOilStorage());
                System.out.println(garage.getAirCompressor());
            }
}
