package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDetails {
    public static final String LOAD_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/truck_management_system";
    public static final String URERNAME = "root";
    public static final String PASSWORD = "database123";

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(URL,URERNAME,PASSWORD);

    }

}
