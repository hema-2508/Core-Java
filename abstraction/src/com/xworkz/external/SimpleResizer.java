package com.xworkz.external;

import com.xworkz.internal.LogoEdit;

public class SimpleResizer implements LogoEdit {
    @Override
    public void resize() {
        System.out.println("Resizing logo proportionally.");
    }
}
