package com.xworkz.internal;

import java.util.Objects;

public class Wallet {
    String material;
    String color;
    int cardSlots;
    boolean hasRFIDProtection;

    public Wallet(String material, String color, int cardSlots, boolean hasRFIDProtection) {
        this.material = material;
        this.color = color;
        this.cardSlots = cardSlots;
        this.hasRFIDProtection = hasRFIDProtection;
    }

    @Override
    public String toString() {
        return "Material = " + material + ", Color = " + color + ", Card Slots = " + cardSlots + ", Has RFID Protection = " + hasRFIDProtection;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Wallet) {
            Wallet wallet = (Wallet) obj;
            if (Objects.equals(this.material, wallet.material) && Objects.equals(this.color, wallet.color) && Objects.equals(this.cardSlots, wallet.cardSlots) && Objects.equals(this.hasRFIDProtection, wallet.hasRFIDProtection)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}