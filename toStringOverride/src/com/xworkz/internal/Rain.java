package com.xworkz.internal;

public class Rain {
    private String rain;
    private String season;
    public void setRain(String condition, String season) {
    this.rain=rain;
    this.season=season;
    }
    @Override public String toString() {
        return "Rain [condition=" + condition + ", season=" + season + "]";
    }
}
