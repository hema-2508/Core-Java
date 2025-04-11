package com.xworkz.tool;

public class RevolverRunner {
    public static void main(String[] args) {

        System.out.println("\n Tool datatype");
        Tool tool = new Tool();
        tool.use();

        System.out.println("\n Weapon datatype");
        Weapon weapon = new Weapon();
        weapon.wield();
        weapon.use();

        System.out.println("\n Revolver datatype");
        Revolver revolver = new Revolver();
        revolver.fire();
        revolver.wield();
        revolver.use();
}

}
