package com.xworkz.external;

import com.xworkz.internal.ImageTool;

public class AIEnhancer implements ImageTool {
    @Override
    public void enhance() {
        System.out.println("Using AI to auto-correct and enhance image details.");
    }
}