package com.xworkz.external;

import com.xworkz.internal.Colorizer;

public class VibranceBooster implements Colorizer {
    @Override
    public void adjustColors() {
        System.out.println("Boosting saturation and vibrance.");
    }
}
