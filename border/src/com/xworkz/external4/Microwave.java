package com.xworkz.external4;

import com.xworkz.internal.rules4.Appliance;

public class Microwave implements Appliance {
    public void turnOn() { System.out.println("Microwave turned on"); }
    public void turnOff() { System.out.println("Microwave turned off"); }
    public void increaseVolume() { System.out.println("Increasing beep volume"); }
    public void decreaseVolume() { System.out.println("Decreasing beep volume"); }
    public void setTimer() { System.out.println("Timer set"); }
    public void reset() { System.out.println("Microwave reset"); }
    public void testMode() { System.out.println("Entering test mode"); }
    public void calibrate() { System.out.println("Calibrating microwave"); }
    public void energySavingMode() { System.out.println("Energy saving mode activated"); }
}
