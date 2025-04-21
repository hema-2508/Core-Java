package com.xworkz.external;

import java.util.Objects;

public class Wallet {
    String brand;
    String material;
    int cardSlots;
    boolean rfidProtection;

    public void setWallet(String brand, String material, int cardSlots, boolean rfidProtection) {
        this.brand = brand;
        this.material = material;
        this.cardSlots = cardSlots;
        this.rfidProtection = rfidProtection;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Material = " + material + ", CardSlots = " + cardSlots + ", RFIDProtection = " + rfidProtection;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Wallet) {
            Wallet wallet = (Wallet) obj;
            if (Objects.equals(this.brand, wallet.brand) && Objects.equals(this.material, wallet.material) && Objects.equals(this.cardSlots, wallet.cardSlots) && Objects.equals(this.rfidProtection, wallet.rfidProtection)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

