package com.xworkz.internal;

import java.util.Objects;

public class Chair {
    String material;
    String color;
    boolean hasArmrests;
    boolean isAdjustable;

    public Chair(String material, String color, boolean hasArmrests, boolean isAdjustable) {
        this.material = material;
        this.color = color;
        this.hasArmrests = hasArmrests;
        this.isAdjustable = isAdjustable;
    }

    @Override
    public String toString() {
        return "Material = " + material + ", Color = " + color + ", Has Armrests = " + hasArmrests + ", Is Adjustable = " + isAdjustable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chair) {
            Chair chair = (Chair) obj;
            if (Objects.equals(this.material, chair.material) && Objects.equals(this.color, chair.color) && Objects.equals(this.hasArmrests, chair.hasArmrests) && Objects.equals(this.isAdjustable, chair.isAdjustable)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
