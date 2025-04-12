package com.xworkz.runTimePolymorphismRunner;
import com.xworkz.runTimePolymorphism.*;

public class Runners {
    public static void main(String[] args) {
        WindowCleaner windowCleaner=new WindowCleaner();
        windowCleaner.usewindow();
        WindowCleaner windowCleaner1=new MaxWindowCleaner();
        windowCleaner1.usewindow();
        MaxWindowCleaner maxWindowCleaner=new MaxWindowCleaner();
        maxWindowCleaner.usewindow();
        maxWindowCleaner.mainwindow();
        System.out.println("===============================================================");
        Apple apple=new Apple();
        apple.fruit();
        Apple apple1=new AppleMax();
        apple1.fruit();
        AppleMax appleMax=new AppleMax();
        appleMax.fruit();
        appleMax.mainFruit();
    }
}
