package com.xworkz.external;

import java.util.Objects;

public class Watch {
    String brand;
    String type;
    boolean waterproof;
    boolean smartwatch;

    public void setWatch(String brand, String type, boolean waterproof, boolean smartwatch) {
        this.brand = brand;
        this.type = type;
        this.waterproof = waterproof;
        this.smartwatch = smartwatch;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Waterproof = " + waterproof + ", Smartwatch = " + smartwatch;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Watch) {
            Watch watch = (Watch) obj;
            if (Objects.equals(this.brand, watch.brand) && Objects.equals(this.type, watch.type) && Objects.equals(this.waterproof, watch.waterproof) && Objects.equals(this.smartwatch, watch.smartwatch)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}