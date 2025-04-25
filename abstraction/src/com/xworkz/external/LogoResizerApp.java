package com.xworkz.external;

import com.xworkz.internal.LogoEdit;

public class LogoResizerApp {
    private LogoEdit logoEdit;

    public LogoResizerApp(LogoEdit logoEdit) {
        this.logoEdit = logoEdit;
    }

    public void resizeLogo() {
        System.out.println("Running resizeLogo in LogoResizerApp");
        if (logoEdit != null) {
            this.logoEdit.resize();
        } else {
            System.out.println("LogoEdit is null");
        }
    }
}