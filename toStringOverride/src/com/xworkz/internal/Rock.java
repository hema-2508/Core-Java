package com.xworkz.internal;

public class Rock {
    private String genre;
    private String instrument;
    public void setRock(String genre, String instrument) {
        this.genre=genre;
        this.instrument=instrument;
    }
    @Override public String toString() {
        return "Rock [genre=" + genre + ", instrument=" + instrument + "]";
    }
}