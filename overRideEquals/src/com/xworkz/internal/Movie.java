package com.xworkz.internal;

import java.util.Objects;

public class Movie {
    String title;
    String director;
    int year;
    double rating;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Title = " + title + ", Director = " + director + ", Year = " + year + ", Rating = " + rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Movie) {
            Movie movie = (Movie) obj;
            if (Objects.equals(this.title, movie.title) && Objects.equals(this.director, movie.director) && Objects.equals(this.year, movie.year) && Objects.equals(this.rating, movie.rating)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}