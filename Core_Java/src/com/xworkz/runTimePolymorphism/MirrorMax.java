package com.xworkz.runTimePolymorphism;

public class MirrorMax extends Mirror {
    public MirrorMax() {
        System.out.println("Constructor of MirrorMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Mirror feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in MirrorMax");
    }
}
