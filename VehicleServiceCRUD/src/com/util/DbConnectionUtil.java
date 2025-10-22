package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtil {
    static final String jdbc_url = "jdbc:mysql://localhost:3306/jfs30_32";
    static final String username = "root";
    static final String password = "Nishipaul@2225";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbc_url, username, password);
    }
}