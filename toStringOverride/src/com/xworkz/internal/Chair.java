package com.xworkz.internal;

public class Chair {
    private String piece;
    private String style;
    public void setChair(String piece, String style) {
        this.piece=piece;
        this.style=style;
    }
    @Override public String toString() {
        return "Chair [piece=" + piece + ", style=" + style + "]";
    }
}