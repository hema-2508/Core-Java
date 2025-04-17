package com.xworkz.internal;

public class Pizza{
    private String dish;
    private String cuisine;
    public void setPizza(String dish, String cuisine) {
        this.cuisine=cuisine;
        this.dish=dish;
    }
    @Override public String toString() {
        return "Pizza [dish=" + dish + ", cuisine=" + cuisine + "]";
    }
}
