package com.xworkz.Runner;

import com.xworkz.external.Adidas;
import com.xworkz.external.Nike;
import com.xworkz.internal.Shoe;

public class Runner {
    public static void main(String[] args) {
        Nike nike=new Nike();
        Adidas adidas = new Adidas();
        nike.abc(adidas);
    }
}
