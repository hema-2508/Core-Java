package com.methods.weather;

public class WeatherRunner {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Season season = new Season(weather);
        season.rainWater();
    }
}
