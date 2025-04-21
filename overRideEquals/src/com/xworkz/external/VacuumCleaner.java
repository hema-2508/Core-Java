package com.xworkz.external;

import java.util.Objects;

public class VacuumCleaner {
    String brand;
    String type;
    int powerWatt;
    boolean bagless;

    public void setVacuumCleaner(String brand, String type, int powerWatt, boolean bagless) {
        this.brand = brand;
        this.type = type;
        this.powerWatt = powerWatt;
        this.bagless = bagless;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", PowerWatt = " + powerWatt + ", Bagless = " + bagless;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof VacuumCleaner) {
            VacuumCleaner vacuumCleaner = (VacuumCleaner) obj;
            if (Objects.equals(this.brand, vacuumCleaner.brand) && Objects.equals(this.type, vacuumCleaner.type) && Objects.equals(this.powerWatt, vacuumCleaner.powerWatt) && Objects.equals(this.bagless, vacuumCleaner.bagless)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
