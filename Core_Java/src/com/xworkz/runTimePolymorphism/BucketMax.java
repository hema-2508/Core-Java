package com.xworkz.runTimePolymorphism;

public class BucketMax extends Bucket {
    public BucketMax() {
        System.out.println("Constructor of BucketMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Bucket feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in BucketMax");
    }
}
