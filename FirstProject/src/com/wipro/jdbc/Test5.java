package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		
		PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?)");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Employee ID:");
            int empid = scanner.nextInt();

            System.out.println("Enter Employee name:");
            String empname = scanner.next();
            
            ps.setInt(1, empid);
            ps.setString(2, empname);
            
            int rowsInserted = ps.executeUpdate();
            
            System.out.println("Do you want to add more records? (yes/no)");
            String response=scanner.next();
            if(response.equalsIgnoreCase("no")) {
            	break;
            }
            System.out.println(rowsInserted+ "row inserted");
		}
		con.close();	
		scanner.close()
;	}

}
