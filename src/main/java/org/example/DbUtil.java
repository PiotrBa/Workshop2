package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private  static final String DB_URL_WORKSHOP= "jdbc:mysql://localhost:3307/workshop2";

    private  static final String DB_USER = "coderslab";
    private  static final String DB_PASSWORD = "coderslab";

    public static Connection connectWorkshop() throws SQLException {
        return DriverManager.getConnection(DB_URL_WORKSHOP, DB_USER, DB_PASSWORD);

    }


}
