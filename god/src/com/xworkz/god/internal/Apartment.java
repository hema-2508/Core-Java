package com.xworkz.god.internal;

public class Apartment {
    private String lift;
    private String garden;
    private String parking;
    private String gym;
    private String furnitures;

    //setter
    void SetLift(String lift){
        this.lift=lift;
    }
    void SetGarden(String garden){
        this.garden=garden;
    }
    void SetLParking(String parking){
        this.parking=parking;
    }
    void SetGym(String gym){
        this.gym=gym;
    }
    void SetFurnitures(String furnitures){
        this.furnitures=furnitures;
    }

    //getter
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
