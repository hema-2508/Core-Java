package com.xworkz.internal;

import java.util.Objects;

public class Watch {
    String brand;
    String style;
    boolean isDigital;
    boolean isWaterproof;

    public Watch(String brand, String style, boolean isDigital, boolean isWaterproof) {
        this.brand = brand;
        this.style = style;
        this.isDigital = isDigital;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Style = " + style + ", Is Digital = " + isDigital + ", Is Waterproof = " + isWaterproof;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Watch) {
            Watch watch = (Watch) obj;
            if (Objects.equals(this.brand, watch.brand) && Objects.equals(this.style, watch.style) && Objects.equals(this.isDigital, watch.isDigital) && Objects.equals(this.isWaterproof, watch.isWaterproof)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
