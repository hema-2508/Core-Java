package com.xworkz.external;

import java.util.Objects;

public class Umbrella {
    String brand;
    String type;
    int ribs;
    boolean automatic;

    public void setUmbrella(String brand, String type, int ribs, boolean automatic) {
        this.brand = brand;
        this.type = type;
        this.ribs = ribs;
        this.automatic = automatic;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Ribs = " + ribs + ", Automatic = " + automatic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Umbrella) {
            Umbrella umbrella = (Umbrella) obj;
            if (Objects.equals(this.brand, umbrella.brand) && Objects.equals(this.type, umbrella.type) && Objects.equals(this.ribs, umbrella.ribs) && Objects.equals(this.automatic, umbrella.automatic)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
