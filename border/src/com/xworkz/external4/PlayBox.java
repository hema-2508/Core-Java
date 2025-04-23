package com.xworkz.external4;

import com.xworkz.internal.rules4.GamingConsole;

public class PlayBox implements GamingConsole {
    public void startGame() { System.out.println("Game started"); }
    public void pauseGame() { System.out.println("Game paused"); }
    public void saveGame() { System.out.println("Game saved"); }
    public void loadGame() { System.out.println("Game loaded"); }
    public void exitGame() { System.out.println("Exiting game"); }
    public void connectController() { System.out.println("Controller connected"); }
    public void updateFirmware() { System.out.println("Firmware updated"); }
    public void takeScreenshot() { System.out.println("Screenshot taken"); }
    public void streamGame() { System.out.println("Streaming started"); }
}
