package com.xworkz.external;

import java.util.Objects;

public class Scooter {
    String brand;
    String model;
    int engineCC;
    boolean electric;

    public void setScooter(String brand, String model, int engineCC, boolean electric) {
        this.brand = brand;
        this.model = model;
        this.engineCC = engineCC;
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Model = " + model + ", EngineCC = " + engineCC + ", Electric = " + electric;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Scooter) {
            Scooter scooter = (Scooter) obj;
            if (Objects.equals(this.brand, scooter.brand) && Objects.equals(this.model, scooter.model) && Objects.equals(this.engineCC, scooter.engineCC) && Objects.equals(this.electric, scooter.electric)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
