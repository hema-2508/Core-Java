package com.xworkz.security;

public class Lock extends Security{
    public Lock() {
        System.out.println("no-arg constructor of Lock");
    }

    public void lockAccess() {
        System.out.println("Running lockAccess in Lock");

        Security security1 = new Security();
        Security security2 = new Lock();

        Lock lock1 = new Lock();
    }

}
