package com.xworkz.external;

import com.xworkz.internal.LogoEdit;

public class SmartResizer implements LogoEdit {
    @Override
    public void resize() {
        System.out.println("Smart scaling logo without distortion.");
    }
}