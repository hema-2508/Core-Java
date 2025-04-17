package com.xworkz.internal;

public class Painting{
    private String form;
    private String medium;
    public void setPainting(String form, String medium) {
        this.form=form;
        this.medium=medium;
    }
    @Override public String toString() {
        return "Painting [form=" + form + ", medium=" + medium + "]";
    }
}
