package com.xworkz.internal;

public class Ballet {
    private String style;
    private String origin;
    public void setBallet(String style, String origin) {
        this.origin=origin;
        this.style=style;
    }
    @Override public String toString() {
        return "Ballet [style=" + style + ", origin=" + origin + "]";
    }
}