package com.kelasC.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private Connection connection;

    public DatabaseManager() {
        try {
            // Ganti url, username, dan password sesuai dengan pengaturan database Anda
            String url = "jdbc:mysql://localhost:3306/barcodelogix";
            String username = "username";
            String password = "your_password";

            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exception
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exception
        }
    }
}
