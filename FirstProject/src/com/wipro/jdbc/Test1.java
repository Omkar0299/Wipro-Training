package com.wipro.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Test1 {

	public static void main(String[] args) {
		try {
			
			//load the driver class
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver class loaded");
			
			//get the connection 
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			
			System.out.println("i got the connection");
			
			
			//send the sql queries - create the Statement object
			
			Statement st  = con.createStatement();
			
			
			//create the query and process it 
			
			//int x = st.executeUpdate("insert into student values(103,'kiran')");
			//int x1 = st.executeUpdate("insert into student values(104,'Ravan')");
			int x2 = st.executeUpdate("insert into student values(10,'Jivan')");
			//System.out.println(x + "row(s) inserted");
			System.out.println(x2 + "row(s) inserted");
			
			//close the connection 
			
			con.close();
			
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}