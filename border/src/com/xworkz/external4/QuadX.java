package com.xworkz.external4;

import com.xworkz.internal.rules4.DroneControl;

public class QuadX implements DroneControl {
    public void takeOff() { System.out.println("Drone taking off"); }
    public void land() { System.out.println("Drone landing"); }
    public void moveLeft() { System.out.println("Moving left"); }
    public void moveRight() { System.out.println("Moving right"); }
    public void ascend() { System.out.println("Ascending"); }
    public void descend() { System.out.println("Descending"); }
    public void hover() { System.out.println("Hovering"); }
    public void takePhoto() { System.out.println("Photo captured"); }
    public void recordVideo() { System.out.println("Video recording"); }
}
