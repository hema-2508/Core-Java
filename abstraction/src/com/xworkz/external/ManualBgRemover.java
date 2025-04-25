package com.xworkz.external;

import com.xworkz.internal.BgRemover;

public class ManualBgRemover implements BgRemover {
    @Override
    public void removeBg() {
        System.out.println("Manual background erasure with a brush tool.");
    }
}