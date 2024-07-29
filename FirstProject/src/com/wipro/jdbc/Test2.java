package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test2  {

	public static void main(String[] args) throws Exception {
		
			
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("driver class loaded");
	
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "system");
	System.out.println("i got the connection");
	
	Statement s=con.createStatement();
	 ResultSet set= s.executeQuery("select * from Employee");
	 while(set.next()) {
		 System.out.println(set.getInt(1)+ " "+ set.getString(2));
	 }
		
		con.close();
		
	

}
}

