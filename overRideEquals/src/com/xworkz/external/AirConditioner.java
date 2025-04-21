package com.xworkz.external;

import java.util.Objects;

public class AirConditioner {
    String brand;
    double tonnage;
    String type;
    boolean inverter;

    public void setAirConditioner(String brand, double tonnage, String type, boolean inverter) {
        this.brand = brand;
        this.tonnage = tonnage;
        this.type = type;
        this.inverter = inverter;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Tonnage = " + tonnage + ", Type = " + type + ", Inverter = " + inverter;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof AirConditioner) {
            AirConditioner airConditioner = (AirConditioner) obj;
            if (Objects.equals(this.brand, airConditioner.brand) && Objects.equals(this.tonnage, airConditioner.tonnage) && Objects.equals(this.type, airConditioner.type) && Objects.equals(this.inverter, airConditioner.inverter)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
