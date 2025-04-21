package com.xworkz.external;

import java.util.Objects;

public class Motorcycle {
    String brand;
    String model;
    int engineCC;
    String type;

    public void setMotorcycle(String brand, String model, int engineCC, String type) {
        this.brand = brand;
        this.model = model;
        this.engineCC = engineCC;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Model = " + model + ", EngineCC = " + engineCC + ", Type = " + type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Motorcycle) {
            Motorcycle motorcycle = (Motorcycle) obj;
            if (Objects.equals(this.brand, motorcycle.brand) && Objects.equals(this.model, motorcycle.model) && Objects.equals(this.engineCC, motorcycle.engineCC) && Objects.equals(this.type, motorcycle.type)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
