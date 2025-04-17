package com.xworkz.internal;

public class Snake  {
    private String name;
    private  String environment;
    public void setSnake(String name, String environment) {
        this.environment=environment;
        this.name=name;
    }
    @Override public String toString() {
        return "Snake [name=" + name + ", environment=" + environment + "]";
    }
}
