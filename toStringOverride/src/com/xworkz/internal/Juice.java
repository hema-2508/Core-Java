package com.xworkz.internal;

public class Juice {
    private String beverage;
    private String flavor;
    public void setJuice(String beverage, String flavor) {
        this.beverage=beverage;
        this.flavor=flavor;
    }
    @Override public String toString() {
        return "Juice [beverage=" + beverage + ", flavor=" + flavor + "]";
    }
}