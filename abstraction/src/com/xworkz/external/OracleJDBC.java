package com.xworkz.external;

import com.xworkz.internal.JDBC;

public class OracleJDBC implements JDBC {

    @Override
    public void save() {
        System.out.println("Running save in OracleJDBC");
    }
}
