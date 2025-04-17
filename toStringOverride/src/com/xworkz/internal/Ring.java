package com.xworkz.internal;

public class Ring {
    private String piece;
    private String metal;

    public void setRing(String piece, String metal) {
        this.metal=metal;
        this.piece=piece;
    }
    @Override public String toString() {
        return "Ring [piece=" + piece + ", metal=" + metal + "]";
    }
}
