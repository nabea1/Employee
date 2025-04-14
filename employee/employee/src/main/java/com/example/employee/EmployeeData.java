package com.example.employee;
import java.sql.*;

public class EmployeeData {
    public static void main(String[] args){
        Employee employee = new Employee("John", "Doe"); //creates an employee

        String url = "jdbc:h2:mem:testdb"; // H2 in-memory database URL
        String user = "sa"; // H2 default user
        String password = ""; // H2 default password

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO employees (first_name, last_name) VALUES (?, ?)")) {

            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.executeUpdate();

            System.out.println("Employee data inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting employee data: " + e.getMessage());
        }
    }
}
