package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver class loaded");
		
		//connecton
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		
		PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?)");
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter an empid" );
			int empid=sc.nextInt();
			System.out.println("Enter an empname" );
			String empname=sc.next();
			
			ps.setInt(1, empid);
			ps.setString(2, empname);
		}
		int a=ps.executeUpdate();
		System.out.println(a + "row(s) inserted");
		
		con.close();
	}

}
