package com.xworkz.internal;

public class Novel {
    private String title;
    private String author;
    public void setNovel(String title, String author) {
        this.author=author;
        this.title=title;
    }
    @Override public String toString() {
        return "Novel [title=" + title + ", author=" + author + "]";
    }
}
