package com.xworkz.security;

public class LockRunner {
    public static void main(String[] args) {

        System.out.println("\n---- Security -----");
        Security security = new Security();
        security.protect();

        System.out.println("\n----- Lock -----");
        Lock lock = new Lock();
        lock.lockAccess();
        lock.protect();
    }

}
