package com.xworkz.internal;

public class Hammer {
    private String name;
    private String use;

    public void setHammer(String name, String use) {
    this.name=name;
    this.use=use;
    }
    @Override public String toString() {
        return "Hammer [name=" + name + ", use=" + use + "]";
    }
}
