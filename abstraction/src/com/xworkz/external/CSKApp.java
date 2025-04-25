package com.xworkz.external;

import com.xworkz.internal.JDBC;

public class CSKApp {
    private JDBC jdbc;
    public CSKApp(JDBC jdbc){
        this.jdbc=jdbc;
    }
    public void IPL(){
        System.out.println("Running IPL in CSK App");
        if (this.jdbc!=null){
            this.jdbc.save();
        }
        else {
            System.err.println("Error!");
        }

    }


}
