package com.sabeer.database.jdbc;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        String database = dotenv.get("MARIADB_DATABASE");
        String username = dotenv.get("MARIADB_USER");
        String password = dotenv.get("MARIADB_PASSWORD");

        String url = "jdbc:mariadb://localhost:4000/" + database;

        String sql = "SELECT id, customer_name, amount FROM bookings";

        try (Connection connection =
                     DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            System.out.println("Connected to MariaDB successfully.");
            System.out.println("\nBookings:");

            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String customerName = resultSet.getString("customer_name");
                double amount = resultSet.getDouble("amount");

                System.out.printf(
                        "%d | %s | %.2f%n",
                        id,
                        customerName,
                        amount
                );
            }

        } catch (SQLException exception) {
            System.err.println("Database operation failed.");
            exception.printStackTrace();
        }
    }

    private static String requiredEnv(String name) {
        String value = System.getenv(name);

        if (value == null || value.isBlank()) {
            throw new IllegalStateException(
                    "Missing environment variable: " + name
            );
        }

        return value;
    }
}
