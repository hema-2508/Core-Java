package com.xworkz.external;

import com.xworkz.internal.PicFix;

public class PhotoFixerApp {
    private PicFix picFix;

    public PhotoFixerApp(PicFix picFix) {
        this.picFix = picFix;
    }

    public void fixPhoto() {
        System.out.println("Running fixPhoto in PhotoFixerApp");
        if (picFix != null) {
            this.picFix.sharpen();
        } else {
            System.out.println("PicFix is null");
        }
    }
}