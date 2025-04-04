package com.methods.weather;

public class Season {
    Weather weather;
    public Season(Weather weather) {
        this.weather=weather;
        System.out.println("Parameterized contructor in Weather");

    }

    public void rainWater() {
        System.out.println("Running rainWater in Season");
        if(weather!=null){
            weather.rain();
        }
        else{
            System.err.println("weather is null in the method");
        }

    }
}
