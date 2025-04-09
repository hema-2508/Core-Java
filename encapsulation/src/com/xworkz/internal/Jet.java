package com.xworkz.internal;

public class Jet {
     private String engineType;
     private String fuelCapacity;
     private String wingSpan;
     private String cockpitDesign;
     private String landingGear;

     void setEngineType(String engineType) {
         this.engineType = engineType;
     }

     void setFuelCapacity(String fuelCapacity) {
         this.fuelCapacity = fuelCapacity;
     }

     void setWingSpan(String wingSpan) {
         this.wingSpan = wingSpan;
     }

     void setCockpitDesign(String cockpitDesign) {
         this.cockpitDesign = cockpitDesign;
     }

     void setLandingGear(String landingGear) {
         this.landingGear = landingGear;
     }


     public String getEngineType() {
         return this.engineType;
     }

     public String getFuelCapacity() {
        return this.fuelCapacity;
     }

     public String getWingSpan() {
        return this.wingSpan;
     }

     public String getCockpitDesign() {
         return this.cockpitDesign;
     }

     public String getLandingGear() {
        return this.landingGear;
     }
}
