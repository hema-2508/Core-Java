package com.xworkz.organization;

public class Tap extends Academy{
    public Tap() {
        System.out.println("no-arg constructor of Tap");
    }

    public void train() {
        System.out.println("Running train in Tap");

        Organization org1 = new Organization();
        Organization org2 = new Academy();
        Organization org3 = new Tap();

        Academy academy1 = new Academy();
        Academy academy2 = new Tap();

        Tap tap1 = new Tap();
    }


}
