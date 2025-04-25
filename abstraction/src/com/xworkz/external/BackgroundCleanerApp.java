package com.xworkz.external;

import com.xworkz.internal.BgRemover;

public class BackgroundCleanerApp {
    private BgRemover bgRemover;

    public BackgroundCleanerApp(BgRemover bgRemover) {
        this.bgRemover = bgRemover;
    }

    public void removeBackground() {
        System.out.println("Running removeBackground in BackgroundCleanerApp");
        if (bgRemover != null) {
            this.bgRemover.removeBg();
        } else {
            System.out.println("BgRemover is null");
        }
    }
}