package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		
		PreparedStatement sc= con.prepareStatement("insert into Student values(?,?)");
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Emter stid");
			int stid=scanner.nextInt();
			
			System.out.println("Enter stname");
			String stname=scanner.next();
			
			sc.setInt(1, stid);
			sc.setString(2, stname);
		}
		
		int a=sc.executeUpdate();
		System.out.println(a+"row inserted");
		con.close();
		}
	
}
