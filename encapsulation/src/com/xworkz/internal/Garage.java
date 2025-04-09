package com.xworkz.internal;

public class Garage {
    private String tools;
    private String mechanic;
    private String carLift;
    private String oilStorage;
    private String airCompressor;

    void setTools(String tools) {
        this.tools = tools;
    }

    void setMechanic(String mechanic) {
        this.mechanic = mechanic;
    }

    void setCarLift(String carLift) {
        this.carLift = carLift;
    }

    void setOilStorage(String oilStorage) {
        this.oilStorage = oilStorage;
    }

    void setAirCompressor(String airCompressor) {
        this.airCompressor = airCompressor;
    }

    public String getTools() {
        return this.tools;
    }

    public String getMechanic() {
        return this.mechanic;
    }

    public String getCarLift() {
        return this.carLift;
    }

    public String getOilStorage() {
        return this.oilStorage;
    }

    public String getAirCompressor() {
        return this.airCompressor;
    }
}
