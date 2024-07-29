package com.wipro.jdbc;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement1 {

   

    private static Connection getConnection() throws SQLException, ClassNotFoundException {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    System.out.println("driver class loaded");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "system", "system");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Employee Management System");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employee");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. View All Employees");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        addEmployee(scanner);
                        break;
                    case 2:
                        viewEmployee(scanner);
                        break;
                    case 3:
                        updateEmployee(scanner);
                        break;
                    case 4:
                        deleteEmployee(scanner);
                        break;
                    case 5:
                        viewAllEmployees();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addEmployee(Scanner scanner) throws ClassNotFoundException {
        System.out.print("Enter employee ID: ");
        int empid = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter employee name: ");
        String empname = scanner.nextLine();

        String sql = "INSERT INTO employee (empid, empname) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, empid);
            stmt.setString(2, empname);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee added successfully.");
            } else {
                System.out.println("Failed to add employee.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewEmployee(Scanner scanner) throws ClassNotFoundException {
        System.out.print("Enter employee ID: ");
        int empid = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        String sql = "SELECT * FROM employee WHERE empid = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, empid);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("Employee Details:");
                do {
                    System.out.printf("ID: %d%nName: %s%n",
                            rs.getInt("empid"), rs.getString("empname"));
                    System.out.println("-----------");
                } while (rs.next());
            } else {
                System.out.println("Employee not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateEmployee(Scanner scanner) throws ClassNotFoundException {
        System.out.print("Enter employee ID to update: ");
        int empid = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        String sqlSelect = "SELECT * FROM employee WHERE empid = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmtSelect = conn.prepareStatement(sqlSelect)) {
            stmtSelect.setInt(1, empid);
            ResultSet rs = stmtSelect.executeQuery();
            if (rs.next()) {
                System.out.print("Enter new name: ");
                String empname = scanner.nextLine();

                String sqlUpdate = "UPDATE employee SET empname = ? WHERE empid = ?";
                try (PreparedStatement stmtUpdate = conn.prepareStatement(sqlUpdate)) {
                    stmtUpdate.setString(1, empname);
                    stmtUpdate.setInt(2, empid);
                    int rowsAffected = stmtUpdate.executeUpdate();
                    if (rowsAffected > 0) {
                        System.out.println("Employee updated successfully.");
                    } else {
                        System.out.println("Failed to update employee.");
                    }
                }
            } else {
                System.out.println("Employee not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteEmployee(Scanner scanner) throws ClassNotFoundException {
        System.out.print("Enter employee ID to delete: ");
        int empid = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        String sql = "DELETE FROM employee WHERE empid = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, empid);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found or failed to delete.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewAllEmployees() throws ClassNotFoundException {
        String sql = "SELECT * FROM employee";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("All Employees:");
            if (rs.next()) {
                do {
                    System.out.printf("ID: %d%nName: %s%n",
                            rs.getInt("empid"), rs.getString("empname"));
                    System.out.println("-----------");
                } while (rs.next());
            } else {
                System.out.println("No employees found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}