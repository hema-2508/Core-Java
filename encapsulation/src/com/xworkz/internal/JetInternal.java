package com.xworkz.internal;

public class JetInternal {
    public void runInternal() {
        Jet jet = new Jet();

        System.out.println("----------Updated values----------");
        jet.setEngineType("Turbojet");
        jet.setFuelCapacity("8000 Liters");
        jet.setWingSpan("35 meters");
        jet.setCockpitDesign("Glass Cockpit");
        jet.setLandingGear("Tricycle Type");

        System.out.println(jet.getEngineType());
        System.out.println(jet.getFuelCapacity());
        System.out.println(jet.getWingSpan());
        System.out.println(jet.getCockpitDesign());
        System.out.println(jet.getLandingGear());
    }
}
