package com.xworkz.internal;

public class Shirt {
    private String item;
    private String material;

    public void setShirt(String item, String material) {
        this.item=item;
        this.material=material;
    }
    @Override public String toString() {
        return "Shirt [item=" + item + ", material=" + material + "]";
    }
}