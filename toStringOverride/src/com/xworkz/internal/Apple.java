package com.xworkz.internal;

public class Apple {
    private String name;
    private String color;
    public void setApple(String name, String color) {

        this.name=name;
        this.color=color;
    }
    @Override public String toString() {
        return "Apple [name=" + name + ", color=" + color + "]";
    }
}