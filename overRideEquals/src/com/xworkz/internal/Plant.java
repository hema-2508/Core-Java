package com.xworkz.internal;

import java.util.Objects;

public class Plant {
    String species;
    String commonName;
    int wateringFrequency;
    boolean isIndoor;

    public Plant(String species, String commonName, int wateringFrequency, boolean isIndoor) {
        this.species = species;
        this.commonName = commonName;
        this.wateringFrequency = wateringFrequency;
        this.isIndoor = isIndoor;
    }

    @Override
    public String toString() {
        return "Species = " + species + ", Common Name = " + commonName + ", Watering Frequency = " + wateringFrequency + ", Is Indoor = " + isIndoor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Plant) {
            Plant plant = (Plant) obj;
            if (Objects.equals(this.species, plant.species) && Objects.equals(this.commonName, plant.commonName) && Objects.equals(this.wateringFrequency, plant.wateringFrequency) && Objects.equals(this.isIndoor, plant.isIndoor)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
