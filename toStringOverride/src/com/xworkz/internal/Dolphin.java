package com.xworkz.internal;

public class Dolphin{
    private String name;
    private String feature;
    public void setDolphin(String name, String feature) {
        this.feature=feature;
        this.name=name;
    }
    @Override public String toString() {
        return "Dolphin [name=" + name + ", feature=" + feature + "]";
    }
}
