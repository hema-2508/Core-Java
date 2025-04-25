package com.xworkz.external;

import com.xworkz.internal.PicFix;

public class EdgeEnhancer implements PicFix {
    @Override
    public void sharpen() {
        System.out.println("Detecting and enhancing edges only.");
    }
}
