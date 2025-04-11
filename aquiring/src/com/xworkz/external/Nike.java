package com.xworkz.external;

import com.xworkz.internal.Puma;
import com.xworkz.internal.Shoe;

public class Nike extends Puma {
    Shoe shoe3;
    public Nike(){
        System.out.println("no arg const of nike");
    }
    Shoe shoe = new Adidas();
    public void abc(Shoe lace){
        shoe3=lace;
        System.out.println(shoe3);
    }


}
