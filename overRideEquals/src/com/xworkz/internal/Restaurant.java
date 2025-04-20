package com.xworkz.internal;

import java.util.Objects;

public class Restaurant {
    String name;
    String cuisine;
    int rating;
    boolean hasDelivery;

    public Restaurant(String name, String cuisine, int rating, boolean hasDelivery) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
        this.hasDelivery = hasDelivery;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Cuisine = " + cuisine + ", Rating = " + rating + ", Has Delivery = " + hasDelivery;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Restaurant) {
            Restaurant restaurant = (Restaurant) obj;
            if (Objects.equals(this.name, restaurant.name) && Objects.equals(this.cuisine, restaurant.cuisine) && Objects.equals(this.rating, restaurant.rating) && Objects.equals(this.hasDelivery, restaurant.hasDelivery)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
