package com.xworkz.runner;

import com.xworkz.internal.*;

public class Runner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle("Milton", "red", 5, 300);
        Bottle bottle2 = new Bottle("Milton", "red", 5, 300);
        Bottle bottle3 = new Bottle("Signoraware", "blue", 2, 700);
        boolean bottleMatch = bottle1.equals(bottle2);
        boolean bottleNotMatch = bottle2.equals(bottle3);
        System.out.println("Bottle Match: " + bottleMatch);
        System.out.println("Bottle Not Match: " + bottleNotMatch);

        Book book1 = new Book("Harry Potter", "J.K. Rowling", 500, 29.99);
        Book book2 = new Book("Harry Potter", "J.K. Rowling", 500, 29.99);
        Book book3 = new Book("Lord of the Rings", "J.R.R. Tolkien", 1000, 39.99);
        boolean bookMatch = book1.equals(book2);
        boolean bookNotMatch = book2.equals(book3);
        System.out.println("Book Match: " + bookMatch);
        System.out.println("Book Not Match: " + bookNotMatch);

        Car car1 = new Car("Toyota", "Camry", 2020, 25000.5);
        Car car2 = new Car("Toyota", "Camry", 2020, 25000.5);
        Car car3 = new Car("Honda", "Accord", 2019, 30000.0);
        boolean carMatch = car1.equals(car2);
        boolean carNotMatch = car2.equals(car3);
        System.out.println("Car Match: " + carMatch);
        System.out.println("Car Not Match: " + carNotMatch);

        Laptop laptop1 = new Laptop("Dell", "i7", 16, 15.6);
        Laptop laptop2 = new Laptop("Dell", "i7", 16, 15.6);
        Laptop laptop3 = new Laptop("Apple", "M1", 8, 13.3);
        boolean laptopMatch = laptop1.equals(laptop2);
        boolean laptopNotMatch = laptop2.equals(laptop3);
        System.out.println("Laptop Match: " + laptopMatch);
        System.out.println("Laptop Not Match: " + laptopNotMatch);

        Phone phone1 = new Phone("Samsung", "Galaxy S21", 128, true);
        Phone phone2 = new Phone("Samsung", "Galaxy S21", 128, true);
        Phone phone3 = new Phone("Apple", "iPhone 13", 256, true);
        boolean phoneMatch = phone1.equals(phone2);
        boolean phoneNotMatch = phone2.equals(phone3);
        System.out.println("Phone Match: " + phoneMatch);
        System.out.println("Phone Not Match: " + phoneNotMatch);

        Dog dog1 = new Dog("Labrador", "Max", 3, 25.5);
        Dog dog2 = new Dog("Labrador", "Max", 3, 25.5);
        Dog dog3 = new Dog("Poodle", "Bella", 5, 15.0);
        boolean dogMatch = dog1.equals(dog2);
        boolean dogNotMatch = dog2.equals(dog3);
        System.out.println("Dog Match: " + dogMatch);
        System.out.println("Dog Not Match: " + dogNotMatch);

        Restaurant restaurant1 = new Restaurant("Olive Garden", "Italian", 4, true);
        Restaurant restaurant2 = new Restaurant("Olive Garden", "Italian", 4, true);
        Restaurant restaurant3 = new Restaurant("McDonald's", "Fast Food", 3, true);
        boolean restaurantMatch = restaurant1.equals(restaurant2);
        boolean restaurantNotMatch = restaurant2.equals(restaurant3);
        System.out.println("Restaurant Match: " + restaurantMatch);
        System.out.println("Restaurant Not Match: " + restaurantNotMatch);

        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, 8.8);
        Movie movie2 = new Movie("Inception", "Christopher Nolan", 2010, 8.8);
        Movie movie3 = new Movie("The Shawshank Redemption", "Frank Darabont", 1994, 9.3);
        boolean movieMatch = movie1.equals(movie2);
        boolean movieNotMatch = movie2.equals(movie3);
        System.out.println("Movie Match: " + movieMatch);
        System.out.println("Movie Not Match: " + movieNotMatch);

        Shoe shoe1 = new Shoe("Nike", "Running", 10, "Black");
        Shoe shoe2 = new Shoe("Nike", "Running", 10, "Black");
        Shoe shoe3 = new Shoe("Adidas", "Casual", 9, "White");
        boolean shoeMatch = shoe1.equals(shoe2);
        boolean shoeNotMatch = shoe2.equals(shoe3);
        System.out.println("Shoe Match: " + shoeMatch);
        System.out.println("Shoe Not Match: " + shoeNotMatch);

        Television tv1 = new Television("Samsung", "QLED", 55, true);
        Television tv2 = new Television("Samsung", "QLED", 55, true);
        Television tv3 = new Television("LG", "OLED", 65, true);
        boolean tvMatch = tv1.equals(tv2);
        boolean tvNotMatch = tv2.equals(tv3);
        System.out.println("TV Match: " + tvMatch);
        System.out.println("TV Not Match: " + tvNotMatch);

        Bicycle bike1 = new Bicycle("Trek", "Mountain", 21, "Aluminum");
        Bicycle bike2 = new Bicycle("Trek", "Mountain", 21, "Aluminum");
        Bicycle bike3 = new Bicycle("Specialized", "Road", 18, "Carbon");
        boolean bikeMatch = bike1.equals(bike2);
        boolean bikeNotMatch = bike2.equals(bike3);
        System.out.println("Bike Match: " + bikeMatch);
        System.out.println("Bike Not Match: " + bikeNotMatch);

        Guitar guitar1 = new Guitar("Fender", "Stratocaster", 6, true);
        Guitar guitar2 = new Guitar("Fender", "Stratocaster", 6, true);
        Guitar guitar3 = new Guitar("Gibson", "Les Paul", 6, true);
        boolean guitarMatch = guitar1.equals(guitar2);
        boolean guitarNotMatch = guitar2.equals(guitar3);
        System.out.println("Guitar Match: " + guitarMatch);
        System.out.println("Guitar Not Match: " + guitarNotMatch);

        Watch watch1 = new Watch("Rolex", "Dress", false, true);
        Watch watch2 = new Watch("Rolex", "Dress", false, true);
        Watch watch3 = new Watch("Casio", "Sports", true, true);
        boolean watchMatch = watch1.equals(watch2);
        boolean watchNotMatch = watch2.equals(watch3);
        System.out.println("Watch Match: " + watchMatch);
        System.out.println("Watch Not Match: " + watchNotMatch);


        Headphones headphones1 = new Headphones("Sony", "Over-ear", true, 199.99);
        Headphones headphones2 = new Headphones("Sony", "Over-ear", true, 199.99);
        Headphones headphones3 = new Headphones("Bose", "In-ear", true, 149.99);
        boolean headphonesMatch = headphones1.equals(headphones2);
        boolean headphonesNotMatch = headphones2.equals(headphones3);
        System.out.println("Headphones Match: " + headphonesMatch);
        System.out.println("Headphones Not Match: " + headphonesNotMatch);

        Backpack backpack1 = new Backpack("Nylon", "Black", 30, true);
        Backpack backpack2 = new Backpack("Nylon", "Black", 30, true);
        Backpack backpack3 = new Backpack("Polyester", "Blue", 25, false);
        boolean backpackMatch = backpack1.equals(backpack2);
        boolean backpackNotMatch = backpack2.equals(backpack3);
        System.out.println("Backpack Match: " + backpackMatch);
        System.out.println("Backpack Not Match: " + backpackNotMatch);

        Camera camera1 = new Camera("Canon", "EOS R5", 45, true);
        Camera camera2 = new Camera("Canon", "EOS R5", 45, true);
        Camera camera3 = new Camera("Sony", "A7 IV", 33, true);
        boolean cameraMatch = camera1.equals(camera2);
        boolean cameraNotMatch = camera2.equals(camera3);
        System.out.println("Camera Match: " + cameraMatch);
        System.out.println("Camera Not Match: " + cameraNotMatch);

        Plant plant1 = new Plant("Monstera", "Swiss Cheese", 7, true);
        Plant plant2 = new Plant("Monstera", "Swiss Cheese", 7, true);
        Plant plant3 = new Plant("Ficus", "Rubber Plant", 10, true);
        boolean plantMatch = plant1.equals(plant2);
        boolean plantNotMatch = plant2.equals(plant3);
        System.out.println("Plant Match: " + plantMatch);
        System.out.println("Plant Not Match: " + plantNotMatch);

        Keyboard keyboard1 = new Keyboard("Logitech", "Mechanical", true, true);
        Keyboard keyboard2 = new Keyboard("Logitech", "Mechanical", true, true);
        Keyboard keyboard3 = new Keyboard("Razer", "Membrane", false, true);
        boolean keyboardMatch = keyboard1.equals(keyboard2);
        boolean keyboardNotMatch = keyboard2.equals(keyboard3);
        System.out.println("Keyboard Match: " + keyboardMatch);
        System.out.println("Keyboard Not Match: " + keyboardNotMatch);

        Chair chair1 = new Chair("Leather", "Brown", true, true);
        Chair chair2 = new Chair("Leather", "Brown", true, true);
        Chair chair3 = new Chair("Fabric", "Black", false, false);
        boolean chairMatch = chair1.equals(chair2);
        boolean chairNotMatch = chair2.equals(chair3);
        System.out.println("Chair Match: " + chairMatch);
        System.out.println("Chair Not Match: " + chairNotMatch);

        Sunglasses shades1 = new Sunglasses("Ray-Ban", "Black", "Plastic", true);
        Sunglasses shades2 = new Sunglasses("Ray-Ban", "Black", "Plastic", true);
        Sunglasses shades3 = new Sunglasses("Oakley", "Blue", "Metal", true);
        boolean shadesMatch = shades1.equals(shades2);
        boolean shadesNotMatch = shades2.equals(shades3);
        System.out.println("Sunglasses Match: " + shadesMatch);
        System.out.println("Sunglasses Not Match: " + shadesNotMatch);

        Wallet wallet1 = new Wallet("Leather", "Black", 8, true);
        Wallet wallet2 = new Wallet("Leather", "Black", 8, true);
        Wallet wallet3 = new Wallet("Nylon", "Gray", 6, false);
        boolean walletMatch = wallet1.equals(wallet2);
        boolean walletNotMatch = wallet2.equals(wallet3);
        System.out.println("Wallet Match: " + walletMatch);
        System.out.println("Wallet Not Match: " + walletNotMatch);

        Speaker speaker1 = new Speaker("JBL", "Bluetooth", 12, true);
        Speaker speaker2 = new Speaker("JBL", "Bluetooth", 12, true);
        Speaker speaker3 = new Speaker("Bose", "WiFi", 8, false);
        boolean speakerMatch = speaker1.equals(speaker2);
        boolean speakerNotMatch = speaker2.equals(speaker3);
        System.out.println("Speaker Match: " + speakerMatch);
        System.out.println("Speaker Not Match: " + speakerNotMatch);

        Microwave microwave1 = new Microwave("Panasonic", 1.2, 10, true);
        Microwave microwave2 = new Microwave("Panasonic", 1.2, 10, true);
        Microwave microwave3 = new Microwave("LG", 0.9, 8, false);
        boolean microwaveMatch = microwave1.equals(microwave2);
        boolean microwaveNotMatch = microwave2.equals(microwave3);
        System.out.println("Microwave Match: " + microwaveMatch);
        System.out.println("Microwave Not Match: " + microwaveNotMatch);

        Smartwatch smartwatch1 = new Smartwatch("Apple", "watchOS", 1.78, true);
        Smartwatch smartwatch2 = new Smartwatch("Apple", "watchOS", 1.78, true);
        Smartwatch smartwatch3 = new Smartwatch("Samsung", "Tizen", 1.4, true);
        boolean smartwatchMatch = smartwatch1.equals(smartwatch2);
        boolean smartwatchNotMatch = smartwatch2.equals(smartwatch3);
        System.out.println("Smartwatch Match: " + smartwatchMatch);
        System.out.println("Smartwatch Not Match: " + smartwatchNotMatch);

        Pillow pillow1 = new Pillow("Memory Foam", "Medium", "Standard", true);
        Pillow pillow2 = new Pillow("Memory Foam", "Medium", "Standard", true);
        Pillow pillow3 = new Pillow("Down", "Soft", "Queen", false);
        boolean pillowMatch = pillow1.equals(pillow2);
        boolean pillowNotMatch = pillow2.equals(pillow3);
        System.out.println("Pillow Match: " + pillowMatch);
        System.out.println("Pillow Not Match: " + pillowNotMatch);
        
    }
}
