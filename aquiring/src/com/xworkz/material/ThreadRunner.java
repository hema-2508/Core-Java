package com.xworkz.material;

public class ThreadRunner {
    public static void main(String[] args) {

        System.out.println("\n Material datatype");
        Material material = new Material();
        material.properties();

        System.out.println("\n Cotton datatype");
        Cotton cotton = new Cotton();
        cotton.softness();
        cotton.properties();

        System.out.println("\n Thread datatype");
        Thread thread = new Thread();
        thread.weave();
        thread.softness();
        thread.properties();
    }

}
