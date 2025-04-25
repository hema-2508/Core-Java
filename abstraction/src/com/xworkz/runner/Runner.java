package com.xworkz.runner;

import com.xworkz.external.CSKApp;
import com.xworkz.external.MysqlJDBC;
import com.xworkz.external.OracleJDBC;
import com.xworkz.internal.JDBC;

public class Runner {
    public static void main(String[] args) {
        JDBC jdbc = new MysqlJDBC();
        JDBC jdbc1=new OracleJDBC();
        CSKApp cskApp = new CSKApp(jdbc1);

        cskApp.IPL();

    }
}
