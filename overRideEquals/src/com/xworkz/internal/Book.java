package com.xworkz.internal;

import java.util.Objects;

public class Book {
    String title;
    String author;
    int pages;
    double price;

    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title = " + title + ", Author = " + author + ", Pages = " + pages + ", Price = " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Book) {
            Book book = (Book) obj;
            if (Objects.equals(this.title, book.title) && Objects.equals(this.author, book.author) && Objects.equals(this.pages, book.pages) && Objects.equals(this.price, book.price)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}