package com.xworkz.internal;

import java.util.Objects;

public class Dog {
    String breed;
    String name;
    int age;
    double weight;

    public Dog(String breed, String name, int age, double weight) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Breed = " + breed + ", Name = " + name + ", Age = " + age + ", Weight = " + weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Dog) {
            Dog dog = (Dog) obj;
            if (Objects.equals(this.breed, dog.breed) && Objects.equals(this.name, dog.name) && Objects.equals(this.age, dog.age) && Objects.equals(this.weight, dog.weight)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}