package com.xworkz.internal;

public class Dog {
    private String species;
    private String habitat;
    public void setDog(String species, String habitat) {
        this.species=species;
        this.habitat=habitat;
    }
    @Override public String toString() {
        return "Dog [species=" + species + ", habitat=" + habitat + "]";
    }
}
