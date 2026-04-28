package com.mainapp.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {

    public static Connection getPooledConnection() throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("com/mainapp/commons/jdbc");

        String url = bundle.getString("jdbc.url");
        String username = bundle.getString("jdbc.username");
        String password = bundle.getString("jdbc.password");
        String driver = bundle.getString("jdbc.classname");

        Class.forName(driver);

        return DriverManager.getConnection(url, username, password);
    }

    public static void closeConnection(Connection con) throws SQLException {
        if (con != null) {
            con.close();
        }
    }
}