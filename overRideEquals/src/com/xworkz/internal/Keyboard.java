package com.xworkz.internal;

import java.util.Objects;

public class Keyboard {
    String brand;
    String switchType;
    boolean mechanical;
    boolean backlit;

    public Keyboard(String brand, String switchType, boolean mechanical, boolean backlit) {
        this.brand = brand;
        this.switchType = switchType;
        this.mechanical = mechanical;
        this.backlit = backlit;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Switch Type = " + switchType + ", Mechanical = " + mechanical + ", Backlit = " + backlit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) obj;
            if (Objects.equals(this.brand, keyboard.brand) && Objects.equals(this.switchType, keyboard.switchType) && Objects.equals(this.mechanical, keyboard.mechanical) && Objects.equals(this.backlit, keyboard.backlit)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
