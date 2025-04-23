package com.xworkz.internal.rules4;

public interface GamingConsole {
    void startGame();
    void pauseGame();
    void saveGame();
    void loadGame();
    void exitGame();
    void connectController();
    void updateFirmware();
    void takeScreenshot();
    void streamGame();
}

