package com.xworkz.internal;

public class Frog{
    private String species;
    private String skin;
    public void setFrog(String species, String skin) {
        this.skin=skin;
        this.species=species;
    }
    @Override public String toString() {
        return "Frog [species=" + species + ", skin=" + skin + "]";
    }
}
