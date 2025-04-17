package com.xworkz.internal;

public class Coffee {
    private String drink;
    private String temperature;
    public void setCoffee(String drink, String temperature) {
        this.drink=drink;
        this.temperature=temperature;
    }
    @Override public String toString() {
        return "Coffee [drink=" + drink + ", temperature=" + temperature + "]";
    }
}