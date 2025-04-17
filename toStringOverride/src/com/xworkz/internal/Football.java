package com.xworkz.internal;

public class Football {
    private String game;
    private String equipment;
    public void setFootball(String game, String equipment) {
        this.equipment=equipment;
        this.game=game;
    }
    @Override public String toString() {
        return "Football [game=" + game + ", equipment=" + equipment + "]";
    }
}
