package com.xworkz.organization;

public class TapRunner {
    public static void main(String[] args) {

        System.out.println("\n Organization ");
        Organization org = new Organization();
        org.manage();

        System.out.println("\n Academy ");
        Academy academy = new Academy();
        academy.teach();
        academy.manage();

        System.out.println("\n Tap ");
        Tap tap = new Tap();
        tap.train();
        tap.teach();
        tap.manage();
    }

}
