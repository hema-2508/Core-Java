package com.xworkz.external;

import com.xworkz.internal.JDBC;

public class MysqlJDBC implements JDBC {
    @Override
    public void save() {
        System.out.println("Running save in MysqlJDBC");
    }
}
