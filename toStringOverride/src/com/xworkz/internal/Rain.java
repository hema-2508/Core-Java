package com.xworkz.internal;

public class Rain {
    private String condition;
    private String season;
    public void setRain(String condition, String season) {
    this.condition=condition;
    this.season=season;
    }
    @Override public String toString() {
        return "Rain [condition=" + condition + ", season=" + season + "]";
    }
}
