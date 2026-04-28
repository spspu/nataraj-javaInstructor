package com.mainapp.dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

    private static Properties props = new Properties();

    static {
        try {
            InputStream is = new FileInputStream("src/com/mainapp/commons/jdbc.properties");
            props.load(is);

            Class.forName(props.getProperty("jdbc.classname"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
                props.getProperty("jdbc.url"),
                props.getProperty("jdbc.username"),
                props.getProperty("jdbc.password")
        );
    }
}