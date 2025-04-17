package com.xworkz.internal;

public class Eagle{
    private String species;
    private String habitat;
    public void setEagle(String species, String habitat) {
        this.habitat=habitat;
        this.species=species;
    }
    @Override public String toString() {
        return "Eagle [species=" + species + ", habitat=" + habitat + "]";
    }
}
