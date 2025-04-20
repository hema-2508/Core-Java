package com.xworkz.internal;

import java.util.Objects;

public class Speaker {
    String brand;
    String connectivity;
    int batteryLife;
    boolean waterproof;

    public Speaker(String brand, String connectivity, int batteryLife, boolean waterproof) {
        this.brand = brand;
        this.connectivity = connectivity;
        this.batteryLife = batteryLife;
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Connectivity = " + connectivity + ", Battery Life = " + batteryLife + ", Waterproof = " + waterproof;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Speaker) {
            Speaker speaker = (Speaker) obj;
            if (Objects.equals(this.brand, speaker.brand) && Objects.equals(this.connectivity, speaker.connectivity) && Objects.equals(this.batteryLife, speaker.batteryLife) && Objects.equals(this.waterproof, speaker.waterproof)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}