package com.xworkz.runner;

import com.xworkz.external.CSKApp;
import com.xworkz.external.MysqlJDBC;
import com.xworkz.external.OracleJDBC;
import com.xworkz.internal.JDBC;

public class Runner {
    public static void main(String[] args) {
        JDBC jdbc = new MysqlJDBC();
        CSKApp cskApp = new CSKApp(jdbc);
        cskApp.IPL();
        cskApp.IPL();
        cskApp.IPL();
    }
}
