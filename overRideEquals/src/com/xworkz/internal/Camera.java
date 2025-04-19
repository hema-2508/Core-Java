package com.xworkz.internal;

import java.util.Objects;

public class Camera {
    String brand;
    String model;
    int megapixels;
    boolean isDSLR;

    public Camera(String brand, String model, int megapixels, boolean isDSLR) {
        this.brand = brand;
        this.model = model;
        this.megapixels = megapixels;
        this.isDSLR = isDSLR;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Model = " + model + ", Megapixels = " + megapixels + ", Is DSLR = " + isDSLR;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Camera) {
            Camera camera = (Camera) obj;
            if (Objects.equals(this.brand, camera.brand) && Objects.equals(this.model, camera.model) && Objects.equals(this.megapixels, camera.megapixels) && Objects.equals(this.isDSLR, camera.isDSLR)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
