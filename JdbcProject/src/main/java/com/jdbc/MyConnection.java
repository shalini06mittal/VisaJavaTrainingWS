package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        //1 . to load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loded");
        // 2. to connect with the driver
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/javatraining","root","root");
        System.out.println("connected");
        return connection;
    }
}
