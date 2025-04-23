package com.xworkz.internal.rules4;

public interface DroneControl {
    void takeOff();
    void land();
    void moveLeft();
    void moveRight();
    void ascend();
    void descend();
    void hover();
    void takePhoto();
    void recordVideo();
}

