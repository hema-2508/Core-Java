package com.xworkz.internal;

public class Tree {
    private String name;
    private String type;
    public void setTree(String name, String type) {
        this.name=name;
        this.type=type;
    }
    @Override public String toString() {
        return "Tree [name=" + name + ", type=" + type + "]";
    }
}
