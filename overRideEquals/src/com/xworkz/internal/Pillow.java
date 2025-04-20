package com.xworkz.internal;

import java.util.Objects;

public class Pillow {
    String material;
    String firmness;
    String size;
    boolean hypoallergenic;

    public Pillow(String material, String firmness, String size, boolean hypoallergenic) {
        this.material = material;
        this.firmness = firmness;
        this.size = size;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return "Material = " + material + ", Firmness = " + firmness + ", Size = " + size + ", Hypoallergenic = " + hypoallergenic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pillow) {
            Pillow pillow = (Pillow) obj;
            if (Objects.equals(this.material, pillow.material) && Objects.equals(this.firmness, pillow.firmness) && Objects.equals(this.size, pillow.size) && Objects.equals(this.hypoallergenic, pillow.hypoallergenic)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
