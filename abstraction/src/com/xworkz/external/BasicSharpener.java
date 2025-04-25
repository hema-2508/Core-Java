package com.xworkz.external;

import com.xworkz.internal.PicFix;

public class BasicSharpener implements PicFix {
    @Override
    public void sharpen() {
        System.out.println("Applying unsharp mask for clarity.");
    }
}
