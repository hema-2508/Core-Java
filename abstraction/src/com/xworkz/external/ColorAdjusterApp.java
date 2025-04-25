package com.xworkz.external;

import com.xworkz.internal.Colorizer;

public class ColorAdjusterApp {
    private Colorizer colorizer;

    public ColorAdjusterApp(Colorizer colorizer) {
        this.colorizer = colorizer;
    }

    public void adjustColors() {
        System.out.println("Running adjustColors in ColorAdjusterApp");
        if (colorizer != null) {
            this.colorizer.adjustColors();
        } else {
            System.out.println("Colorizer is null");
        }
    }
}