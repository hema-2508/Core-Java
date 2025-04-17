package com.xworkz.internal;

public class Butterfly {
    private String name;
    private String color;

    public void setButterfly(String name, String color) {
        this.color=color;
        this.name=name;
    }
    @Override public String toString() {
        return "Butterfly [name=" + name + ", color=" + color + "]";
    }
}
