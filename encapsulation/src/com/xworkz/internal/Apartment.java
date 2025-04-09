package com.xworkz.internal;

public class Apartment {
    private String lift;
    private String garden;
    private String parking;
    private String gym;
    private String furnitures;


    void setLift(String lift){
        this.lift=lift;
    }
    void setGarden(String garden){
        this.garden=garden;
    }
    void setParking(String parking){
        this.parking=parking;
    }
    void setGym(String gym){
        this.gym=gym;
    }
    void setFurnitures(String furnitures){
        this.furnitures=furnitures;
    }

    public String GetLift(){
        return this.lift;
    }
    public String GetGarden(){
        return this.garden;
    }
    public String GetParking(){
        return this.parking;
    }
    public String GetGym(){
        return this.gym;
    }
    public String GetFurnitures(){
        return this.furnitures;
    }


}
