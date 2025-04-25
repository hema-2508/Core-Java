package com.xworkz.external;

import com.xworkz.internal.ImageTool;

public class BasicEnhancer implements ImageTool {
    @Override
    public void enhance() {
        System.out.println("Applying basic contrast and brightness adjustments.");
    }
}