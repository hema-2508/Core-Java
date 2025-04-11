package com.xworkz.material;

public class Thread extends Cotton{
    public Thread() {
        System.out.println("no-arg constructor of Thread");
    }

    public void weave() {
        System.out.println("Running weave in Thread");

        Material mat1 = new Material();
        Material mat2 = new Cotton();
        Material mat3 = new Thread();

        Cotton cotton1 = new Cotton();
        Cotton cotton2 = new Thread();

        Thread thread1 = new Thread();
    }


}
