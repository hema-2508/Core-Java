package com.xworkz.runTimePolymorphism;

public class NotebookMax extends Notebook {
    public NotebookMax() {
        System.out.println("Constructor of NotebookMax");
    }
    @Override
    public void feature() {
        System.out.println("Enhanced Notebook feature");
    }
    public void specialFeature() {
        System.out.println("Extra feature in NotebookMax");
    }
}
